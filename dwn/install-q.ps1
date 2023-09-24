# Define colors
$Green = [System.ConsoleColor]::Green
$Red = [System.ConsoleColor]::Red
$DefaultColor = [System.ConsoleColor]::Gray

# Default installation directory
$InstallDir = "$env:USERPROFILE\.q"

# Q Jar URL
$QJarUrl = "http://github.com/qRX53/Q/releases/latest/download/Q.jar"

# Check if the script is running with -Info flag
$InfoFlag = $false
$ErrorFlag = $false

if ($args -contains "-Info") {
    $InfoFlag = $true
    $ErrorFlag = $false
}

# Function to display info
function Display-Info {
    if ($InfoFlag) {
        Write-Host "[INFO] Installing Q software..."
        Write-Host "[INFO] Installation directory: $InstallDir"
        Write-Host "[INFO] Downloading Q Jar from: $QJarUrl"
    }
}

# Function to install Q
function Install-Q {
    # Create installation directory
    if (-not (Test-Path -Path $InstallDir -PathType Container)) {
        New-Item -ItemType Directory -Path $InstallDir | Out-Null
    }

    # Download Q Jar and place it in the installation directory
    $QJarPath = Join-Path -Path $InstallDir -ChildPath "Q.jar"
    Invoke-WebRequest -Uri $QJarUrl -OutFile $QJarPath -ErrorAction SilentlyContinue
    if (Test-Path -Path $QJarPath) {
        return $true # Download successful
    } else {
        return $false # Download failed
    }
}

# Function to update Q
function Update-Q {
    $QJarPath = Join-Path -Path $InstallDir -ChildPath "Q.jar"
    if (Test-Path -Path $QJarPath) {
        Remove-Item -Path $QJarPath -Force # Remove the old Q Jar
    }

    return Install-Q # Reinstall Q
}

# Main script logic
if (-not [bool](([System.Security.Principal.WindowsIdentity]::GetCurrent()).Groups -match "S-1-5-32-544")) {
    Write-Host "[ERROR] Please run as an administrator."
    exit
}

if ($args -contains "-Update") {
    Display-Info
    if (Update-Q) {
        Write-Host ("[INFO] Q software updated successfully.") -ForegroundColor $Green
    } else {
        $ErrorFlag = $true
    }
} else {
    Display-Info
    if (Install-Q) {
        Write-Host ("[INFO] Q software installed successfully.") -ForegroundColor $Green
    } else {
        $ErrorFlag = $true
    }
}

# Print usage instructions if the info flag is not set
if (-not $InfoFlag) {
    if ($ErrorFlag) {
        Write-Host ("[ERROR] Unable to download Q software.") -ForegroundColor $Red
    }
}

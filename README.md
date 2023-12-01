![Maven Build](https://github.com/QRX53/Q/actions/workflows/maven.yml/badge.svg)

## Installation

Build scripts can be found [here](https://github.com/QRX53/Q/tree/main/dwn). The universal script supports most major linux distros, and macOS. Windows script is likely buggy, as I do not have access to a Windows machine to reliably test it. To install, either download the repository to get the file, copy the file contents into a file on your local machine of the same name, or, probably the easiest, use the following command (for Fish, or ZSH).

```
touch install-nix.sh ; curl "https://raw.githubusercontent.com/QRX53/Q/main/dwn/install-*nix" >> install-nix.sh ; chmod +x install-nix.sh ; ./install-nix.sh
```

## Examples

Some examples can be found [here](https://github.com/QRX53/Q/tree/main/examples), these should work, but some are older, and may have lost functionality as the language changes. Likely will not be updated, but are still a very good example of the capabilities of Q.

## Getting Started With Q

Q comes with a prebuilt project creation manager. To get started, verify your Q installation with:
```
q --version
```
This should return something similar to:
```
Version: 2.X.X
Installation status: ✅
```
Once you have verified that Q is installed on your local machine successfully, you can create a new Q project using the following command:
```
q --create hello-world --sign
```
Please note that the `--sign` flag is optional. What this flag does is sign your account's username to the generated `q.yaml` file, in the `author` field. By default this will be blank.

Once your new `hello-world` project is created it should look similar to this:
```
hello-world/
├── q.yaml
└── src/
    ├── main.q
    └── objs/
        └── Printer.u
```
This is all that a Q project is comprised of. The `q.yaml` file contains all information about the Q project, including the name, author, and version of the project. All of this information can be queried using `q --info hello-world`.

### Now that you have your project:

Once your project is successfully created, and Q has been installed properly, you can create, and edit Q code. Run the project using `q hello-world`

# See codebase for more command prompts if building locally

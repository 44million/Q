![Linux Build](https://github.com/QRX53/Q/actions/workflows/maven-linux.yml/badge.svg) ![macOS Build](https://github.com/QRX53/Q/actions/workflows/maven-macos.yml/badge.svg) ![Q Install](https://github.com/QRX53/Q/actions/workflows/q.yml/badge.svg)

## Installation

Build scripts can be found [here](https://github.com/QRX53/Q/tree/main/dwn). The universal script supports most major
linux distros, and macOS. I do not have access to a Windows machine to reliably test installation.
To install, either download the repository to get the installation script file, copy the script contents into a file
on your local machine of the same name, or, probably the easiest, use the following command.

```
curl -sSL "https://raw.githubusercontent.com/QRX53/Q/main/dwn/install-*nix" | sudo bash
```

This command will download the installation script, and execute it. Please note, if you do
not want to run this command without knowing what the script does, download the script manually. If all goes well, you
should see something along the lines of: `Installation complete!`. This means your installation went well, and you are
ready to move on.

## Getting Started With Q

Q can run as loose files, or you can use Q's built in project manager. If you would rather not use the project manager,
create a new file ending in `.q`. Next, add the following code into your new file:

```
#import <q.std>;

fn main(args):
  std::cout("Hello, World!");
end
```

This is a simple Hello World file in Q. Once you've added this text into your new file, run the following command:

```
q --run your-file.q
```

After running this command, you should see the text `Hello, World!` printed to your console. If you would like to add
more functionality, you can create new `library` files, which are files ending in `.u`, and can be imported by
adding `#import path.to.library.file;` to the top of your `.q` file.

### Using Q's Project Manager.

Q also comes with a prebuilt project creation manager. To get started, verify your Q installation with:

```
q --version
```

This should return something similar to:

```
Version: 2.X.X
Installation status: ✅
```

Once you have verified that Q is installed on your local machine successfully, you can create a new Q project using the
following command:

```
q --create hello-world --sign
```

Please note that the `--sign` flag is optional. What this flag does is sign your account's username to the
generated `q.yaml` file, in the `author` field. By default, this will be blank.

Once your new `hello-world` project is created it should look similar to this:

```
hello-world/
├── q.yaml
└── src/
    ├── main.q
    └── objs/
        └── Printer.u
```

This is all that a Q project is composed of. The `q.yaml` file contains all information about the Q project, including
the name, author, and version of the project. All of this information can be queried using `q --info hello-world`.

### Now that you have your project:

Once your project is successfully created, and Q has been installed properly, you can create, and edit Q code. Run the
project using `q hello-world`

## Examples

Some examples can be found [here](https://github.com/QRX53/Q/tree/main/examples), these are very good showcases of Q's
use cases and flexibility.

## Use `q -h` to get information about Q's CLI system.

# Q Key:

**Installation**

# Clone (or download the repo), and head over to the `/dwn` folder. Double click that executable. Once the process is done, you can delete the cloned or downloaded repo.

**OBJECTS**

- Objects are subsets of classes

- Classes can be created using the following syntax:

- Objects currently only work as singlets (ie only one instance of a class can exist at a time.)

```js

// Import the standard input/output library

#import q.std;

  

// Declare the class, and name

class Main {

  

	// Class variables

	var value;

  

	// Mark the class as an object class

	cn Main():

	end

  

	// Function to set the value

	fn set(newValue):

		self::value = newValue;

	end

  

	// Function to get the value

	fn get():

		return self::value;

	end

  

// End the class block

}

```

- Once the Object class has been created, you can reference it in other classes as an object, like so:

```js

#import q.std;

  

class Runner {

  

	// Main function, all files are scanned for this, and it is automatically executed

	fn main(args):

		// Create the object, called m in this instance

		new Main as m();

		// Set the value

		m::set("Hello World");

		// Print the value

		std::coutln(m::get());

	end


}

```

**Functions**

- Functions can be declared like so:

```js

#import q.std;

  

class Main {

  

	// Function declaration, can be preceded by 'async' or 'native'

	fn thisIsAFunction(argument1, argument2):


		std::coutln(argument1 * argument2);
  

	end

  

}

```

- Functions can then be called, like so

```js

#import q.std;

  

class Main {

  

	fn thisIsAFunction(argument1, argument2):

  

		std::coutln(argument1 * argument2);

  

	end

  

	// Main function, will automatically be executed

	fn main(args):

		thisIsAFunction(2, 16);

	end

  

}

```

- If the function is preceded by `async`, then it will run in a private Java Thread, meaning that multiple functions
  will be executed at once instead of one at a time by order of parsing, the syntax would be like
  so: `async fn thisIsAFunction(): end`


- If the function is preceded by 'native', then it will not work with Q code, only with native java code. Like so:

```js

#import q.std;

  

class Main {

  

	native fn runMe {

  

		// java code here

  

	}

  

	fn main(args):

		runMe();

	end
}

```

- Using the `native` keyword, java code can be executed inside of Q


- You can also write anonymous functions, like so:

```js

#import q.std;

  

class Main {

  

	fn (): ->

		std::coutln("Hello World");

	end

  

}

```

**The Main Function**

- During the Lexing sequence of all files, Q will check for the Main function. No other function can look like it, as it
  will execute that, it looks like so:

```js

#import q.std;

  

class Main {

  

	// Main Function

	fn main(args):

		std::coutln("Hello World");

	end

}

```

- It must come with the 'args' parameter, as that is the arguments given to the JVM, it is an array type variable

**Variables**

- Variables work similarly to javascript, no variable type notation is required, unless it is an array, or an Object.
  Like so:

```js

#import q.std;

  

class Main {

  

	fn main(args):

  

		// Number variable

		var num = 1000;

		// Double/decimal number variable

		var dec = 1000.1;

		// String variable

		var str = "Hello There";

		// Array variable

		var ary = [1, 2, 3, 4, 5, 6];

		// Variables can also be marked with the `const` keyword, meaning they cannot be changed

		const life = "None";

  

		// Then of course object variables

		new Object as o();

		// you can change the value of a variable like so:

		str = "This is the number value: ";

  

		// String variables, and other types can be put together like so:
	
		str = (str + num);

		// now it will read 'This is the number value: 1000'

  

	end

  

}

```

- Objects can be marked with `const` instead of `var`, meaning that the value cannot be changed. If you try to change
  It, it will fail, and exit the program.

**Imports**

- importing a file will locate the file in question, and lex it, to load the code into the runner, meaning that only
  imported files can be referenced in code.

- There are several different import methods, such as:

```js

// standard import for file already on your computer

#import path.to.File;

// importing anything that is built into the system must start with 'q.' then the file name

#import q.NativeFile

// import from a link

#import "https://qfiles/File.txt";

// and importing a whole folder

#import [path.to.folder];

```

**Various loops and statements**

- If/then statement (without surrounding class):

```js

if (true):

	std::coutln("The condition was true");

else if (false):

	std::coutln("The condition was false");

else:

	std::coutln("The condition was neither true nor false (not possible)");

end

```

- While statement (without surrounding class):

```js

while (thisfact == false):

	std::coutln("false");

end

// if the condition changes, the code will stop running

```

- try/catch statement (without surrounding class):

```js

try:

	nonexistant();

except:

	// 'default' can be replaced with 'printbefore' or 'printafter' depending on when you want the error message to print

	<"default">

	// in addition to this message, a system error report will be printed

	std::err("Problem fr");

end

```

**Math**

- here's the logic table:

![enter image description here](https://media.discordapp.net/attachments/848634931897958410/1014363485074899004/Screen_Shot_2022-08-30_at_8.38.09_PM.png)

- Plus ofc the basic types, `*` to multiple, `/` to divide, `+` and `-` to add and subtract

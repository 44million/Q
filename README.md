# QLang 2.0

- better


# TODO

 - [x] Anonymous functions:

```js
fn -> 
	std:ln("Hello World"); 
end
```

 - [x] Possibly change function identifier?
	 - [ ] func
	 - [x] fn
	 - [ ] val/void
	 - [ ] def
	 - [ ] method
	 - [ ] mthd
	 - [ ] protocol
	 - [ ] pro
 - [x] Classes/Objects
```js

class Runner

	noval c;

	fn run(x, y)

		std:ln(x * y);

	end

	const Runner()

	end

end

class Main

	fn main()
		Runner r = new Runner();
		r.run(20, 304);
	end
	
end
```

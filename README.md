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
	 - [ ] func **[old]**
	 - [x] fn **[new]**
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
	
	cn Runner();

	fn run(x)
		std:ln(x * self.c);
	end
	
	fn set(c)
		self.c = c;
	end

end

class Main

	fn main()
		Runner r = new Runner();
		r.set(204);
		r.run(20);
	end
	
end
```

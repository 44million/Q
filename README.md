# QLang 2.0

- better


# TODO

 - [x] Anonymous functions:

```js
fn -> 
	std::coutln("Hello World"); 
end
```

 - [ ] Change `variables` to a Variable object, from a HashMap.
- [ ] Optimize code

 - [x] Possibly change function identifier?
	 - [ ] func \[**old**\]
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

	noval var c;
	
	cn Runner()
	
	end

	fn run(x, y)
		io::cout(x * y);
	end

	fn set(nv)
		self::c = nv;
	end
	
	fn get()
		return self::c;
	end

end

class Main

	fn main()
		new Runner as r();
		r::run(20, 304);
	end
	
end
```

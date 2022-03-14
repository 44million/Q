# QLang 2.0

- better


# TODO

 - [x] Anonymous functions:

```js
fn -> 
	std::coutln("Hello World"); 
end
```

 - [ ] ~~Change `variables` to a Variable object, from a HashMap.~~ Would make execution time slower, plus there's no point
- [x] Optimize code \[it went from ~12 second execution time, to 3\] 

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
@autoimport
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

@autoimport
class Main

	fn main()
		new Runner as r();
		r::run(20, 304);
		io::cout(r::get());
	end
	
end
```

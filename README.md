# QLang 2.0

- gooder

# TODO

- [x] Anonymous functions:

```js
fn (): -> 
	std::coutln("Hello World"); 
end
```

- [ ] ~~Change `variables` to a Variable object, from a HashMap.~~ Would make execution time slower, plus there's no
  point
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
- [ ] Finish Objects (Currently only works as Singletons for some reason)

```js

#import q.std;

class Runner

	var c;
	
	cn Runner():
	
	end

	fn mul(x, y):
		std::cout(x * y);
	end

	fn set(nv):
		self::c = nv;
	end
	
	fn get(x):
		return (self::c * x);
	end

end

class Main

	fn main(args):
		new Runner as r();
		r::set(80);
		r::mul(20, 304);
		std::cout(r::get(-80));
	end
	
end
```

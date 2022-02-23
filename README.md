# QLang 2.0

- better


# TODO

- [x] Anonymous functions:

```js
func -> { std:ln("Hello World"); }
```

- [ ] Possibly change function identifier?
    - [ ] func
    - [ ] fn
    - [ ] val/void
    - [ ] def
    - [ ] method
    - [ ] mthd
    - [ ] protocol
    - [ ] pro
- [ ] Classes/Objects
```js

class Main

	private c;

	cfunc run(x, y)

		std:ln(x * y);

	endf

	cfunc Main()

		here.c = 100;

	endf

endc

Main main = new Main();
main.run(20, 40);
```

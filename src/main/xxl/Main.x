class Main
    void main()
        std:ln("std:ln(Hello World);");

        std:ln("Enter text: ");
        x = input();

        std:ln("your text: " + x);

        Window win = new Window(130, 400);
        win.render();

    endf
endc

if (1 < 2) do
    std:ln("Hello World");
endf
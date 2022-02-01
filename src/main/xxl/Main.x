#import src.main.xxl.BT;

class Main
    void main()
        std:ln("Test");

        std:ln("Enter text: ");
        x = input();

        std:ln("your text: " + x);

    endf
endc

if (1 < 2) do
    std:ln("If Statement Test");
endf

Window win = new Window("Hello", "600", "450");
win.render();

init();
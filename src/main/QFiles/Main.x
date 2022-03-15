class Main

    @autoimport
    fn make()

        new Window as w("Hello World", 90, 90);
        w::render();

    end

    fn main()
        std::cout("Help me");
        make();
    end

end
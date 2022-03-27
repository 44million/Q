#import [*];

class Runner

    noval var isRunning;

    cn Runner()
        std::cout("Runner");
    end

    fn start()
        std::cout("running");
        self::isRunning = true;
    end

    fn run()
        if (self::isRunning)
            std::cout("running");
        else
            std::cout("not running");
        end
    end

    fn stop()
        std::cout("stopped");
        self::isRunning = false;
    end

end
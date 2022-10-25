#import q.Console;
#import q.Time;
#import q.Random;
#import q.Math;
#import q.Files;
#import q.http;
#import q.awt;
#import q.io;
#import q.FileUtils;
#import q.std;

class UnitTest

    cn UnitTest():

    end

    var i = 0;

    async fn runfunctiontests(x, y, z):
            std::coutln(x*y);
            std::coutln(y*z);
            std::coutln(x + " str concat");

            std::coutln(std::property("user.dir"));

            std::coutln(std::workspace("verify", "UnitTest.l"));
            std::coutln(std::workspace("home"));
            std::workspace("make", "UnitFolderTest");
            std::workspace("makefile", "UnitFolderTest/HelloWorld.untst");

            std::coutln(std::getClass());

            std::coutln(std::compilerFileTree());

            std::coutln(std::fns());

            std::coutln(std::libraries());
            std::coutln(std::parsed());

            std::coutln(std::split("Hello, World", ","));

            std::coutln(std::replaceInStr("Hello, World", ",", " "));

            Console::readPassword();

            std::coutln(Time::cur());
            std::coutln(Time::date());
            std::coutln(Time::instant());

            std::coutln(Math::getQCode());
            std::coutln(Math::toInt("15"));

            std::coutln(Files::countLines("UnitTest.l"));
            //Files::writeFile("/UnitFolderTest/HelloWorld.untst", "Hello, World!");
            //std::coutln(Files::absPath("UnitTest.l"));
            std::coutln(Files::here());
            //Files::delete("UnitFolderTest/HelloWorld.untst");
            std::coutln(Files::canRead("UnitTest.l"));
            std::coutln(Files::size("UnitTest.l"));
            std::coutln(Files::exists("UnitTest.l"));

            //http::get("discord.com");
            // Not going to test it here, but theres also
            /*
                post, put, delete, head, options, trace
            */

            //new Window as w();
            //w::render();

            new WebServer as web(8008);
            web::fromFile("src/main/QFiles/index.html");
            web::changeText("<b>Hello, World</b>");
            web::update();
            web::kill();

            io::printf("Hello, %s", "World");
            io::err("Goodbye, World.");
            io::errf("Goodbye, Cruel %s", "World.");

            std::coutln(FileUtils::countChars("UnitTest.l"));


        end

    async fn runsystemtests(str, num1, num2):

        if (num1 > num2):
            std::coutln("num1 is greater than num2");
        else if (num2 > num1):
            std::coutln("num2 is greater than num1");
        else:
            std::coutln("Who knows");
        end

        //while (1 < 10):
            //std::coutln("on TOP");
        //end

        var i = 0;
        var x = "Hello, There.";
        var ary = [1, 2, 3];

        std::coutln(ary[0]);
        std::coutln(str + 2);
        std::coutln((num1 + num2) + str);

        try:
            std::coutln(" ");
        except:
            <"default">
            std::coutln("Error");
        end

    end

    async fn exec():

        runtests(1, 2, 3);

    end

end
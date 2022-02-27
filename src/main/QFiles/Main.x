#import [*];
#import src.main.QFiles.TestLibrary;

class Object

    noval value;

    cn Object();

    fn set(x)
        self.value = x;
    end

    fn get()
        return self.value;
    end

end

class FileWriter : Object

    noval path;

    cn FileWriter();

    fn setPath(newPath)
        self.path = newPath;
    end

    fn getPath()
        return self.path;
    end

    fn scribe(content)

        new File as f(self.path);
        f.write(content);

    end

end

class Writer : Object

    noval val;

    cn Writer();

    fn set(x)
        self.val = x;
    end

    fn get()
        return self.val;
    end

end

class Main

    fn main()

        new Writer as w();
        // if you dont call 'set', the 'val' variable will be null.
        w.set("Hello there");

        std:ln(w.get());

        // this will run just fine
        noval thisisnull;
        // as will this
        thisisnotnull = "This isn't null";
        // this will not, so i commented it out
        // noval x = "This is going to fail!";

        // const tests
        i = 100;
        std:ln(i);
        i = 101;
        std:ln(i);

        new Random as r();
        ranInt = r.ran("int");
        ranStr = r.ran("str");
        ranBool = r.ran("bool");

        new FileWriter as fw();
        fw.setPath("src/main/QFiles/primary.l");
        fw.scribe("// " + ranInt + " <-- int, " + ranStr + " <-- str, " + ranBool + " <-- bool");

    end

end


#import q.std;
#import q.io;

class Library

    var name;
    var books;

    cn Library(name):

    end

    fn setName(name):
        self::name = name;
    end

    fn getName():
        return self::name;
    end

    fn setBooks(books):
        self::books = books;
    end

    fn getBooks():
        return self::books;
    end

end
@header List
// This is not finished, and as of yet, does NOT work.
class List

    cn List();

    ary = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
    counter = 0;

    fn get(index)
        return self.ary[index];
    end

    fn add(value)
        self.ary[self.counter] = value;
        counter = counter + 1;
    end

    fn print()
        std:ln(self.ary);
    end

end
#import q.io;
#import q.std;

class Board {

    cn Board():

    end

    var board = [
        [0, 0, 0],
        [0, 0, 0],
        [0, 0, 0]
    ]

    fn set(player, c1, c2):
        self::board[c1[c2]] = player;
    end

    fn get():
        return self::board;
    end

}

class Main {

    fn main(args):

        new Board as board();

        var me = 1;
        var computer = 2;

        io::err("You are 1. ");

        std::coutln("Where would you like to go on x: ");
        var inputx = std::cin();
        
        std::coutln("Where would you like to go on y: ");
        var inputy = std::cin();

        board::set(me, inputx, inputy);

        std::coutln(board::get());

        // this doesnt work yet


    end

}
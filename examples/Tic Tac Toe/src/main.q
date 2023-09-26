#import <q.std>;
#import <q.io>;

class Tic {

  cn Tic():
    std::coutln("TicTacToe");
  end

  async fn pBoard(ary, ary2, ary3):
    std::coutln(ary);
    std::coutln(ary2);
    std::coutln(ary3);
  end

  async fn play(ary1, ary2, ary3, player, move):
    if (move == "1"):
      ary1[0] = player;
      pBoard(ary1, ary2, ary3);
    else if (move == "2"):
      ary1[1] = player;
      pBoard(ary1, ary2, ary3);
    else if (move == "3"):
      ary1[2] = player;
      pBoard(ary1, ary2, ary3);
    else if (move == "4"):
      ary2[0] = player;
      pBoard(ary1, ary2, ary3);
    else if (move == "5"):
      ary2[1] = player;
      pBoard(ary1, ary2, ary3);
    else if (move == "6"):
      ary2[2] = player;
      pBoard(ary1, ary2, ary3);
    else if (move == "7"):
      ary3[0] = player;
      pBoard(ary1, ary2, ary3);
    else if (move == "8"):
      ary3[1] = player;
      pBoard(ary1, ary2, ary3);
    else if (move == "9"):
      ary3[2] = player;
      pBoard(ary1, ary2, ary3);
    else:
      io::err("Incorrect format.");
    end
  end

  end

  async fn genBoard():

    var boardTop = ["1","2","3"];
    var boardMiddle = ["4","5","6"];
    var boardBottom = ["7","8","9"];

    std::coutln("Board:");
    std::coutln(boardTop);
    std::coutln(boardMiddle);
    std::coutln(boardBottom);

    std::coutln("There will be: 9 turns.");

    std::coutln("Player 1, would you like to be X, or O?");
    var player = std::cin();

    std::coutln("Player 2, would you like to be X, or O?");
    var player2 = std::cin();

    std::coutln("Player 1, you are now: " + player + ".");
    std::coutln("Where would you like to go? Select a number.");

    var move1 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player, move1);

    std::coutln("Please pass the computer to player 2.")
    std::coutln("Player 2, you are now: " + player2 + ".");
    std::coutln("Where would you like to go? Select a number.");

    var move2 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player2, move2);

    std::coutln("Player 1, where would you like to go?");
    move1 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player, move1);

    std::coutln("Player 2, where would you like to go?");
    move2 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player2, move2);

    std::coutln("Player 1, where would you like to go?");
    move1 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player, move1);

    std::coutln("Player 2, where would you like to go?");
    move2 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player2, move2);

    std::coutln("Player 1, where would you like to go?");
    move1 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player, move1);

    std::coutln("Player 2, where would you like to go?");
    move2 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player2, move2);

    std::coutln("Player 1, where would you like to go?");
    move1 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player, move1);

    std::coutln("Player 2, where would you like to go?");
    move2 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player2, move2);

    std::coutln("Player 1, where would you like to go?");
    move1 = std::cin();
    play(boardTop, boardMiddle, boardBottom, player, move1);

  end

  fn main(args):
    genBoard();
  end
}

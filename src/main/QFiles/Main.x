#import q.std;

native fn jfunc {
    "public class Temp {"
    "   public static void main(String[] args) {"
    "        System.out.println(900);"
    "   }"
    "}"
}

async fn xyz(x):
    std::coutln("Hello There");
end

fn main(args):

    xyz("X");
    jfunc();

end
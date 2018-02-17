import java.util.Random;

public class Tabla {

    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;91m";
    public static final String BLUE = "\33[0;94m";

    public enum Symbol {
        SX, S0, S_;
    }

    private Symbol[][] t;


    public Tabla() {            //constructor in care intializez o tabele 3 linii 3 coloane.
        t = new Symbol[3][3];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                t[i][j] = Symbol.S_;
            }
        }
    }

    public void showtable() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j)
                switch (t[i][j]) {
                    case SX:
                        System.out.print(RED + "x" + RESET);
                        break;
                    case S0:
                        System.out.print(BLUE + "0" + RESET);
                        break;
                    default:
                        System.out.print("_");
                        break;
                }
            System.out.println();

        }
    }

    public Symbol hasWon() {

        if ((t[0][0] != Symbol.S_) && (t[0][1] == t[0][2]) && (t[0][0] == t[0][2])) return t[0][1];
            if (t[0][1]==Symbol.SX)
        if ((t[1][0] != Symbol.S_) && (t[1][1]) == t[1][2] && (t[1][0] == t[1][2])) return t[1][1];
        if ((t[2][0] != Symbol.S_) && (t[2][1] == t[2][2]) && (t[2][1] == t[2][0])) return t[2][1];
        if ((t[0][0] != Symbol.S_) && (t[1][0] == t[2][0]) && (t[1][0] == t[0][0])) return t[1][0];
        if (((t[0][1]) != Symbol.S_) && (t[1][1] == t[2][1]) && (t[1][1] == t[0][1])) return t[0][1];
        if (((t[0][2]) != Symbol.S_) && (t[1][2] == t[2][2]) && (t[1][2] == t[0][2])) return t[0][2];
        if ((t[0][0] != Symbol.S_) && (t[1][1] == t[2][2]) && (t[1][1] == t[0][0])) return t[0][0];
        if ((t[2][0] != Symbol.S_) && (t[1][1] == t[0][2]) && (t[1][1] == t[2][0])) return t[2][0];
        else return (Symbol.S_);
    }


    public void completeaza(int a, int b, Symbol role) {
        t[a][b] = role;
    }
}
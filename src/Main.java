import java.util.Random;

public class Main {

    public static void main(String args[]) {

        Tabla tabel = new Tabla();
        Player unu = new Player(tabel, Tabla.Symbol.SX);
        Player doi = new Player(tabel, Tabla.Symbol.S0);

        boolean a=isXFirst();

        tabel.showtable();

        while (tabel.hasWon()== Tabla.Symbol.S_)
        {
            if (a==true) unu.nextMove();
                else doi.nextMove();
                a=!a;  // a va fi exact inversul lui

        }
        tabel.hasWon();
    }

    static boolean isXFirst() {
        Random r = new Random();
        return r.nextBoolean();
    }



}

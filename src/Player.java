import java.util.Scanner;

public class Player {

    private Tabla t;
    private Tabla.Symbol role;

    public Player(Tabla t, Tabla.Symbol role) {

        this.t = t;
        this.role = role;
    }


    int readValidIndex() {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un nr intre 0-2:");
        while (true) {
            a = sc.nextInt();
            if (a <= 2 && a >= 0)
                break;
        }
        return a;
    }


    public void nextMove() {
        //Scanner sc = new Scanner(System.in);
        int a = readValidIndex(); //pastrez valorile
        int b = readValidIndex(); //pastrez valorile
        t.completeaza(a, b, role);   // in aceasta linie jucatorul doreste sa puna o bifa, iar p[t asta apelez metoda completeaza din clasa tabla(tabla va indeplini dorinta)
    }


}

import java.util.Random;
import java.util.Scanner;

public class Init {
    public static void main(String[] args) throws Exception {

        Treno treno = new Treno();
        treno.treni();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1.scegli treno \n" +
                    "2.scegli fermata \n");
                    System.out.println("");

            String str = scanner.nextLine();
            int key = Integer.parseInt(str);
            switch (key) {
                case 1:
                    System.out.println("inserisci il numero del treno: \n");
                    str = scanner.nextLine();
                    int tr = Integer.parseInt(str);
                    System.out.println("Il treno" + tr + " è attualmente in posizione: " + treno.getCurrentPosition(tr));
                    break;
                    case 2:
                    System.out.println("inserisci il numero della stazione: \n");
                    str = scanner.nextLine();
                    int tru = Integer.parseInt(str);
                    System.out.println("Il treno" + tru + " è attualmente in posizione: " + );  
                    break;
                default:
                    break;
            }
        }
    }
}
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Init {

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    public static void main(String[] args) throws Exception {
        
            int x = 0;//list1.trainstatus(2);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ciao e benvenuto nella simulazione treni, scrivi il numero di un treno o numero di una stazione per avere piu informazioni su di esse");
            String inputString = scanner.nextLine();
            int i = inputString.length();

            //mby
            if (i<99) {
                System.out.println("Il treno da te richiesto è attualmente ");
                switch (x) {
                    case 1:
                    System.out.println("in è in transito verso la stazione: " + x);
                        break;
                    case 2:
                    System.out.println("alla stazione n: " + x);
                        break;
                }

                
            }
        
            
            Treno treno = new Treno();
            System.out.println(treno.treni());

            
        }
    
    public static int timegen(int val) {

        Random rand = new Random();
        return (rand.nextInt(val));
        }
}
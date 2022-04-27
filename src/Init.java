import java.util.ArrayList;
import java.util.Random;

public class Init {

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    public static void main(String[] args) throws Exception {
        
            //check on station distance
            System.out.println(Treno.getList());

            //generate a train to check stats
            Generatetrain traininit = new Generatetrain();
            System.out.println(traininit.traininit());
            
            
        }
    
    public static int timegen(int val) {

        Random rand = new Random();
        return (rand.nextInt(val));
        }
}
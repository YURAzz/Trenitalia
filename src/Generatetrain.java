import java.util.ArrayList;
import java.util.Random;


public class Generatetrain {

    //list structure (0 line, 1 start, 2 end,)

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list43 = new ArrayList<Integer>();

    int rete = -1;
    int start = -1;
    int end = -1;
    
    public ArrayList<Integer> traininit(){
        
        
        list1.clear();
        list43.clear();
        
        //line extract and line routing w switch
        //every 15 stations is a line 0-15 line 1, 16-30 line 2, 
        
        rete = timegen(4);
        start = timegen(15);
        end = timegen(15);
        
        list1.add(rete);
        
        //...
        list43 = check(rete, end, start);
        
        list1.add(list43.get(0));
        list1.add(list43.get(1));
        
        return (list1);
    }
    
    //checks if start and end station are equal and rerolls
    public static ArrayList<Integer> check(int rete, int start, int end) {
    
        ArrayList<Integer> check = new ArrayList<Integer>();
        Boolean i = true;
        while (i){

    if (start==end){
        start = timegen(15);
        end = timegen(15);
    }
    else{
        check.add(start+(rete*15));
        check.add(end+(rete*15));
        i = false;
    }
}
    return check;
}


public static int timegen(int val) {

    Random rand = new Random();
    return (rand.nextInt(val));
    }
}
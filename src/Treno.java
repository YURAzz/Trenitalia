import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Treno extends Thread {


public static void Treni() throws InterruptedException  {

    Generatetrain traininit = new Generatetrain();
    System.out.println(traininit.traininit());


}

public static ArrayList<Integer> getList() throws FileNotFoundException {
    
    Scanner s = new Scanner(new File("distanzastaz.txt"));
    ArrayList<Integer> list = new ArrayList<Integer>();
    while (s.hasNext()){
        list.add(s.nextInt());
    }
    s.close();
    return list;
}
}
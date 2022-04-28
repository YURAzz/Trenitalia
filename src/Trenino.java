import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Trenino {

    int posizione_treno = 0;
    int destinazione_treno = 0;
    int sleep_timer = 0;

    public void treno() {
    
    Generatetrain traininit = new Generatetrain();
    Thread thread = new Thread();
    thread.start();

    ArrayList<Integer> listastaz = (getList());
    ArrayList<Integer> treno = (traininit.traininit());
    
    destinazione_treno = treno.get(2);
    posizione_treno = treno.get(1);

    sleep_timer = listastaz.get(posizione_treno);

    while (posizione_treno != destinazione_treno) {

        thread.sleep(sleep_timer * 100);

        if (posizione_treno > destinazione_treno){
            posizione_treno = posizione_treno -1;
            treno.set(2, posizione_treno);
        }
        else{
            posizione_treno = posizione_treno + 1;
            treno.set(2, posizione_treno);
        }
        thread.sleep(600);
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

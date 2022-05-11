import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Trenino extends Thread {

    int posizione_treno = 0;
    int destinazione_treno = 0;
    int sleep_timer = 0;

    Generatetrain traininit = new Generatetrain();
    ArrayList<Integer> treno = (traininit.traininit());

    public int getPosizione_treno() {
        return posizione_treno;
    }

    public void setPosizione_treno(int posizione_treno) {
        this.posizione_treno = posizione_treno;
    }

    public int getDestinazione_treno() {
        return destinazione_treno;
    }

    public void setDestinazione_treno(int destinazione_treno) {
        this.destinazione_treno = destinazione_treno;
    }

    public int getSleep_timer() {
        return sleep_timer;
    }

    public void setSleep_timer(int sleep_timer) {
        this.sleep_timer = sleep_timer;
    }

    public ArrayList<Integer> datiTreno() {
        return treno;
    }

    public void run() {

        while (true) {
            try {
                treno();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void treno() throws InterruptedException, FileNotFoundException {

        Thread thread = new Thread();
        thread.start();

        ArrayList<Integer> listastaz = (getList());

        destinazione_treno = treno.get(2);
        posizione_treno = treno.get(1);

        sleep_timer = listastaz.get(posizione_treno);

        while (posizione_treno != destinazione_treno) {

            thread.sleep(sleep_timer * 100);

            if (posizione_treno > destinazione_treno) {
                posizione_treno = posizione_treno - 1;
                treno.set(2, posizione_treno);
            } else {
                posizione_treno = posizione_treno + 1;
                treno.set(2, posizione_treno);
            }
            Thread.sleep(600);
        }
    }

    public static ArrayList<Integer> getList() throws FileNotFoundException {

        Scanner s = new Scanner(new File("distanzastaz.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (s.hasNext()) {
            list.add(s.nextInt());
        }
        s.close();
        return list;
    }
}

import java.util.ArrayList;
import java.util.LinkedList;

public class Treno {

    private LinkedList<Trenino> list = new LinkedList<Trenino>();

    public int getCurrentPosition(int index) {
        return (list.get(index).posizione_treno);
    }

    public void treni() {

        for (int i = 0; i < 120; ++i) {
            list.add(new Trenino());
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).start();
        }
    }

    public ArrayList<Integer> getData(int index) {
        return list.get(index).datiTreno();
    }
}
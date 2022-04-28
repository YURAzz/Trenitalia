import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Treno extends Thread {

public int treni() throws InterruptedException, FileNotFoundException  {

    ExecutorService exec = Executors.newFixedThreadPool(120);
    for (int i = 0; i < 120; ++i) {
    exec.submit(new Trenino());
    System.out.println("stai creando un nuovo thread");
        }
    }
}
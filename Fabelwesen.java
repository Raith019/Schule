import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class Fabelwesen implements Runnable{
    private final Object lock = new Object();
    ArrayList<String> parts = new ArrayList();
    int counter = 0;
    Entschlüsseln en = new Entschlüsseln();
    String originalpasswort = "520da0807c1e972fb9a862485009d47ad1c4978db1369652f5ae176085eb9df7";
    String erg = "-";
    boolean passwortErraten = false;

    public void aufgabe4() {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        boolean passwordfound = false;
        ArrayList<String> liste = new ArrayList();
        Scanner s = null;
        try {
            s = new Scanner(new File("Liste_von_Fabelwesen.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (s.hasNextLine()) {
            parts.add(s.nextLine());
            }
        while (passwortErraten==false)
            executor.execute(this::run);



    try {
        Thread.sleep(10);
    }catch (Exception e){

}


        System.out.println("Das passwort ist "+erg);
    }

    @Override
    public void run() {


        ArrayList<String> templist = new ArrayList<>();

while ((templist.size()<30)&&(counter<parts.size())){
    templist.add(parts.get(counter));
    counter++;
}

        for (int i = 0; i < templist.size(); i++) {
            String finalepasswort = templist.get(i);
            synchronized (lock){
                String temp =en.applySha256(finalepasswort);

                if (temp.equals(originalpasswort)){
                    System.out.println("Passwot gefunden");
                    System.out.println(finalepasswort);
                    erg = finalepasswort;
                    passwortErraten = true;
                    counter = parts.size();

                }
                else {
                    System.out.println(finalepasswort);




                }
            }

        }


    }


    }


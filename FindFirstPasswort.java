import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class FindFirstPasswort implements Runnable {
    private final Object lock = new Object();
    char[] buch = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] buch1 = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
    char[] buch2 = new char[]{'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


    String originalpasswort = "95511ec2b03a441daada2e54cad5a8a7ae990e99b4a9f3512b92f672467186b2";
    char[] passwort = new char[4];
    Entschlüsseln en = new Entschlüsseln();
    int counter = 0;
    String erg = "_";

    public void aufgabe1() {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        executor.execute(this::run);
        executor.execute(this::run);

        System.out.println("Das passwort ist "+erg);
    }
    public void checkPasswort(){
        counter++;


        if ((counter % 2 == 0)) {
            for (int i = 0; i < buch1.length; i++) {
                passwort[3] = buch1[i];
                for (int j = 0; j < buch.length; j++) {
                    passwort[2] = buch[j];
                    for (int k = 0; k < buch.length; k++) {
                        passwort[1] = buch[k];
                        for (int l = 0; l < buch.length; l++) {
                            passwort[0]= buch[l];


                                String finalepasswort = ""+passwort[3]+passwort[2]+passwort[1]+passwort[0];


                                String temp =en.applySha256(finalepasswort);

                                if (temp.equals(originalpasswort)){
                                    System.out.println("Passwot gefunden");
                                    System.out.println(finalepasswort);
                                    erg = finalepasswort;
                                    i = buch1.length;
                                }


                        }
                    }


                }
            }
        }
        else if (counter%2 != 0)
        {
            for (int i = 0; i < buch2.length; i++) {
                passwort[3] = buch2[i];
                for (int j = 0; j < buch.length; j++) {
                    passwort[2] = buch[j];
                    for (int k = 0; k < buch.length; k++) {
                        passwort[1] = buch[k];
                        for (int l = 0; l < buch.length; l++) {
                            passwort[0] = buch[l];


                                String finalepasswort = ""+passwort[3]+passwort[2]+passwort[1]+passwort[0];


                                String temp =en.applySha256(finalepasswort);

                                if (temp.equals(originalpasswort)){
                                    System.out.println("Passwot gefunden");
                                    System.out.println(finalepasswort);
                                    erg = finalepasswort;
                                    i = buch2.length;
                                }


                        }
                    }

                }
            }
        }
    }



    @Override
    public void run() {
        checkPasswort();
    }


}


import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class FindThirdPasswort implements Runnable {
    private final Object lock = new Object();

    int[] zahl1 = new int[]{0, 1, 2, 3, 4};
    int[] zahl2 = new int[]{5, 6, 7, 8, 9};
    String[] all = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] all1 = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"};
    String[] all2 = new String[]{"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] all3 = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};
    String[] all4 = new String[]{"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] all5 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    String originalpasswort = "6cd2017cdafb4b2d6412eb50c7a8e457dac6e5c5a5a528d03231462e5d774589";
    String[] passwort = new String[5];
    Entschlüsseln en = new Entschlüsseln();
    int counter = 0;
    String erg = "_";

    public void aufgabe3() {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        executor.execute(this::run);
        executor.execute(this::run);
        executor.execute(this::run);
        executor.execute(this::run);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {

        }
        System.out.println("Das passwort ist " + erg);
    }


    public void checkPasswort() {
        counter++;


        if (!(counter  == 1)) {
            for (int i = 0; i < all1.length; i++) {
                passwort[0] = all1[i];
                for (int j = 0; j < all.length; j++) {
                    passwort[1] = all[j];
                    for (int k = 0; k < all.length; k++) {
                        passwort[2] = all[k];
                        for (int l = 0; l < all.length; l++) {
                            passwort[3] = all[l];
                            for (int m = 0; m < all.length; m++) {
                                passwort[4] = all[m];



                                    synchronized (lock) {
                                        String finalepasswort = "" + passwort[0] + passwort[1] + passwort[2] + passwort[3] + passwort[4];


                                        String temp = en.applySha256(finalepasswort);

                                        if (temp.equals(originalpasswort)) {
                                            System.out.println("Passwot gefunden");
                                            System.out.println(finalepasswort);
                                            erg = finalepasswort;
                                            i = all1.length;

                                        }
                                    }

                            }
                        }
                    }
                }
            }

        } else if (counter == 2) {
            for (int i = 0; i < all2.length; i++) {
                passwort[0] = all2[i];
                for (int j = 0; j < all.length; j++) {
                    passwort[1] = all[j];
                    for (int k = 0; k < all.length; k++) {
                        passwort[2] = all[k];
                        for (int l = 0; l < all.length; l++) {
                            passwort[3] = all[l];
                            for (int m = 0; m < all.length; m++) {
                                passwort[4] = all[m];


                                    synchronized (lock) {
                                        String finalepasswort = "" + passwort[0] + passwort[1] + passwort[2] + passwort[3] + passwort[4];


                                        String temp = en.applySha256(finalepasswort);

                                        if (temp.equals(originalpasswort)) {
                                            System.out.println("Passwot gefunden");
                                            System.out.println(finalepasswort);
                                            erg = finalepasswort;
                                            i = all2.length;

                                        }
                                    }

                            }

                        }
                    }
                }
            }


        }

        if (!(counter  == 3)) {
            for (int i = 0; i < all3.length; i++) {
                passwort[0] = all3[i];
                for (int j = 0; j < all.length; j++) {
                    passwort[1] = all[j];
                    for (int k = 0; k < all.length; k++) {
                        passwort[2] = all[k];
                        for (int l = 0; l < all.length; l++) {
                            passwort[3] = all[l];
                            for (int m = 0; m < all.length; m++) {
                                passwort[4] = all[m];



                                    synchronized (lock) {
                                        String finalepasswort = "" + passwort[0] + passwort[1] + passwort[2] + passwort[3] + passwort[4];


                                        String temp = en.applySha256(finalepasswort);

                                        if (temp.equals(originalpasswort)) {
                                            System.out.println("Passwot gefunden");
                                            System.out.println(finalepasswort);
                                            erg = finalepasswort;
                                            i = all1.length;

                                        }

                                }
                            }
                        }
                    }
                }
            }
        } else if (counter == 4) {
            for (int i = 0; i < all4.length; i++) {
                passwort[0] = all4[i];
                for (int j = 0; j < all.length; j++) {
                    passwort[1] = all[j];
                    for (int k = 0; k < all.length; k++) {
                        passwort[2] = all[k];
                        for (int l = 0; l < all.length; l++) {
                            passwort[3] = all[l];
                            for (int m = 0; m < all.length; m++) {
                                passwort[4] = all[m];



                                    synchronized (lock) {
                                        String finalepasswort = "" + passwort[0] + passwort[1] + passwort[2] + passwort[3] + passwort[4];


                                        String temp = en.applySha256(finalepasswort);

                                        if (temp.equals(originalpasswort)) {
                                            System.out.println("Passwot gefunden");
                                            System.out.println(finalepasswort);
                                            erg = finalepasswort;
                                            i = all2.length;

                                        }
                                    }
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
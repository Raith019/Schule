import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class FindSecondPasswort implements Runnable {
    private final Object lock = new Object();
    char[] buch = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    char[] buch1 = new char[]{'A','B', 'C', 'D', 'E', 'F', 'G'};
    char[] buch2 = new char[]{'H', 'I', 'J', 'K', 'L', 'M'};
    char[] buch3 = new char[]{'N', 'O', 'P', 'Q', 'R', 'S', 'T'};
    char[] buch4 = new char[]{'U', 'V', 'W', 'X', 'Y', 'Z'};

    int[] zahl1 = new int[]{0, 1, 2, 3, 4};
    int[] zahl2 = new int[]{5, 6, 7, 8, 9};

    String[] all1 = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"};
    String[] all2 = new String[]{"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] all3 = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};
    String[] all4 = new String[]{"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] all5 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    String originalpasswort = "6cd2017cdafb4b2d6412eb50c7a8e457dac6e5c5a5a528d03231462e5d774589";
    char[] passwort = new char[6];
    Entschlüsseln en = new Entschlüsseln();
    int counter = 0;
    String erg = "_";

    public void aufgabe2() {
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


        if ((counter  == 1)) {
            for (int i = 0; i < buch1.length; i++) {
                passwort[0] = buch1[i];
                for (int j = 0; j < buch.length; j++) {
                    passwort[1] = buch[j];
                    for (int k = 0; k < buch.length; k++) {
                        passwort[2] = buch[k];
                        for (int l = 0; l < buch.length; l++) {
                            passwort[3] = buch[l];
                            for (int m = 0; m < buch.length; m++) {
                                passwort[4] = buch[m];
                                for (int n = 0; n < buch.length; n++) {
                                    passwort[5] = buch[n];


                                        String finalepasswort = "" + passwort[0] + passwort[1] + passwort[2] + passwort[3] + passwort[4] + passwort[5];


                                        String temp = en.applySha256(finalepasswort);

                                        if (temp.equals(originalpasswort)) {
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
            }

        }
        if (counter == 2) {
            for (int i = 0; i < buch2.length; i++) {
                passwort[0] = buch2[i];
                for (int j = 0; j < buch.length; j++) {
                    passwort[1] = buch[j];
                    for (int k = 0; k < buch.length; k++) {
                        passwort[2] = buch[k];
                        for (int l = 0; l < buch.length; l++) {
                            passwort[3] = buch[l];
                            for (int m = 0; m < buch.length; m++) {
                                passwort[4] = buch[m];
                                for (int n = 0; n < buch.length; n++) {
                                    passwort[5] = buch[n];



                                        String finalepasswort = "" + passwort[0] + passwort[1] + passwort[2] + passwort[3] + passwort[4] + passwort[5];


                                        String temp = en.applySha256(finalepasswort);

                                        if (temp.equals(originalpasswort)) {
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


        }

        if ((counter  == 3)) {
            for (int i = 0; i < buch3.length; i++) {
                passwort[0] = buch1[i];
                for (int j = 0; j < buch.length; j++) {
                    passwort[1] = buch[j];
                    for (int k = 0; k < buch.length; k++) {
                        passwort[2] = buch[k];
                        for (int l = 0; l < buch.length; l++) {
                            passwort[3] = buch[l];
                            for (int m = 0; m < buch.length; m++) {
                                passwort[4] = buch[m];
                                for (int n = 0; n < buch.length; n++) {
                                    passwort[5] = buch[n];



                                        String finalepasswort = "" + passwort[0] + passwort[1] + passwort[2] + passwort[3] + passwort[4] + passwort[5];


                                        String temp = en.applySha256(finalepasswort);

                                        if (temp.equals(originalpasswort)) {
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
            }
        }
        if (counter == 4) {
            for (int i = 0; i < buch4.length; i++) {
                passwort[0] = buch2[i];
                for (int j = 0; j < buch.length; j++) {
                    passwort[1] = buch[j];
                    for (int k = 0; k < buch.length; k++) {
                        passwort[2] = buch[k];
                        for (int l = 0; l < buch.length; l++) {
                            passwort[3] = buch[l];
                            for (int m = 0; m < buch.length; m++) {
                                passwort[4] = buch[m];
                                for (int n = 0; n < buch.length; n++) {
                                    passwort[5] = buch[n];



                                        String finalepasswort = "" + passwort[0] + passwort[1] + passwort[2] + passwort[3] + passwort[4] + passwort[5];


                                        String temp = en.applySha256(finalepasswort);

                                        if (temp.equals(originalpasswort)) {
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


        }
    }

    @Override
    public void run() {
        checkPasswort();
    }
}
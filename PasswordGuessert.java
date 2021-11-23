import java.util.Locale;


public class PasswordGuessert{
    Entschlüsseln en = new Entschlüsseln();

    char[] buch1 = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


    int[] zahl1 = new int[]{0,1,2,3,4,5,6,7,8,9};


    String[] all = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
    "0","1","2","3","4","5","6","7","8","9"};


public void aufgabe1(){
    String originalpasswort = "95511ec2b03a441daada2e54cad5a8a7ae990e99b4a9f3512b92f672467186b2";
    String erg = "-";
    char[] passwort = new char[4];
    for (int i = 0; i < buch1.length; i++) {
        passwort[3] = buch1[i];
        for (int j = 0; j < buch1.length; j++) {
            passwort[2] = buch1[j];
            for (int k = 0; k < buch1.length; k++) {
                passwort[1] = buch1[k];
                for (int l = 0; l < buch1.length; l++) {
                    passwort[0] = buch1[l];
                    String finalepasswort = ""+passwort[3]+passwort[2]+passwort[1]+passwort[0];


                    String temp =en.applySha256(finalepasswort);

                    if (temp.equals(originalpasswort)){
                        System.out.println("Passwot gefunden");
                        System.out.println(finalepasswort);
                        erg = finalepasswort;
                        i = buch1.length;
                    }
                    else {
                        System.out.println(finalepasswort);




                    }


                }
            }
        }
    }
    System.out.println("Das passwort ist "+erg);

    }
    public void aufgabe2(){

        String originalpasswort  ="6cd2017cdafb4b2d6412eb50c7a8e457dac6e5c5a5a528d03231462e5d774589";
        char[] finalePasswort = new char[6];
        String erg = "-";
        for (int i = 0; i < buch1.length; i++) {
            finalePasswort[0] = buch1[i];
            for (int j = 0; j < buch1.length; j++) {
                finalePasswort[1] = buch1[j];
                for (int k = 0; k < buch1.length; k++) {
                    finalePasswort[2] = buch1[k];
                    for (int l = 0; l < buch1.length; l++) {
                        finalePasswort[3] = buch1[l];
                        for (int m = 0; m < buch1.length; m++) {
                            finalePasswort[4] = buch1[m];
                            for (int n = 0; n < buch1.length; n++) {
                                finalePasswort[5] = buch1[n];

                                String finalepasswort = finalePasswort[0]+""+finalePasswort[1]+""+finalePasswort[2]+""+finalePasswort[3]+""+finalePasswort[4]+""+finalePasswort[5];
                                finalepasswort = finalepasswort.toUpperCase(Locale.ROOT);
                                String temp =en.applySha256(finalepasswort);
                                if (temp.equals(originalpasswort)){
                                    System.out.println("Passwot gefunden");
                                    System.out.println(finalepasswort);
                                    erg = finalepasswort;
                                    i = buch1.length;
                                }
                                else {
                                    System.out.println(finalepasswort);


                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Das passwort ist "+erg);
    }
    public void aufgabe3(){


        String originalpasswort  ="a8d6f454f4b4ff90aef14abe614f61eede264190e088dee0995e17434d1dc2bf";
        String[] finalePasswort = new String[5];
        String erg = "-";
        for (int i = 0; i < all.length; i++) {
            finalePasswort[0] = all[i];
            for (int j = 0; j < all.length; j++) {
                finalePasswort[1] = all[j];
                for (int k = 0; k < all.length; k++) {
                    finalePasswort[2] = all[k];
                    for (int l = 0; l < all.length; l++) {
                        finalePasswort[3] = all[l];
                            for (int n = 0; n < all.length; n++) {
                                finalePasswort[4] = all[n];

                                String finalepasswort = finalePasswort[0]+""+finalePasswort[1]+""+finalePasswort[2]+""+finalePasswort[3]+""+finalePasswort[4];
                                String temp =en.applySha256(finalepasswort);
                                if (temp.equals(originalpasswort)){
                                    System.out.println("Passwot gefunden");
                                    System.out.println(finalepasswort);
                                    erg = finalepasswort;
                                    i = all.length;
                                }
                                else {
                                    System.out.println(finalepasswort);


                                }
                            }
                        }
                    }
            }
        }
        System.out.println("Das passwort ist "+erg);
    }
}

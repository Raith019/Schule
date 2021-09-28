
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class EratosthenesPrimeSieve {

    static int og = 100;
    static boolean eing = true;
    static Set<Integer> prim = new HashSet<>();
    static List<Integer> arrlist = new ArrayList<>();

    public static void main(String[] args) {
        aufgabe1();
        aufgabe2();

    }

    public static void aufgabe1() {
        for (int j = 0; j < og; j++) {
            sieb(j);
        }
        System.out.println(prim);

        printPrimes();
    }

    public static void sieb(int pObergraenze) {
        boolean prime = false;
        for (int i = 2; i < pObergraenze; i++) {
            prime = isPrime(i);
            if (prime == true) {
                prim.add(i);
            }
        }

    }

    //    @Override
    public static boolean isPrime(int p) {
        int temp = 0;
        for (int i = 2; i < p; i++) {

            temp = (p % i);

            if (temp == 0) {
                return false;
            }

        }
        return true;
    }

    //    @Override
    public static void printPrimes() {

        System.out.println(prim);
    }



    public static void aufgabe2() {
        int firstprime = 0;
        int secondprime = 0;
        int temp = 0;
        int y = 0;
        arrlist.addAll(prim);

        while (eing = true) {
            System.out.println("Bis zu welcher gerade Natürliche Zahl wollen sie Berechnen?");
            Scanner s = new Scanner(System.in);
            y=0;
            og = s.nextInt();
            int x = 0;
            boolean[] booarr = new boolean[og/2];
            for (int i = 0; i>booarr.length;i++)
            {
                booarr[i] = false;
            }
            for (int i = 2; i < og; i++) {
                temp = 4;

                while (temp<i+2)
                {
                    for (int j = 1; j < prim.size();++j){

                        for (int k = 1; k < prim.size();++k){

                            temp = arrlist.get(j)+arrlist.get(k);
                            firstprime = arrlist.get(j);
                            secondprime = arrlist.get(k);
                            if (y==0)
                                System.out.println("4 : 2 + 2");// Keine Andere Moeglichkeit gefunden um 4 einzubinden
                            y=-1;
                            if ((og+2>temp)&&(booarr[k]==false)) {
                                System.out.println(temp + " : " + firstprime + " + " + secondprime);
                                booarr[k] = true;
                            }
                            x++;

                        }
                    }


                    i++;
                }
            }
        }
        {

        }

    }

}

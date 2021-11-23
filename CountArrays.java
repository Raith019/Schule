import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountArrays{
    Scanner s = null;
    int arraysize;
    String originalString;
    ArrayList<Character> originalCharArray= new ArrayList();

    public void aufgabe5(){
        readFile();
        calculate();
    }


    public void readFile(){

        try {
            s = new Scanner(new File("numbers0"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        arraysize = s.nextInt();
        while (s.hasNext()) {
            originalString = s.nextLine();
            System.out.println(originalString);
            char[] tempchararray = originalString.toCharArray();

            for (int i = 0; i < tempchararray.length; i++) {
                if(tempchararray[i] != ' '){
                    originalCharArray.add(tempchararray[i]);
                };
            }
        }
        for (int j = 0; j < originalCharArray.size(); j++) {
            System.out.print(originalCharArray.get(j));
        }
        System.out.println("");

    }



    public void calculate(){
        ArrayList<Character> tempCharArray = new ArrayList();
        ArrayList<Character> tempCharArray2 = new ArrayList();
        ArrayList<ArrayList> subarrays = new ArrayList();
        int counter = 0;
        for (int i = 0; i < originalCharArray.size(); i++) {
            for (int j = 0; j < arraysize; j++) {
                tempCharArray.add(originalCharArray.get(j));
            }
            tempCharArray2 = new ArrayList<>(tempCharArray);
            tempCharArray.clear();
            subarrays.add(tempCharArray2);
            counter++;

            if (originalCharArray.size()<arraysize)
                i = originalCharArray.size();

            originalCharArray.remove(0);

        }
        for (int i = 0; i < subarrays.size(); i++) {
            for (int j = 0; j < arraysize; j++) {
                System.out.print(subarrays.get(i).get(j));
            }
            System.out.println("");
        }
        System.out.println(counter);

    }
}






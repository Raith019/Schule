public class Main {
public static void main(String args[]){
    ReciprocalArraySum ras = new ReciprocalArraySum();
    double[] darray = new double[10];
    for (int i = 0; i < darray.length; i++) {
        darray[i]= i+1;
    }

    ras.start(darray);
}

}

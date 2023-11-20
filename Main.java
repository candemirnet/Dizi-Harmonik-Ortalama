import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] list = new int[5];
        Scanner imp = new Scanner(System.in);
        double harmonik = 0;
        int n = list.length;

        for(int i = 0; i< list.length; i++){
            System.out.print("Dizinin Elemanlarını Giriniz: ");
            list[i] = imp.nextInt();
        }

        System.out.println("Dizi ELemanları: " + Arrays.toString(list));
        for(int j =0; j<list.length; j++){
            harmonik += 1.0/list[j];
        }
        
        double harmonikOrt = n/ harmonik;
        System.out.println("Dizini Harmonik Ortalaması: " + harmonikOrt);

    }
}
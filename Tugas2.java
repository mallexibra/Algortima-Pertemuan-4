import java.util.Scanner;
public class Tugas2 {
    public static void main (String[] args){
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukkan angka untuk variabel A:");
        int A = inputan.nextInt();
        System.out.println("Masukkan angka untuk variabel B:");
        int B = inputan.nextInt();

        if(A == B){
            System.out.println("Variabel A: " + A);
            System.out.println("Variabel B: " + B);
        } else if (A < B) {
            System.out.println("Variabel A: " + A);
        } else {
            System.out.println("Variabel B: " + B);
        }
        inputan.close();
    }
}

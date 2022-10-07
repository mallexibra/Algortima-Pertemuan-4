import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args){
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukkan angka untuk variabel P:");
        int P = inputan.nextInt();
        System.out.println("Masukkan angka untuk variabel Q:");
        int Q = inputan.nextInt();
        System.out.println("Masukkan angka untuk variabel R:");
        int R = inputan.nextInt();
    
        if(P > Q){
            if(R > P){
                System.out.println("Variabel R adalah: " + R);
            }else{
                System.out.println("Variabel P adalah: " + P);
            }
        } else if (Q > R) {
            System.out.println("Variabel Q adalah: " + Q);
        } else {
            System.out.println("Variabel R adalah: " + R);
        }
        inputan.close();
    }
}

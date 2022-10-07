import java.util.Scanner;
public class Tugas1{
    public static void main(String[] args) {
        Scanner inputin = new Scanner(System.in);
        System.out.println("Masukkan angka untuk Harga A:");
        int hargaA = inputin.nextInt();
        System.out.println("Masukkan angka untuk Harga B:");
        int hargaB = inputin.nextInt();
        int hargaX = hargaA + hargaB;
        int hargaY = 0;

        if(hargaX > 0){
            hargaY = hargaA * hargaB;
        }else{
            hargaY = hargaX;
        }

        System.out.println("Harga A adalah:" + hargaA);
        System.out.println("Harga B adalah:" + hargaB);
        System.out.println("Harga X adalah:" + hargaX);
        System.out.println("Harga Y adalah:" + hargaY);

        inputin.close();
    }
}
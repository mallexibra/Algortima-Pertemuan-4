import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        // Variabel suit jawa
        int gunting = 1;
        int batu = 2;
        int kertas = 3;

        // Input user tanganku
        System.out.println("Pilihlah gaco Tanganku sebagai berikut:");
        System.out.println("1 = Gunting, 2 = Batu, 3 = Kertas");
        int tanganku = masukan.nextInt();

        // Input user tanganmu
        System.out.println("Pilihlah gaco Tanganku sebagai berikut:");
        System.out.println("1 = Gunting, 2 = Batu, 3 = Kertas");
        int tanganmu = masukan.nextInt();

        // Tanganku sebagai gunting
        if(tanganku == gunting && tanganmu == gunting ){
            System.out.println("Gunting VS Gunting");
            System.out.println("Hasil dari tanganku dan tanganmu adalah SEIMBANG");
        }else if(tanganku == gunting && tanganmu == kertas){
            System.out.println("Gunting VS Kertas");
            System.out.println("Hasil dari tanganku dan tanganmu TANGANKU MENANG");
        }else if(tanganku == gunting && tanganmu == batu){
            System.out.println("Gunting VS Batu");
            System.out.println("Hasil dari tanganku dan tanganmu TANGANMU MENANG");
        }else if(tanganku >= 3 || tanganmu >= 3){
            System.out.println("Masukkan angka yang benar dong!");
        }

        // Tanganku sebagai batu
        if(tanganku == batu && tanganmu == batu ){
            System.out.println("Batu VS Batu");
            System.out.println("Hasil dari tanganku dan tanganmu adalah SEIMBANG");
        }else if(tanganku == batu && tanganmu == kertas){
            System.out.println("Batu VS Kertas");
            System.out.println("Hasil dari tanganku dan tanganmu TANGANKU MENANG");
        }else if(tanganku == batu && tanganmu == gunting){
            System.out.println("Batu VS Gunting");
            System.out.println("Hasil dari tanganku dan tanganmu TANGANMU MENANG");
        }

        // Tanganku sebagai kertas
        if(tanganku == kertas && tanganmu == kertas ){
            System.out.println("Kertas VS Kertas");
            System.out.println("Hasil dari tanganku dan tanganmu adalah SEIMBANG");
        }else if(tanganku == kertas && tanganmu == batu){
            System.out.println("Kertas VS Batu");
            System.out.println("Hasil dari tanganku dan tanganmu TANGANKU MENANG");
        }else if(tanganku == kertas && tanganmu == gunting){
            System.out.println("Kertas VS Gunting");
            System.out.println("Hasil dari tanganku dan tanganmu TANGANMU MENANG");
        }
    }
}

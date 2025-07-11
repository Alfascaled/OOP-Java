
import java.util.Scanner;

class Alat {
    String Nama;
    int Harga,Stok;

    Alat(String Nama, int Harga, int Stok) {
        this.Nama = Nama;
        this.Harga = Harga;
        this.Stok = Stok;
    }

    // static void tampilAlat(Alat[] daftar){

    //     for(int x = 0; x < daftar.length; x++) {
    //         System.out.println("No.: " + (x+1));
    //         System.out.println("Nama Alat: "+  daftar[x].Nama);
    //         System.out.println("Harga: "+  daftar[x].Harga);
    //         System.out.println("Stok: "+  daftar[x].Stok);
    //         System.out.println();
    //     }
    // }

    int totalHarga(int n) {
        return this.Harga * n;
    }

    boolean stokCukup(int j) {
        return this.Stok >= j;
    }

    void kurang (int k) {
        System.out.println("Stok dikurangi : " + k);
        this.Stok -= k;
        System.out.println("Detail Alat : ");
        System.out.println();
        System.out.println("Nama Alat: " + this.Nama);
        System.out.println("Harga    : " + this.Harga);
        System.out.println("Stok     : " + this.Stok);

    }

    void item() {
        System.out.println("Nama Alat: " + this.Nama);
        System.out.println("Harga    : " + this.Harga);
        System.out.println("Stok     : " + this.Stok);
    }

    static void enter(int x){
        for (int i = 0; i < x ; i++) {
            System.out.println();
        }
    }

    static void pause(Scanner input){
    System.out.print("Tekan ENTER untuk kembali ke menu...");
    input.nextLine();
    input.nextLine();
}
     
} // End of Alat class 

public class Kasir {

    public static void main(String[] args) {

        // Buat input

        Scanner input = new Scanner(System.in);


        Alat[] brbg = new Alat[4];

        brbg[0] = new Alat("Arrow",45000,300);
        brbg[1] = new Alat("Arm guard",200000,100);
        brbg[2] = new Alat("Bow Stand",150000,80);
        brbg[3] = new Alat("Finger Tab",100000,65);


        // Menu 
        while(true){
            System.out.println("========== TOKO PANAHAN Sejahtera ==========");
            System.out.println("1. Detail per Item");
            System.out.println("2. Cek Harga per item ");
            System.out.println("3. Cek Stok item");
            System.out.println("4. Keluar");

            Alat.enter(0);

            System.out.print("Pilih salah satu (1 - 4) : ");
            int menu = input.nextInt();

            // Fitur nomor 1 

            if (menu == 1){
                System.out.print("Pilih Alat : 1. Arrow | 2. Arm Guard | 3. Bow Stand | 4. Finger tab : ");
                int pilih = input.nextInt();

                if (pilih == 1) {
                    System.out.println("======================");
                    brbg[0].item();
                    System.out.println("======================");
                }
                else if (pilih == 2){
                    System.out.println("======================");
                    brbg[1].item();
                    System.out.println("======================");
                }
                else if (pilih == 3) {
                    System.out.println("======================");
                    brbg[2].item();
                    System.out.println("======================");
                }
                else if (pilih == 4){
                    System.out.println("======================");
                    brbg[3].item();
                    System.out.println("======================");
                }

                Alat.pause(input);
                
            }

            else if (menu == 4){

                break;
  

            }



        }



   
    }


        
}

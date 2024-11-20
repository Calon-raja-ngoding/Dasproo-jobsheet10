package Pertemuan13;
import java.util.Scanner;
public class Kafe18 {
    public static void Menu(String namaPelanggan, boolean isMember,String kodePromo){
        System.out.println("Selamat datang, "+namaPelanggan+" !");
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda memasukkan kode promo (DISKON50), dapatkan diskon 50% untuk setiap pembelian");
        }else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda memasukkan kode promo (DISKON50), dapatkan diskon 30% untuk setiap pembelian");
        }else{System.out.println("Anda memasukkan kode invalid");}

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println("====== MENU RESTO KAFE ======");
        System.out.println(" 1. Kopi Hitam - Rp.15.000");
        System.out.println(" 2. Cappuccino - Rp.20.000");
        System.out.println(" 3. Latte - Rp.22.000 ");
        System.out.println(" 4. Teh Tarik - Rp.12.000");
        System.out.println(" 5. Roti Bakar - Rp.10.000");
        System.out.println(" 6. Mie Goreng - Rp.18.000");
        System.out.println("=============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    public static double hitungTotalHarga18(int pilihanMenu, int banyakItem,String kodePromo){
        int[] hargaItems = {15000,20000,22000,12000,10000,18000};
         double diskon=0;
        if (kodePromo.equals("DISKON50")) {
            diskon += 0.5;
        }else if (kodePromo.equals("DISKON30")) {
            diskon+=0.3;
        }
        double hargaTotal = hargaItems[pilihanMenu-1] * banyakItem-((hargaItems[pilihanMenu-1] * banyakItem)*diskon);
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String nama = sc.nextLine();
        System.out.print("Member ?(true/false) : ");
        boolean member = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Masukkan kode promo : ");
        String kode = sc.nextLine();
        Menu(nama,member,kode);
        double totalHarga=0;
        int jumlah[]=new int[20],c=0;
        String pesanan[]=new String[20]; 
        while (true) {
            System.out.print("\nMasukkan nomor menu yg ingin anda pesan : ");
            int pilihanMenu =sc.nextInt();
            if (pilihanMenu == 0) {
                pesanan[c]="Kopi hitam";
            }else if (pilihanMenu == 2) {
                pesanan[c]="Latte";
            }else if (pilihanMenu == 3) {
                pesanan[c]="Latte";
            }else if (pilihanMenu == 4) {
                pesanan[c]="Teh Tarik";
            }else if (pilihanMenu == 5) {
                pesanan[c]="Roti Bakar";
            }else if (pilihanMenu == 6) {
                pesanan[c]="Mie Goreng";
            }
            System.out.print("Masukkan jumlah yg ingin dipesan : ");
            int baanyakItem = sc.nextInt();
            sc.nextLine();
            jumlah[c]= baanyakItem;
            totalHarga += hitungTotalHarga18(pilihanMenu, baanyakItem, kode);
            System.out.print("Apakah anda masih ingin menambahakan pesanan? (y/n) :");
            String status = sc.nextLine();
            if (status.equalsIgnoreCase("n")) {
                break;
            }
            c++;
        }
        System.out.println("\nPesanan :");
        for(int i = 0; i <= c; i++){
            System.out.println((i+1)+". "+pesanan[i]+" - "+jumlah[i]);
        }
        System.out.println("Total harga untuk pesanan anda : "+ totalHarga);

    }
}
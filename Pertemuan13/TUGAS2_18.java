package Pertemuan13;
import java.util.Scanner;

public class TUGAS2_18 {
    static Scanner sc=new Scanner(System.in);
    static int m,h;
    static int[][] data;
    static String[] menu;
    public static void main(String[] args) {
        mengisi();
        menginput();
        while (true) {
            System.out.println("\nLayanan :");
            System.out.println(" 1.Menampilkan seluruh data penjualan");
            System.out.println(" 2.Menampilkan penjualan terbanyak");
            System.out.println(" 3.Menampilkan rata-rata dari penjualan setiap menu");
            System.out.println(" 4.Keluar dari program");
            System.out.print("\nMasukkan angka dari layanan yg anda inginkan : ");
            int layanan = sc.nextInt();
            if (layanan == 1) {
                menampilkan();
            }else if (layanan == 2) {
                penjualanTertinggi();
            }else if (layanan == 3) {
                rata2Penjualan();
            }else{
                break;
            }
        }
    }
    static void mengisi(){
        System.out.print("Masukkan jumlah menu : ");
        m =sc.nextInt();
        System.out.print("Masukkan jumlah hari : ");
        h = sc.nextInt();
        sc.nextLine();

        data=new int[m][h];
        menu=new String[m];
    }
    static int[][] menginput(){
        for(int i =0;i<m;i++){
            System.out.println("Masukkan nama menu ke-"+ (i+1));
            menu[i]=sc.nextLine();
        }
        System.out.println("Menginput data penjualan : ");
        for(int i=0;i<m;i++){
            System.out.println((i+1)+"."+menu[i]);
            for(int j=0;j < h;j++){
                System.out.print("  -hari ke"+(j+1)+" : ");
                data [i][j]= sc.nextInt();
            }
            System.out.println();
        }
        System.out.println();
        return data;
    }
    static void menampilkan(){
        System.out.println("Menampilkan seluruh data penjualan : ");
        for(int i=0;i<data.length;i++){
            System.out.println((i+1)+"."+menu[i]);
            for(int j=0;j < data[i].length;j++){
                System.out.println("  - hari ke"+(j+1)+" : " +data[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void penjualanTertinggi(){
        int menuu=0,hari=0;
        int a = data[0][0];
        for(int i=0;i<data.length;i++){
            for(int j=1;j < data[i].length;j++){
                if (a<data[i][j]) {
                    menuu = i;
                    a = data[i][j];
                    hari = (j+1);
                }
            }
        }
        System.out.println("Penjualan terbanyak yaitu :");
        System.out.println("  -"+menu[menuu]+" pada hari ke-"+hari+" : "+a);
        System.out.println();
    }
    static void rata2Penjualan(){
        
        System.out.println("Rata-rata penjualan minggu ini");
        for(int i=0;i<data.length;i++){
            int total = 0;
            for(int j=0;j < data[i].length;j++){
                total += data[i][j];
            }
            System.out.println((i+1)+"."+menu[i]+" : "+ (total / h));
        }
    }
    

}

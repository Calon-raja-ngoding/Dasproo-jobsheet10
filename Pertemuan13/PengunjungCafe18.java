package Pertemuan13;

public class PengunjungCafe18 {
    public static void daftarPengunjung(int jumlah,
    String... namaPengunjung){
        for (String nama : namaPengunjung) {
            System.out.println(" - "+ nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung(3,"Ali","Budi","Citra");
    }
}

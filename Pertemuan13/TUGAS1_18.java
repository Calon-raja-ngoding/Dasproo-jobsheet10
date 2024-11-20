package Pertemuan13;
import java.util.Scanner;
public class TUGAS1_18 {
    static int hitungVolume(int s){
        int volume = s*s*s;
        return volume;
    }
    static int hitungLuasPermukaan(int s){
        int LP = 6*s*s;
        return LP;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sisi,luasPermukaan,volume;
        System.out.print("Masukkan panjang sisi : ");
        sisi = sc.nextInt();
        volume = hitungVolume(sisi);
        System.out.println("Volume dari kubus adalah "+ volume);
        luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan dari kubus adalah "+ luasPermukaan);
    }
}

package Pertemuan13;
public class PengunjungCafe23 {

    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung");
        for (String i : namaPengunjung){
            System.out.println(i);

        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra:");
    }
}
package Pertemuan13;

import java.util.Scanner;

public class Kafe23 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan ");
    }

    public static int hitungTotalHarga23(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        
        if ("DISKON50".equalsIgnoreCase(kodePromo)) {
            hargaTotal *= 0.5; 
            System.out.println("Anda mendapatkan diskon 50%!");
        } else if ("DISKON30".equalsIgnoreCase(kodePromo)) {
            hargaTotal *= 0.7; 
            System.out.println("Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid, tidak ada pengurangan total harga.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true);
        Scanner sc = new Scanner(System.in);
        int totalPesanan = 0;
        while (true) {
            
            System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            
            System.out.print("Masukkan kode promo (jika ada): ");
            String kodePromo = sc.next();
            
            int totalHarga = hitungTotalHarga23(pilihanMenu, banyakItem, kodePromo);
            
            totalPesanan += totalHarga;
            
            System.out.print("Apakah ada pesanan lagi? (y/n) :");
            String tambah = sc.next();
            if (tambah.equalsIgnoreCase("n")) {
                break;
                
            }
            
        }
        System.out.println("Total harga untuk pesanan anda: Rp " + totalPesanan);
    }
}

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Delfi Astuti
 */
public class MainPembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        Pembayaran pembayaran = null;
        
        System.out.println("Masukkan Jumlah------- Sistem Pembayaran Toko Online -------");
        System.out.println("Masukkan ID Transaksi = ");
        String id = scanner.nextLine();
        
        System.out.println("Masukkan Jumlah Bayar = ");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih Metode Pembayaran = ");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.println("Pilihan Metode Pembayaran Anda (1/2/3) : ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        
        switch(pilihan) {
            case 1 : System.out.println("Metode Transfer Bank");
                     System.out.print("Masukkan nama bank tujuan = ");
                     String bank = scanner.nextLine();
                     pembayaran = new PembayaranTransfer(bank,jumlah,id);
                     break;
            case 2 : System.out.println("Metode Kartu Kredit");
                     System.out.print("Masukkan nomor kartu kredit = ");
                     String nomor = scanner.nextLine();
                     pembayaran = new PembayaranKartuKredit(nomor,jumlah,id);
                     break; 
            case 3 : System.out.println("Metode E-Wallet");
                     System.out.print("Masukkan nama E-Wallet (OVO, Shopeepay, dll) = ");
                     String ewallet = scanner.nextLine();
                     pembayaran = new PembayaranEWallet(jumlah,id,ewallet);
                     break;       
        }
        System.out.println("\n==Konfirmasi Buktu Pembayaran === ");
        pembayaran.prosesPembayaran();
    }
}

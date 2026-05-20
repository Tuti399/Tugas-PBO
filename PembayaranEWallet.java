/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Delfi Astuti
 */
public class PembayaranEWallet extends Pembayaran {
    private String namaEWallet;
    
    public PembayaranEWallet(String namaEWallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEWallet = namaEWallet;
    }

    public String getNamaEWallet() {
        return namaEWallet;
    }

    public void setNamaEWallet(String namaEWallet) {
        this.namaEWallet = namaEWallet;
    }
    
    
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui E-Wallet : ");
        System.out.println("E-Wallet : " + namaEWallet);
        System.out.println("ID-Transaksi : " + idTransaksi);
        System.out.println("Jumlah Bayar : " + jumlahBayar);
    }
    
    
    
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Delfi Astuti
 */
public class PembayaranTransfer extends Pembayaran {
    private String namaBank;
    
    public PembayaranTransfer(String idTransaksi, double jumlahBayar, String id) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui Kartu Kredit : ");
        System.out.println("Nama Bank Tujuan : " + namaBank);
        System.out.println("ID-Transaksi : " + idTransaksi);
        System.out.println("Jumlah Bayar : " + jumlahBayar);
    }
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Delfi Astuti
 */
public class PembayaranKartuKredit extends Pembayaran {
    private String nomorKartu;
    
    public PembayaranKartuKredit(String nomorKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }
    
    @Override
     public void prosesPembayaran() {
        System.out.println("Pembayaran melalui Kartu Kredit : ");
        System.out.println("Nama Kartu Kredit : " + nomorKartu);
        System.out.println("ID-Transaksi : " + idTransaksi);
        System.out.println("Jumlah Bayar : " + jumlahBayar);
    }
    
    
}

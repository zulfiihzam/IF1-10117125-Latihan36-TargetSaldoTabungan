/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan36.targetsaldotabungan;

/**
 * @author
 * Nama     : Zulfi Ihzam Rahmat
 * Kelas    : IF-1
 * NIM      : 10117125
 * Deskripsi Program : program ini berisi program yang menampilkan target saldo
 * tabungan nasabah
 */
public class IF110117125Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 3500000;
        double bunga = 0.08;
        double bulan = 0;
        
        saldotabungan targetsaldotabungan = new saldotabungan();
        targetsaldotabungan.hitungsaldotabungan(saldo, bulan, bunga);
    }
    
}

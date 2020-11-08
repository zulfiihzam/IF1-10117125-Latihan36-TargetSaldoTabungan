/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan36.targetsaldotabungan;

/**
 *
 * @author zulfi ihzam
 */
public class saldotabungan {
    public void hitungsaldotabungan(int saldo, double bulan, double bunga){
    int i;
    for(i = 1; saldo<=6000000; i++){
        bulan = bunga * saldo;
        saldo = (int) (saldo + bulan);
        System.out.println("Saldo di Bulan ke-" + i +"Rp." + saldo);
    }   
}
}

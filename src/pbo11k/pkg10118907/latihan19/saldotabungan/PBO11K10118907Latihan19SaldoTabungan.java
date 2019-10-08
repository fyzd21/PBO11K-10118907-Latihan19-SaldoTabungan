/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan19.saldotabungan;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan mengjitung saldo tabungan
 * 
 */
public class PBO11K10118907Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo, saldo_awal = 2500000, lama = 6, bunga = 15;
        
        saldo(saldo_awal, lama, bunga);
        
    }
    
    public static void saldo(int saldo_awal, int lama, int bunga) {
        int saldo2, total = saldo_awal;
        for(int i = 1; i<=lama; i++) {
            saldo2 = total * bunga/100;
            total += saldo2;
            /**
             * Taken and inspired from
             * https://stackoverflow.com/questions/5323502/how-to-set-thousands-separator-in-java
             * Question from Funtime - https://stackoverflow.com/users/568939/funtime
             * Solution from syloc - https://stackoverflow.com/users/956629/syloc
             */
            System.out.println("Saldo bulan ke-"+i+" Rp"+String.format("%,d", total).replace(",", "."));
        }   
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi22205011latihan20.zalfa.java;
import java.util.Scanner;
/**
 *
 * @author User
 Nama : Zalfa Rosiyah Riski 
 Nim : 22205011
 Jurusan : Teknik Informatika
 Deskripsi : menampilkan target saldo tabungan
 */
public class TI_REGPAGI22205011latihan20ZalfaJava {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int bulan = 0;
        
        System.out.print("Saldo Awal: ");
        int saldoAwal = scanner.nextInt();

        System.out.print("Bunga/Bulan (%): ");
        int bungaPerBulan = scanner.nextInt();

        System.out.print("saldo target: ");
        int saldoTarget = scanner.nextInt();

        
        while (saldoAwal < saldoTarget) {
            bulan++;
            int bunga = saldoAwal * bungaPerBulan / 100 ;
            saldoAwal += bunga;
            System.out.println("Saldo di bulan ke-" + bulan + "= Rp." + saldoAwal);
            
        }
    }
}
    
            
           

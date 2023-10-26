/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi22205011latihan22.zalfa.java;
import java.util.Scanner;
/**
 *
 * @author User
 Nama : Zalfa Rosiyah Riski 
 Nim : 22205011
 Jurusan : Teknik Informatika
 Deskripsi : Membuat program perhitungan yang inputnya berasal dari kondisi lingkaran
 */
public class TI_REGPAGI22205011latihan22ZalfaJava {

    public static void main(String[] args) {
       System.out.println("=======Perhitungan lingkaran=======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai diameter lingkaran : ");
        String diameterLingkaran = scanner.nextLine();
        
        try {
            int d = Integer.parseInt(diameterLingkaran);
            
            if(d <= 0) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            
            } else {
                int jariJariLingkaran = d / 2;
                double luasLingkaran = Math.PI * jariJariLingkaran * jariJariLingkaran;
                double kelilingLingkaran = Math.PI * d;
        
                System.out.println("\n");
                System.out.println("=====Hasil Perhitungan Lingkaran=====");
                System.out.println("Jari-jari Lingkaran = " +jariJariLingkaran);
                System.out.println("Luas Lingkaran = "+luasLingkaran);
                System.out.println("Keliling Lingkaran = "+kelilingLingkaran);
            }
        } catch (NumberFormatException e) {
            System.out.println("Nilai Diameter Tidak Sesuai ");
    }
    }
}

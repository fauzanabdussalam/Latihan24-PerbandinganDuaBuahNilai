/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Membandingkan Dua Buah Nilai
 *
 */
public class PBO10K10119901Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int nilaiPertama = 0, nilaiKedua = 0;
        String aktivitas;

        System.out.println("========Program Perbandingan Nilai========");
        
        do 
        {
            System.out.print("Masukkan nilai pertama : ");
            nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua : ");
            nilaiKedua = scanner.nextInt();

            System.out.print("Hasil : ");
            if (nilaiPertama > nilaiKedua) 
            {
                System.out.println(nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } 
            else if (nilaiPertama < nilaiKedua) 
            {
                System.out.println(nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } 
            else 
            {
                System.out.println(nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
            aktivitas = scanner.next();
            aktivitas = aktivitas.toLowerCase();
            System.out.println();
        } 
        while (aktivitas.equals("ya"));
    }
    
}

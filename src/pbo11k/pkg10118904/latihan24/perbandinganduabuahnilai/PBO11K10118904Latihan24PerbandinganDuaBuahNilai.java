/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan24.perbandinganduabuahnilai;
import java.util.*;

/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program membandingakan dua buah nilai
 */
public class PBO11K10118904Latihan24PerbandinganDuaBuahNilai {
    public static Scanner input = new Scanner(System.in);
    public static void bandingkan(int b1 , int b2){
        if (b1 > b2)
            System.out.println(b1 +" Lebih beasr dari "+ b2);
        else if (b1 < b2)
            System.out.println(b1 +" Lebih-37"
                    + " kecil dari "+ b2);
        else
            System.out.println(b1 +" Sama dengan "+ b2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ulang = "Ya";
        int b1,b2;
        
        System.out.println("====== Program perbandingan nilai ======");
        do {
            System.out.print("Masukan nilai pertama : ");
            b1 = input.nextInt();
            System.out.print("Masukan nilai kedua   : ");
            b2 = input.nextInt();
            bandingkan(b1,b2);
            System.out.println("");
            System.out.print("Ulangi aktifitas ? (Ya/Tidak) : ");
            ulang = input.next();
            System.out.println("");
        } while(ulang.equals("Ya"));
    }
    
}

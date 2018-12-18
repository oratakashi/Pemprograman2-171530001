/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum9;

/**
 *
 * @author Nixia
 */
public class CetakTruk {
    
    public static void main(String arg[]){
        Truk truk=new Truk(1000);
        System.out.println("Muatan maksimal : " + truk.getMuatanMaks());
        truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan : 500");
        truk.tambahMuatan(350.0);
        System.out.println("Tambah muatan : 350");
        truk.tambahMuatan(100.0);
        System.out.println("Tambah muatan : 100");
        truk.tambahMuatan(150.0);
        System.out.println("Tambah muatan : 150");
        System.out.println("Muatan sekarang = " + truk.getMuatan());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10.Percobaan;

/**
 *
 * @author nixia
 */
class A{
    private final void Bergerak(){
        System.out.println("Animasi Berjalan");
    }
}
public class QOTD163 extends A{
    public final void Bergerak(){
        System.out.println("Bergerak");
    }
    public static void main(String arg[]){
        new QOTD163().Bergerak();
    }
}

/**
 * Analisa Code :
 * Outputnya adalah : Bergerak
 * Karena pada baris 22 memanggil method bergerak di class QOTD163
 */
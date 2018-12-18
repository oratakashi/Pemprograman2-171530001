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
class QOTD162 {
    public int x = 5;
}

class Child extends QOTD162{
    public int x = 10;
    public void info(int x){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

public class AksesNilai{
    public static void main(String arg[]){
        Child c = new Child();
        c.info(15);
    }
}

/**
 * Analisa Code :
 * Baris 19 menampilkan data x yang ada di parameter
 * Baris 20 menampilkan data x dari class Child
 * Baris 21 menampilkan data x dari class parent
 */
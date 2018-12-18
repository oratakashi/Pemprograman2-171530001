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
class Induk{
    Induk(){}
    protected void Metode1(){
        System.out.println("Induk : Metode 1");
    }
}

class Anak extends Induk{
    Anak(){}
    public void Metode1(){
        System.out.println("Anak : Metode 1");
    }
}

public class Aplikasi {
    public static void main(String[] args){
        Induk o = new Anak(); //Karena Induk Parent si Anak
        o.Metode1();
    }
}

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
final class QOTD161 {
    int xxx;
    void yyy(){xxx=1;}
}

class Bbb extends QOTD161{
    final QOTD161 finalref = new QOTD161();
    
    final void yyy(){
        System.out.println("method yyy");
        finalref.xxx = 12345;
    }
}

/**
 * Analisa Code :
 * Error karena class parent menggunakan final , sedangkan final merupakan modifier non akses
 */
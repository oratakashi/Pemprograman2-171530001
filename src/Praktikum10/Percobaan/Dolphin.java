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
class Animal{}
class Mammal extends Animal{}
class Cat extends Animal{}
public class Dolphin extends Mammal{
    public static void main(String[] args){
        Mammal m = new Cat();
        Animal a = m;
        Dolphin d = (Dolphin) a;
    }
}

/**
 * Analisa Code :
 * Baris 17 terdapat error karena tidak bisa membuat oject Mammal
 * Menggunakan new Cat karena bukan parentnya
 */
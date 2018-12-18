/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_11;

public class AutoNim {
  public static void main (String []args){
      String ta="2015";
      String kd_prodi="153";
      String no_reg="0001";
      String nim;
      
      nim= ta.substring(2,4)+kd_prodi+no_reg;
      
      System.out.println("NIM : "+nim);
  }  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10.Tugas;

/**
 *
 * @author nixia
 */
public class NilaiMatakuliah extends Matakuliah{
    double bobot_uts;
    double bobot_uas;
    double bobot_lain2;
    double nilai_uts;
    double nilai_uas;
    double nilai_lain2;
    double nilai_akhir;
    String Grade;
    Mahasiswa mhs;
    
    public double hitungNilai(){
        this.bobot_uts = 0.3;
        this.bobot_uas = 0.3;
        this.bobot_lain2 = 0.4;
        this.nilai_uas=75;
        this.nilai_uts=80;
        this.nilai_lain2=90;
        
        this.nilai_akhir = ((this.nilai_uts*this.bobot_uts)+(this.nilai_uas*this.bobot_uas)+(this.nilai_lain2*this.bobot_lain2));
        return this.nilai_akhir;
    }
    
    public void hitungGrade(){
        double nilai = this.nilai_akhir;
        if(nilai>80){
            System.out.println("Grade A");
            this.Grade = "A";
        }else if(nilai>=75||nilai<81){
            System.out.println("Grade AB");
            this.Grade = "AB";
        }else if(nilai>=70||nilai<76){
            System.out.println("Grade B");
            this.Grade = "B";
        }else if(nilai>=65||nilai<70){
            System.out.println("Grade BC");
            this.Grade = "BC";
        }else if(nilai>=45||nilai<55){
            System.out.println("Grade C");
            this.Grade = "C";
        }else if(nilai>35||nilai<45){
            System.out.println("Grade D");
            this.Grade = "D";
        }
    }
}

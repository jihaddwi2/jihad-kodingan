/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */


public class produktifrpl {
     int bilangannilai;
    String namapengguna;
    
    
    Scanner input = new Scanner(System.in);
    
    void lulus(){
        
    System.out.println("masukkan nama pengguna = ");
        namapengguna = input.nextLine(); 
        
    System.out.println("masukkan nilai RPL = ");
        bilangannilai = input.nextInt();
         
        
        
        if(bilangannilai <= 60) {System.out.println("maaf anda yang bernama "+namapengguna+" anda tidak lulus dengan nilai RPL = "+bilangannilai);
        }else{System.out.println("anda yang bernama "+namapengguna+" anda lulus dengan nilai RPL = "+bilangannilai);};
    }
    
}

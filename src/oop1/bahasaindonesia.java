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
public class bahasaindonesia {
    
    int bilangannilai;
    
    
    
    Scanner input = new Scanner(System.in);
    
    void lulus(){
        
    System.out.println("masukkan nilai Bahasa Indonesia = ");
        bilangannilai = input.nextInt();
         
        
        
        if(bilangannilai <= 60) {System.out.println("maaf anda tidak lulus dengan nilai Bahasa Indonesia = "+bilangannilai);
        }else{System.out.println("anda lulus dengan nilai Bahasa Indonesia = "+bilangannilai);};
    }
}

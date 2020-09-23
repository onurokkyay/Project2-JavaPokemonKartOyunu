/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author OnurOkyay
 */
public abstract class Oyuncu {
     private String OyuncuAdi;
     private String OyuncuID;
     private int Skor;
     ArrayList<Pokemon> liste=new ArrayList<Pokemon>();

    public String getOyuncuAdi() {
        return OyuncuAdi;
    }
     
    public Oyuncu() {
    }

    public Oyuncu(String OyuncuAdi, String OyuncuID, int Skor) {
        this.OyuncuAdi = OyuncuAdi;
        this.OyuncuID = OyuncuID;
        this.Skor = Skor;
    }
    public void SkorGoster(){
        System.out.println(""+this.Skor);
    }

    public void setSkor() {
        this.Skor =this.Skor+5;
    }

    public int getSkor() {
        return Skor;
    }
    
    
  
     abstract void KartSec(ArrayList<Pokemon> list,int a,int b,int c);
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author OnurOkyay
 */
public class Bilgisayar extends Oyuncu {
   private int a=0,b=0,c=0;
    
    
    
    public Bilgisayar() {
    }

    public Bilgisayar(String OyuncuAdi, String OyuncuID, int Skor) {
        super(OyuncuAdi, OyuncuID, Skor);
    }

    
       
    
    
    
   
    
    
    @Override
    void KartSec(ArrayList<Pokemon> list,int a ,int b,int c) {
       this.liste.add(list.get(a));
       this.liste.add(list.get(b));
       this.liste.add(list.get(c));
    }
    
    
    
    
    
}

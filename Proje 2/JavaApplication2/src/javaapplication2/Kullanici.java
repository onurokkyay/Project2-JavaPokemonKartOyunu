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
public class Kullanici extends Oyuncu{

    public Kullanici() {
    }

    public Kullanici(String OyuncuAdi, String OyuncuID, int Skor) {
        super(OyuncuAdi, OyuncuID, Skor);
    }

    
    
    
    @Override
    void KartSec(ArrayList<Pokemon> list, int a, int b, int c) {
        
    }
    
}

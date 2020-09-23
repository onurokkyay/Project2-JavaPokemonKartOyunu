/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.ImageIcon;

/**
 *
 * @author OnurOkyay
 */
public class Butterfree extends Pokemon {
    
    private String dosyayolu = "src\\img\\butterfree.jpg";

private ImageIcon icon = new ImageIcon(dosyayolu);
    public int kullanim=0;
     private int kullanim2=0;
    private int damage=10;
    
            public Butterfree(){
                
            }
            
            public  Butterfree(String pokemonID,String pokemonAdi,String pokemonTip){
                    super(pokemonID,pokemonAdi,pokemonTip);
                    
    }

    public String getDosyayolu() {
        return dosyayolu;
    }

  
            
            
            
            public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void hasarPuaniGoster() {
         System.out.println(""+this.damage);
    }

    /**
     *
     * @return
     */
    @Override
    public boolean kullanildiMi(int x){
        if(x==1){
            System.out.println("kullanildi");
        return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean kullanildiMi2(int x) {
        if(x==1){
            System.out.println("kullanildi");
        return true;
        }else{
            return false;
        }
    }
    
    public int getKullanim2() {
        return kullanim2;
    }

    public void setKullanim2() {
        this.kullanim2 =1;
    }
    

}

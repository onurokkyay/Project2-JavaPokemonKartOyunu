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
public class Pokemon {
    private int kullanim;
    private int kullanim2;
    private String pokemonID;
    private String pokemonAdi;
    private String pokemonTip;
    private int damage;
    
    
    public Pokemon(){
    }
    
    
            
    public  Pokemon(String pokemonID,String pokemonAdi,String pokemonTip){
        this.kullanim=0;
        this.kullanim2=0;
        this.pokemonID=pokemonID;
        this.pokemonAdi=pokemonAdi;
        this.pokemonTip=pokemonTip;
    }
   
     public void setKullanim(){
        this.kullanim=1;
    }
      public int getKullanim(){
        return this.kullanim;
    }
      public int getDamage(){
        return this.damage;
    }
      
private String dosyayolu;

    public String getDosyayolu() {
        return dosyayolu;
    }

   

    

    
    
    
    public void setPokemonID(String pokemonID){
        this.pokemonID=pokemonID;
    }
    public String getPokemonID(){
        return this.pokemonID;
    }
     public void setPokemonAdi(String pokemonAdi){
        this.pokemonAdi=pokemonAdi;
    }
    public String getPokemonAdi(){
        return this.pokemonAdi;
    }
     public void setPokemonTip(String pokemonTip){
        this.pokemonTip=pokemonTip;
    }
    public String getPokemonTip(){
        return this.pokemonTip;
    }
    
    public void showInfos(){
        System.out.println(""+this.getPokemonID());
        System.out.println(""+this.getPokemonAdi());
        System.out.println(""+this.getPokemonTip());
    }
    public void hasarPuaniGoster(){
        System.out.println("sa");
    }
    
    public boolean kullanildiMi(int x){
        if(x==1){
            System.out.println("kullanildi");
        return true;
        }else{
            return false;
        }
    }
    
        public boolean kullanildiMi2(int x){
        if(x==1){
            System.out.println("kullanildi");
        return true;
        }else{
            return false;
        }
    }

    public void setKullanim2() {
        this.kullanim2 = 1;
    }

    public int getKullanim2() {
        return kullanim2;
    }

    void setDosyayolu(String dosyayolu) {
       this.dosyayolu=dosyayolu;
    }

    

        
    
    
}

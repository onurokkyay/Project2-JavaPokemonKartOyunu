
package javaapplication2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author OnurOkyay
 */
public class JavaApplication2 {
    
    

  
    public static void main(String[] args) {
        AnaMenü menü=new AnaMenü();
        menü.setVisible(true);
            
        /* ArrayList<Pokemon> list=new ArrayList<Pokemon>();
            Pikachu pika=new Pikachu("01","Pikachu","Elektrik");
            Bulbasaur bulba=new Bulbasaur("02","Bulbasaur","Çim");
            Charmander charman=new Charmander("03","Charmander","Ateş");
            Squirtle squ=new Squirtle("04","Squirtle","Su");
            Zubat zuba=new Zubat("05","Zubat","Hava");
            Psyduck psy=new Psyduck("06","Psyduck","Su");
            Snorlax snor=new Snorlax("07","Snorlax","Normal");
            Butterfree butter=new Butterfree("08","Butterfree","Hava");
            Jigglypuff jiggly=new Jigglypuff("09","Jigglypuff","Ses");
            Meowth meow=new Meowth("10","Meowth","Normal");
            Bilgisayar Bot=new Bilgisayar("Bilgisayar","000",0);
            list.add(pika);
            list.add(bulba);
            list.add(charman);
            list.add(squ);
            list.add(zuba);
            list.add(psy);
            list.add(snor);
            list.add(butter);
            list.add(jiggly);
            list.add(meow);*/
            
          
            int a,b,c;
            Random  rnd=new Random();
            do{
                a=rnd.nextInt(10);
                b=rnd.nextInt(10);
                c=rnd.nextInt(10);
                
            }while(a==b || a==c || b==c);
            
           /* Bot.KartSec(list,a,b,c);
            System.out.println(""+Bot.liste.get(0));
            System.out.println(""+Bot.liste.get(1));  
            System.out.println(""+Bot.liste.get(2));
            Bot.liste.get(0).setKullanim();
            Bot.liste.get(1).setKullanim();
            Bot.liste.get(2).setKullanim();
            System.out.println(Bot.liste.get(0).getKullanim());
            System.out.println(Bot.liste.get(1).getKullanim());
            System.out.println(Bot.liste.get(2).getKullanim());
            */
            
            
            
            
        /*pika.showInfos();
        pika.hasarPuaniGoster();
        bulba.showInfos();
        bulba.hasarPuaniGoster();
        charman.showInfos();
        charman.hasarPuaniGoster();
        squ.showInfos();
        squ.hasarPuaniGoster();
        zuba.showInfos();
        zuba.hasarPuaniGoster();
        psy.showInfos();
        psy.hasarPuaniGoster();
        snor.showInfos();
        snor.hasarPuaniGoster();
        butter.showInfos();
        butter.hasarPuaniGoster();
        jiggly.showInfos();
        jiggly.hasarPuaniGoster();
        meow.showInfos();
        meow.hasarPuaniGoster();*/
        
   
    }
}

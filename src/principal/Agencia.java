package principal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabrielapazmino
 */
public class Agencia {
    public void presentarMenu() throws ParseException{
        System.out.println("Buenas dias, que cargo tiene usted?(Cliente o agencia)");
        String ocupacion=sc.nextLine();
        switch(ocupacion){
            case "Cliente":
                
                break;
            case "agencia":
                presentarMenuAgencia();
                break;
        }  
        
    
    }

    public Agencia() {
        presentarMenu();
    }
            
    }

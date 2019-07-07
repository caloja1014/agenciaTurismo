package principal;

import Menu.MenuAgencia;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
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
    
    public static ArrayList<Reserva> reservas=new ArrayList<>();

    Scanner sc=new Scanner(System.in);
    
    public Agencia() throws ParseException {
        presentarMenu();
    }
        
    public void presentarMenu() throws ParseException{
        System.out.println("Buenas dias, que cargo tiene usted?(Cliente o agencia)");
        String ocupacion=sc.nextLine();
        switch(ocupacion){
            case "Cliente":
                
                break;
            case "agencia":
                MenuAgencia ma=new MenuAgencia();
                break;
        }  
        
    
    }


            
}

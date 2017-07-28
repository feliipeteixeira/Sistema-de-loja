/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Geral;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author felipe
 */
public class MascaraGeral {
    private static final String EMAIL_PATTERN =
     "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
     + 
     "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
      
    public boolean MascaraEmail(String email){
        //Verifica se mascara 
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        // CASO MASCARA SEJA VERDADE, 
        
        if(matcher.matches() == true){
            return true;
        }else return false;
         
       
    
    }
    
}

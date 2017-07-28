/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.CampoDigitado;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


    
    public class ControleGeral extends PlainDocument {
   
    private int maxLength = 0;
    String CondiçãoCampo = "";   
       
    public ControleGeral(int TamanhoTexto,String ExpresaoRegular){
    
             this.maxLength = TamanhoTexto;
             this.CondiçãoCampo = ExpresaoRegular;
             
        } 
         
    @Override  
    public void insertString(int offset, String str, AttributeSet attr)   
    throws BadLocationException {  
        
        if (str == null || getLength() == maxLength)  
            return;  
            System.out.println(str);
        int totalIncricao = (getLength() + str.length());  
        if (totalIncricao <= maxLength) {  
        
             super.insertString(offset,str.replaceAll(CondiçãoCampo,""), attr);
        
        }  else {
        
            super.insertString(offset,str.replaceAll("[aA0-zZ9]",""), attr);
    
        }    
    }  

    
    
    
    
    
}

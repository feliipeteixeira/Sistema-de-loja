
package Controle.CampoDigitado;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;




  
  
    /**
     
     Sempre que o modelo de dados (o conteúdo propriamente dito) de um JTextField for modificado, 
     o método insertString() daquele modelo será invocado (no caso, o de um objeto PlainDocument).  
     O argumento offset indica o deslocamento (a posição) inicial onde o objeto String str deverá ser inserido 
     (o argumento AttributeSet não é útil para o que desejamos fazer, além de PlainDocument gerenciar modelos de 
     conteúdo de texto que não possuem atributos de caracteres). Agora, finalmente, ao invés de extendermos a 
     classe JTextField, vamos extender a classe PlainDocument e criar um novo modelo de dados que seja capaz de 
     restringir o número de caracteres aceitos no modelo de dados de qualquer JTextField. 
     
     
     */
   


class ControleCampo extends PlainDocument {
   
  @Override
  public void insertString(int offset, String str, AttributeSet attr)  
      throws BadLocationException {  
       // tamanho da string 
        if(this.getLength() + str.length() <= 10){
                super.insertString(offset,str.replaceAll("[^0-9]",""), attr);
        }
     else{
        super.insertString(offset, str, attr);
        }
       }  
   
    
}
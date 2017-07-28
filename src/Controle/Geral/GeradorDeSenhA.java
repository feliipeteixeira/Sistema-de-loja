/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Geral;

import Controle.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author felipe
 */
public class GeradorDeSenhA {
    
    public void Criptografia(String Texto) throws NoSuchAlgorithmException, UnsupportedEncodingException{
         
                     MessageDigest CriptografiaSHA256= MessageDigest.getInstance("SHA-256");
                     byte TextoGerado[] = CriptografiaSHA256.digest(Texto.getBytes("UTF-8"));
                     
                     
                     
                     
                     StringBuilder SalvandoHex = new StringBuilder();
                     for (byte b : TextoGerado) {
                              SalvandoHex.append(String.format("%02X", 0xFF & b));
                     }
                    String CriptografiaGerada = SalvandoHex.toString();
                    System.out.println("retorno: " + CriptografiaGerada);
    }
    
    public boolean Compara(String Texto, String Texto2){
    
    return false;
    }
    
}

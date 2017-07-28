
package Controle.Geral;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.*;    
public class ControleMonetário extends PlainDocument {    
    
public static final int NUMERO_DIGITOS_MAXIMO = 12;    
    

    /**Constantes para definir o formato*/  
    public static final String NUMERO = "#,##0.00; -#,##0.00";  
    public static final String REAL = "R$ #,##0.00;R$ -#,##0.00";  
    public static final String PORCENTAGEM = "#,##0.00'%';-#,##0.00'%'";  


      
    public NumberFormat z = NumberFormat.getCurrencyInstance();
      
    /**Valor inserido no campo*/  
    private double dValue = 0.0;  
      
    /**Ultimo valor válido*/  
    private String oldValue = "0.00";  
      
    /**String que será exibida em caso de valor inválido ou fora do formato*/  
    public static final String ERRO = "Valor inválido";  
      

public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {    
    
    System.out.println(str);
    
   String texto = getText(0, getLength());    
  for (int i = 0; i < str.length(); i++) {    
      char c = str.charAt(i);    
      if (!Character.isDigit(c)) {    
          return;    
      }    
  }    
  
  
    
   if(texto.length() < this.NUMERO_DIGITOS_MAXIMO){    
      
      super.remove(0, getLength());     
      texto = texto.replace(".", "").replace(",", "");    
      StringBuffer s = new StringBuffer(texto + str);    
      
   if (s.length() > 0 && s.charAt(0) == '0') {    
       s.deleteCharAt(0);    
   }    
  
   
   
   if(s.length() < 3) {    
     if(s.length() < 1) {     
         s.insert(0,"000");    
     }else if (s.length() < 2) {    
         s.insert(0,"00");    
   }else{    
    s.insert(0,"0");    
    }    
   }     
    
  s.insert(s.length()-2, ",");    

  
  
  if(s.length() > 6) {    
    s.insert(s.length()-6, ".");    
  }    

  
  
  if(s.length() > 10) {    
    s.insert(s.length()-10, ".");    
  }    
    
  super.insertString(0, s.toString(), a);    
  }    
}    

public void remove(int offset, int length) throws BadLocationException {    
    super.remove(offset, length);     
      String texto = getText(0, getLength());    
      texto = texto.replace(",", "");    
      texto = texto.replace(".", "");    
    super.remove(0, getLength());    
    insertString(0, texto, null);    
  }    
   
//================================================================================================







//Converte uma String para o formato de um BigDecimal
public static BigDecimal ConvertStringValueToBigDecimal(String numero, Integer qtdeCasasDecimais) {
        String casasDecimais = "";
        String num = numero;
        DecimalFormat df = null;
        try {
            if (qtdeCasasDecimais > 0) {
                for (int i = 0; i < qtdeCasasDecimais; i++) {
                    casasDecimais = casasDecimais.concat("0");
                }
                if (num.equals("")) {
                    num = "0.".concat(casasDecimais);
                }
                df = new DecimalFormat("#,##0.".concat(casasDecimais), new DecimalFormatSymbols(new Locale("pt", "BR")));
                df.setParseBigDecimal(true); // aqui o pulo do gato
                df.setRoundingMode(RoundingMode.DOWN);
                return (BigDecimal) df.parse(num); // deve voltar o BigDecimal "1234.56"
            } else {
                if (num.equals("")) {
                    num = "0";
                }
                df = new DecimalFormat("###########");
                df.setParseBigDecimal(true);
                df.setRoundingMode(RoundingMode.DOWN);
                return new BigDecimal(((BigDecimal) df.parse(num)).intValue());
            }
        } catch (ParseException ex) {
            
            return new BigDecimal("0");
        }
    }

//================================================================================================

public static String TipoDeCalculo(String ValorConta, String Desconto,String DinheiroRecebido) throws ParseException{
          
     if(ValorConta.equals("")){
         JOptionPane.showMessageDialog(null, "SubTotal vazio");
         return "";
     }
    
    else if(Desconto.equals("")){
     
        
    return SemDisconto(ValorConta,DinheiroRecebido);
    
    }else {
        //JOptionPane.showMessageDialog(null,Disconto(ValorConta,Desconto));
         //JOptionPane.showMessageDialog(null,ComDisconto(Disconto(ValorConta,Desconto), DinheiroRecebido));
        Double AuxDesconto = Disconto(ValorConta,Desconto);
         
        return ComDisconto(AuxDesconto, ValorConta);
        
    }
     
 }
 
public static double Disconto(String SubTotal, String Desconto) throws ParseException{

    DecimalFormatSymbols dfs = new DecimalFormatSymbols (new Locale ("pt", "BR"));
    DecimalFormat df = new DecimalFormat ("#,##0.00", dfs);
    
   
    double TotalContaAux = df.parse (SubTotal).doubleValue();
    double DescontoAux = df.parse (Desconto).doubleValue();
    
    
    double ResultadoTroco;
    ResultadoTroco = (TotalContaAux*DescontoAux) / 100;
    double aux = Math.ceil(ResultadoTroco);

   return aux;
}
 
public static String SemDisconto(String SubTotal, String Dinheiro) throws ParseException{

    DecimalFormatSymbols dfs = new DecimalFormatSymbols (new Locale ("pt", "BR"));
    DecimalFormat df = new DecimalFormat ("#,##0.00", dfs);
    
    double TotalContaAux = df.parse (SubTotal).doubleValue();
    double DinheiroAux = df.parse (Dinheiro).doubleValue();
    
    
    double ResultadoTroco;
    ResultadoTroco = DinheiroAux - TotalContaAux;
       
   //AREDONDA OS VALORES PARA DUAS CASAS DECIMAIS
   double aux = Math.ceil(ResultadoTroco);
  
    // CONVERTE PARA STRING, FORMATO CORRETO 
    String converte =  NumberFormat.getCurrencyInstance().format(aux);
    
   
return converte;
}

public static String ComDisconto(Double Desconto, String Subtotal) throws ParseException {
     NumberFormat z = NumberFormat.getCurrencyInstance();
     
    Locale meuLocal = new Locale( "pt", "BR" ); 

   DecimalFormatSymbols dfs = new DecimalFormatSymbols (new Locale ("pt", "BR"));
   DecimalFormat df = new DecimalFormat (NUMERO, dfs);
   
    double d = df.parse (Subtotal).doubleValue();

    System.out.println("d: "+d);
    System.out.println("d1: "+ Desconto);
    
   double restul;
   restul = d - Desconto;
   
   //AREDONDA OS VALORES PARA DUAS CASAS DECIMAIS
    double aux = Math.ceil(restul);

      
return Converte(aux);
}





//================================================================================================


public String Troco(String ContaTotal, String dinheiro) throws ParseException{
    
    // CONVERTE DOUBLE DE VIDO O METODO PRINCIPAL ESTA FORMATODO CORRETO
    double numDouble = Double.parseDouble(ContaTotal);
    
    DecimalFormatSymbols dfs = new DecimalFormatSymbols (new Locale ("pt", "BR"));
    DecimalFormat df = new DecimalFormat (NUMERO, dfs);

    double dinheiroAux = df.parse (dinheiro).doubleValue();
    
    System.out.println("troco total: " + numDouble);
    System.out.println("dinheiro: " + dinheiro);
    
    //CALCULO PARA RESULTADO FINAL
    double ResultadoTroco; 
    ResultadoTroco = numDouble - dinheiroAux; 
   
    //AREDONDA OS VALORES PARA DUAS CASAS DECIMAIS
    double aux = Math.ceil(ResultadoTroco);
    
    // CONVERTE PARA STRING, FORMATO CORRETO 
    String converte = z.format(aux);
    
    // retira o negativo do calculo 
    String numeroPonto = converte.replaceAll("-","");
    
    

    
    return numeroPonto;
}

  public static String Converte(double aux) {
        
      String z = NumberFormat.getCurrencyInstance().format(aux);
    
    return z;

    }



}   




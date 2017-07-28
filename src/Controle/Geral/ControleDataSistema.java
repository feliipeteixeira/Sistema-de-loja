/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Geral;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatterBuilder;


/**
 *
 * @author felipe
 */
public class ControleDataSistema {
    
        //Formato de data para banco de dados
        public String HoraFormatoBanco(){

            LocalDateTime hoje = LocalDateTime.now();
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println("data localformate" + hoje.format(formatador)); //08/04/2014
            return hoje.format(formatador);
        }

         //Formato de data para banco de dados
        public String HoraFormatoBrasil(){

            LocalDateTime hoje = LocalDateTime.now();
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            System.out.println("data localformate" + hoje.format(formatador)); //08/04/2014
            return hoje.format(formatador);
        }

        public String DataDetalhadaFormatoBanco(String dateTime){
            System.out.println("banco de dados: " + dateTime);
         org.joda.time.format.DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-dd-MM HH:mm:ss");
         DateTime jodatime = dtf.parseDateTime(dateTime);

         org.joda.time.format.DateTimeFormatter fmt = new DateTimeFormatterBuilder().
                 appendDayOfWeekText().
                 appendMonthOfYearText().
                 toFormatter();

         System.out.println("dia da semana: " + fmt.print(jodatime));
         // Format for output
         org.joda.time.format.DateTimeFormatter dtfOut = DateTimeFormat.forPattern("dd/MM/yyyy hh:mm");
         // Printing the date
         System.out.println("Data : " + dtfOut.print(jodatime));

         return dtf.print(jodatime);

        }

        public String DataDetalhadaFormatoBanco1(String dateTime){

            if (dateTime.charAt(dateTime.length() - 2) == '.') { // verifica se o último caractere é uma vírgula
                System.out.println("sim");
                }
             DateTime date = DateTime.parse(dateTime, DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.S"));
             // Format for input
             org.joda.time.format.DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.S");
             DateTime jodatime = dtf.parseDateTime(dateTime);

            return dtf.print(jodatime);

        }

        public String Data(String dateTime1){
                        // Format for input
            org.joda.time.format.DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.S");
            // Parsing the date
            DateTime jodatime = dtf.parseDateTime(dateTime1);
            org.joda.time.format.DateTimeFormatter fmt = new DateTimeFormatterBuilder().
                     appendDayOfMonth(2). // 2 Digito (Valor mínimo) - Preenche com 0 se for menor que 10
                     appendLiteral('/'). // Separador
                     appendMonthOfYear(2). // Mes como Texto
                     appendLiteral('/'). // Separador
                     appendYear(2, 4).
                     appendLiteral("  ").// Numero minimo para impressao (2) | Numero maximo para parse (4)       
                     appendHourOfDay(2).
                    appendLiteral(':').
                    appendMinuteOfHour(2).
                    appendLiteral("  ").
                    appendDayOfWeekText().
                     appendLiteral("  ").
                     appendMonthOfYearText().
                     appendLiteral("  ").
                    appendLiteral("  ").
                     toFormatter();
            
                   
        return  fmt.print(jodatime);
                
                }
       
        public String FormatoOriginalDataHora(String DataHora){
             // Format for input
            org.joda.time.format.DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
            // Parsing the date
            DateTime jodatime = dtf.parseDateTime(DataHora);
            org.joda.time.format.DateTimeFormatter fmt = new DateTimeFormatterBuilder().
                     appendDayOfMonth(2). // 2 Digito (Valor mínimo) - Preenche com 0 se for menor que 10
                     appendLiteral('/'). // Separador
                     appendMonthOfYear(2). // Mes como Texto
                     appendLiteral('/'). // Separador
                     appendYear(2, 4).
                     appendLiteral("  ").// Numero minimo para impressao (2) | Numero maximo para parse (4)       
                     appendHourOfDay(2).
                    appendLiteral(':').
                    appendMinuteOfHour(2).
                    appendLiteral("  ").
                    appendDayOfWeekText().
                     appendLiteral("  ").
                     appendMonthOfYearText().
                     appendLiteral("  ").
                    appendLiteral("  ").
                     toFormatter();
            
                   
        return  fmt.print(jodatime);
                
        }

}

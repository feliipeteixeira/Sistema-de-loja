package Controle;

import java.awt.EventQueue;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.text.*;

public class ChanceMaskTextFormattedFieldText extends javax.swing.JFrame {

    private javax.swing.JFormattedTextField fmtField;
    private javax.swing.JRadioButton radioButtonCNPJ;
    private javax.swing.JRadioButton radioButtonCPF;

    private MaskFormatter CNPJMask;
    private MaskFormatter CPFMask;

    public ChanceMaskTextFormattedFieldText() {
        initComponents();

        //adiciona os radiobuttons no groupbutton
        //pra que apenas um seja selecionavel
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButtonCPF);
        radioGroup.add(radioButtonCNPJ);

        //cria as mascaras e já a deixa pronta pra uso
        try {
            CNPJMask = new MaskFormatter("##.###.###/####-##");
            CPFMask = new MaskFormatter("###.###.###-##");
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        //adiciona um listener 
        radioButtonCPF.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    fmtField.setValue(null);
                    fmtField.setFormatterFactory(new DefaultFormatterFactory(CPFMask));
                }
            }
        });

        radioButtonCNPJ.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    
                    fmtField.setValue(null);
                    fmtField.setFormatterFactory(new DefaultFormatterFactory(CNPJMask));
                }
            }
        });
    }

    @SuppressWarnings("unchecked")                       
    private void initComponents() {

        fmtField = new javax.swing.JFormattedTextField();
        radioButtonCPF = new javax.swing.JRadioButton();
        radioButtonCNPJ = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radioButtonCPF.setText("CPF");

        radioButtonCNPJ.setText("CNPJ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonCNPJ)
                    .addComponent(radioButtonCPF)
                    .addComponent(fmtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(fmtField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(radioButtonCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButtonCNPJ)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }                     

    public static void main(String args[]) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChanceMaskTextFormattedFieldText().setVisible(true);
            }
        });
    }                
}
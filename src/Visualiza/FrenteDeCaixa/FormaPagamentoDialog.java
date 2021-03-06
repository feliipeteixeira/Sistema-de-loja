package Visualiza.FrenteDeCaixa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Controle.Geral.ControleMonetário;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.jdesktop.swingx.JXImagePanel;



/**
 *
 * @author felipe
 */
public class FormaPagamentoDialog extends javax.swing.JDialog {

     
    public String aux, ValorPago,trocado;

    
    
    
    /**
     * Creates new form FormaPagamento1
     */
    public FormaPagamentoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
                 
        setLocationRelativeTo(null);
        PainelValorPago.setOpaque(false);
        SubTotal.requestFocus();
        ValorRecebido.setDocument(new ControleMonetário());
        Desconto.setDocument(new ControleMonetário());
        SubTotal.setDocument(new ControleMonetário());
        
        ImageIcon imagem = new ImageIcon(getClass().getResource("/Img/Graficos/FundosCaixa.png"));        
        imagePanel.setImage(imagem.getImage());
        imagePanel.setStyle(JXImagePanel.Style.SCALED);  
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel = new org.jdesktop.swingx.JXImagePanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        SubTotal = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Desconto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ValorRecebido = new javax.swing.JTextField();
        PainelValorPago = new javax.swing.JPanel();
        pago = new javax.swing.JLabel();
        Troco = new javax.swing.JLabel();
        FinalizarCompra = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        FormaPagamento = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShadowColor(new java.awt.Color(153, 153, 153));
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        imagePanel.setBorder(dropShadowBorder1);
        imagePanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imagePanelKeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Forma de pagamento");

        jLabel20.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Subtotal");

        SubTotal.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        SubTotal.setText("0.00");
        SubTotal.setToolTipText("");
        SubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTotalActionPerformed(evt);
            }
        });
        SubTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SubTotalKeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Desconto");

        Desconto.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        Desconto.setText("0.00");
        Desconto.setToolTipText("");
        Desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescontoActionPerformed(evt);
            }
        });
        Desconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DescontoKeyPressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Valor recebido");

        ValorRecebido.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        ValorRecebido.setText("0.00");
        ValorRecebido.setToolTipText("");
        ValorRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorRecebidoActionPerformed(evt);
            }
        });
        ValorRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ValorRecebidoKeyPressed(evt);
            }
        });

        PainelValorPago.setBackground(new java.awt.Color(255, 255, 255));
        PainelValorPago.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        pago.setFont(new java.awt.Font("Arial Narrow", 1, 60)); // NOI18N
        pago.setForeground(new java.awt.Color(255, 0, 0));

        Troco.setFont(new java.awt.Font("Arial Narrow", 1, 60)); // NOI18N
        Troco.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout PainelValorPagoLayout = new javax.swing.GroupLayout(PainelValorPago);
        PainelValorPago.setLayout(PainelValorPagoLayout);
        PainelValorPagoLayout.setHorizontalGroup(
            PainelValorPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelValorPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Troco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PainelValorPagoLayout.setVerticalGroup(
            PainelValorPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pago, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
            .addComponent(Troco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        FinalizarCompra.setText("FINALIZAR CONTA");
        FinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarCompraActionPerformed(evt);
            }
        });
        FinalizarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FinalizarCompraKeyPressed(evt);
            }
        });

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        FormaPagamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão de crédito", "Cartão de Débito", "Dividir conta", "Transferência Bancária", "Cheques", "Parcelada" }));
        FormaPagamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FormaPagamentoItemStateChanged(evt);
            }
        });
        FormaPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FormaPagamentoMouseClicked(evt);
            }
        });
        FormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaPagamentoActionPerformed(evt);
            }
        });
        FormaPagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FormaPagamentoKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(252, 0, 50));
        jButton2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botao/delete.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Valor total ");

        jLabel19.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Valor total ");

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addComponent(PainelValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Desconto)
                            .addComponent(SubTotal)
                            .addComponent(ValorRecebido)
                            .addComponent(FormaPagamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FinalizarCompra)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel22))
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(187, 187, 187))
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Desconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubTotalActionPerformed

    private void SubTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SubTotalKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            Desconto.requestFocus();
            // botao.requestFocus();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_SubTotalKeyPressed

    private void DescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescontoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_DescontoActionPerformed

    private void DescontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescontoKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            ValorRecebido.requestFocus();
            // botao.requestFocus();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_DescontoKeyPressed

    private void ValorRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorRecebidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorRecebidoActionPerformed

    private void ValorRecebidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorRecebidoKeyPressed

        // if(SubTotal.getText().equals("")|| Desconto.getText().equals("")||ValorRecebido.getText().equals("") ){
            // Desconto.setText("0,00");
            //ValorRecebido.setText("0,00");
            // JOptionPane.showMessageDialog(null, "Campo vazio");
            //} else {

            double porcentagem;
            double valor;
            double resultado;

            if(evt.getKeyCode() == evt.VK_ENTER){

                try {
                    
             ControleMonetário controleMonetário = new ControleMonetário();
                    ValorPago = controleMonetário.TipoDeCalculo(SubTotal.getText(), Desconto.getText(),ValorRecebido.getText());
                  
                    trocado = controleMonetário.Troco(ValorPago,ValorRecebido.getText());
                    
                    
                } catch (ParseException ex) {
                    Logger.getLogger(FormaPagamentoDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              //  System.out.println("valor recebido: " + ValorPago);
               // trocado = controleMonetário.Troco(ValorPago,ValorRecebido.getText());
                
                pago.setText(ValorPago);
                Troco.setText(trocado);

                //float subtoltal = Float.parseFloat(SubTotal.getText());
                //float desconto = Float.parseFloat(Desconto.getText());

                //System.out.println(desconto);
                FormaPagamento.requestFocus();
                // botao.requestFocus();

                //  }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ValorRecebidoKeyPressed

    private void FinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarCompraActionPerformed

        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_FinalizarCompraActionPerformed

    private void FinalizarCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FinalizarCompraKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            dispose();
            // botao.requestFocus();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_FinalizarCompraKeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed



        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void FormaPagamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FormaPagamentoItemStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_FormaPagamentoItemStateChanged

    private void FormaPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaPagamentoMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_FormaPagamentoMouseClicked

    private void FormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaPagamentoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_FormaPagamentoActionPerformed

    private void FormaPagamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FormaPagamentoKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){
            FinalizarCompra.requestFocus();
            if(FormaPagamento.getSelectedIndex()== 3){
                DividindoPagamentoDialog dividindoPagamentoDialog = new DividindoPagamentoDialog(null, rootPaneCheckingEnabled, ValorPago);
                dividindoPagamentoDialog.setVisible(true);

            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_FormaPagamentoKeyPressed

    private void imagePanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imagePanelKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_imagePanelKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormaPagamentoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaPagamentoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaPagamentoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaPagamentoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormaPagamentoDialog dialog = new FormaPagamentoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Desconto;
    private javax.swing.JButton FinalizarCompra;
    private javax.swing.JComboBox FormaPagamento;
    private javax.swing.JPanel PainelValorPago;
    private javax.swing.JTextField SubTotal;
    private javax.swing.JLabel Troco;
    private javax.swing.JTextField ValorRecebido;
    private org.jdesktop.swingx.JXImagePanel imagePanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel pago;
    // End of variables declaration//GEN-END:variables
}

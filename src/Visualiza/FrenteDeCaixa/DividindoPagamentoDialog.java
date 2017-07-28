/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualiza.FrenteDeCaixa;


import Controle.Geral.ControleMonetário;
import javax.swing.ImageIcon;
import org.jdesktop.swingx.JXImagePanel;

/**
 *
 * @author felipe
 */
public class DividindoPagamentoDialog extends javax.swing.JDialog {

    /**
     * Creates new form DividindoPagamentoDialog
     */
    public DividindoPagamentoDialog(java.awt.Frame parent, boolean modal,String ValorTotal) {
        super(parent, modal);
        initComponents();
   

        ValorApagar.setText(ValorTotal);
        ImageIcon imagem = new ImageIcon(getClass().getResource("/Img/Graficos/FundosCaixa.png"));        
        DividirConta.setImage(imagem.getImage());
        DividirConta.setStyle(JXImagePanel.Style.SCALED);
        
        Dinheiro.requestFocus();
         
         Dinheiro.setDocument(new ControleMonetário());
         MastCard.setDocument(new ControleMonetário());
         Maestro.setDocument(new ControleMonetário());
         outras.setDocument(new ControleMonetário());
         Fiado.setDocument(new ControleMonetário());
         ValeRefeicao.setDocument(new ControleMonetário());
         HiperCard.setDocument(new ControleMonetário());
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DividirConta = new org.jdesktop.swingx.JXImagePanel();
        jLabel21 = new javax.swing.JLabel();
        Dinheiro = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ValorApagar = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        MastCard = new javax.swing.JTextField();
        HiperCard = new javax.swing.JTextField();
        Maestro = new javax.swing.JTextField();
        ValeRefeicao = new javax.swing.JTextField();
        outras = new javax.swing.JTextField();
        Fiado = new javax.swing.JTextField();
        ValorPago = new javax.swing.JPanel();
        ValorTotalPago = new javax.swing.JLabel();
        FinalizarCompra = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShadowColor(new java.awt.Color(204, 204, 204));
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        DividirConta.setBorder(dropShadowBorder1);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Dinheiro");

        Dinheiro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Dinheiro.setText("0.00");
        Dinheiro.setToolTipText("");
        Dinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinheiroActionPerformed(evt);
            }
        });
        Dinheiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DinheiroKeyPressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Total conta");

        ValorApagar.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        ValorApagar.setForeground(new java.awt.Color(255, 0, 0));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("MasterCard");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Caderno-Fiado");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Outros");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("HiperCard");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Maestro");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Vale Refeição");

        MastCard.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        MastCard.setText("0.00");
        MastCard.setToolTipText("");
        MastCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MastCardActionPerformed(evt);
            }
        });
        MastCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MastCardKeyPressed(evt);
            }
        });

        HiperCard.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        HiperCard.setText("0.00");
        HiperCard.setToolTipText("");
        HiperCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HiperCardActionPerformed(evt);
            }
        });
        HiperCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HiperCardKeyPressed(evt);
            }
        });

        Maestro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Maestro.setText("0.00");
        Maestro.setToolTipText("");
        Maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaestroActionPerformed(evt);
            }
        });
        Maestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MaestroKeyPressed(evt);
            }
        });

        ValeRefeicao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ValeRefeicao.setText("0.00");
        ValeRefeicao.setToolTipText("");
        ValeRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValeRefeicaoActionPerformed(evt);
            }
        });
        ValeRefeicao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ValeRefeicaoKeyPressed(evt);
            }
        });

        outras.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        outras.setText("0.00");
        outras.setToolTipText("");
        outras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outrasActionPerformed(evt);
            }
        });
        outras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                outrasKeyPressed(evt);
            }
        });

        Fiado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Fiado.setText("0.00");
        Fiado.setToolTipText("");
        Fiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiadoActionPerformed(evt);
            }
        });
        Fiado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FiadoKeyPressed(evt);
            }
        });

        ValorPago.setOpaque(false);
        ValorPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        ValorTotalPago.setFont(new java.awt.Font("Arial", 1, 64)); // NOI18N
        ValorTotalPago.setForeground(new java.awt.Color(255, 255, 255));
        ValorTotalPago.setAutoscrolls(true);

        javax.swing.GroupLayout ValorPagoLayout = new javax.swing.GroupLayout(ValorPago);
        ValorPago.setLayout(ValorPagoLayout);
        ValorPagoLayout.setHorizontalGroup(
            ValorPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ValorPagoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ValorTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        ValorPagoLayout.setVerticalGroup(
            ValorPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValorPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ValorTotalPago, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
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

        jButton2.setBackground(new java.awt.Color(51, 255, 0));
        jButton2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botao/Verifica.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(252, 0, 50));
        jButton4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botao/delete.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DividirContaLayout = new javax.swing.GroupLayout(DividirConta);
        DividirConta.setLayout(DividirContaLayout);
        DividirContaLayout.setHorizontalGroup(
            DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DividirContaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DividirContaLayout.createSequentialGroup()
                        .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ValorPago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(DividirContaLayout.createSequentialGroup()
                                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ValeRefeicao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Maestro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(HiperCard, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MastCard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DividirContaLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(outras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Fiado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Dinheiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(84, 84, 84))
                    .addGroup(DividirContaLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FinalizarCompra)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DividirContaLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DividirContaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ValorApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        DividirContaLayout.setVerticalGroup(
            DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DividirContaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ValorApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MastCard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HiperCard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Maestro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValeRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fiado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addComponent(ValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DividirContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DividirContaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(FinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(DividirContaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DividirConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DividirConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DinheiroActionPerformed

    private void DinheiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DinheiroKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            MastCard.requestFocus();
            // botao.requestFocus();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_DinheiroKeyPressed

    private void MastCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MastCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MastCardActionPerformed

    private void MastCardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MastCardKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            HiperCard.requestFocus();
            // botao.requestFocus();

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_MastCardKeyPressed

    private void HiperCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HiperCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HiperCardActionPerformed

    private void HiperCardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HiperCardKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            Maestro.requestFocus();
            // botao.requestFocus();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_HiperCardKeyPressed

    private void MaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaestroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaestroActionPerformed

    private void MaestroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MaestroKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            ValeRefeicao.requestFocus();
            // botao.requestFocus();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_MaestroKeyPressed

    private void ValeRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValeRefeicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValeRefeicaoActionPerformed

    private void ValeRefeicaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValeRefeicaoKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            Fiado.requestFocus();
            // botao.requestFocus();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ValeRefeicaoKeyPressed

    private void outrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outrasActionPerformed

    private void outrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outrasKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            FinalizarCompra.requestFocus();
            // botao.requestFocus();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_outrasKeyPressed

    private void FiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiadoActionPerformed

    private void FiadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiadoKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){

            outras.requestFocus();
            // botao.requestFocus();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_FiadoKeyPressed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        double Vdinheiro = Double.parseDouble(Dinheiro.getText().replace(',', '.'));
        double Vmastercard = Double.parseDouble(MastCard.getText().replace(',', '.'));
        double Vfiado = Double.parseDouble(Fiado.getText().replace(',', '.'));
        double VvaleRefeicao = Double.parseDouble(ValeRefeicao.getText().replace(',', '.'));
        double VOutras = Double.parseDouble(outras.getText().replace(',', '.'));
        double VhiperCard = Double.parseDouble(HiperCard.getText().replace(',', '.'));
        double Vmaestro = Double.parseDouble(Maestro.getText().replace(',', '.'));

        double ResultadoFinal = Vdinheiro + Vmastercard + Vfiado +VvaleRefeicao + VOutras + VhiperCard + Vmaestro ;
        ControleMonetário controleMonetário = new ControleMonetário();
        String  aux = Double.toString(ResultadoFinal);
        //ValorTotalPago.setText(controleMonetário.ConvertString(aux));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Dinheiro;
    private org.jdesktop.swingx.JXImagePanel DividirConta;
    private javax.swing.JTextField Fiado;
    private javax.swing.JButton FinalizarCompra;
    private javax.swing.JTextField HiperCard;
    private javax.swing.JTextField Maestro;
    private javax.swing.JTextField MastCard;
    private javax.swing.JTextField ValeRefeicao;
    private javax.swing.JLabel ValorApagar;
    private javax.swing.JPanel ValorPago;
    private javax.swing.JLabel ValorTotalPago;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JTextField outras;
    // End of variables declaration//GEN-END:variables
}
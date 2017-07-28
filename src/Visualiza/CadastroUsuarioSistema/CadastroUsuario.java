/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualiza.CadastroUsuarioSistema;


import BD.UsuarioSistemaDAO;
import Controle.ControleUsuarioSistema;
import Controle.Geral.ControleDataSistema;
import Modelo.AbstractTabel.ModeloAbstractUsuarioSistema;
import Modelo.ModeloUsuarioSistema;
import com.sun.xml.internal.ws.client.ContentNegotiation;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class CadastroUsuario extends javax.swing.JFrame {

    public ModeloAbstractUsuarioSistema modelo;
    public List<ModeloUsuarioSistema> lista;
    public ModeloUsuarioSistema modeloUsuarioSistema;
    public ControleUsuarioSistema controleUsuarioSistema;
    public UsuarioSistemaDAO usuarioSistemaDAO;
    public ControleDataSistema controleDataSistema;
 
    
    
    public void ListaTabele() throws InstantiationException{
     ControleUsuarioSistema controleUsuarioSistema = new ControleUsuarioSistema();
     lista = controleUsuarioSistema.ListarBanco();
     modelo = new ModeloAbstractUsuarioSistema(lista);
    }
    
    public void LIstar() throws InstantiationException{
     ControleUsuarioSistema controleUsuarioSistema = new ControleUsuarioSistema();
     lista = controleUsuarioSistema.BuscarNome(BtnPequisa.getText());
     modelo = new ModeloAbstractUsuarioSistema(lista);
    }
    
    
    public CadastroUsuario() {
   
        try {
            ListaTabele();
        } catch (InstantiationException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        initComponents();
       
                
       DataCriacao.setText("");
   
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension scrnsize = toolkit.getScreenSize();  
        setExtendedState(JFrame.MAXIMIZED_BOTH);  // frame n�o passando do menu 
        setSize(scrnsize.width, scrnsize.height);
    }
    
    
/*
    private void pesquisar() throws InstantiationException  {
      
      ArrayList<ModeloUsuarioSistema> ListamodeloUsuarioSistemas = new ArrayList<ModeloUsuarioSistema>();        
      ModeloUsuarioSistema modeloUsuarioSistema = new ModeloUsuarioSistema();   
      usuarioSistemaDAO = new UsuarioSistemaDAO();
      
      //modeloUsuarioSistema.setDataCriacao(hoje.format(formatador));
      ListamodeloUsuarioSistemas.add(modeloUsuarioSistema);
      lista=ListamodeloUsuarioSistemas;
      // sera retornado da classe DAO uma lista
      lista = usuarioSistemaDAO.getModeloUsuarioSistema();  
      // seta na tabela o modelo contido na class ContatoTableModel
      modelo = new ModeloAbstractUsuarioSistema(lista);
      
    }
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        label17 = new java.awt.Label();
        label14 = new java.awt.Label();
        label10 = new java.awt.Label();
        Nome = new javax.swing.JTextField();
        Senha = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        admin = new javax.swing.JCheckBox();
        label19 = new java.awt.Label();
        Email = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ConfirmaSenha = new javax.swing.JPasswordField();
        label26 = new java.awt.Label();
        DataCriacao = new javax.swing.JTextField();
        label27 = new java.awt.Label();
        DataAlteracao = new javax.swing.JTextField();
        BtnSalvarUsuario = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaUsuarioSistema = new javax.swing.JTable(modelo);
        BtnUsuarioAlterar = new javax.swing.JButton();
        BtnRemoverUsuario = new javax.swing.JButton();
        BtnPequisa = new javax.swing.JButton();
        TextFildPesquisaNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de funcionario ");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Img/MenuUsuario.png")).getImage());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        label17.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        label17.setText("Conf. senha");

        label14.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        label14.setText("Senha");

        label10.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        label10.setText("Nome");

        Nome.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        Senha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        label2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label2.setText("Cadastro de usuario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        admin.setText("Administrador");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        label19.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        label19.setText("Email");

        Email.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nivel de acesso", jPanel1);

        label26.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        label26.setText("Criado");

        DataCriacao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        DataCriacao.setText("00/00/00 00:00");
        DataCriacao.setEnabled(false);
        DataCriacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataCriacaoActionPerformed(evt);
            }
        });

        label27.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        label27.setText("Data Alteracao");

        DataAlteracao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        DataAlteracao.setText("00/00/00 00:00");
        DataAlteracao.setEnabled(false);
        DataAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataAlteracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DataAlteracao)
                                    .addComponent(Email)
                                    .addComponent(DataCriacao)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                            .addComponent(ConfirmaSenha))
                                        .addGap(18, 18, 18)
                                        .addComponent(admin)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(7, 7, 7)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(admin)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ConfirmaSenha)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnSalvarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalvarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnSalvarUsuario.setText("Salvar");
        BtnSalvarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalvarUsuario.setBorderPainted(false);
        BtnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarUsuarioActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton6.setText("Fechar");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        TabelaUsuarioSistema.setAutoCreateColumnsFromModel(false);
        TabelaUsuarioSistema.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        TabelaUsuarioSistema.setModel(modelo);
        TabelaUsuarioSistema.setToolTipText("Usuarios Sistema");
        TabelaUsuarioSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaUsuarioSistema.setFocusable(false);
        TabelaUsuarioSistema.setGridColor(new java.awt.Color(255, 255, 255));
        TabelaUsuarioSistema.setSelectionBackground(new java.awt.Color(204, 204, 255));
        TabelaUsuarioSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaUsuarioSistemaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaUsuarioSistema);

        BtnUsuarioAlterar.setBackground(new java.awt.Color(255, 255, 255));
        BtnUsuarioAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnUsuarioAlterar.setText("Alterar");
        BtnUsuarioAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnUsuarioAlterar.setBorderPainted(false);
        BtnUsuarioAlterar.setEnabled(false);
        BtnUsuarioAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioAlterarActionPerformed(evt);
            }
        });

        BtnRemoverUsuario.setBackground(new java.awt.Color(255, 255, 255));
        BtnRemoverUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnRemoverUsuario.setText("Remover");
        BtnRemoverUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRemoverUsuario.setBorderPainted(false);
        BtnRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoverUsuarioActionPerformed(evt);
            }
        });

        BtnPequisa.setBackground(new java.awt.Color(255, 255, 255));
        BtnPequisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnPequisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/magnifier13.png"))); // NOI18N
        BtnPequisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnPequisa.setBorderPainted(false);
        BtnPequisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPequisaActionPerformed(evt);
            }
        });
        BtnPequisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnPequisaKeyPressed(evt);
            }
        });

        TextFildPesquisaNome.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TextFildPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFildPesquisaNomeActionPerformed(evt);
            }
        });
        TextFildPesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFildPesquisaNomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRemoverUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnUsuarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TextFildPesquisaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnPequisa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextFildPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPequisa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUsuarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRemoverUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarUsuarioActionPerformed
        
            
     
      ControleUsuarioSistema controleUsuarioSistema = new ControleUsuarioSistema();
      
     try {
         //controleUsuarioSistema.teste(modeloUsuarioSistema);
         
         //recebe uma lista de dados
         modelo.onAddAll(controleUsuarioSistema.SemModelo(
                 Nome.getText(),
                 Senha.getText(),
                 ConfirmaSenha.getText(),
                 Email.getText(),
                 admin.isSelected())
         );
         
     } catch (NoSuchAlgorithmException ex) {
         Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
     } catch (UnsupportedEncodingException ex) {
         Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
         Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }//GEN-LAST:event_BtnSalvarUsuarioActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TabelaUsuarioSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaUsuarioSistemaMouseClicked

        if (evt.getClickCount() == 2) {
            BtnUsuarioAlterar.setEnabled(true);
            BtnSalvarUsuario.setEnabled(false);
            
            int linhaSelecionada = TabelaUsuarioSistema.getSelectedRow();//pegar a linha selecionada
            ModeloUsuarioSistema modeloUsuarioSistema = modelo.getContato(linhaSelecionada);
            
            Nome.setText(modeloUsuarioSistema.getUsuario());
            Email.setText(modeloUsuarioSistema.getEmail());
            DataCriacao.setText(modeloUsuarioSistema.getDataCriacao());
            DataAlteracao.setText(modeloUsuarioSistema.getDataCriacao());
            admin.setSelected(modeloUsuarioSistema.isAdmin());
        
        }
        
        
   
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaUsuarioSistemaMouseClicked

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void DataCriacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataCriacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataCriacaoActionPerformed

    private void BtnUsuarioAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioAlterarActionPerformed
     
       controleUsuarioSistema = new ControleUsuarioSistema();
       int LinhaSelecionada = modelo.getRowCount();
       
       
       modelo.update(
               LinhaSelecionada,
               controleUsuarioSistema.AlteracaoUsuario(
               Nome.getText(),
               Email.getText(),
               Senha.getText(),
               ConfirmaSenha.getText(),
               admin.isSelected()));
  
       
        

    // TODO add your handling code here:
    }//GEN-LAST:event_BtnUsuarioAlterarActionPerformed

    private void DataAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataAlteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataAlteracaoActionPerformed

    private void BtnRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoverUsuarioActionPerformed
       int linhaSelecionada = TabelaUsuarioSistema.getSelectedRow();
        System.out.println("linha: " + linhaSelecionada);
    
        if(linhaSelecionada >= 0){
            modelo.removeContato(linhaSelecionada);
        } else { 
           if (TabelaUsuarioSistema.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "Não existe registro");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione registro");
            }
         }
        
    // TODO add your handling code here:
    }//GEN-LAST:event_BtnRemoverUsuarioActionPerformed

    private void BtnPequisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPequisaActionPerformed
        
         ControleUsuarioSistema controleUsuarioSistema = new ControleUsuarioSistema();
    
        try {
            modelo.onRemoveAll();            
            lista = controleUsuarioSistema.BuscarNome(TextFildPesquisaNome.getText());
            modelo.onAddAll(lista);
           
            
        } catch (InstantiationException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_BtnPequisaActionPerformed

    private void TextFildPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFildPesquisaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFildPesquisaNomeActionPerformed

    private void TextFildPesquisaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFildPesquisaNomeKeyPressed

    if(evt.getKeyCode() == evt.VK_ENTER){
        
        BtnPequisa.requestFocus();
    }    

    // TODO add your handling code here:
    }//GEN-LAST:event_TextFildPesquisaNomeKeyPressed

    private void BtnPequisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnPequisaKeyPressed
         if(evt.getKeyCode() == evt.VK_ENTER){
             ControleUsuarioSistema controleUsuarioSistema = new ControleUsuarioSistema();
    
        try {
            modelo.onRemoveAll();            
            lista = controleUsuarioSistema.BuscarNome(TextFildPesquisaNome.getText());
            modelo.onAddAll(lista);
           
            
        } catch (InstantiationException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    // TODO add your handling code here:
    }//GEN-LAST:event_BtnPequisaKeyPressed

 
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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroUsuario().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPequisa;
    private javax.swing.JButton BtnRemoverUsuario;
    private javax.swing.JButton BtnSalvarUsuario;
    private javax.swing.JButton BtnUsuarioAlterar;
    private javax.swing.JPasswordField ConfirmaSenha;
    private javax.swing.JTextField DataAlteracao;
    private javax.swing.JTextField DataCriacao;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Senha;
    public javax.swing.JTable TabelaUsuarioSistema;
    private javax.swing.JTextField TextFildPesquisaNome;
    private javax.swing.JCheckBox admin;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label10;
    private java.awt.Label label14;
    private java.awt.Label label17;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label26;
    private java.awt.Label label27;
    // End of variables declaration//GEN-END:variables

   
}

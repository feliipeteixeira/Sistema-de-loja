    package Visualiza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/******************************************* IMPORTAÇÃO DE HORAS *****************/


import Visualiza.CadastroEmpresa.CadastroEmpresa;
import java.awt.EventQueue;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
  
import javax.swing.JLabel;  
/******************************************* IMPORTAÇÃO DE HORAS *****************/

import Visualiza.CadastroUsuarioSistema.CadastroUsuario;



import Visualiza.ConfiguracaoMenu.ConfiguracaoSoftware;
import Visualiza.Fornecedor.Fornecedor;
import Visualiza.LogInfo.LogInfo;
import Visualiza.RestriçãoMenu.RestriçãoDeMenu;

import Visualiza.login.LoginInicial;
import Visualiza.pinel.informacaoSoftware;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class PrincipalMenu extends javax.swing.JFrame {

    private static final DateFormat FORMATO = new SimpleDateFormat("HH:mm:ss");  
    private static final DateFormat DATA = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form PrincipalMenu
     */
    
    public PrincipalMenu(String UsuarioLogado) {
        initComponents();
        
         setTitle("Lanchonete");
         usuario.setText(UsuarioLogado);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 Toolkit toolkit = Toolkit.getDefaultToolkit();    
         Dimension scrnsize = toolkit.getScreenSize();  
         setExtendedState(JFrame.MAXIMIZED_BOTH);  // frame n�o passando do menu 
         setSize(scrnsize.width, scrnsize.height);
 
        MenuCadastro.setVisible(false);
        Thread clockThread = new Thread(new PrincipalMenu.ClockRunnable(), "Clock thread");  
        clockThread.setDaemon(true);  
        clockThread.start();   
       
    }
   
    private JLabel getLblHora() {  
        if (lblHora == null) {  
            lblHora = new JLabel();  
        }  
        return lblHora;  
    }  
  
    /** 
     * Método para atualizar a hora no formulário. Não é thread-safe, portanto, 
     * se o utilizado fora da thread da AWT, deve-se utilizar um dos comandos da 
     * EventQueue (invokeLater ou invokeAndWait). 
     * @param date
     */  
    public void setHora(Date date) {  
        getLblHora().setText(FORMATO.format(date));
        dataMenu.setText(DATA.format(date));
    }  
  
    
    
    
    
    
    
    private class ClockRunnable implements Runnable {  
        @Override
        public void run() {  
            try {  
                while (true) {  
                    // Aqui chamamos o setHora através da EventQueue da AWT.  
                    // Conforme dito, isso garante Thread safety para o Swing.  
                    EventQueue.invokeLater(new Runnable() {  
                        public void run() {  
                            // Só podemos chamar setHora diretamente dessa  
                            // forma, pois esse Runnable é uma InnerClass não  
                            // estática.  
                            setHora(new Date());  
                        }  
                    });  
                    // Fazemos nossa thread dormir por um segundo, liberando o  
                    // processador para outras threads processarem.  
                    Thread.sleep(1000);  
                }  
            }  
            catch (InterruptedException e) {  
            }  
        }  
    }  



    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dataMenu = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        dataMenu2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAjuda1 = new javax.swing.JMenu();
        MenuEmpresa = new javax.swing.JMenuItem();
        menuFinanceiro3 = new javax.swing.JMenu();
        MenuFuncionario = new javax.swing.JMenuItem();
        MenuFuncionario1 = new javax.swing.JMenuItem();
        MenuCliente = new javax.swing.JMenuItem();
        MenuEmpresa1 = new javax.swing.JMenuItem();
        MenuProduto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuCaixa = new javax.swing.JMenuItem();
        menuFinanceiro1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        MenuCaixa1 = new javax.swing.JMenuItem();
        MenuCaixa2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuCaixa4 = new javax.swing.JMenuItem();
        menuFinanceiro4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menuFinanceiro2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        MenuRelatório = new javax.swing.JMenu();
        menuFinanceiro = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        menuSair1 = new javax.swing.JMenuItem();
        menuSair2 = new javax.swing.JMenuItem();
        MenuCadastro = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lanchonet");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Img/logo_apenas_1.png")).getImage());
        setName("Lanchonete"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblHora.setBackground(new java.awt.Color(204, 204, 204));
        lblHora.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lblHora.setForeground(new java.awt.Color(204, 204, 204));
        lblHora.setText("xxxxxxxx");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotãoCliente.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botao/Produto.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botao/Caixa.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        dataMenu.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        dataMenu.setForeground(new java.awt.Color(153, 153, 153));
        dataMenu.setText("xx/xx/xxxx");

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        dataMenu2.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        dataMenu2.setForeground(new java.awt.Color(153, 153, 153));
        dataMenu2.setText("Versão 1.1.1");

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        usuario.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        usuario.setForeground(new java.awt.Color(153, 153, 153));
        usuario.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Usuário Logado: ");

        jButton10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/funcionariop.png"))); // NOI18N
        jButton10.setText("Troca usuário");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botao/Produto.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(dataMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(19, 19, 19)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 975, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usuario)
                                    .addComponent(jLabel1))))
                        .addComponent(dataMenu))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataMenu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );

        MenuAjuda1.setText("Cadastro");

        MenuEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconeEmpresaMenu.png"))); // NOI18N
        MenuEmpresa.setText("Empresa");
        MenuEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEmpresaActionPerformed(evt);
            }
        });
        MenuAjuda1.add(MenuEmpresa);

        menuFinanceiro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/MenuUsuario.png"))); // NOI18N
        menuFinanceiro3.setText("Usuário");

        MenuFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Funcionario.png"))); // NOI18N
        MenuFuncionario.setText("Funcionario");
        MenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFuncionarioActionPerformed(evt);
            }
        });
        menuFinanceiro3.add(MenuFuncionario);

        MenuFuncionario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgMenu/restrçãoMenu.png"))); // NOI18N
        MenuFuncionario1.setText("Restrição do menu");
        MenuFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFuncionario1ActionPerformed(evt);
            }
        });
        menuFinanceiro3.add(MenuFuncionario1);

        MenuAjuda1.add(menuFinanceiro3);

        MenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/client.png"))); // NOI18N
        MenuCliente.setText("Cliente");
        MenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteActionPerformed(evt);
            }
        });
        MenuAjuda1.add(MenuCliente);

        MenuEmpresa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgMenu/MenuFornecedor.png"))); // NOI18N
        MenuEmpresa1.setText("Fornecedor");
        MenuEmpresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEmpresa1ActionPerformed(evt);
            }
        });
        MenuAjuda1.add(MenuEmpresa1);

        MenuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Produto.png"))); // NOI18N
        MenuProduto.setText("Produto");
        MenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProdutoActionPerformed(evt);
            }
        });
        MenuAjuda1.add(MenuProduto);

        jMenuBar1.add(MenuAjuda1);

        jMenu4.setText("Financeiro");

        MenuCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caixa.png"))); // NOI18N
        MenuCaixa.setText("Caixa");
        MenuCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCaixaActionPerformed(evt);
            }
        });
        jMenu4.add(MenuCaixa);

        menuFinanceiro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconeDinheroMenu.png"))); // NOI18N
        menuFinanceiro1.setText("Contas");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgMenu/financeiroContasApagar.png"))); // NOI18N
        jMenuItem3.setText("Contas pendentes");
        menuFinanceiro1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgMenu/financeiroContasReceber.png"))); // NOI18N
        jMenuItem4.setText("Contas a pagar");
        menuFinanceiro1.add(jMenuItem4);

        MenuCaixa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconeMatriculaMenu.png"))); // NOI18N
        MenuCaixa1.setText("Tipo pagamento");
        MenuCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCaixa1ActionPerformed(evt);
            }
        });
        menuFinanceiro1.add(MenuCaixa1);

        jMenu4.add(menuFinanceiro1);

        MenuCaixa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconeMatriculaMenu.png"))); // NOI18N
        MenuCaixa2.setText("Fiado");
        MenuCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCaixa2ActionPerformed(evt);
            }
        });
        jMenu4.add(MenuCaixa2);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Configuração");

        MenuCaixa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgMenu/Logs.png"))); // NOI18N
        MenuCaixa4.setText("Log de Informações");
        MenuCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCaixa4ActionPerformed(evt);
            }
        });
        jMenu5.add(MenuCaixa4);

        menuFinanceiro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgMenu/configuraMenu.png"))); // NOI18N
        menuFinanceiro4.setText("Configuração");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/segurança_1.png"))); // NOI18N
        jMenuItem7.setText("Copia de segurança ");
        menuFinanceiro4.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/segurança_3.png"))); // NOI18N
        jMenuItem8.setText("Importar banco de dados");
        menuFinanceiro4.add(jMenuItem8);

        menuFinanceiro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BancoDeDaos.png"))); // NOI18N
        menuFinanceiro2.setText("Banco de dados");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/segurança_1.png"))); // NOI18N
        jMenuItem5.setText("Copia de segurança ");
        menuFinanceiro2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/segurança_3.png"))); // NOI18N
        jMenuItem6.setText("Importar banco de dados");
        menuFinanceiro2.add(jMenuItem6);

        menuFinanceiro4.add(menuFinanceiro2);

        jMenu5.add(menuFinanceiro4);

        jMenuBar1.add(jMenu5);

        MenuRelatório.setText("Relatório");

        menuFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconeDinheroMenu.png"))); // NOI18N
        menuFinanceiro.setText("Financeiro");
        MenuRelatório.add(menuFinanceiro);

        jMenuBar1.add(MenuRelatório);

        jMenu6.setText("Ajuda");

        menuSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgMenu/www.png"))); // NOI18N
        menuSair1.setText("Ajuda online");
        menuSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSair1ActionPerformed(evt);
            }
        });
        jMenu6.add(menuSair1);

        menuSair2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgMenu/www.png"))); // NOI18N
        menuSair2.setText("Versão ");
        menuSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSair2ActionPerformed(evt);
            }
        });
        jMenu6.add(menuSair2);

        jMenuBar1.add(jMenu6);

        MenuCadastro.setText("Fechar");

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/MenuFechar.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        MenuCadastro.add(menuSair);

        jMenuBar1.add(MenuCadastro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("Lanchonet");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEmpresaActionPerformed

       CadastroEmpresa cadastroEmpresa = new CadastroEmpresa();
        cadastroEmpresa.setVisible(true); 

    
    }//GEN-LAST:event_MenuEmpresaActionPerformed
   
    private void MenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFuncionarioActionPerformed
     CadastroUsuario cadastroUsuario = new CadastroUsuario();
     cadastroUsuario.setVisible(true);   
    
    }//GEN-LAST:event_MenuFuncionarioActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        
        int resultadoFechamento = JOptionPane.showConfirmDialog(null,"Sair do cadastro de usuário", "Sair",JOptionPane.YES_NO_OPTION);
     
        if (resultadoFechamento == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_menuSairActionPerformed

    private void MenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProdutoActionPerformed

    // TODO add your handling code here:
    }//GEN-LAST:event_MenuProdutoActionPerformed

    private void MenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteActionPerformed

    }//GEN-LAST:event_MenuClienteActionPerformed

    private void MenuCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCaixaActionPerformed

    private void menuSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSair1ActionPerformed

    private void MenuCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCaixa1ActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCaixa1ActionPerformed

    private void MenuCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCaixa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCaixa2ActionPerformed

    private void MenuFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFuncionario1ActionPerformed

        RestriçãoDeMenu restriçãoDeMenu = new RestriçãoDeMenu();
        restriçãoDeMenu.setVisible(true);
        
    // TODO add your handling code here:
    }//GEN-LAST:event_MenuFuncionario1ActionPerformed

    private void menuSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSair2ActionPerformed

    informacaoSoftware versao = new informacaoSoftware(null, true);
    versao.setVisible(true);

    // TODO add your handling code here:
    }//GEN-LAST:event_menuSair2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
        
       

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed






        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        LoginInicial login = new LoginInicial();
        login.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MenuCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCaixa4ActionPerformed

        LogInfo logInfo = new LogInfo();
        logInfo.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCaixa4ActionPerformed

    private void MenuEmpresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEmpresa1ActionPerformed
        
      Fornecedor fornecedor = new Fornecedor();
      fornecedor.setVisible(true);
        
    // TODO add your handling code here:
    }//GEN-LAST:event_MenuEmpresa1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAjuda1;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuCaixa;
    private javax.swing.JMenuItem MenuCaixa1;
    private javax.swing.JMenuItem MenuCaixa2;
    private javax.swing.JMenuItem MenuCaixa4;
    private javax.swing.JMenuItem MenuCliente;
    private javax.swing.JMenuItem MenuEmpresa;
    private javax.swing.JMenuItem MenuEmpresa1;
    private javax.swing.JMenuItem MenuFuncionario;
    private javax.swing.JMenuItem MenuFuncionario1;
    private javax.swing.JMenuItem MenuProduto;
    private javax.swing.JMenu MenuRelatório;
    private javax.swing.JLabel dataMenu;
    private javax.swing.JLabel dataMenu2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblHora;
    private javax.swing.JMenu menuFinanceiro;
    private javax.swing.JMenu menuFinanceiro1;
    private javax.swing.JMenu menuFinanceiro2;
    private javax.swing.JMenu menuFinanceiro3;
    private javax.swing.JMenu menuFinanceiro4;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSair1;
    private javax.swing.JMenuItem menuSair2;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables




}
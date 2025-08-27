
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇAO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇAO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZADO - 19/08/2008                             *
 *******************************************************
 * MODULO -      SIMULADOR ALBRAS                      *
 ******************************************************/
//Carregar estes pacotes:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.io.*;
//import java.net.*;

public class SimuladorAlbras extends JFrame implements ActionListener {

    JLabel tap, valortap, trafo, barra1, barra2, tap1, tap2, valortap1, valortap2, trafo1, trafo2, subir, descer,
            Alarmes, tensaoCont4;
    JLabel mt1a, mt1b, mt2a, mt2b, l1a, l1b, l2a, l2b, l189, l289, l157, l1, l257, l2, bta, btb, bta57, btb57, mt152,
            mtr52, mt252, l152, l252, bt52, gif1;
    JLabel status, status1, status2, mt1, mtr, mt2, jLabel1, tensao, simulador, eletronorte, tensaoEletronorte,
            alunorte, frequencia;
    JLabel contdem, demcont, medenergia, fatpotencia, demanterior, dematual, demmedtotal, horaref, red1, reduçao1, dem,
            albras, demTotalAlbras;
    JLabel demred, corr, corrSet, corrSet1, corrSet2, corrSet3, corrSet4, tensaoCont, desvio, tensaoCont1, tensaoCont2,
            tensaoCont3;
    public JLabel Label1, Label2, projeto, email, lbData;

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23,
            b24, b25, idc1, idc2, idc3, idc4;
    JButton b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46,
            b47, b48;
    JTextField tfUsuario, tfPerfil, tfCodigo, tfData, enterField, tfhoraref, tfData1, tfTagEquipamento, tfOperacao,
            jtfSenha, tfManobra;

    String nome, senha, perfil, data, Usuario, usuario, tagequipamento, operacao, manobra, albras1 = "";
    SimpleDateFormat formato, formato1;
    ImageIcon icone = new ImageIcon("");
    JPanel painel;
    int origem = 0;
    int passo = 0;
    double demtotal = 0, elet = 0, tensaoElet = 0, demAlunorte = 0, fatPotencia = 0, demAtual = 0, demAnterior = 0;
    double demMedTotal = 0, corrente = 0, corrente1 = 0, tensaocontrole = 0, tensaocontrole1 = 0;

    Equipamentos eqp = new Equipamentos();
    Equipamentos345kV eqp1 = new Equipamentos345kV();
    // BDadosUsuario U = new BDadosUsuario();
    BDadosAcesso BDE = new BDadosAcesso();
    BDOperaçoes BDO = new BDOperaçoes();
    BDEquipamentos BDEQ = new BDEquipamentos();
    Acesso acesso = new Acesso();
    ManobraInteligente manobrainteligente = new ManobraInteligente();
    ManobraPadrao MP = new ManobraPadrao();

    // ����������������������������������������� DECLARAÇÃO DAS VARIAVEIS

    String seccionadora89l1fechada = "";
    String seccionadora89l1afechada = "";
    String seccionadora89l1bfechada = "";
    String seccionadora89l1aberta = "";
    String seccionadora89l1aaberta = "";
    String seccionadora89l1baberta = "";
    String seccionadora89l2fechada = "";
    String seccionadora89l2afechada = "";
    String seccionadora89alafechada = "";
    String seccionadora89alaaberta = "";
    String seccionadora89bpafechada = "";
    String seccionadora89bpaaberta = "";
    String seccionadora89bpbfechada = "";
    String seccionadora89bpbaberta = "";
    String seccionadora89l2bfechada = "";
    String seccionadora89l2aberta = "";
    String seccionadora89l2aaberta = "";
    String seccionadora89l2baberta = "";
    String seccionadora89albfechada = "";
    String seccionadora89albaberta = "";
    String seccionadora89alaberta = "";
    String seccionadora89alfechada = "";
    String seccionadora89btafechada = "";
    String seccionadora89btbfechada = "";
    String seccionadora89btaaberta = "";
    String seccionadora89btbaberta = "";
    String seccionadora89mt1afechada = "";
    String seccionadora89mt1aaberta = "";
    String seccionadora89mt1bfechada = "";
    String seccionadora89mt1baberta = "";
    String seccionadora89mtrafechada = "";
    String seccionadora89mtraaberta = "";
    String seccionadora89mtrbfechada = "";
    String seccionadora89mtrbaberta = "";
    String seccionadora89mt2afechada = "";
    String seccionadora89mt2aaberta = "";
    String seccionadora89mt2bfechada = "";
    String seccionadora89mt2baberta = "";
    String seccionadora89mt3afechada = "";
    String seccionadora89mt3aaberta = "";
    String seccionadora89mt3bfechada = "";
    String seccionadora89mt3baberta = "";
    String seccionadora89mt4afechada = "";
    String seccionadora89mt4aaberta = "";
    String seccionadora89mt4bfechada = "";
    String seccionadora89mt4baberta = "";
    String seccionadora89a2eaberta = "";
    String seccionadora89a4eaberta = "";
    String seccionadora89a6eaberta = "";
    String seccionadora89a8eaberta = "";
    String seccionadora89p1aberta = "";
    String seccionadora89lvrreaberta = "";
    String seccionadora89lvrraberta = "";
    String seccionadora89p2aberta = "";
    String seccionadora89p3aberta = "";
    String seccionadora89p4aberta = "";
    String seccionadora89p5aberta = "";
    String seccionadora89p6aberta = "";
    String seccionadora89a2efechada = "";
    String seccionadora89a4efechada = "";
    String seccionadora89a6efechada = "";
    String seccionadora89a8efechada = "";
    String seccionadora89p1efechada = "";
    String seccionadora89p2efechada = "";
    String seccionadora89p3efechada = "";
    String seccionadora89p4efechada = "";
    String seccionadora89p5efechada = "";
    String seccionadora89p6efechada = "";
    String seccionadora89c1aberta = "";
    String seccionadora89c2aberta = "";
    String seccionadora89c3aberta = "";
    String seccionadora89c4aberta = "";
    String seccionadora89c5aberta = "";
    String seccionadora89c6aberta = "";
    String seccionadora89c1eaberta = "";
    String seccionadora89c2eaberta = "";
    String seccionadora89c3eaberta = "";
    String seccionadora89c4eaberta = "";
    String seccionadora89c5eaberta = "";
    String seccionadora89c6eaberta = "";
    String seccionadora89c1efechada = "";
    String seccionadora89c2efechada = "";
    String seccionadora89c3efechada = "";
    String seccionadora89c4efechada = "";
    String seccionadora89c5efechada = "";
    String seccionadora89c6efechada = "";
    String seccionadora89r1aberta = "";
    String seccionadora89r2aberta = "";
    String seccionadora89r3aberta = "";
    String seccionadora89r4aberta = "";
    String seccionadora89r5aberta = "";
    String seccionadora89r6aberta = "";
    String seccionadora89r1eaberta = "";
    String seccionadora89r2eaberta = "";
    String seccionadora89r3eaberta = "";
    String seccionadora89r4eaberta = "";
    String seccionadora89r5eaberta = "";
    String seccionadora89r6eaberta = "";
    String seccionadora89r1efechada = "";
    String seccionadora89r2efechada = "";
    String seccionadora89r3efechada = "";
    String seccionadora89r4efechada = "";
    String seccionadora89r5efechada = "";
    String seccionadora89r6efechada = "";
    String seccionadora89tueaberta = "";
    String seccionadora89tuefechada = "";
    String disjuntor52l1fechado = "";
    String disjuntor52l1aberto = "";
    String disjuntor52l2fechado = "";
    String disjuntor52l2aberto = "";
    String disjuntor52alfechado = "";
    String disjuntor52alaberto = "";
    String disjuntor52btfechado = "";
    String disjuntor52btaberto = "";
    String disjuntor52mt1fechado = "";
    String disjuntor52mt1aberto = "";
    String disjuntor52mtrfechado = "";
    String disjuntor52mtraberto = "";
    String disjuntor52mt2fechado = "";
    String disjuntor52mt2aberto = "";
    String disjuntor52mt3fechado = "";
    String disjuntor52mt3aberto = "";
    String disjuntor52mt4fechado = "";
    String disjuntor52mt4aberto = "";
    String disjuntor52a1fechado = "";
    String disjuntor52a1aberto = "";
    String disjuntor52a2fechado = "";
    String disjuntor52a2aberto = "";
    String disjuntor52a3fechado = "";
    String disjuntor52a3aberto = "";
    String disjuntor52a4fechado = "";
    String disjuntor52a4aberto = "";
    String disjuntor52a5fechado = "";
    String disjuntor52a5aberto = "";
    String disjuntor52a6fechado = "";
    String disjuntor52a6aberto = "";
    String disjuntor52a7fechado = "";
    String disjuntor52a7aberto = "";
    String disjuntor52a8fechado = "";
    String disjuntor52a8aberto = "";
    String disjuntor52p1fechado = "";
    String disjuntor52p1aberto = "";
    String disjuntor52p2fechado = "";
    String disjuntor52p2aberto = "";
    String disjuntor52p3fechado = "";
    String disjuntor52p3aberto = "";
    String disjuntor52p4fechado = "";
    String disjuntor52p4aberto = "";
    String disjuntor52p5fechado = "";
    String disjuntor52p5aberto = "";
    String disjuntor52p6fechado = "";
    String disjuntor52p6aberto = "";
    String disjuntor52lvr1fechado = "";
    String disjuntor52lvr1aberto = "";
    String disjuntor52c1fechado = "";
    String disjuntor52c1aberto = "";
    String disjuntor52c2fechado = "";
    String disjuntor52c2aberto = "";
    String disjuntor52c3fechado = "";
    String disjuntor52c3aberto = "";
    String disjuntor52c4fechado = "";
    String disjuntor52c4aberto = "";
    String disjuntor52c5fechado = "";
    String disjuntor52c5aberto = "";
    String disjuntor52c6fechado = "";
    String disjuntor52c6aberto = "";
    String disjuntor52c7fechado = "";
    String disjuntor52c7aberto = "";
    String disjuntor52c8fechado = "";
    String disjuntor52c8aberto = "";
    String disjuntor52r1fechado = "";
    String disjuntor52r1aberto = "";
    String disjuntor52r2fechado = "";
    String disjuntor52r2aberto = "";
    String disjuntor52r3fechado = "";
    String disjuntor52r3aberto = "";
    String disjuntor52r4fechado = "";
    String disjuntor52r4aberto = "";
    String disjuntor52r5fechado = "";
    String disjuntor52r5aberto = "";
    String disjuntor52r6fechado = "";
    String disjuntor52r6aberto = "";
    String disjuntor52r7fechado = "";
    String disjuntor52r7aberto = "";
    String disjuntor52r8fechado = "";
    String disjuntor52r8aberto = "";
    String disjuntor52g1fechado = "";
    String disjuntor52g1aberto = "";
    String disjuntor52g2fechado = "";
    String disjuntor52g2aberto = "";
    String disjuntor52tufechado = "";
    String disjuntor52tuaberto = "";
    String EnerL1 = "";
    String EnerL2 = "";
    String DesenL1 = "";
    String DesenL2 = "";
    String EnerBayBT = "";
    String EnerL1BarraA = "";
    String EnerL2IntBarra = "";
    String EnerMT1BarraA = "";
    String EnerMTRBarraA = "";
    String EnerMT2BarraB = "";
    String EnerMT3BarraA = "";
    String EnerMT4BarraB = "";
    String DesenMT1BarraA = "";
    String DesenMTRBarraA = "";
    String DesenMT2BarraB = "";
    String DesenMT3BarraA = "";
    String DesenMT4BarraB = "";
    String DesenL1BarraA = "";
    String DesenL2IntBarra = "";
    String EnerAlbras = "";
    String DesenAlbras = "";
    String PrepAlbras = "";
    String EnerGerador = "";
    String NormRed1 = "";
    String NormRed2 = "";
    String NormRed3 = "";
    String NormRed4 = "";
    String DeslProgRed1 = "";
    String DeslProgRed2 = "";
    String DeslProgRed3 = "";
    String DeslProgRed4 = "";
    String TransfMT1MTR = "";
    String TransfMTRMT1 = "";
    String TransfMT2MTR = "";
    String TransfMTRMT2 = "";
    String TransfMT3MTR = "";
    String TransfMTRMT3 = "";
    String TransfMT4MTR = "";
    String TransfMTRMT4 = "";
    String EnergBarraEM = "";
    String EnergCargas = "";
    String DeslCargas = "";
    String DesenBarraEM = "";

    public SimuladorAlbras() // Metodo Construtor
    {
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); // gerenciador de layout
        // setResizable(false);

        getContentPane().add(new ClockCanvas("             Cronometro", "GMT+0"));

        setTitle("Simulador para Treinamento de Operadores!");
        setSize(1070, 820);
        c.setBackground(new Color(192, 192, 192));
        // setLocation(400, 100);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Icon imagem1 = new ImageIcon("Carlos1.GIF");
        gif1 = new JLabel();
        gif1.setIcon(imagem1);
        gif1.setBackground(new Color(192, 192, 192)); // cor de fundo do botao
        gif1.setBounds(990, 710, 70, 70); // Coluna,Linha,Largura,Altura
        getContentPane().add(gif1);

        Icon imagem = new ImageIcon("Albras1.JPG");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem);
        jLabel1.setBounds(2, 4, 255, 50);
        getContentPane().add(jLabel1);

        email = new JLabel("cmardonio@yahoo.com.br", JLabel.CENTER);
        email.setFont(new Font("Dialog", Font.ITALIC, 10));
        getContentPane().add(email);
        email.setBounds(960, 768, 150, 15);
        email.setForeground(Color.gray);// cor

        MP.setVisible(false);

        // ����������������������������������������� CRIAÇAO DE TEXTFIELD E BOTOES

        tfUsuario = new JTextField("        Default     ");
        tfUsuario.setEditable(false);
        tfUsuario.addActionListener(this);
        tfUsuario.setFont(new Font("Dialog", Font.BOLD, 16));
        tfUsuario.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
        tfUsuario.setForeground(Color.yellow);
        tfUsuario.setBounds(892, 15, 124, 27); // Coluna,Linha,Largura,Altura
        getContentPane().add(tfUsuario);

        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat(" dd/MM/yyyy hh:mm:ss"); // somente a data em um objeto separado
        String date = formato.format(data); // variavel date recebe o conteudo do objeto data
        tfData = new JTextField(date);
        tfData.setEditable(false);
        tfData.setFont(new Font("Dialog", Font.BOLD, 12));
        tfData.setBackground(new Color(0, 0, 0)); // cor de fundo do bot�o
        tfData.setForeground(Color.yellow);
        tfData.setBounds(892, 29, 124, 24); // Coluna,Linha,Largura,Altura
        // getContentPane().add(tfData);

        jtfSenha = new JPasswordField();
        jtfSenha.addActionListener(this);
        jtfSenha.setFont(new Font("Dialog", Font.BOLD, 16));
        jtfSenha.setBackground(new Color(0, 0, 0));// cor de fundo do botao
        jtfSenha.setForeground(Color.yellow);
        jtfSenha.setBounds(700, 0, 95, 25); // Coluna,Linha,Largura,Altura
        // getContentPane().add(jtfSenha);

        tfPerfil = new JTextField("");
        tfPerfil.addActionListener(this);
        tfPerfil.setFont(new Font("Dialog", Font.BOLD, 16));
        tfPerfil.setBackground(new Color(0, 0, 0));// cor de fundo do botao
        tfPerfil.setForeground(Color.yellow);
        tfPerfil.setBounds(700, 0, 95, 25); // Coluna,Linha,Largura,Altura
        // getContentPane().add(tfPerfil);

        b36 = new JButton(""); // BOTAO EFETUAR LOGIN
        b36.setIcon(new javax.swing.ImageIcon("botãoLogin.jpg"));
        b36.addActionListener(this);
        b36.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b36.setVerticalTextPosition(AbstractButton.CENTER); // posi��o do texto
        b36.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b36.setBackground(new Color(192, 192, 192)); // cor de fundo do botao
        b36.setForeground(Color.black); // cor do titulo do botao
        b36.setEnabled(true);
        b36.setToolTipText("Pressione para fazer Login e liberar a operaçao dos Equipamentos");
        b36.setMnemonic(KeyEvent.VK_B);
        b36.setActionCommand("Usuario");// define o nome da acao
        b36.setBounds(152, 59, 50, 48); // Coluna,Linha,Largura,Altura
        getContentPane().add(b36);

        b37 = new JButton(""); // BOT�O PAINEL RELAT�RIOS
        b37.setIcon(new javax.swing.ImageIcon("botãoRelatorio.JPG"));
        b37.addActionListener(this);
        b37.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b37.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b37.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b37.setBackground(new Color(192, 192, 192)); // cor de fundo do bot�o
        b37.setForeground(Color.black); // cor do titulo do botao
        b37.setEnabled(true);
        b37.setToolTipText("Pressione para Consultar os Relatorios");
        b37.setMnemonic(KeyEvent.VK_B);
        b37.setActionCommand("Relatorios"); // define o nome da acao
        b37.setBounds(202, 59, 50, 48); // Coluna,Linha,Largura,Altura
        getContentPane().add(b37);

        b38 = new JButton(""); // BOTAO EFETUAR LOGOFF
        b38.setIcon(new javax.swing.ImageIcon("botaoHistoricos.jpg"));
        b38.addActionListener(this);
        b38.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b38.setVerticalTextPosition(AbstractButton.CENTER);// posiçao do texto
        b38.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b38.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b38.setForeground(Color.black);// cor do titulo do botao
        b38.setEnabled(true);
        b38.setToolTipText("Pressione para fazer Logoff e bloquear as operaçoes");
        b38.setMnemonic(KeyEvent.VK_B);
        b38.setActionCommand("Usuario");// define o nome da acao
        b38.setBounds(2, 59, 50, 48); // Coluna,Linha,Largura,Altura
        getContentPane().add(b38);

        b39 = new JButton(""); // BOTAO PAINEL ALTERAÇAO DE USUARIOS
        b39.setIcon(new javax.swing.ImageIcon("botãoAlarme.jpg"));
        b39.addActionListener(this);
        b39.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b39.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b39.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b39.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b39.setForeground(Color.black);// cor do titulo do bot�o
        b39.setEnabled(true);
        b39.setToolTipText("Pressione para Inserir e Editar os Usuarios do Sistema");
        b39.setMnemonic(KeyEvent.VK_B);
        b39.setActionCommand("Usuario");// define o nome da acao
        b39.setBounds(52, 59, 50, 48); // Coluna,Linha,Largura,Altura
        getContentPane().add(b39);

        b41 = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
        b41.setIcon(new javax.swing.ImageIcon("botãoTelecomando.jpg"));
        b41.addActionListener(this);
        b41.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b41.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b41.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b41.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b41.setForeground(Color.black);// cor do titulo do bot�o
        b41.setEnabled(true);
        b41.setToolTipText("Pressione para acessar a Tela dos Barramentos de 34,5 kV");
        b41.setMnemonic(KeyEvent.VK_B);
        b41.setActionCommand("Usuario");// define o nome da acao
        b41.setBounds(302, 59, 50, 48); // (252,59,50,48) Coluna,Linha,Largura,Altura
        getContentPane().add(b41);

        b42 = new JButton(""); // BOT�O PAINEL FRAME MENU DE TELECOMANDO
        b42.setIcon(new javax.swing.ImageIcon("telecomando.jpg"));
        b42.addActionListener(this);
        b42.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b42.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b42.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b42.setForeground(Color.black);// cor do titulo do bot�o
        b42.setEnabled(true);
        b42.setToolTipText("Modifica Valores");
        b42.setMnemonic(KeyEvent.VK_B);
        b42.setActionCommand("Usuario");// define o nome da acao
        b42.setBounds(252, 59, 50, 48); // Coluna,Linha,Largura,Altura
        getContentPane().add(b42);

        b43 = new JButton(""); // BOT�O PAINEL FRAME MENU DE TELECOMANDO
        b43.setIcon(new javax.swing.ImageIcon("botãoMT.jpg"));
        b43.addActionListener(this);
        b43.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b43.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b43.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b43.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b43.setForeground(Color.black);// cor do titulo do botao
        b43.setEnabled(true);
        b43.setToolTipText("Pressione para Visualizar Imagens dos Equipamentos");
        b43.setMnemonic(KeyEvent.VK_B);
        b43.setActionCommand("Usuario");// define o nome da acao
        b43.setBounds(102, 59, 50, 48); // Coluna,Linha,Largura,Altura
        getContentPane().add(b43);

        b44 = new JButton(""); // BOT�O PAINEL FRAME MENU DE TELECOMANDO
        b44.setIcon(new javax.swing.ImageIcon("Simulador.jpg"));
        b44.addActionListener(this);
        b44.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b44.setVerticalTextPosition(AbstractButton.CENTER);// posiçao do texto
        b44.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b44.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b44.setForeground(Color.black);// cor do titulo do bot�o
        b44.setEnabled(true);
        b44.setToolTipText("Pressione para Selecionar uma das Classes de Manobra a ser Simulada");
        b44.setMnemonic(KeyEvent.VK_B);
        b44.setActionCommand("Usuario");// define o nome da acao
        b44.setBounds(352, 59, 50, 48); // Coluna,Linha,Largura,Altura
        getContentPane().add(b44);

        b45 = new JButton(""); // BOT�O PAINEL FRAME MENU DE TELECOMANDO
        b45.setIcon(new javax.swing.ImageIcon("botaoseslocais.jpg"));
        b45.addActionListener(this);
        b45.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b45.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b45.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b45.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b45.setForeground(Color.black);// cor do titulo do bot�o
        b45.setEnabled(true);
        b45.setToolTipText("Pressione para chamar a tela das SE's Locais");
        b45.setMnemonic(KeyEvent.VK_B);
        b45.setActionCommand("Usuario");// define o nome da acao
        b45.setBounds(402, 59, 50, 48); // Coluna,Linha,Largura,Altura
        getContentPane().add(b45);

        // ����������������������������� CRIAÇAO DE PANEL PARA ADICIONAR LINHAS
        JPanel borda = new JPanel(); // LINHA SUPERIOR
        borda.setBounds(0, 1, 1050, 4);
        borda.setBackground(Color.blue);
        getContentPane().add(borda);

        JPanel borda1 = new JPanel(); // LINHA INFERIOR
        borda1.setBounds(0, 54, 1050, 4);
        borda1.setBackground(Color.blue);
        getContentPane().add(borda1);

        // ���������������������������������� CRIAÇAO DAS BORDAS NORTE E SUL PARA ADIÇAO
        // DOS LABELS
        simulador = new JLabel("SIMULADOR");
        simulador.setFont(new Font("Dialog", Font.BOLD, 40));
        simulador.setForeground(Color.white);// cor de fundo do bot�o
        simulador.setBounds(430, 5, 300, 50); // Coluna,Linha,Largura,Altura
        // getContentPane().add(simulador);

        lbData = new JLabel("" + data);
        // lbData.setEditable(false);
        lbData.setFont(new Font("Dialog", Font.BOLD, 14));
        lbData.setForeground(new Color(225255255));
        lbData.setBackground(new Color(192, 192, 192)); // cor de fundo do botão
        lbData.setBounds(802, 70, 224, 24); // Coluna,Linha,Largura,Altura
        getContentPane().add(lbData);

        Alarmes = new JLabel("Alarmes: ");
        Alarmes.setFont(new Font("Arial", 1, 16));
        Alarmes.setForeground(Color.red);
        Alarmes.setBounds(10, 700, 255, 40);
        getContentPane().add(Alarmes);

        JLabel l1 = new JLabel();
        l1.setFont(new Font("Arial", 1, 80));
        l1.setText("                                                                            .");
        l1.setForeground(Color.gray);

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setBackground(new Color(192, 192, 192));
        p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.add(l1);
        c.add(p1, java.awt.BorderLayout.NORTH);

        status = new JLabel();
        status.setFont(new Font("Arial", 1, 48));
        status.setText(
                "                                                                                               .");
        status.setForeground(Color.gray);

        status1 = new JLabel(" MANOBRA HABILITADA PARA SIMULAÇAO: " + "'NENHUMA'");
        status1.setForeground(new Color(225255255));
        status1.setFont(new Font("Dialog", Font.BOLD, 12));
        status1.setBounds(10, 730, 640, 20); // Coluna,Linha,Largura,Altura
        getContentPane().add(status1);

        status2 = new JLabel(" EQUIPAMENTO QUE FOI OPERADO: " + "'NENHUM'");
        status2.setForeground(Color.green);
        status2.setFont(new Font("Dialog", Font.BOLD, 12));
        status2.setBounds(10, 750, 415, 20); // Coluna,Linha,Largura,Altura
        getContentPane().add(status2);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.setBackground(new Color(192, 192, 192));
        p2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.add(status); // p2.add (status1); p2.add (status2);
        c.add(p2, java.awt.BorderLayout.SOUTH);

        // ����������������������������� CRIAÇAO DE UM PANEL PARA ADIÇAO DOS ELEMENTOS
        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(192, 192, 192));
        painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        // ����������� CRIAÇAO DE TODOS OS LABELS QUE IDENTIFICAM OS EQUIPAMENTOS

        contdem = new JLabel("Controle de Demanda");
        contdem.setFont(new Font("Dialog", Font.BOLD, 14));
        contdem.setForeground(Color.black);
        contdem.setBounds(48, 40, 160, 30);
        painel.add(contdem);

        demcont = new JLabel("Demanda Controlada (MW)");
        demcont.setFont(new Font("Dialog", Font.ITALIC, 14));
        demcont.setForeground(new Color(51, 102, 153));
        demcont.setBounds(8, 60, 240, 30);
        painel.add(demcont);

        demcont = new JLabel("812.0");
        demcont.setFont(new Font("Dialog", Font.BOLD, 14));
        demcont.setForeground(Color.blue);
        demcont.setBounds(208, 60, 240, 30);
        painel.add(demcont);

        frequencia = new JLabel("60.0            (HZ)");
        frequencia.setForeground(Color.blue);
        frequencia.setBounds(380, 8, 120, 30);
        painel.add(frequencia);

        eletronorte = new JLabel("Eletronorte");
        eletronorte.setFont(new Font("Dialog", Font.ITALIC, 14));
        eletronorte.setForeground(new Color(51, 102, 153));
        eletronorte.setBounds(278, 50, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(eletronorte);

        tensaoEletronorte = new JLabel("237.7   (kV)");
        tensaoEletronorte.setFont(new Font("Dialog", Font.BOLD, 14));
        tensaoEletronorte.setForeground(Color.blue);
        tensaoEletronorte.setBounds(292, 65, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(tensaoEletronorte);

        eletronorte = new JLabel("855.2   (MW)");
        eletronorte.setFont(new Font("Dialog", Font.BOLD, 14));
        eletronorte.setForeground(Color.blue);
        eletronorte.setBounds(292, 85, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(eletronorte);

        alunorte = new JLabel("Alunorte");
        alunorte.setFont(new Font("Dialog", Font.ITALIC, 14));
        alunorte.setForeground(new Color(51, 102, 153));
        alunorte.setBounds(534, 50, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(alunorte);

        alunorte = new JLabel("76.1      (MW)");
        alunorte.setFont(new Font("Dialog", Font.BOLD, 14));
        alunorte.setForeground(Color.blue);
        alunorte.setBounds(540, 65, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(alunorte);

        albras = new JLabel("Albras");
        albras.setFont(new Font("Dialog", Font.ITALIC, 14));
        albras.setForeground(Color.black);
        albras.setBounds(440, 85, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(albras);

        demTotalAlbras = new JLabel("792.2    (MW)");
        demTotalAlbras.setFont(new Font("Dialog", Font.BOLD, 14));
        demTotalAlbras.setForeground(Color.blue);
        demTotalAlbras.setBounds(440, 100, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(demTotalAlbras);

        albras = new JLabel("MT's");
        albras.setFont(new Font("Dialog", Font.ITALIC, 14));
        albras.setForeground(Color.black);
        albras.setBounds(425, 158, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(albras);

        medenergia = new JLabel("Mediçao de Energia");
        medenergia.setFont(new Font("Dialog", Font.BOLD, 14));
        medenergia.setForeground(Color.black);
        medenergia.setBounds(740, 40, 160, 30);
        painel.add(medenergia);

        fatpotencia = new JLabel("Fator de Potencia                           %");
        fatpotencia.setFont(new Font("Dialog", Font.ITALIC, 14));
        fatpotencia.setForeground(new Color(51, 102, 153));
        fatpotencia.setBounds(640, 70, 250, 14); // IDENTIFICACAO DA BARRA B
        painel.add(fatpotencia);

        fatpotencia = new JLabel("98.3");
        fatpotencia.setFont(new Font("Dialog", Font.BOLD, 14));
        fatpotencia.setForeground(Color.blue);
        fatpotencia.setBounds(935, 70, 250, 14); // IDENTIFICACAO DA BARRA B
        painel.add(fatpotencia);

        demanterior = new JLabel("Demanda Anterior                        (MW)");
        demanterior.setFont(new Font("Dialog", Font.ITALIC, 14));
        demanterior.setForeground(new Color(51, 102, 153));
        demanterior.setBounds(640, 95, 250, 14); // IDENTIFICACAO DA BARRA B
        painel.add(demanterior);

        demanterior = new JLabel("805.2");
        demanterior.setFont(new Font("Dialog", Font.BOLD, 14));
        demanterior.setForeground(Color.blue);
        demanterior.setBounds(935, 95, 250, 14); // IDENTIFICACAO DA BARRA B
        painel.add(demanterior);

        dematual = new JLabel("Demanda Atual                             (MW)");
        dematual.setFont(new Font("Dialog", Font.ITALIC, 14));
        dematual.setForeground(new Color(51, 102, 153));
        dematual.setBounds(640, 120, 250, 14); // IDENTIFICAC�O DA BARRA B
        painel.add(dematual);

        dematual = new JLabel("805.8");
        dematual.setFont(new Font("Dialog", Font.BOLD, 14));
        dematual.setForeground(Color.blue);
        dematual.setBounds(935, 120, 250, 14); // IDENTIFICACAO DA BARRA B
        painel.add(dematual);

        demmedtotal = new JLabel("Demanda Medidor Total_Albras   (MW)");
        demmedtotal.setFont(new Font("Dialog", Font.ITALIC, 14));
        demmedtotal.setForeground(new Color(51, 102, 153));
        demmedtotal.setBounds(640, 145, 250, 14); // IDENTIFICACAO DA BARRA B
        painel.add(demmedtotal);

        demmedtotal = new JLabel("806.4");
        demmedtotal.setFont(new Font("Dialog", Font.BOLD, 14));
        demmedtotal.setForeground(Color.blue);
        demmedtotal.setBounds(935, 145, 250, 14); // IDENTIFICACAO DA BARRA B
        painel.add(demmedtotal);

        horaref = new JLabel("Hora de Referencia");
        horaref.setFont(new Font("Dialog", Font.ITALIC, 14));
        horaref.setForeground(new Color(51, 102, 153));
        horaref.setBounds(640, 170, 250, 14); // IDENTIFICACAO DA BARRA B
        painel.add(horaref);

        horaref = new JLabel("Fora de Ponta");
        horaref.setFont(new Font("Dialog", Font.ITALIC, 14));
        horaref.setForeground(new Color(128, 0, 128));
        horaref.setBounds(768, 170, 250, 14); // IDENTIFICACAO DA BARRA B
        painel.add(horaref);

        tfData = new JTextField();
        tfData.setEditable(false);
        tfData.setFont(new Font("Dialog", Font.BOLD, 13));
        tfData.setForeground(new Color(225255255));
        tfData.setBackground(new Color(192, 192, 192)); // cor de fundo do botao
        tfData.setBounds(862, 170, 126, 15); // Coluna,Linha,Largura,Altura
        painel.add(tfData);

        red1 = new JLabel("RED1");
        red1.setFont(new Font("Dialog", Font.BOLD, 18));
        red1.setForeground(Color.blue);
        red1.setBounds(40, 470, 160, 30);
        painel.add(red1);

        red1 = new JLabel("LVR-1");
        red1.setFont(new Font("Dialog", Font.ITALIC, 14));
        red1.setForeground(new Color(51, 102, 153));
        red1.setBounds(80, 230, 160, 30);
        painel.add(red1);

        red1 = new JLabel("RED2");
        red1.setFont(new Font("Dialog", Font.BOLD, 18));
        red1.setForeground(Color.blue);
        red1.setBounds(205, 470, 160, 30);
        painel.add(red1);

        red1 = new JLabel("LVR-2");
        red1.setFont(new Font("Dialog", Font.ITALIC, 14));
        red1.setForeground(new Color(51, 102, 153));
        red1.setBounds(250, 230, 160, 30);
        painel.add(red1);

        red1 = new JLabel("RED3");
        red1.setFont(new Font("Dialog", Font.BOLD, 18));
        red1.setForeground(Color.blue);
        red1.setBounds(375, 470, 160, 30);
        painel.add(red1);

        red1 = new JLabel("LVR-3");
        red1.setFont(new Font("Dialog", Font.ITALIC, 14));
        red1.setForeground(new Color(51, 102, 153));
        red1.setBounds(420, 230, 160, 30);
        painel.add(red1);

        red1 = new JLabel("RED4");
        red1.setFont(new Font("Dialog", Font.BOLD, 18));
        red1.setForeground(Color.blue);
        red1.setBounds(545, 470, 160, 30);
        painel.add(red1);

        red1 = new JLabel("LVR-4");
        red1.setFont(new Font("Dialog", Font.ITALIC, 14));
        red1.setForeground(new Color(51, 102, 153));
        red1.setBounds(590, 230, 160, 30);
        painel.add(red1);

        red1 = new JLabel("PROCESSO");
        red1.setFont(new Font("Dialog", Font.BOLD, 18));
        red1.setForeground(Color.blue);
        red1.setBounds(940, 470, 160, 30);
        painel.add(red1);

        reduçao1 = new JLabel("Reduçao I");
        reduçao1.setFont(new Font("Dialog", Font.BOLD, 15));
        reduçao1.setForeground(Color.black);
        reduçao1.setBounds(100, 285, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(reduçao1);

        reduçao1 = new JLabel("Reduçao II");
        reduçao1.setFont(new Font("Dialog", Font.BOLD, 15));
        reduçao1.setForeground(Color.black);
        reduçao1.setBounds(270, 285, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(reduçao1);

        reduçao1 = new JLabel("Reduçao III");
        reduçao1.setFont(new Font("Dialog", Font.BOLD, 15));
        reduçao1.setForeground(Color.black);
        reduçao1.setBounds(440, 285, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(reduçao1);

        reduçao1 = new JLabel("Reduçao IV");
        reduçao1.setFont(new Font("Dialog", Font.BOLD, 15));
        reduçao1.setForeground(Color.black);
        reduçao1.setBounds(610, 285, 130, 14); // IDENTIFICACAO DA BARRA B
        painel.add(reduçao1);

        reduçao1 = new JLabel("Alimentadores");
        reduçao1.setFont(new Font("Dialog", Font.BOLD, 15));
        reduçao1.setForeground(Color.black);
        reduçao1.setBounds(855, 285, 220, 14); // IDENTIFICACAO DA BARRA B
        painel.add(reduçao1);

        reduçao1 = new JLabel("de Processo");
        reduçao1.setFont(new Font("Dialog", Font.BOLD, 15));
        reduçao1.setForeground(Color.black);
        reduçao1.setBounds(855, 297, 220, 14); // IDENTIFICACAO DA BARRA B
        painel.add(reduçao1);

        dem = new JLabel("Dem");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(80, 305, 160, 30);
        painel.add(dem);

        dem = new JLabel("Iset");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(80, 330, 160, 30);
        painel.add(dem);

        idc1 = new JButton("IDC");
        idc1.setFont(new Font("Dialog", Font.ITALIC, 15));
        idc1.setForeground(new Color(0, 0, 102));
        idc1.setBackground(new Color(192, 192, 192));
        idc1.setBounds(80, 364, 60, 20);
        painel.add(idc1);

        dem = new JLabel("VDC");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(80, 390, 160, 30);
        painel.add(dem);

        dem = new JLabel("DV");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(80, 420, 160, 30);
        painel.add(dem);

        dem = new JLabel("Dem");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(250, 305, 160, 30);
        painel.add(dem);

        dem = new JLabel("Iset");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(250, 330, 160, 30);
        painel.add(dem);

        idc2 = new JButton("IDC");
        idc2.setFont(new Font("Dialog", Font.ITALIC, 15));
        idc2.setForeground(new Color(0, 0, 102));
        idc2.setBackground(new Color(192, 192, 192));
        idc2.setBounds(250, 364, 60, 20);
        painel.add(idc2);

        dem = new JLabel("VDC");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(250, 390, 160, 30);
        painel.add(dem);

        dem = new JLabel("DV");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(250, 420, 160, 30);
        painel.add(dem);

        dem = new JLabel("Dem");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(420, 305, 160, 30);
        painel.add(dem);

        dem = new JLabel("Iset");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(420, 330, 160, 30);
        painel.add(dem);

        idc3 = new JButton("IDC");
        idc3.setFont(new Font("Dialog", Font.ITALIC, 15));
        idc3.setForeground(new Color(0, 0, 102));
        idc3.setBackground(new Color(192, 192, 192));
        idc3.setBounds(420, 364, 60, 20);
        painel.add(idc3);

        dem = new JLabel("VDC");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(420, 390, 160, 30);
        painel.add(dem);

        dem = new JLabel("DV");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(420, 420, 160, 30);
        painel.add(dem);

        dem = new JLabel("Dem");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(590, 305, 160, 30);
        painel.add(dem);

        dem = new JLabel("Iset");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(590, 330, 160, 30);
        painel.add(dem);

        idc4 = new JButton("IDC");
        idc4.setFont(new Font("Dialog", Font.ITALIC, 15));
        idc4.setForeground(new Color(0, 0, 102));
        idc4.setBackground(new Color(192, 192, 192));
        idc4.setBounds(590, 364, 60, 20);
        painel.add(idc4);

        dem = new JLabel("VDC");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(590, 390, 160, 30);
        painel.add(dem);

        dem = new JLabel("DV");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(590, 420, 160, 30);
        painel.add(dem);

        dem = new JLabel("P1");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(870, 305, 160, 30);
        painel.add(dem);

        dem = new JLabel("P2");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(870, 325, 160, 30);
        painel.add(dem);

        dem = new JLabel("P3");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(870, 345, 160, 30);
        painel.add(dem);

        dem = new JLabel("P4");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(870, 365, 160, 30);
        painel.add(dem);

        dem = new JLabel("P5");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(870, 385, 160, 30);
        painel.add(dem);

        dem = new JLabel("P6");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(870, 405, 160, 30);
        painel.add(dem);

        dem = new JLabel("Total");
        dem.setFont(new Font("Dialog", Font.ITALIC, 15));
        dem.setForeground(new Color(0, 0, 102));
        dem.setBounds(870, 425, 160, 30);
        painel.add(dem);

        demred = new JLabel("                      182.1");
        demred.setFont(new Font("Dialog", Font.BOLD, 15));
        demred.setForeground(Color.blue);
        demred.setBounds(80, 305, 160, 30);
        painel.add(demred);

        corr = new JLabel("                      172.0");
        corr.setFont(new Font("Dialog", Font.BOLD, 15));
        corr.setForeground(Color.blue);
        corr.setBounds(80, 330, 160, 30);
        painel.add(corr);

        corrSet1 = new JLabel("                      172.2");
        corrSet1.setFont(new Font("Dialog", Font.BOLD, 15));
        corrSet1.setForeground(Color.blue);
        corrSet1.setBounds(80, 360, 160, 30);
        painel.add(corrSet1);

        tensaoCont1 = new JLabel("                    1028.5");
        tensaoCont1.setFont(new Font("Dialog", Font.BOLD, 15));
        tensaoCont1.setForeground(Color.blue);
        tensaoCont1.setBounds(80, 390, 160, 30);
        painel.add(tensaoCont1);

        desvio = new JLabel("                       1.35");
        desvio.setFont(new Font("Dialog", Font.BOLD, 15));
        desvio.setForeground(Color.blue);
        desvio.setBounds(80, 420, 160, 30);
        painel.add(desvio);

        demred = new JLabel("                      194.1");
        demred.setFont(new Font("Dialog", Font.BOLD, 15));
        demred.setForeground(Color.blue);
        demred.setBounds(250, 305, 160, 30);
        painel.add(demred);

        corr = new JLabel("                      181.0");
        corr.setFont(new Font("Dialog", Font.BOLD, 15));
        corr.setForeground(Color.blue);
        corr.setBounds(250, 330, 160, 30);
        painel.add(corr);

        corrSet2 = new JLabel("                      181.1");
        corrSet2.setFont(new Font("Dialog", Font.BOLD, 15));
        corrSet2.setForeground(Color.blue);
        corrSet2.setBounds(250, 360, 160, 30);
        painel.add(corrSet2);

        tensaoCont2 = new JLabel("                    1044.2");
        tensaoCont2.setFont(new Font("Dialog", Font.BOLD, 15));
        tensaoCont2.setForeground(Color.blue);
        tensaoCont2.setBounds(250, 390, 160, 30);
        painel.add(tensaoCont2);

        desvio = new JLabel("                       -7.22");
        desvio.setFont(new Font("Dialog", Font.BOLD, 15));
        desvio.setForeground(Color.blue);
        desvio.setBounds(250, 420, 160, 30);
        painel.add(desvio);

        demred = new JLabel("                      196.7");
        demred.setFont(new Font("Dialog", Font.BOLD, 15));
        demred.setForeground(Color.blue);
        demred.setBounds(420, 305, 160, 30);
        painel.add(demred);

        corr = new JLabel("                      180.0");
        corr.setFont(new Font("Dialog", Font.BOLD, 15));
        corr.setForeground(Color.blue);
        corr.setBounds(420, 330, 160, 30);
        painel.add(corr);

        corrSet3 = new JLabel("                      180.1");
        corrSet3.setFont(new Font("Dialog", Font.BOLD, 15));
        corrSet3.setForeground(Color.blue);
        corrSet3.setBounds(420, 360, 160, 30);
        painel.add(corrSet3);

        tensaoCont3 = new JLabel("                    1064.1");
        tensaoCont3.setFont(new Font("Dialog", Font.BOLD, 15));
        tensaoCont3.setForeground(Color.blue);
        tensaoCont3.setBounds(420, 390, 160, 30);
        painel.add(tensaoCont3);

        desvio = new JLabel("                       0.22");
        desvio.setFont(new Font("Dialog", Font.BOLD, 15));
        desvio.setForeground(Color.blue);
        desvio.setBounds(420, 420, 160, 30);
        painel.add(desvio);

        demred = new JLabel("                      195.8");
        demred.setFont(new Font("Dialog", Font.BOLD, 15));
        demred.setForeground(Color.blue);
        demred.setBounds(590, 305, 160, 30);
        painel.add(demred);

        corr = new JLabel("                      181.0");
        corr.setFont(new Font("Dialog", Font.BOLD, 15));
        corr.setForeground(Color.blue);
        corr.setBounds(590, 330, 160, 30);
        painel.add(corr);

        corrSet4 = new JLabel("                      181.1");
        corrSet4.setFont(new Font("Dialog", Font.BOLD, 15));
        corrSet4.setForeground(Color.blue);
        corrSet4.setBounds(590, 360, 160, 30);
        painel.add(corrSet4);

        tensaoCont4 = new JLabel("                    1056.1");
        tensaoCont4.setFont(new Font("Dialog", Font.BOLD, 15));
        tensaoCont4.setForeground(Color.blue);
        tensaoCont4.setBounds(590, 390, 160, 30);
        painel.add(tensaoCont4);

        desvio = new JLabel("                       0.40");
        desvio.setFont(new Font("Dialog", Font.BOLD, 15));
        desvio.setForeground(Color.blue);
        desvio.setBounds(590, 420, 160, 30);
        painel.add(desvio);

        demred = new JLabel("                      8.2");
        demred.setFont(new Font("Dialog", Font.BOLD, 15));
        demred.setForeground(Color.blue);
        demred.setBounds(830, 304, 160, 30);
        painel.add(demred);

        corr = new JLabel("                      6.0");
        corr.setFont(new Font("Dialog", Font.BOLD, 15));
        corr.setForeground(Color.blue);
        corr.setBounds(830, 324, 160, 30);
        painel.add(corr);

        corrSet = new JLabel("                       7.1");
        corrSet.setFont(new Font("Dialog", Font.BOLD, 15));
        corrSet.setForeground(Color.blue);
        corrSet.setBounds(830, 344, 160, 30);
        painel.add(corrSet);

        tensaoCont = new JLabel("                       4.1");
        tensaoCont.setFont(new Font("Dialog", Font.BOLD, 15));
        tensaoCont.setForeground(Color.blue);
        tensaoCont.setBounds(830, 364, 160, 30);
        painel.add(tensaoCont);

        desvio = new JLabel("                       5.4");
        desvio.setFont(new Font("Dialog", Font.BOLD, 15));
        desvio.setForeground(Color.blue);
        desvio.setBounds(830, 384, 160, 30);
        painel.add(desvio);

        desvio = new JLabel("                       4.4");
        desvio.setFont(new Font("Dialog", Font.BOLD, 15));
        desvio.setForeground(Color.blue);
        desvio.setBounds(830, 404, 160, 30);
        painel.add(desvio);

        desvio = new JLabel("                       36.4");
        desvio.setFont(new Font("Dialog", Font.BOLD, 15));
        desvio.setForeground(Color.blue);
        desvio.setBounds(820, 424, 160, 30);
        painel.add(desvio);

        // �������� CRIAÇAO DE TODOS OS ELEMENTOS GRAFICOS ADICIONADOS EM PANEL

        JPanel v = new JPanel();
        v.setBounds(310, 30, 250, 3);
        v.setBackground(Color.red);
        painel.add(v);

        JPanel v1 = new JPanel();
        v1.setBounds(60, 206, 930, 3);
        v1.setBackground(Color.orange);
        painel.add(v1);

        JPanel v2 = new JPanel();
        v2.setBounds(308, 30, 3, 20);
        v2.setBackground(Color.red);
        painel.add(v2);

        JPanel v3 = new JPanel();
        v3.setBounds(560, 30, 3, 20);
        v3.setBackground(Color.red);
        painel.add(v3);

        JPanel v4 = new JPanel();
        v4.setBounds(294, 48, 32, 3);
        v4.setBackground(Color.red);
        painel.add(v4);

        JPanel v5 = new JPanel();
        v5.setBounds(546, 48, 32, 3);
        v5.setBackground(Color.red);
        painel.add(v5);

        JPanel v6 = new JPanel();
        v6.setBounds(398, 30, 3, 112);
        v6.setBackground(Color.red);
        painel.add(v6);

        JPanel v7 = new JPanel();
        v7.setBounds(400, 180, 3, 28);
        v7.setBackground(Color.orange);
        painel.add(v7);

        Icon imagem3 = new ImageIcon("MT.JPG");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem3);
        jLabel1.setBounds(370, 244, 55, 48);
        getContentPane().add(jLabel1);

        JPanel v8 = new JPanel();
        v8.setBounds(257, 55, 1, 140);
        v8.setBackground(Color.gray);
        painel.add(v8);

        JPanel v9 = new JPanel();
        v9.setBounds(6, 55, 1, 140);
        v9.setBackground(Color.gray);
        painel.add(v9);

        JPanel v10 = new JPanel();
        v10.setBounds(6, 195, 252, 1);
        v10.setBackground(Color.gray);
        painel.add(v10);

        JPanel v11 = new JPanel();
        v11.setBounds(6, 54, 30, 1);
        v11.setBackground(Color.gray);
        painel.add(v11);

        JPanel v12 = new JPanel();
        v12.setBounds(232, 54, 26, 1);
        v12.setBackground(Color.gray);
        painel.add(v12);

        JPanel v13 = new JPanel();
        v13.setBounds(988, 55, 1, 140);
        v13.setBackground(Color.gray);
        painel.add(v13);

        JPanel v14 = new JPanel();
        v14.setBounds(633, 55, 1, 140);
        v14.setBackground(Color.gray);
        painel.add(v14);

        JPanel v15 = new JPanel();
        v15.setBounds(633, 195, 356, 1);
        v15.setBackground(Color.gray);
        painel.add(v15);

        JPanel v16 = new JPanel();
        v16.setBounds(633, 54, 80, 1);
        v16.setBackground(Color.gray);
        painel.add(v16);

        JPanel v17 = new JPanel();
        v17.setBounds(929, 54, 60, 1);
        v17.setBackground(Color.gray);
        painel.add(v17);

        JPanel v18 = new JPanel();
        v18.setBounds(58, 206, 3, 32);
        v18.setBackground(Color.orange);
        painel.add(v18);

        Icon imagem4 = new ImageIcon("LVR1.JPG");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem4);
        jLabel1.setBounds(43, 330, 55, 48);
        getContentPane().add(jLabel1);

        JPanel v19 = new JPanel();
        v19.setBounds(58, 263, 3, 200);
        v19.setBackground(Color.yellow);
        painel.add(v19);

        JPanel v20 = new JPanel();
        v20.setBounds(44, 463, 32, 3);
        v20.setBackground(Color.yellow);
        painel.add(v20);

        JPanel v21 = new JPanel();
        v21.setBounds(224, 206, 3, 32);
        v21.setBackground(Color.orange);
        painel.add(v21);

        Icon imagem5 = new ImageIcon("LVR1.JPG");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem5);
        jLabel1.setBounds(211, 330, 55, 48);
        getContentPane().add(jLabel1);

        JPanel v22 = new JPanel();
        v22.setBounds(226, 263, 3, 200);
        v22.setBackground(Color.yellow);
        painel.add(v22);

        JPanel v23 = new JPanel();
        v23.setBounds(212, 463, 32, 3);
        v23.setBackground(Color.yellow);
        painel.add(v23);

        JPanel v24 = new JPanel();
        v24.setBounds(400, 206, 3, 32);
        v24.setBackground(Color.orange);
        painel.add(v24);

        Icon imagem6 = new ImageIcon("LVR1.JPG");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem6);
        jLabel1.setBounds(383, 330, 55, 48);
        getContentPane().add(jLabel1);

        JPanel v25 = new JPanel();
        v25.setBounds(398, 263, 3, 200);
        v25.setBackground(Color.yellow);
        painel.add(v25);

        JPanel v26 = new JPanel();
        v26.setBounds(383, 463, 32, 3);
        v26.setBackground(Color.yellow);
        painel.add(v26);

        JPanel v27 = new JPanel();
        v27.setBounds(566, 206, 3, 32);
        v27.setBackground(Color.orange);
        painel.add(v27);

        Icon imagem7 = new ImageIcon("LVR1.JPG");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem7);
        jLabel1.setBounds(551, 330, 55, 48);
        getContentPane().add(jLabel1);

        JPanel v28 = new JPanel();
        v28.setBounds(566, 263, 3, 200);
        v28.setBackground(Color.yellow);
        painel.add(v28);

        JPanel v29 = new JPanel();
        v29.setBounds(552, 463, 32, 3);
        v29.setBackground(Color.yellow);
        painel.add(v29);

        JPanel v30 = new JPanel();
        v30.setBounds(987, 207, 3, 257);
        v30.setBackground(Color.orange);
        painel.add(v30);

        JPanel v31 = new JPanel();
        v31.setBounds(972, 463, 32, 3);
        v31.setBackground(Color.orange);
        painel.add(v31);

        JPanel v32 = new JPanel();
        v32.setBounds(974, 295, 1, 158);
        v32.setBackground(Color.gray);
        painel.add(v32);

        JPanel v33 = new JPanel();
        v33.setBounds(833, 453, 142, 1);
        v33.setBackground(Color.gray);
        painel.add(v33);

        JPanel v34 = new JPanel();
        v34.setBounds(833, 295, 18, 1);
        v34.setBackground(Color.gray);
        painel.add(v34);

        JPanel v35 = new JPanel();
        v35.setBounds(957, 295, 18, 1);
        v35.setBackground(Color.gray);
        painel.add(v35);

        JPanel v36 = new JPanel();
        v36.setBounds(833, 295, 1, 158);
        v36.setBackground(Color.gray);
        painel.add(v36);

        JPanel v37 = new JPanel();
        v37.setBounds(724, 295, 1, 158);
        v37.setBackground(Color.gray);
        painel.add(v37);

        JPanel v38 = new JPanel();
        v38.setBounds(583, 453, 142, 1);
        v38.setBackground(Color.gray);
        painel.add(v38);

        JPanel v39 = new JPanel();
        v39.setBounds(583, 295, 18, 1);
        v39.setBackground(Color.gray);
        painel.add(v39);

        JPanel v40 = new JPanel();
        v40.setBounds(707, 295, 18, 1);
        v40.setBackground(Color.gray);
        painel.add(v40);

        JPanel v41 = new JPanel();
        v41.setBounds(583, 295, 1, 158);
        v41.setBackground(Color.gray);
        painel.add(v41);

        JPanel v42 = new JPanel();
        v42.setBounds(554, 295, 1, 158);
        v42.setBackground(Color.gray);
        painel.add(v42);

        JPanel v43 = new JPanel();
        v43.setBounds(413, 453, 142, 1);
        v43.setBackground(Color.gray);
        painel.add(v43);

        JPanel v44 = new JPanel();
        v44.setBounds(413, 295, 18, 1);
        v44.setBackground(Color.gray);
        painel.add(v44);

        JPanel v45 = new JPanel();
        v45.setBounds(537, 295, 18, 1);
        v45.setBackground(Color.gray);
        painel.add(v45);

        JPanel v46 = new JPanel();
        v46.setBounds(413, 295, 1, 158);
        v46.setBackground(Color.gray);
        painel.add(v46);

        JPanel v47 = new JPanel();
        v47.setBounds(384, 295, 1, 158);
        v47.setBackground(Color.gray);
        painel.add(v47);

        JPanel v48 = new JPanel();
        v48.setBounds(243, 453, 142, 1);
        v48.setBackground(Color.gray);
        painel.add(v48);

        JPanel v49 = new JPanel();
        v49.setBounds(243, 295, 18, 1);
        v49.setBackground(Color.gray);
        painel.add(v49);

        JPanel v50 = new JPanel();
        v50.setBounds(367, 295, 18, 1);
        v50.setBackground(Color.gray);
        painel.add(v50);

        JPanel v51 = new JPanel();
        v51.setBounds(243, 295, 1, 158);
        v51.setBackground(Color.gray);
        painel.add(v51);

        JPanel v52 = new JPanel();
        v52.setBounds(214, 295, 1, 158);
        v52.setBackground(Color.gray);
        painel.add(v52);

        JPanel v53 = new JPanel();
        v53.setBounds(73, 453, 142, 1);
        v53.setBackground(Color.gray);
        painel.add(v53);

        JPanel v54 = new JPanel();
        v54.setBounds(73, 295, 18, 1);
        v54.setBackground(Color.gray);
        painel.add(v54);

        JPanel v55 = new JPanel();
        v55.setBounds(197, 295, 18, 1);
        v55.setBackground(Color.gray);
        painel.add(v55);

        JPanel v56 = new JPanel();
        v56.setBounds(73, 295, 1, 158);
        v56.setBackground(Color.gray);
        painel.add(v56);

        Icon imagem9 = new ImageIcon("estaçao.GIF");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem9);
        jLabel1.setBounds(70, 303, 55, 48);
        getContentPane().add(jLabel1);

        Icon imagem10 = new ImageIcon("estaçao.GIF");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem10);
        jLabel1.setBounds(238, 303, 55, 48);
        getContentPane().add(jLabel1);

        Icon imagem11 = new ImageIcon("estaçao.GIF");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem11);
        jLabel1.setBounds(410, 303, 55, 48);
        getContentPane().add(jLabel1);

        Icon imagem12 = new ImageIcon("estaçao.GIF");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem12);
        jLabel1.setBounds(579, 303, 55, 48);
        getContentPane().add(jLabel1);

        c.add(painel, java.awt.BorderLayout.CENTER);
        // setDefaultOpenOperation(javax.swing.WindowConstants.AlwaysOnTop);
    }

    // #################### CLASSE TIMELISTENER PARA INSTALAR CONTADOR DE TEMPO
    interface TimerListener {
        void timeElapsed(Timer t);
    }

    class Timer extends Thread {
        private TimerListener target;
        private int interval;

        public Timer(int i, TimerListener t) {
            target = t;
            interval = i;
            setDaemon(true);
        }

        public void run() {
            try {
                while (!interrupted()) {
                    sleep(interval);
                    target.timeElapsed(this);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    // ########## CLASSE CLOCK CANVAS PARA EXECUTAR E MOSTRAR A HORA EM TEMPO REAL
    class ClockCanvas extends JPanel implements TimerListener {
        private int seconds = 0;
        String city;
        // private int offset;
        private GregorianCalendar calendar;

        public ClockCanvas(String c, String tz) {
            city = c;
            calendar = new GregorianCalendar(TimeZone.getTimeZone(tz));
            Timer t = new Timer(1000, this);
            t.start();
            setSize(1, 1);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            double hourAngle = 2 * Math.PI * (seconds - 3 * 60 * 60) / (12 * 60 * 60);
            double minuteAngle = 2 * Math.PI * (seconds - 15 * 60) / (60 * 60);
            double secondAngle = 2 * Math.PI * (seconds - 15) / 60;

            atualizaData();
        }

        public void atualizaData() {
            Date data = new Date();
            SimpleDateFormat formato = new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss"); // somente a data em um objeto //
                                                                                     // separado
            String date = formato.format(data);
            tfData.setText(date);
        }

        public void timeElapsed(Timer t) {
            calendar.setTime(new Date());
            seconds = calendar.get(Calendar.HOUR) * 60 * 60 +
                    calendar.get(Calendar.MINUTE) * 60 +
                    calendar.get(calendar.SECOND);
            repaint();
        }
    }

    // ###################### METODOS ACTIONPERFORMED DE AÇÃO AOS BOTÕES CRIADOS
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b34) // ----------- BOTAO SAIR ----------------//
        {
            System.exit(0);
        }

        if (e.getSource() == b36) // --------------------------EXECUTA A CLASSE MENUPERFIL----------//
        {
            MenuPerfil MP = new MenuPerfil();
            MP.setVisible(true);
        }

        if (e.getSource() == b37) // -------------EXECUTAR O PAINEL DE MENU DE RELATORIOS-----------//
        {
            InterfaceRelatorios IR = new InterfaceRelatorios();
            IR.setVisible(true);
        }

        if (e.getSource() == b38) // -------------BOTÃO LOGOFF-----------//
        {
            usuario = tfUsuario.getText();
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja efetuar Logoff de: " + usuario,
                    "Usuario", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                tfUsuario.setText("     Default     ");
                tfPerfil.setText("     Default     ");
            }
        }

        if (e.getSource() == b39) // -------------BOTÃO EXECUTA A CLASSE INTERFACE USUARIO-----------//
        {
            if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")) {
                InterfaceUsuario IU = new InterfaceUsuario();
                IU.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Voce nao tem Perfil para acessar essa Funcionalidade!");
            }
        }

        if (e.getSource() == b41) // --------BOTÃO EXECUTA A CLASSE INTERFACEMENU DA TELA DOS BARRAMENTOS
        {
            if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")
                    || tfPerfil.getText().equals("Usuario") || tfPerfil.getText().equals("usuario")) {
                InterfaceMenu menu = new InterfaceMenu();
                menu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Faça o LOGIN para poder acessar essa Funcionalidade!");
            }
        }

        if (e.getSource() == b42) // -------------BOTÃO EXECUTA O MÉTODO DE TROCA DOS VALORES DE DEMANDA
        {
            variaDemanda();
            demTotalAlbras.setText("" + demtotal + "    (MW)");
            eletronorte.setText("" + elet + "   (MW)");
            tensaoEletronorte.setText("" + tensaoElet + "   (MW)");
            alunorte.setText("" + demAlunorte + "      (MW)");
            fatpotencia.setText("" + fatPotencia);
            demanterior.setText("" + demAnterior);
            dematual.setText("" + demAtual);
            demmedtotal.setText("" + demMedTotal);
            corrSet1.setText("                      " + corrente1);
            corrSet2.setText("                      " + corrente);
            corrSet3.setText("                      " + corrente);
            corrSet4.setText("                      " + corrente);
            tensaoCont1.setText("                    " + tensaocontrole1);
            tensaoCont2.setText("                    " + tensaocontrole);
            tensaoCont3.setText("                    " + tensaocontrole);
            tensaoCont4.setText("                    " + tensaocontrole);
        }

        if (e.getSource() == b43) // -------------BOTÃO QUE EXECUTA A CLASSE IMAGENS-----------//
        {
            Imagens1 mts = new Imagens1();
            mts.setVisible(true);
        }

        if (e.getSource() == b44 || e.getSource() == tfUsuario) {
            if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")
                    || tfPerfil.getText().equals("Usuario") || tfPerfil.getText().equals("usuario")) {
                MenuManobrasG MM = new MenuManobrasG();
                MM.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Faça o LOGIN para poder acessar essa Funcionalidade!");
            }
        }

        System.out.println("Confirmação do Ação do Método actionPerformed");
    }

    public void variaDemanda() // -----------MÉTODO PARA MUDAR OS VALORES DE DEMANDA-----------//
    {
        demtotal = 800.2;
        demtotal = demtotal + (int) ((Math.random() * 10) + 1);
        elet = 855.1;
        elet = elet + (int) ((Math.random() * 10) + 1);
        tensaoElet = 237.1;
        tensaoElet = tensaoElet + (int) ((Math.random() * 10) + 1);
        demAlunorte = 74.1;
        demAlunorte = demAlunorte + (int) ((Math.random() * 10) + 1);
        fatPotencia = 96.3;
        fatPotencia = fatPotencia + (int) ((Math.random() * 2) + 1);
        demAnterior = 798.2;
        demAnterior = demAnterior + (int) ((Math.random() * 10) + 1);
        demAtual = 795.2;
        demAtual = demAtual + (int) ((Math.random() * 10) + 1);
        demMedTotal = 795.2;
        demMedTotal = demMedTotal + (int) ((Math.random() * 10) + 1);
        corrente = 180.2;
        corrente = corrente + (int) ((Math.random() * 2) + 1);
        corrente1 = 170.3;
        corrente1 = corrente1 + (int) ((Math.random() * 2) + 1);
        tensaocontrole1 = 1026.3;
        tensaocontrole1 = tensaocontrole1 + (int) ((Math.random() * 10) + 1);
        tensaocontrole = 1048.3;
        tensaocontrole = tensaocontrole + (int) ((Math.random() * 10) + 1);
    }

    // ############################## CLASSE PERFIL PARA REALIZAR LOGIN
    public class Perfil extends JFrame implements ActionListener {

        // ---- Definiçao dos Objetos a serem Usados
        BDadosUsuario objBDLogin = new BDadosUsuario();

        private JLabel jlLogin;
        private JLabel jlSenha;
        private JLabel jlPerfil;
        private JLabel jlDistancia;
        JLabel gif, projeto, lbindice;

        private JTextField jtfLogin;
        private JPasswordField jtfSenha;
        private JTextField jtfPerfil;

        private JButton bConsultar;
        private JButton bSair;

        private JPanel jpPainel = new JPanel();

        public Perfil() {
            // --- Configuraçao do Frame
            setTitle("EfetuarLogin");
            setSize(210, 340);
            // setLocation(440, 200);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            setResizable(false);

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            jpPainel.add(gif);

            projeto = new JLabel("Efetuar Login", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 27));
            projeto.setForeground(Color.blue);
            jpPainel.add(projeto);
            container.add(jpPainel);

            // --- Configuraçao dos objetos do Frame
            jlLogin = new JLabel("   Login   ");
            jlSenha = new JLabel("   Senha   ");
            jlPerfil = new JLabel("   Perfil  ");
            jlDistancia = new JLabel(
                    "                                                                                                           ");

            jtfLogin = new JTextField(16);
            jtfSenha = new JPasswordField(16);
            jtfPerfil = new JTextField("Administrador", 16);
            jtfPerfil.addActionListener(this);

            // --- Definiçao dos Botoes e seus eventos
            bConsultar = new JButton("Autenticar");
            bConsultar.addActionListener(this);
            bSair = new JButton("     Sair    ");
            bSair.addActionListener(this);

            // --- Adicionando os Objetos para o Painel
            jpPainel.add(jlLogin);
            jpPainel.add(jtfLogin);
            jpPainel.add(jlSenha);
            jpPainel.add(jtfSenha);
            jpPainel.add(jlPerfil);
            jpPainel.add(jtfPerfil);
            jpPainel.add(jlDistancia);

            jpPainel.add(bConsultar);
            jpPainel.add(bSair);

            getContentPane().add(jpPainel);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bConsultar || e.getSource() == jtfPerfil) {
                objBDLogin.ConectarBD();
                String login = jtfLogin.getText();
                String senha = new String(jtfSenha.getPassword());
                String perfil = jtfPerfil.getText();

                if (objBDLogin.consultaLogin(login, senha, perfil)) {
                    setVisible(false);
                    tfUsuario.setText(login);
                    jtfSenha.setText(senha);
                    tfPerfil.setText(perfil);
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou Senha Invalidos!");
                }
            }

            if (e.getSource() == bSair) {
                setVisible(false);
            }
        }
    }

    // ############################ CLASSE MENUPERFIL DE GESTÃO DE USUARIOS
    public class MenuPerfil extends JFrame implements ActionListener {
        JLabel gif, projeto, lbindice;

        private JButton bEntrada;
        private JButton bSaida;
        private JButton bAlterarSenha;
        private JButton bCriarUsuario;
        private JButton bSair;

        private JPanel jpPainel = new JPanel();

        public MenuPerfil() {
            // --- Configuraçao do Frame
            setTitle("Usuario");
            setSize(150, 280);
            // setLocation(440, 200);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            // setResizable(false);

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            jpPainel.add(gif);

            projeto = new JLabel("Entrada/Saida Usuario", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 12));
            projeto.setForeground(Color.blue);
            jpPainel.add(projeto);

            container.add(jpPainel);

            // --- Definiçao dos Botoes e seus eventos
            bEntrada = new JButton("      Entrada     ");
            bEntrada.addActionListener(this);
            bSaida = new JButton("        Saida       ");
            bSaida.addActionListener(this);
            bAlterarSenha = new JButton("Alterar Senha");
            bAlterarSenha.addActionListener(this);
            bCriarUsuario = new JButton(" Criar Usuario");
            bCriarUsuario.addActionListener(this);
            bCriarUsuario.setForeground(Color.red);
            bSair = new JButton("         Sair          ");
            bSair.addActionListener(this);

            // --- Adicionando os Objetos para o Painel
            jpPainel.add(bEntrada);
            jpPainel.add(bSaida);
            jpPainel.add(bAlterarSenha);
            jpPainel.add(bCriarUsuario);
            jpPainel.add(bSair);

            getContentPane().add(jpPainel);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bEntrada) {
                Perfil perfil = new Perfil();
                perfil.setVisible(true);
            }

            if (e.getSource() == bSaida) {
                usuario = tfUsuario.getText();
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja efetuar Logoff de: " + usuario,
                        "Usuario", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                if (n == JOptionPane.YES_OPTION) {
                    tfUsuario.setText("     Default     ");
                    tfPerfil.setText("     Default     ");
                }
            }

            if (e.getSource() == bAlterarSenha) {
                AlterarSenha AS = new AlterarSenha();
                AS.setVisible(true);
            }

            if (e.getSource() == bCriarUsuario) {
                if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")) {
                    InterfaceUsuario IU = new InterfaceUsuario();
                    IU.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Voce nao tem Perfil para acessar essa Funcionalidade!");
                }
            }

            if (e.getSource() == bSair) {
                setVisible(false);
            }
        }
    }

    // ############################# CLASSE ALTERAR SENHA PARA EDIÇÃO DE SENHAS

    public class AlterarSenha extends JFrame implements ActionListener {

        // ---- Definiçao dos Objetos a serem Usados
        BDadosUsuario objBDLogin = new BDadosUsuario();

        JLabel jlLogin;
        JLabel jlNome;
        JLabel jlSenha;
        JLabel jlPerfil;
        JLabel jlDistancia;
        JLabel gif, projeto, lbindice;

        JTextField jtfLogin;
        JTextField jtfNome;
        JPasswordField jtfSenha;
        JTextField jtfPerfil;

        JButton bConsultar;
        JButton bCadastrar;
        JButton bAlterar;
        JButton bExcluir;
        JButton bLimpar;
        JButton bSair;

        private JPanel jpPainel = new JPanel();

        public AlterarSenha() {
            // --- Configuraçao do Frame
            setTitle("Alterar Senha");
            setSize(220, 340);
            // setLocation(420, 200);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            // setResizable(false);

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            jpPainel.add(gif);

            projeto = new JLabel("Alterar Senha de Usuario", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 16));
            projeto.setForeground(Color.blue);
            jpPainel.add(projeto);

            container.add(jpPainel);

            // --- Configuraçao dos objetos do Frame
            jlLogin = new JLabel("   Login   ");
            jtfLogin = new JTextField(15);
            jlSenha = new JLabel("   Senha   ");
            jtfSenha = new JPasswordField(15);
            jtfLogin.addActionListener(this);
            jlDistancia = new JLabel(
                    "                                                                                                           ");

            // --- Definiçao dos Botoes e seus eventos
            bAlterar = new JButton("       Alterar       ");
            bAlterar.addActionListener(this);
            bConsultar = new JButton("    Consultar    ");
            bConsultar.addActionListener(this);
            bSair = new JButton("          Sair         ");
            bSair.addActionListener(this);

            // --- Adicionando os Objetos para o Painel
            jpPainel.add(jlLogin);
            jpPainel.add(jtfLogin);
            jpPainel.add(jlSenha);
            jpPainel.add(jtfSenha);
            jpPainel.add(jlDistancia);

            jpPainel.add(bAlterar);
            jpPainel.add(bConsultar);
            jpPainel.add(bSair);

            getContentPane().add(jpPainel);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bConsultar || e.getSource() == jtfLogin) {
                objBDLogin.ConectarBD();

                if (objBDLogin.consultaNome(jtfLogin.getText())) {
                    AtualizarTela();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro de Consulta!");
                }
            }

            if (e.getSource() == bAlterar) {
                objBDLogin.ConectarBD();

                String login = jtfLogin.getText();
                String nome = new String(jtfSenha.getPassword());
                String senha = new String(jtfSenha.getPassword());
                String perfil = new String(jtfSenha.getPassword());
                objBDLogin.alteraLogin(login, nome, senha, perfil);
                AtualizarTela();
            }

            if (e.getSource() == bSair) {
                setVisible(false);
            }
        }

        public void AtualizarTela() {
            jtfLogin.setText(objBDLogin.objLogin.getLogin());
            jtfSenha.setText(objBDLogin.objLogin.getSenha());
        }
    }

    // ##################################### CLASSE MENU DAS TELAS DE TELECOMANDO
    public class InterfaceMenu extends JFrame implements ActionListener {
        JLabel gif, projeto;
        JPanel painel;

        JButton bBarraMTS;
        JButton bBarraMT1;
        JButton bBarraAL;
        JButton bBarraT1;
        JButton bBarraTr;
        JButton bBarraT2;
        JButton bBarraT3;
        JButton bBarraT4;
        JButton bSair;

        public InterfaceMenu() // --- Configuraçao do Frame
        {
            super("Acesso as Telas de Telecomando");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout

            // Toolkit tk = Toolkit.getDefaultToolkit();
            // Dimension d = tk.getScreenSize();
            container.setBackground(new Color(180, 180, 180));
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JLabel l1 = new JLabel();
            l1.setFont(new Font("Arial", 1, 20));
            l1.setText("Barramentos de 230 kV");
            l1.setForeground(Color.green);
            l1.setBounds(240, 50, 350, 20);
            getContentPane().add(l1);

            JLabel l2 = new JLabel();
            l2.setFont(new Font("Arial", 1, 11));
            l2.setText("MT-1 Barra de 34.5kV");
            l2.setForeground(Color.green);
            l2.setBounds(10, 400, 130, 20);
            getContentPane().add(l2);

            JLabel l5 = new JLabel();
            l5.setFont(new Font("Arial", 1, 11));
            l5.setText("MT-R Barra de 34.5kV");
            l5.setForeground(Color.green);
            l5.setBounds(145, 400, 130, 20);
            getContentPane().add(l5);

            JLabel l6 = new JLabel();
            l6.setFont(new Font("Arial", 1, 11));
            l6.setText("MT-2 Barra de 34.5kV");
            l6.setForeground(Color.green);
            l6.setBounds(275, 400, 130, 20);
            getContentPane().add(l6);

            JLabel l7 = new JLabel();
            l7.setFont(new Font("Arial", 1, 11));
            l7.setText("MT-3 Barra de 34.5kV");
            l7.setForeground(Color.green);
            l7.setBounds(405, 400, 130, 20);
            getContentPane().add(l7);

            JLabel l8 = new JLabel();
            l8.setFont(new Font("Arial", 1, 11));
            l8.setText("MT-4 Barra de 34.5kV");
            l8.setForeground(Color.green);
            l8.setBounds(535, 400, 130, 20);
            getContentPane().add(l8);

            bBarraMTS = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
            bBarraMTS.setIcon(new javax.swing.ImageIcon("MTS3,4.gif"));
            bBarraMTS.addActionListener(this);
            bBarraMTS.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            bBarraMTS.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            bBarraMTS.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            // bBarraMTS.setBackground(new Color(0,0,0));//cor de fundo do botao
            bBarraMTS.setForeground(Color.black);// cor do titulo do botao
            bBarraMTS.setEnabled(true);
            bBarraMTS.setToolTipText("Pressione para a Tela dos Trafos MT-3 e MT-4");
            bBarraMTS.setMnemonic(KeyEvent.VK_B);
            bBarraMTS.setActionCommand("Barra MTS");// define o nome da acao
            bBarraMTS.setBounds(30, 80, 150, 80); // Coluna,Linha,Largura,Altura
            getContentPane().add(bBarraMTS);

            bBarraMT1 = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
            bBarraMT1.setIcon(new javax.swing.ImageIcon("Linhas.gif"));
            bBarraMT1.addActionListener(this);
            bBarraMT1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            bBarraMT1.setVerticalTextPosition(AbstractButton.CENTER);// posiçao do texto
            bBarraMT1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            // bBarraMT1.setForeground(Color.black);//cor do titulo do bot�o
            bBarraMT1.setEnabled(true);
            bBarraMT1.setToolTipText("Pressione para acessar as Telas dos Trafos MT-1, MT-R, MT-2");
            bBarraMT1.setMnemonic(KeyEvent.VK_B);
            bBarraMT1.setActionCommand("Barra MT1");// define o nome da acao
            bBarraMT1.setBounds(190, 80, 330, 79); // Coluna,Linha,Largura,Altura
            getContentPane().add(bBarraMT1);

            bBarraAL = new JButton(""); // BOT�O PAINEL FRAME MENU DE TELECOMANDO
            bBarraAL.setIcon(new javax.swing.ImageIcon("AL.gif"));
            bBarraAL.addActionListener(this);
            bBarraAL.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            bBarraAL.setVerticalTextPosition(AbstractButton.CENTER);// posiçao do texto
            bBarraAL.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            // bBarraAL.setForeground(Color.black);//cor do titulo do botao
            bBarraAL.setEnabled(true);
            bBarraAL.setToolTipText("Pressione para acessar a tela do Bay do Alunorte");
            bBarraAL.setMnemonic(KeyEvent.VK_B);
            bBarraAL.setActionCommand("Barra AL");// define o nome da acao
            bBarraAL.setBounds(530, 80, 80, 80); // Coluna,Linha,Largura,Altura
            getContentPane().add(bBarraAL);

            bBarraT1 = new JButton(""); // BOT�O PAINEL FRAME MENU DE TELECOMANDO
            bBarraT1.setIcon(new javax.swing.ImageIcon("BarraT1.gif"));
            bBarraT1.addActionListener(this);
            bBarraT1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            bBarraT1.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            bBarraT1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            // bBarraT1.setForeground(Color.black);//cor do titulo do botao
            bBarraT1.setEnabled(true);
            bBarraT1.setToolTipText("Pressione para a Tela da Barra T1 de 34,5 kV");
            bBarraT1.setMnemonic(KeyEvent.VK_B);
            bBarraT1.setActionCommand("Barra T1");// define o nome da acao
            bBarraT1.setBounds(20, 300, 106, 95); // Coluna,Linha,Largura,Altura
            getContentPane().add(bBarraT1);

            bBarraTr = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
            bBarraTr.setIcon(new javax.swing.ImageIcon("BarraTR.gif"));
            bBarraTr.addActionListener(this);
            bBarraTr.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            bBarraTr.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            bBarraTr.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            // bBarraTr.setForeground(Color.black);//cor do titulo do bot�o
            bBarraTr.setEnabled(true);
            bBarraTr.setToolTipText("Pressione para a Tela da Barra TR de 34,5 kV");
            bBarraTr.setMnemonic(KeyEvent.VK_B);
            bBarraTr.setActionCommand("Barra TR");// define o nome da acao
            bBarraTr.setBounds(150, 300, 106, 95); // Coluna,Linha,Largura,Altura
            getContentPane().add(bBarraTr);

            bBarraT2 = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
            bBarraT2.setIcon(new javax.swing.ImageIcon("BarraT2.gif"));
            bBarraT2.addActionListener(this);
            bBarraT2.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            bBarraT2.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            bBarraT2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            // bBarraT2.setForeground(Color.black);//cor do titulo do botao
            bBarraT2.setEnabled(true);
            bBarraT2.setToolTipText("Pressione para a Tela da Barra TR de 34,5 kV");
            bBarraT2.setMnemonic(KeyEvent.VK_B);
            bBarraT2.setActionCommand("Barra TR");// define o nome da acao
            bBarraT2.setBounds(280, 300, 106, 95); // Coluna,Linha,Largura,Altura
            getContentPane().add(bBarraT2);

            bBarraT3 = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
            bBarraT3.setIcon(new javax.swing.ImageIcon("BarraT3.gif"));
            bBarraT3.addActionListener(this);
            bBarraT3.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            bBarraT3.setVerticalTextPosition(AbstractButton.CENTER);// posiçao do texto
            bBarraT3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            // bBarraT1.setBackground(new Color(0,0,0));//cor de fundo do bot�o
            bBarraT3.setForeground(Color.black);// cor do titulo do bot�o
            bBarraT3.setEnabled(true);
            bBarraT3.setToolTipText("Pressione para a Tela da Barra T3 de 34,5 kV");
            bBarraT3.setMnemonic(KeyEvent.VK_B);
            bBarraT3.setActionCommand("Barra TR");// define o nome da acao
            bBarraT3.setBounds(410, 300, 106, 95); // Coluna,Linha,Largura,Altura
            getContentPane().add(bBarraT3);

            bBarraT4 = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
            bBarraT4.setIcon(new javax.swing.ImageIcon("BarraT4.gif"));
            bBarraT4.addActionListener(this);
            bBarraT4.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            bBarraT4.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            bBarraT4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            // bBarraT1.setBackground(new Color(0,0,0));//cor de fundo do bot�o
            bBarraT4.setForeground(Color.black);// cor do titulo do bot�o
            bBarraT4.setEnabled(true);
            bBarraT4.setToolTipText("Pressione para a Tela da Barra TR de 34,5 kV");
            bBarraT4.setMnemonic(KeyEvent.VK_B);
            bBarraT4.setActionCommand("Barra TR");// define o nome da acao
            bBarraT4.setBounds(540, 300, 106, 95); // Coluna,Linha,Largura,Altura
            getContentPane().add(bBarraT4);

            bSair = new JButton("");
            bSair.setIcon(new javax.swing.ImageIcon("Porta.jpg"));
            bSair.addActionListener(this);
            bSair.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
            bSair.setToolTipText("Pressione para encerrar o programa");
            bSair.setHorizontalTextPosition(AbstractButton.CENTER);
            bSair.setVerticalTextPosition(AbstractButton.CENTER);
            bSair.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            bSair.setBounds(325, 540, 32, 58);
            getContentPane().add(bSair);

            JPanel painel = new JPanel();
            painel = new JPanel();
            painel.setLayout(null);
            painel.setBackground(new Color(0, 128, 128));
            painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            JPanel painel1 = new JPanel(); // Barra 34,5 kV
            painel1.setBounds(70, 270, 520, 3);
            painel1.setBackground(Color.orange);
            painel.add(painel1);

            JPanel painel2 = new JPanel(); // Barra MTS / BARRA 34,5 kV
            painel2.setBounds(280, 155, 3, 115);
            painel2.setBackground(Color.orange);
            painel.add(painel2);

            JPanel painel3 = new JPanel(); // MTS / BARRA T1 34,5 kV
            painel3.setBounds(70, 270, 3, 35);
            painel3.setBackground(Color.orange);
            painel.add(painel3);

            JPanel painel4 = new JPanel(); // MTS / BARRA TR 34,5 kV
            painel4.setBounds(200, 270, 3, 35);
            painel4.setBackground(Color.orange);
            painel.add(painel4);

            JPanel painel5 = new JPanel(); // MTS / BARRA T2 34,5 kV
            painel5.setBounds(330, 270, 3, 35);
            painel5.setBackground(Color.orange);
            painel.add(painel5);

            JPanel painel6 = new JPanel(); // MTS / BARRA T3 34,5 kV
            painel6.setBounds(460, 270, 3, 35);
            painel6.setBackground(Color.orange);
            painel.add(painel6);

            JPanel painel7 = new JPanel(); // MTS / BARRA T4 34,5 kV
            painel7.setBounds(590, 270, 3, 35);
            painel7.setBackground(Color.orange);
            painel.add(painel7);

            JPanel painel8 = new JPanel(); // MTS / BARRA T4 34,5 kV
            painel8.setBounds(500, 95, 30, 3);
            painel8.setBackground(Color.red);
            painel.add(painel8);

            JPanel painel9 = new JPanel(); // MTS / BARRA T4 34,5 kV
            painel9.setBounds(180, 95, 30, 3);
            painel9.setBackground(Color.red);
            painel.add(painel9);

            container.add(painel);
            container.setBackground(new Color(180, 180, 180));
            setSize(700, 650);
            // setLocation(550, 150);
            setVisible(true);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            bBarraMTS.addActionListener(new ActionListener() // Ação do botao para chamar a classe MTS 3E4
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        MTSActionPerformed(evt);
                    }

                }
            });

            bBarraMT1.addActionListener(new ActionListener() // Açao do botao chamar a classe MTS 1,R,2
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        MT1ActionPerformed(evt);
                    }

                }
            });

            bBarraT1.addActionListener(new ActionListener() // Açao do botao chamar a BT1
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        BT1ActionPerformed(evt);
                    }

                }
            });

            bBarraTr.addActionListener(new ActionListener() // Açao do botao chamar aclasse BTR
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        BTrActionPerformed(evt);
                    }

                }
            });

            bBarraT2.addActionListener(new ActionListener() // Açao do botao para chamar a classe BT2
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        BT2ActionPerformed(evt);
                    }

                }
            });

            bBarraT3.addActionListener(new ActionListener() // Açao do botao para chamar a classe BT3
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        BT3ActionPerformed(evt);
                    }

                }
            });

            bBarraT4.addActionListener(new ActionListener() // Açao do botao para chamar a classe BT4
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        BT4ActionPerformed(evt);
                    }

                }
            });

            bBarraAL.addActionListener(new ActionListener() // Açao do botao para chamar a classe BAL
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        BALActionPerformed(evt);
                    }

                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    setVisible(false);
                }
            });
        }

        // --- Metodo que aglutina os eventos dos Botoes
        public void actionPerformed(ActionEvent e) {
        }

        private void MT1ActionPerformed(ActionEvent evt) {
            new Tela230kv().setVisible(true);
            setVisible(false);
        }

        private void MTSActionPerformed(ActionEvent evt) {
            new MTS3e4().setVisible(true);
            setVisible(false);
        }

        private void BT1ActionPerformed(ActionEvent evt) {
            new InterfaceMT1().setVisible(true);
            setVisible(false);
        }

        private void BTrActionPerformed(ActionEvent evt) {
            new InterfaceMTR().setVisible(true);
            setVisible(false);
        }

        private void BT2ActionPerformed(ActionEvent evt) {
            new InterfaceMT2().setVisible(true);
            setVisible(false);
        }

        private void BT3ActionPerformed(ActionEvent evt) {
            new InterfaceMT3().setVisible(true);
            setVisible(false);
        }

        private void BT4ActionPerformed(ActionEvent evt) {
            new InterfaceMT4().setVisible(true);
            setVisible(false);
        }

        private void BALActionPerformed(ActionEvent evt) {
            new InterfaceAlunorte().setVisible(true);
            setVisible(false);
            // this.hide();
        }
    }

    // ######################### CLASSE TELA DE 230 KV DE TELECOMANDO

    public class Tela230kv extends JFrame implements ActionListener {
        public Tela230kv() {

            Container c = getContentPane();
            c.setLayout(new BorderLayout()); // gerenciador de layout

            // Toolkit tk = Toolkit.getDefaultToolkit();
            // Dimension d = tk.getScreenSize();

            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(null,
                    "Voce deseja habilitar alguma manobra para Simulação? ",
                    "Habilitar", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                MenuManobrasG MM = new MenuManobrasG();
                MM.setVisible(true);
            }

            setTitle("Barramento de 230 kV MT's");
            setSize(1050, 640);
            c.setBackground(new Color(0, 128, 128));
            // setLocation(350, 150);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JLabel l1 = new JLabel();
            l1.setFont(new Font("Arial", 1, 30));
            l1.setText("Barramento de 230 kV MT's");
            l1.setForeground(Color.blue);

            Icon imagem1 = new ImageIcon("Carlos1.GIF");
            gif1 = new JLabel();
            gif1.setIcon(imagem1);
            gif1.setBounds(954, 500, 100, 100); // Coluna,Linha,Largura,Altura
            gif1.setBackground(new Color(192, 192, 192)); // cor de fundo do botão
            getContentPane().add(gif1);

            email = new JLabel("cmardonio@yahoo.com.br", JLabel.CENTER);
            email.setFont(new Font("Dialog", Font.ITALIC, 10));
            getContentPane().add(email);
            email.setBounds(900, 585, 150, 15);
            email.setForeground(Color.gray);

            painel = new JPanel();
            painel.setLayout(null);
            painel.setBackground(new Color(0, 128, 128));
            painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            JPanel p1 = new JPanel();
            p1.setBackground(new Color(0, 128, 128));
            p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            p1.add(l1);

            c.add(p1, java.awt.BorderLayout.NORTH);

            // MP.setVisible(false);

            // ������������� CRIAÇAO DAS BORDAS NORTE E SUL PARA ADIÇAO DOS LABELS

            tensao = new JLabel(" Tensao de Linha: 235 kV");
            tensao.setFont(new Font("Dialog", Font.BOLD, 14));
            tensao.setForeground(new Color(225255255));
            tensao.setBounds(800, 20, 215, 20); // Coluna,Linha,Largura,Altura
            getContentPane().add(tensao);

            // �����������������������CRIAÇAO DE UM PANEL PARA ADIÇAO DOS ELEMENTOS GRAFICOS
            painel = new JPanel();
            painel.setLayout(null);
            painel.setBackground(new Color(0, 128, 128));
            painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            // ��������������������������������������� BARRAS A E B
            JPanel v = new JPanel(); // Barra A
            v.setBounds(10, 5, 1000, 3);
            v.setBackground(Color.red);
            painel.add(v);

            JPanel v1 = new JPanel(); // Barra B
            v1.setBounds(10, 30, 1000, 3);
            v1.setBackground(Color.red);
            painel.add(v1);

            barra1 = new JLabel("A"); // IDENTIFICAC�O DA BARRA A
            barra1.setForeground(Color.blue);
            barra1.setBounds(10, 0, 60, 30);
            painel.add(barra1);

            barra2 = new JLabel("B");
            barra2.setForeground(Color.blue);
            barra2.setBounds(10, 25, 60, 30); // IDENTIFICACAO DA BARRA B
            painel.add(barra2);

            // �������������� CRIAÇAO DE TODOS OS LABELS QUE IDENTIFICAM OS EQUIPAMENTOS
            mt1a = new JLabel("89 MT-RA");
            mt1a.setForeground(Color.blue);
            mt1a.setBounds(202, 40, 60, 30);
            painel.add(mt1a);
            mt1b = new JLabel("89 MT-RB");
            mt1b.setForeground(Color.blue);
            mt1b.setBounds(284, 40, 60, 30);
            painel.add(mt1b);
            mt2a = new JLabel("89 MT-1A");
            mt2a.setForeground(Color.blue);
            mt2a.setBounds(350, 40, 60, 30);
            painel.add(mt2a);
            mt2b = new JLabel("89 MT-1B");
            mt2b.setForeground(Color.blue);
            mt2b.setBounds(435, 40, 60, 30);
            painel.add(mt2b);
            mt2a = new JLabel("89 MT-2A");
            mt2a.setForeground(Color.blue);
            mt2a.setBounds(52, 40, 60, 30);
            painel.add(mt2a);
            mt2b = new JLabel("89 MT-2B");
            mt2b.setForeground(Color.blue);
            mt2b.setBounds(134, 40, 60, 30);
            painel.add(mt2b);
            l1a = new JLabel("89 L1-A");
            l1a.setForeground(Color.blue);
            l1a.setBounds(510, 40, 60, 30);
            painel.add(l1a);
            l1b = new JLabel("89 L1-B");
            l1b.setForeground(Color.blue);
            l1b.setBounds(595, 40, 60, 30);
            painel.add(l1b);
            l189 = new JLabel("89 L1");
            l189.setForeground(Color.blue);
            l189.setBounds(570, 215, 60, 30);
            painel.add(l189);
            l157 = new JLabel("57 L1");
            l157.setForeground(Color.blue);
            l157.setBounds(510, 280, 60, 30);
            painel.add(l157);
            l1 = new JLabel("Alimentaçao 230 Kv");
            l1.setForeground(Color.blue);
            l1.setBounds(502, 342, 150, 30);
            painel.add(l1);
            l1 = new JLabel("Linha 1");
            l1.setForeground(Color.blue);
            l1.setBounds(532, 355, 150, 30);
            painel.add(l1);
            l2a = new JLabel("89 L2-A");
            l2a.setForeground(Color.blue);
            l2a.setBounds(660, 40, 60, 30);
            painel.add(l2a);
            l2b = new JLabel("89 L2-B");
            l2b.setForeground(Color.blue);
            l2b.setBounds(743, 40, 60, 30);
            painel.add(l2b);
            l289 = new JLabel("89 L2");
            l289.setForeground(Color.blue);
            l289.setBounds(720, 215, 60, 30);
            painel.add(l289);
            l257 = new JLabel("57 L2");
            l257.setForeground(Color.blue);
            l257.setBounds(782, 280, 60, 30);
            painel.add(l257);
            l2 = new JLabel("Alimentaçao 230 Kv");
            l2.setForeground(Color.blue);
            l2.setBounds(650, 342, 150, 30);
            painel.add(l2);
            l2 = new JLabel("Linha 2");
            l2.setForeground(Color.blue);
            l2.setBounds(685, 355, 150, 30);
            painel.add(l2);
            bta = new JLabel("89 BTA");
            bta.setForeground(Color.blue);
            bta.setBounds(850, 60, 60, 30);
            painel.add(bta);
            btb = new JLabel("89 BTB");
            btb.setForeground(Color.blue);
            btb.setBounds(935, 60, 60, 30);
            painel.add(btb);
            bta57 = new JLabel("57 BTA");
            bta57.setForeground(Color.blue);
            bta57.setBounds(745, 103, 60, 30);
            painel.add(bta57);
            btb57 = new JLabel("57 BTB");
            btb57.setForeground(Color.blue);
            btb57.setBounds(950, 103, 60, 30);
            painel.add(btb57);
            mt152 = new JLabel("52 MT-R");
            mt152.setForeground(Color.blue);
            mt152.setBounds(260, 150, 60, 30);
            painel.add(mt152);
            mt252 = new JLabel("52 MT-1");
            mt252.setForeground(Color.blue);
            mt252.setBounds(410, 150, 60, 30);
            painel.add(mt252);
            mt252 = new JLabel("52 MT-2");
            mt252.setForeground(Color.blue);
            mt252.setBounds(110, 150, 60, 30);
            painel.add(mt252);
            l152 = new JLabel("52 L1");
            l152.setForeground(Color.blue);
            l152.setBounds(570, 150, 60, 30);
            painel.add(l152);
            l252 = new JLabel("52 L2");
            l252.setForeground(Color.blue);
            l252.setBounds(720, 150, 60, 30);
            painel.add(l252);
            bt52 = new JLabel("52 BT");
            bt52.setForeground(Color.blue);
            bt52.setBounds(875, 180, 60, 30);
            painel.add(bt52);

            // �������������������������������������������� BAY TRAFO MT-1

            JPanel v13 = new JPanel(); // SECCIONADORA 89 MT-1A
            v13.setBounds(345, 8, 3, 55);
            v13.setBackground(Color.red);
            painel.add(v13);

            JPanel v14 = new JPanel(); // SECCIONADORA 89 MT-1A / DISJUNTOR 52 MT-R
            v14.setBounds(345, 103, 3, 23);
            v14.setBackground(Color.red);
            painel.add(v14);

            JPanel v15 = new JPanel(); // SECCIONADORA 89 MT-1B
            v15.setBounds(430, 30, 3, 33);
            v15.setBackground(Color.red);
            painel.add(v15);

            JPanel v16 = new JPanel(); // SECCIONADORA 89 MT-1B / DISJUNTOR
            v16.setBounds(430, 103, 3, 23);
            v16.setBackground(Color.red);
            painel.add(v16);

            JPanel v17 = new JPanel(); // DISJUNTOR / TRANSFORMADOR
            v17.setBounds(390, 185, 3, 43);
            v17.setBackground(Color.red);
            painel.add(v17);

            JPanel v18 = new JPanel(); // SECCIONADORA 89 MT-1A / SECCIONADORA 89 MT-1B
            v18.setBounds(345, 125, 88, 3);
            v18.setBackground(Color.red);
            painel.add(v18);

            JPanel v19 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v19.setBounds(390, 126, 3, 20);
            v19.setBackground(Color.red);
            painel.add(v19);

            JPanel v20 = new JPanel(); // TRANSFORMADOR / BARRA T1
            v20.setBounds(390, 272, 3, 114);
            v20.setBackground(Color.orange);
            painel.add(v20);

            JPanel v21 = new JPanel(); // BARRA T1
            v21.setBounds(325, 385, 130, 3);
            v21.setBackground(Color.orange);
            painel.add(v21);

            // ������������������������������������������������ BAY MT-R

            JPanel v2 = new JPanel(); // Seccionadora 89 MT-RA
            v2.setBounds(195, 8, 3, 55);
            v2.setBackground(Color.red);
            painel.add(v2);

            JPanel v3 = new JPanel();
            v3.setBounds(195, 103, 3, 23); // Seccionadora 89 MT-RA / Disjuntor
            v3.setBackground(Color.red);
            painel.add(v3);

            JPanel v4 = new JPanel(); // Seccionadora 89 MT-RB
            v4.setBounds(280, 30, 3, 33);
            v4.setBackground(Color.red);
            painel.add(v4);

            JPanel v5 = new JPanel(); // SECCIONADORA 89 MT-RB / DISJUNTOR MT-R
            v5.setBounds(279, 103, 3, 23);
            v5.setBackground(Color.red);
            painel.add(v5);

            JPanel v6 = new JPanel(); // DISJUNTOR / TRANSFORMADOR
            v6.setBounds(240, 185, 3, 43);
            v6.setBackground(Color.red);
            painel.add(v6);

            JPanel v7 = new JPanel(); // SECCIONADORA MT-1A / SECCIONADORA MT-RB
            v7.setBounds(195, 125, 87, 3);
            v7.setBackground(Color.red);
            painel.add(v7);

            JPanel v8 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v8.setBounds(240, 126, 3, 20);
            v8.setBackground(Color.red);
            painel.add(v8);

            JPanel v9 = new JPanel(); // TRANSFORMADOR / BARRA TR
            v9.setBounds(240, 272, 3, 114);
            v9.setBackground(Color.orange);
            painel.add(v9);

            JPanel v10 = new JPanel(); // BARRA TR
            v10.setBounds(175, 385, 130, 3);
            v10.setBackground(Color.orange);
            painel.add(v10);

            // �������������������������������������������� BAY MT-2

            JPanel v86 = new JPanel(); // Seccionadora 89 MT-2A
            v86.setBounds(45, 8, 3, 55);
            v86.setBackground(Color.red);
            painel.add(v86);

            JPanel v87 = new JPanel();
            v87.setBounds(45, 103, 3, 23); // Seccionadora 89 MT-2A / Disjuntor
            v87.setBackground(Color.red);
            painel.add(v87);

            JPanel v88 = new JPanel(); // Seccionadora 89 MT-2B
            v88.setBounds(130, 30, 3, 33);
            v88.setBackground(Color.red);
            painel.add(v88);

            JPanel v89 = new JPanel(); // SECCIONADORA 89 MT-2B / DISJUNTOR MT-2
            v89.setBounds(129, 103, 3, 23);
            v89.setBackground(Color.red);
            painel.add(v89);

            JPanel v90 = new JPanel(); // DISJUNTOR / TRANSFORMADOR
            v90.setBounds(90, 185, 3, 43);
            v90.setBackground(Color.red);
            painel.add(v90);

            JPanel v91 = new JPanel(); // SECCIONADORA MT-2A / SECCIONADORA MT-2B
            v91.setBounds(45, 125, 87, 3);
            v91.setBackground(Color.red);
            painel.add(v91);

            JPanel v92 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v92.setBounds(90, 126, 3, 20);
            v92.setBackground(Color.red);
            painel.add(v92);

            JPanel v93 = new JPanel(); // TRANSFORMADOR / BARRA T2
            v93.setBounds(90, 272, 3, 114);
            v93.setBackground(Color.orange);
            painel.add(v93);

            JPanel v94 = new JPanel(); // BARRA T2
            v94.setBounds(25, 385, 130, 3);
            v94.setBackground(Color.orange);
            painel.add(v94);

            // ������������������������������������������� BAY DA LINHA L1

            JPanel v22 = new JPanel(); // SECCIONADORA 89 L1-A
            v22.setBounds(505, 8, 3, 55);
            v22.setBackground(Color.red);
            painel.add(v22);

            JPanel v23 = new JPanel();
            v23.setBounds(505, 103, 3, 23); // Seccionadora 89 L1-A / Disjuntor
            v23.setBackground(Color.red);
            painel.add(v23);

            JPanel v24 = new JPanel(); // Seccionadora 89 L1-B
            v24.setBounds(590, 30, 3, 33);
            v24.setBackground(Color.red);
            painel.add(v24);

            JPanel v25 = new JPanel(); // SECCIONADORA 89 L1-A / DISJUNTOR 52 L1
            v25.setBounds(590, 103, 3, 23);
            v25.setBackground(Color.red);
            painel.add(v25);

            JPanel v26 = new JPanel(); // DISJUNTOR / SECCIONADORA 89 L1-A
            v26.setBounds(550, 185, 3, 23);
            v26.setBackground(Color.red);
            painel.add(v26);

            JPanel v27 = new JPanel(); // SECCIONADORA L1-A / SECCIONADORA L1-B
            v27.setBounds(505, 125, 88, 3);
            v27.setBackground(Color.red);
            painel.add(v27);

            JPanel v28 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v28.setBounds(550, 126, 3, 20);
            v28.setBackground(Color.red);
            painel.add(v28);

            JPanel v48 = new JPanel();
            v48.setBounds(550, 252, 3, 88); // Seccionadora 89 L1 / Alimentador L1
            v48.setBackground(Color.red);
            painel.add(v48);

            JPanel v66 = new JPanel(); // SETA
            v66.setBounds(546, 338, 11, 5);
            v66.setBackground(Color.red);
            painel.add(v66);
            JPanel v67 = new JPanel(); // SETA
            v67.setBounds(547, 343, 9, 4);
            v67.setBackground(Color.red);
            painel.add(v67);
            JPanel v68 = new JPanel(); // SETA
            v68.setBounds(548, 346, 7, 3);
            v68.setBackground(Color.red);
            painel.add(v68);
            JPanel v69 = new JPanel(); // SETA
            v69.setBounds(549, 349, 5, 2);
            v69.setBackground(Color.red);
            painel.add(v69);
            JPanel v70 = new JPanel(); // SETA
            v70.setBounds(550, 351, 3, 2);
            v70.setBackground(Color.red);
            painel.add(v70);

            JPanel v49 = new JPanel(); // SECCIONADORA 57 L1-A / SECCIONADORA 89 L1
            v49.setBounds(490, 256, 60, 3);
            v49.setBackground(Color.red);
            painel.add(v49);

            JPanel v50 = new JPanel(); // SECCIONADORA 57 L1-A / SECCIONADORA 89 L1
            v50.setBounds(490, 256, 3, 20);
            v50.setBackground(Color.red);
            painel.add(v50);

            JPanel v51 = new JPanel(); // SECCIONADORA 57 L1 / ATERRAMENTO
            v51.setBounds(490, 316, 3, 20);
            v51.setBackground(Color.red);
            painel.add(v51);

            JPanel v56 = new JPanel(); // ATERRAMENTO
            v56.setBounds(484, 335, 15, 1);
            v56.setBackground(Color.red);
            painel.add(v56);
            JPanel v57 = new JPanel(); // ATERRAMENTO
            v57.setBounds(486, 337, 12, 1);
            v57.setBackground(Color.red);
            painel.add(v57);
            JPanel v58 = new JPanel(); // ATERRAMENTO
            v58.setBounds(488, 339, 9, 1);
            v58.setBackground(Color.red);
            painel.add(v58);
            JPanel v59 = new JPanel(); // ATERRAMENTO
            v59.setBounds(490, 341, 6, 1);
            v59.setBackground(Color.red);
            painel.add(v59);
            JPanel v60 = new JPanel(); // ATERRAMENTO
            v60.setBounds(492, 343, 3, 1);
            v60.setBackground(Color.red);
            painel.add(v60);

            // ���������������������������������������� BAY DA SECCIONADORA 89 L2

            JPanel v29 = new JPanel(); // SECCIONADORA 89 L2-A
            v29.setBounds(655, 8, 3, 55);
            v29.setBackground(Color.red);
            painel.add(v29);

            JPanel v30 = new JPanel();
            v30.setBounds(655, 103, 3, 23); // Seccionadora 89 L2-A / Disjuntor
            v30.setBackground(Color.red);
            painel.add(v30);

            JPanel v31 = new JPanel(); // Seccionadora 89 L2-B
            v31.setBounds(740, 30, 3, 33);
            v31.setBackground(Color.red);
            painel.add(v31);

            JPanel v32 = new JPanel(); // SECCIONADORA 89 L2-A / DISJUNTOR 52 L2
            v32.setBounds(740, 103, 3, 23);
            v32.setBackground(Color.red);
            painel.add(v32);

            JPanel v33 = new JPanel(); // DISJUNTOR / ALIMENTADOR
            v33.setBounds(700, 185, 3, 23);
            v33.setBackground(Color.red);
            painel.add(v33);

            JPanel v71 = new JPanel(); // SETA
            v71.setBounds(697, 338, 11, 5);
            v71.setBackground(Color.red);
            painel.add(v71);
            JPanel v72 = new JPanel(); // SETA
            v72.setBounds(698, 343, 9, 4);
            v72.setBackground(Color.red);
            painel.add(v72);
            JPanel v73 = new JPanel(); // SETA
            v73.setBounds(699, 346, 7, 3);
            v73.setBackground(Color.red);
            painel.add(v73);
            JPanel v74 = new JPanel(); // SETA
            v74.setBounds(700, 349, 5, 2);
            v74.setBackground(Color.red);
            painel.add(v74);
            JPanel v75 = new JPanel(); // SETA
            v75.setBounds(701, 351, 3, 2);
            v75.setBackground(Color.red);
            painel.add(v75);

            JPanel v34 = new JPanel(); // SECCIONADORA L2-A / SECCIONADORA L2-B
            v34.setBounds(655, 125, 88, 3);
            v34.setBackground(Color.red);
            painel.add(v34);

            JPanel v35 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v35.setBounds(700, 126, 3, 20);
            v35.setBackground(Color.red);
            painel.add(v35);

            JPanel v52 = new JPanel(); // SECCIONADORA 89 L2 / ALIMENTADOR
            v52.setBounds(701, 252, 3, 88);
            v52.setBackground(Color.red);
            painel.add(v52);

            JPanel v53 = new JPanel(); // SECCIONADORA 89 L2 / SECCIONADORA LT 57 L2
            v53.setBounds(703, 256, 62, 3);
            v53.setBackground(Color.red);
            painel.add(v53);

            JPanel v54 = new JPanel(); // SECCIONADORA 89 L2-A / SECCIONADORA 57 L2
            v54.setBounds(762, 256, 3, 20);
            v54.setBackground(Color.red);
            painel.add(v54);

            JPanel v55 = new JPanel(); // SECCIONADORA 57 L2 / ATERRAMENTO
            v55.setBounds(764, 316, 3, 20);
            v55.setBackground(Color.red);
            painel.add(v55);

            JPanel v76 = new JPanel(); // ATERRAMENTO
            v76.setBounds(758, 335, 15, 1);
            v76.setBackground(Color.red);
            painel.add(v76);
            JPanel v77 = new JPanel(); // ATERRAMENTO
            v77.setBounds(760, 337, 12, 1);
            v77.setBackground(Color.red);
            painel.add(v77);
            JPanel v78 = new JPanel(); // ATERRAMENTO
            v78.setBounds(762, 339, 9, 1);
            v78.setBackground(Color.red);
            painel.add(v78);
            JPanel v79 = new JPanel(); // ATERRAMENTO
            v79.setBounds(764, 341, 6, 1);
            v79.setBackground(Color.red);
            painel.add(v79);
            JPanel v80 = new JPanel(); // ATERRAMENTO
            v80.setBounds(766, 343, 3, 1);
            v80.setBackground(Color.red);
            painel.add(v80);

            // ����������������������������������������� BAY DA INTERLIGAÇAO

            JPanel v36 = new JPanel(); // SECCIONADORA 89 BT-A
            v36.setBounds(845, 8, 3, 75);
            v36.setBackground(Color.red);
            painel.add(v36);

            JPanel v37 = new JPanel();
            v37.setBounds(845, 125, 3, 43); // Seccionadora 89 BT-A / Disjuntor 52 BT
            v37.setBackground(Color.red);
            painel.add(v37);

            JPanel v38 = new JPanel(); // Seccionadora 89 BT-B
            v38.setBounds(930, 30, 3, 53);
            v38.setBackground(Color.red);
            painel.add(v38);

            JPanel v39 = new JPanel(); // SECCIONADORA 89 BT-B / DISJUNTOR 52 BT
            v39.setBounds(930, 125, 3, 43);
            v39.setBackground(Color.red);
            painel.add(v39);

            JPanel v40 = new JPanel(); // SECCIONADORA 57 BT-A / BARRA A
            v40.setBounds(785, 57, 60, 3);
            v40.setBackground(Color.red);
            painel.add(v40);

            JPanel v41 = new JPanel(); // SECCIONADORA 89 BT-A / DISJUNTOR 52 BT
            v41.setBounds(845, 165, 27, 3);
            v41.setBackground(Color.red);
            painel.add(v41);

            JPanel v42 = new JPanel(); // SECCIONADORA 89 BT-B / DISJUNTOR 52 BT
            v42.setBounds(904, 165, 29, 3);
            v42.setBackground(Color.red);
            painel.add(v42);

            JPanel v43 = new JPanel(); // SECCIONADORA 57 BT-A / BARRA A
            v43.setBounds(785, 58, 3, 68);
            v43.setBackground(Color.red);
            painel.add(v43);

            JPanel v44 = new JPanel(); // SECCIONADORA 57 BT-A / ATERRAMENTO
            v44.setBounds(785, 165, 3, 32);
            v44.setBackground(Color.red);
            painel.add(v44);

            JPanel v45 = new JPanel(); // BARRA B SECCIONADORA 57 BT-B
            v45.setBounds(932, 57, 60, 3);
            v45.setBackground(Color.red);
            painel.add(v45);

            JPanel v46 = new JPanel(); // SECCIONADORA 57 BT-B / BARRA B
            v46.setBounds(992, 57, 3, 69);
            v46.setBackground(Color.red);
            painel.add(v46);

            JPanel v47 = new JPanel(); // SECCIONADORA 57 BT-B / ATERRAMENTO
            v47.setBounds(992, 165, 3, 32);
            v47.setBackground(Color.red);
            painel.add(v47);

            JPanel v61 = new JPanel(); // ATERRAMENTO 89 BT-A
            v61.setBounds(778, 197, 15, 1);
            v61.setBackground(Color.red);
            painel.add(v61);
            JPanel v62 = new JPanel(); // ATERRAMENTO 89 BT-A
            v62.setBounds(780, 199, 12, 1);
            v62.setBackground(Color.red);
            painel.add(v62);
            JPanel v63 = new JPanel(); // ATERRAMENTO 89 BT-A
            v63.setBounds(782, 201, 9, 1);
            v63.setBackground(Color.red);
            painel.add(v63);
            JPanel v64 = new JPanel(); // ATERRAMENTO 89 BT-A
            v64.setBounds(784, 203, 6, 1);
            v64.setBackground(Color.red);
            painel.add(v64);
            JPanel v65 = new JPanel(); // ATERRAMENTO 89 BT-A
            v65.setBounds(786, 205, 3, 1);
            v65.setBackground(Color.red);
            painel.add(v65);

            JPanel v81 = new JPanel(); // ATERRAMENTO 89 BT-B
            v81.setBounds(986, 197, 15, 1);
            v81.setBackground(Color.red);
            painel.add(v81);
            JPanel v82 = new JPanel(); // ATERRAMENTO 89 BT-B
            v82.setBounds(988, 199, 12, 1);
            v82.setBackground(Color.red);
            painel.add(v82);
            JPanel v83 = new JPanel(); // ATERRAMENTO 89 BT-B
            v83.setBounds(990, 201, 9, 1);
            v83.setBackground(Color.red);
            painel.add(v83);
            JPanel v84 = new JPanel(); // ATERRAMENTO 89 BT-B
            v84.setBounds(992, 203, 6, 1);
            v84.setBackground(Color.red);
            painel.add(v84);
            JPanel v85 = new JPanel(); // ATERRAMENTO 89 BT-B
            v85.setBounds(994, 205, 3, 1);
            v85.setBackground(Color.red);
            painel.add(v85);

            // �������������������������������������� CRIAÇAO DO BOTAO 89 MT-1

            b1 = new JButton(); // BOTAO CS 89 MT-1A
            b1.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b1.addActionListener(this);
            b1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b1.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b1.setBackground(new Color(0, 51, 0));// cor de fundo do bot�o
            b1.setForeground(Color.black);// cor do titulo do bot�o
            b1.setEnabled(true);
            b1.setToolTipText("Pressione para operar a Seccionadora 89 MT-1A");
            b1.setMnemonic(KeyEvent.VK_B);
            b1.setActionCommand("89MT1A");// define o nome da acao
            b1.setBounds(330, 62, 33, 45);
            painel.add(b1);

            // �������������������������������������� CRIAÇAO DO BOTAO 52 MT-1

            b2 = new JButton(); // BOT�O DJ 52 MT-1
            b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b2.addActionListener(this);
            b2.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b2.setMnemonic(KeyEvent.VK_C);
            b2.setToolTipText("Pressione para operar o Disjuntor 52 MT-1");
            b2.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b2.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
            b2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b2.setBounds(375, 145, 33, 42);
            painel.add(b2);

            // ���������������������������������� CRIAÇAO DO BOTAO CS 89 MT-1B

            b3 = new JButton(); // BOT�O CS 89 MT-1B
            b3.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b3.addActionListener(this);
            b3.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b3.setToolTipText("Pressione para operar a Seccionadora 89 MT-1B");
            b3.setHorizontalTextPosition(AbstractButton.CENTER);
            b3.setVerticalTextPosition(AbstractButton.CENTER);
            b3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b3.setBounds(415, 62, 33, 45);
            painel.add(b3);

            // ����������������������������������� CRIAÇAO DO BOTAO TRAFO MT-1

            b4 = new JButton(); // BOTAO TRANSFORMADOR MT-1
            b4.setIcon(new javax.swing.ImageIcon("MT-1desenergizado.JPG"));
            b4.addActionListener(this);
            b4.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b4.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
            b4.setHorizontalTextPosition(AbstractButton.CENTER);
            b4.setVerticalTextPosition(AbstractButton.CENTER);
            b4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b4.setBounds(363, 228, 52, 45);
            painel.add(b4);

            // ����������������������������������� CRIAÇAO DO BOTOES DE CONTROLE DO TRAFO
            // MT-1

            b5 = new JButton("+"); // TAP MT-1
            b5.setBounds(417, 232, 41, 15);
            b5.addActionListener(this);
            painel.add(b5);

            b6 = new JButton("-"); // TAP MT-1
            b6.setBounds(417, 252, 41, 15);
            b6.addActionListener(this);
            painel.add(b6);

            tap = new JLabel("30.6 Kv"); // VALOR DE TENSAO DA BARRA T1
            tap.setForeground(Color.blue);
            tap.setBounds(375, 385, 60, 30);
            painel.add(tap);

            // valortap = new JLabel (eqp.getMostrarTapsmt1()); // VALOR TAP MT-1
            // valortap.setForeground(Color.blue);
            // valortap.setBounds (422,262,60,30);
            // javac -cp ".;postgresql-42.7.3.jar" SimuladorAlbraspainel.add (valortap);

            trafo = new JLabel("Desenergizado"); // CONDI��O DO TRANSFORMADOR
            trafo.setBounds(300, 202, 100, 30);
            // painel.add (trafo);

            // ���������������������������������������� CRIAÇAO DO BOTAO 89 MT-R

            b7 = new JButton(); // BOT�O CS 89 MT-RA
            b7.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b7.addActionListener(this);
            b7.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b7.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b7.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b7.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b7.setForeground(Color.black);// cor do titulo do bot�o
            b7.setEnabled(true);
            b7.setToolTipText("Pressione para operar a Seccionadora 89 MT-RA");
            b7.setMnemonic(KeyEvent.VK_B);
            b7.setActionCommand("89MT1A");// define o nome da acao
            b7.setBounds(180, 62, 33, 45);
            painel.add(b7);

            // ���������������������������������������� CRIAÇAO DO BOTAO 52 MT-R

            b8 = new JButton(); // BOT�O DJ 52 MT-R
            b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b8.addActionListener(this);
            b8.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b8.setMnemonic(KeyEvent.VK_C);
            b8.setToolTipText("Pressione para operar o Disjuntor 52 MT-R");
            b8.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b8.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
            b8.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b8.setBounds(225, 145, 33, 42);
            painel.add(b8);

            // ��������������������������������������� CRIAÇAO DO BOTAO 89 MT-RB

            b9 = new JButton();
            b9.setIcon(new javax.swing.ImageIcon("Chave1.jpg")); // Botao 89 MT-RB
            b9.addActionListener(this);
            b9.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b9.setToolTipText("Pressione para operar a Seccionadora 89 MT-RB");
            b9.setHorizontalTextPosition(AbstractButton.CENTER);
            b9.setVerticalTextPosition(AbstractButton.CENTER);
            b9.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b9.setBounds(265, 62, 33, 45);
            painel.add(b9);

            // ��������������������������������������� CRIAÇAO DO BOTAO TRAFO MT-R

            b10 = new JButton(); // GIF TRANSFORMADOR MT-R
            b10.setIcon(new javax.swing.ImageIcon("MT-Rdesenergizado.GIF"));
            b10.addActionListener(this);
            b10.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-R");
            b10.setHorizontalTextPosition(AbstractButton.CENTER);
            b10.setVerticalTextPosition(AbstractButton.CENTER);
            b10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b10.setBounds(213, 228, 52, 45);
            painel.add(b10);

            // ��������������������������������������� CONTROLES DO TRAFO MT-R

            b11 = new JButton("+"); // TAP MT-R
            b11.setBounds(267, 232, 41, 15);
            b11.addActionListener(this);
            painel.add(b11);

            b12 = new JButton("-"); // TAP MT-R
            b12.setBounds(267, 252, 41, 15);
            b12.addActionListener(this);
            painel.add(b12);

            tap1 = new JLabel("30.6 Kv"); // VALOR DE TENS�O NA BARRA TR
            tap1.setForeground(Color.blue);
            tap1.setBounds(225, 385, 60, 25);
            painel.add(tap1);

            // valortap1 = new JLabel (eqp.getMostrarTapsmt1()); // TAP MT-R
            // valortap1.setForeground(Color.blue);
            // valortap1.setBounds (272,269,40,15);
            // painel.add (valortap1);

            trafo1 = new JLabel("Desenergizado"); // CONDI��O DO TRANSFORMADOR
            trafo1.setBounds(150, 200, 100, 30);
            // painel.add (trafo1);

            // ���������������������������������������� CRIAÇAO DO BOTAO 89 MT-2A

            b13 = new JButton(); // BOT�O CS 89 MT-2A
            b13.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b13.addActionListener(this);
            b13.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b13.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b13.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b13.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b13.setForeground(Color.black);// cor do titulo do bot�o
            b13.setEnabled(true);
            b13.setToolTipText("Pressione para operar a Seccionadora 89 MT-2A");
            b13.setMnemonic(KeyEvent.VK_B);
            b13.setActionCommand("89MT2A");// define o nome da acao
            b13.setBounds(30, 61, 33, 45);
            painel.add(b13);

            // ���������������������������������������� CRIAÇAO DO BOTAO 52 MT-2

            b14 = new JButton(); // BOT�O DJ 52 MT-2
            b14.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b14.addActionListener(this);
            b14.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b14.setMnemonic(KeyEvent.VK_C);
            b14.setToolTipText("Pressione para operar o Disjuntor 52 MT-2");
            b14.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b14.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
            b14.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b14.setBounds(75, 145, 33, 42);
            painel.add(b14);

            // ��������������������������������������� CRIAÇAO DO BOTAO 89 MT-2B

            b15 = new JButton();
            b15.setIcon(new javax.swing.ImageIcon("Chave1.jpg")); // Bot�o 89 MT-2B
            b15.addActionListener(this);
            b15.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b15.setToolTipText("Pressione para operar a Seccionadora 89 MT-2B");
            b15.setHorizontalTextPosition(AbstractButton.CENTER);
            b15.setVerticalTextPosition(AbstractButton.CENTER);
            b15.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b15.setBounds(115, 61, 33, 45);
            painel.add(b15);

            // ��������������������������������������� CRIAÇAO DO BOTAO TRAFO MT-2

            b16 = new JButton(); // GIF TRANSFORMADOR MT-2
            b16.setIcon(new javax.swing.ImageIcon("MT-2desenergizado.GIF"));
            b16.addActionListener(this);
            b16.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b16.setToolTipText("Pressione para comutar o Tap do Transformador MT-2");
            b16.setHorizontalTextPosition(AbstractButton.CENTER);
            b16.setVerticalTextPosition(AbstractButton.CENTER);
            b16.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b16.setBounds(63, 228, 52, 45);
            painel.add(b16);

            // ��������������������������������������� CONTROLES DO TRAFO MT-2

            b17 = new JButton("+"); // TAP MT-2
            b17.setBounds(117, 232, 41, 15);
            b17.addActionListener(this);
            painel.add(b17);

            b18 = new JButton("-"); // TAP MT-2
            b18.setBounds(117, 252, 41, 15);
            b18.addActionListener(this);
            painel.add(b18);

            tap2 = new JLabel("30.6 Kv"); // VALOR DE TENSAO NA BARRA T2
            tap2.setForeground(Color.blue);
            tap2.setBounds(75, 385, 60, 25);
            painel.add(tap2);

            // valortap2 = new JLabel (eqp.getMostrarTapsmt2()); // TAP MT-2
            // valortap2.setForeground(Color.blue);
            // valortap2.setBounds (122,269,40,15);
            // painel.add (valortap2);

            trafo2 = new JLabel("Desenergizado"); // CONDIÇAO DO TRANSFORMADOR MT-2
            trafo2.setBounds(0, 200, 100, 30);
            // painel.add (trafo2);

            // ����������������������������������� CRIAÇAO DO BOTAO 89 L1-A

            b19 = new JButton(); // BOTAO CS 89 L1-A
            b19.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b19.addActionListener(this);
            b19.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b19.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b19.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b19.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b19.setForeground(Color.black);// cor do titulo do bot�o
            b19.setEnabled(true);
            b19.setToolTipText("Pressione para operar a Seccionadora 89 L1-A");
            b19.setMnemonic(KeyEvent.VK_B);
            b19.setActionCommand("89L1A");// define o nome da acao
            b19.setBounds(490, 62, 33, 45);
            painel.add(b19);

            // ����������������������������������� CRIAÇAO DO BOTAO 89 L1-B

            b20 = new JButton(); // BOTAO CS 89 L1-B
            b20.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b20.addActionListener(this);
            b20.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b20.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b20.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b20.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b20.setForeground(Color.black);// cor do titulo do bot�o
            b20.setEnabled(true);
            b20.setToolTipText("Pressione para operar a Seccionadora 89 L1-B");
            b20.setMnemonic(KeyEvent.VK_B);
            b20.setActionCommand("89L1B");// define o nome da acao
            b20.setBounds(575, 62, 33, 45);
            painel.add(b20);

            // ����������������������������������� CRIA��O DO BOT�O 52 L1

            b21 = new JButton(); // BOTAO 52 L1
            b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b21.addActionListener(this);
            b21.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b21.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b21.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b21.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b21.setForeground(Color.black);// cor do titulo do bot�o
            b21.setEnabled(true);
            b21.setToolTipText("Pressione para operar O Disjuntor 52 L1");
            b21.setMnemonic(KeyEvent.VK_B);
            b21.setActionCommand("52L1");// define o nome da acao
            b21.setBounds(535, 145, 33, 42);
            painel.add(b21);

            // ����������������������������������� CRIAÇAO DO BOTAO 89 L1

            b22 = new JButton(); // BOT�O CS 89 L1
            b22.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b22.addActionListener(this);
            b22.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b22.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b22.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b22.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b22.setForeground(Color.black);// cor do titulo do bot�o
            b22.setEnabled(true);
            b22.setToolTipText("Pressione para operar a Seccionadora 89 L1");
            b22.setMnemonic(KeyEvent.VK_B);
            b22.setActionCommand("89L1");// define o nome da acao
            b22.setBounds(535, 208, 33, 45);
            painel.add(b22);

            // ����������������������������������� CRIAÇAO DO BOTAO 57 L1

            b23 = new JButton(); // BOTAO CS 57 L1
            b23.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b23.setHorizontalTextPosition(AbstractButton.CENTER); // posicao do texto
            b23.setVerticalTextPosition(AbstractButton.CENTER); // posi��o do texto
            b23.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b23.setBackground(new Color(204, 204, 255)); // cor de fundo do bot�o
            b23.setBounds(475, 276, 33, 45);
            painel.add(b23);

            // ����������������������������������� CRIAÇAO DO BOTAO 89 L2-A

            b24 = new JButton(); // BOTAO CS 89 L2-A
            b24.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b24.addActionListener(this);
            b24.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b24.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b24.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b24.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b24.setForeground(Color.black);// cor do titulo do bot�o
            b24.setEnabled(true);
            b24.setToolTipText("Pressione para operar a Seccionadora 89 L2-A");
            b24.setMnemonic(KeyEvent.VK_B);
            b24.setActionCommand("89L2A");// define o nome da acao
            b24.setBounds(640, 62, 33, 45);
            painel.add(b24);

            // ����������������������������������� CRIAÇAO DO BOTAO 89 L2-B

            b25 = new JButton(); // BOT�O CS 89 L2-B
            b25.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b25.addActionListener(this);
            b25.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b25.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b25.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b25.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b25.setForeground(Color.black);// cor do titulo do bot�o
            b25.setEnabled(true);
            b25.setToolTipText("Pressione para operar a Seccionadora 89 L2-B");
            b25.setMnemonic(KeyEvent.VK_B);
            b25.setActionCommand("89L2B");// define o nome da acao
            b25.setBounds(725, 62, 33, 45);
            painel.add(b25);

            // ����������������������������������� CRIAÇAO DO BOTAO 52 L2

            b26 = new JButton(); // BOTAO 52 L2
            b26.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b26.addActionListener(this);
            b26.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b26.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b26.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b26.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b26.setForeground(Color.black);// cor do titulo do bot�o
            b26.setEnabled(true);
            b26.setToolTipText("Pressione para operar O Disjuntor 52 L2");
            b26.setMnemonic(KeyEvent.VK_B);
            b26.setActionCommand("52L2");// define o nome da acao
            b26.setBounds(685, 145, 33, 42);
            painel.add(b26);

            // ����������������������������������� CRIA��O DO BOT�O 89 L2

            b27 = new JButton(); // BOT�O CS 89 L2
            b27.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b27.addActionListener(this);
            b27.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b27.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b27.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b27.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b27.setForeground(Color.black);// cor do titulo do bot�o
            b27.setEnabled(true);
            b27.setToolTipText("Pressione para operar a Seccionadora 89 L2");
            b27.setMnemonic(KeyEvent.VK_B);
            b27.setActionCommand("89L2");// define o nome da acao
            b27.setBounds(686, 208, 33, 45);
            painel.add(b27);

            // ����������������������������������� CRIAÇAO DO BOTAO 57 L2

            b28 = new JButton(); // BOT�O LT 57 L2
            b28.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b28.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b28.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b28.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b28.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b28.setBounds(748, 276, 33, 45);
            painel.add(b28);
            // ����������������������������������� CRIAÇAO DO BOTAO 89 BT-A

            b29 = new JButton(); // BOTAO CS 89 BT-A
            b29.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b29.addActionListener(this);
            b29.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b29.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b29.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b29.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b29.setForeground(Color.black);// cor do titulo do bot�o
            b29.setEnabled(true);
            b29.setToolTipText("Pressione para operar a Seccionadora 89 BT-A");
            b29.setMnemonic(KeyEvent.VK_B);
            b29.setActionCommand("89BTA");// define o nome da acao
            b29.setBounds(830, 82, 33, 45);
            painel.add(b29);

            // ����������������������������������� CRIA��O DO BOT�O 57 BT-A

            b30 = new JButton(); // BOT�O LT 57 BT-A
            b30.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b30.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b30.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b30.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b30.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b30.setBounds(770, 125, 33, 45);
            painel.add(b30);

            // ����������������������������������� CRIA��O DO BOT�O 89 BT-B

            b31 = new JButton(); // BOT�O CS 89 BT-B
            b31.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b31.addActionListener(this);
            b31.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b31.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b31.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b31.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b31.setForeground(Color.black);// cor do titulo do bot�o
            b31.setEnabled(true);
            b31.setToolTipText("Pressione para operar a Seccionadora 89 BT-B");
            b31.setMnemonic(KeyEvent.VK_B);
            b31.setActionCommand("89BTB");// define o nome da acao
            b31.setBounds(915, 82, 33, 45);
            painel.add(b31);

            // ����������������������������������� CRIAÇÃO DO BOTÃO 57 BT-B

            b32 = new JButton(); // BOT�O LT 57 BT-B
            b32.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b32.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b32.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b32.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b32.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b32.setBounds(977, 125, 33, 45);
            painel.add(b32);

            // ����������������������������������� CRIAÇÃO DO BOTÃO 52 BT

            b33 = new JButton(); // BOT�O 52 BT
            b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b33.addActionListener(this);
            b33.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b33.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b33.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b33.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b33.setForeground(Color.black);// cor do titulo do bot�o
            b33.setEnabled(true);
            b33.setToolTipText("Pressione para operar O Disjuntor 52 BT");
            b33.setMnemonic(KeyEvent.VK_B);
            b33.setActionCommand("52BT");// define o nome da acao
            b33.setBounds(872, 145, 33, 42);
            painel.add(b33);

            // ��������������������������������������� CRIAÇAO DO BOTAO SAIR

            b34 = new JButton("");
            b34.setIcon(new javax.swing.ImageIcon("Porta.jpg"));
            b34.addActionListener(this);
            b34.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b34.setToolTipText("Pressione para encerrar o programa");
            b34.setHorizontalTextPosition(AbstractButton.CENTER);
            b34.setVerticalTextPosition(AbstractButton.CENTER);
            b34.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b34.setBounds(500, 465, 32, 58);
            painel.add(b34);

            // ��������������������������������������� BOTÃO SETA

            b40 = new JButton("");
            b40.setIcon(new javax.swing.ImageIcon("Seta.jpg"));
            b40.addActionListener(this);
            b40.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b40.setToolTipText("Pressione para retornar ao Menu das Telas MTs 3 e 4");
            b40.setHorizontalTextPosition(AbstractButton.CENTER);
            b40.setVerticalTextPosition(AbstractButton.CENTER);
            b40.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b40.setBounds(80, 465, 30, 30);
            painel.add(b40);

            b42 = new JButton(""); // BOTÃO PARA EXECUTAR A CONFIGURAÇÃO PADRÃO DOS BARRAMENTOS DE 230 KV
            b42.setIcon(new javax.swing.ImageIcon("telecomando.jpg"));
            b42.addActionListener(this);
            b42.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b42.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b42.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b42.setForeground(Color.black);// cor do titulo do bot�o
            b42.setEnabled(true);
            b42.setToolTipText("Pressione para Energizar na Configuraçao Padrao");
            b42.setMnemonic(KeyEvent.VK_B);
            b42.setActionCommand("Usuario");// define o nome da acao
            b42.setBounds(2, 2, 50, 48); // Coluna,Linha,Largura,Altura
            getContentPane().add(b42);

            // atualizaConfiguracao();

            c.add(painel, java.awt.BorderLayout.CENTER);
            // setDefaultOpenOperation(javax.swing.WindowConstants.AlwaysOnTop);
        }

        // ############### MÉTODO ACTIONPERFORMED QUE EXECUTA AÇÃO DOS BOTÕES CRIADOS

        public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
        {
            if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")
                    || tfPerfil.getText().equals("Usuario") || tfPerfil.getText().equals("usuario")
                    || tfPerfil.getText().equals("usuario")) {

                if (e.getSource() == b1)// ���������������������� AÇAO DO BOTAO DA CS 89 MT-1A
                {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja alterar o estado da Seccionadora 89 MT-1A?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mt1a().equals("Seccionadora Aberta")) {
                            b1.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mt1a();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // String tagequipamento = tfTagEquipamento.getText();
                            // String operacao = tfOperacao.getText();
                            // String manobra = tfManobra.getText();
                            // BDE.ConectarBD();
                            // BDE.incluir89mt1afechada(usuario, data);
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt1aFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento89mt1a();
                            // BDEQ.cadastraEquipamentos();

                            // seccionadora89mt1afechada = "Seccionadora 89MT-1A Fechada";
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Fechada com
                            // Sucesso!",
                            // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt1afechada = "Seccionadora 89MT-1A Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        }

                        else if (eqp.seccionadora89mt1a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt1().equals("Disjuntor Aberto")
                                || eqp.disjuntor52mt1().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89mt1b().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b1.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mt1a();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.ConectarBD();
                            // BDE.incluir89mt1aaberta(usuario, data);
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt1aAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89mt1a();
                            // BDEQ.cadastraEquipamentos();
                            // seccionadora89mt1aaberta = "Seccionadora 89MT-1A Aberta";
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Aberta com
                            // Sucesso!",
                            // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt1aaberta = "Seccionadora 89MT-1A Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-1 FECHADO! \n",
                                    "Logica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89MT-1A " + eqp.seccionadora89mt1a());
                }

                // ���������������������������������������� AÇAO DO BOTAO DO DJ 52 MT-1
                if (e.getSource() == b2) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja alterar o estado do Disjuntor 52 MT-1?",
                            "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.disjuntor52mt1().equals("Disjuntor Aberto")
                                && eqp.seccionadora89mt1a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                || eqp.seccionadora89mt1b().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                        && eqp.disjuntor52mt1().equals("Disjuntor Aberto")) {
                            b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                            eqp.fecharDisjuntor52mt1();
                            status2.setText(" Equipamento operado: " + "52 MT-1 " + eqp.disjuntor52mt1());
                            b4.setIcon(new javax.swing.ImageIcon("MT-1energizado.GIF"));
                            eqp.ligarTransformadormt1();
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52mt2fechado(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento52mt2();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52mt1fechado = "Disjuntor 52MT-1 Fechado";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            if (eqp.seccionadora89mt1a().equals("Seccionadora Fechada")
                                    && eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                    || eqp.seccionadora89mt1b().equals("Seccionadora Fechada")
                                            && eqp.disjuntor52bt().equals("Disjuntor Fechado")
                                    || eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                            && eqp.seccionadora89mt2b().equals("Seccionadora Fechada")) {
                                // JOptionPane.showMessageDialog(null,
                                // "O Disjuntor 52 MT-1 foi Fechado #TRANSFORMADOR ENERGIZADO!#", "Disjuntor",
                                // JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                                b4.setIcon(new javax.swing.ImageIcon("MT-1energizado.GIF"));
                                tap.setText("" + eqp.getValorTapmt1());
                                trafo.setText(" Energizado");
                            }
                        } else if (eqp.disjuntor52mt1().equals("Disjuntor Fechado")
                                && eqp.seccionadora89mt1a().equals("Seccionadora Fechada")
                                || eqp.disjuntor52bt().equals("Disjuntor Fechado")) {

                            b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                            eqp.abrirDisjuntor52mt1();
                            status2.setText(" Equipamento operado: " + "52 MT-1 " + eqp.disjuntor52mt1());
                            b4.setIcon(new javax.swing.ImageIcon("MT-1desenergizado.JPG"));
                            tap.setText("0 kV");
                            eqp.desligarTransformadormt1();
                            // trafo.setText("Desenergizado");
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52mt2aberto(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantAbertura52mt2();
                            // BDEQ.cadastraEquipamentos();
                            disjuntor52mt1aberto = "Disjuntor 52MT-1 Aberto";
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            // if (eqp.seccionadora89mt1a().equals("Seccionadora Fechada")
                            // || eqp.seccionadora89mt1b().equals("Seccionadora Aberta")
                            // && eqp.disjuntor52mt1().equals("Disjuntor Aberto"))
                            // JOptionPane.showMessageDialog(null,
                            // "O Disjuntor 52 MT-1 foi aberto #TRANSFORMADOR DESENERGIZADO!#", "Disjuntor",
                            // JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Logica de Intertravamento não Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                                    "Logica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    if (eqp.disjuntor52mt1().equals("Disjuntor Fechado")
                            && eqp.disjuntor52l1().equals("Disjuntor Aberto")
                            && eqp.disjuntor52l2().equals("Disjuntor Aberto")
                            && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                        status2.setText(" Equipamento operado: " + "O TRANSFORMADOR MT-1 ESTA DESENERGIZADO");
                    } else if (eqp.disjuntor52mt1().equals("Disjuntor Fechado")
                            && eqp.seccionadora89mt1a().equals("Seccionadora Aberta")
                            || eqp.seccionadora89mt1b().equals("Seccionadora Aberta")
                                    && eqp.disjuntor52l1().equals("Disjuntor Aberto")
                                    && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                        status2.setText(" Equipamento operado: " + "O TRANSFORMADOR MT-1 ESTA DESENERGIZADO");
                    }
                }

                // ���������������������������������������� AÇAO DO BOTAO DA CS 89 MT-1B
                if (e.getSource() == b3) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja alterar o estado da Seccionadora 89 MT-1B?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mt1b().equals("Seccionadora Aberta")) {
                            b3.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mt1b();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.ConectarBD();
                            // BDE.incluir89mt1bfechada(usuario, data);
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt1bFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.cadastraEquipamentos();
                            // BDEQ.QuantFechamento89mt1b();
                            // seccionadora89mt1bfechada = "Seccionadora 89MT-1B Fechada";
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT1-B foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt1bfechada = "Seccionadora 89MT-1B Fechada";
                            manobrainteligente.DesenerL1InterBarra();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        } else if (eqp.seccionadora89mt1b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt1().equals("Disjuntor Aberto")
                                || eqp.disjuntor52mt1().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89mt1a().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b3.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mt1b();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.ConectarBD();
                            // BDE.incluir89mt1baberta(usuario, data);
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt1bAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.cadastraEquipamentos();
                            // BDEQ.QuantAbertura89mt1b();

                            // JOptionPane.showMessageDialog(null,"A Seccionadora esta 89 MT1-B foi Aberta
                            // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt1baberta = "Seccionadora 89MT-1B Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-1 FECHADO! \n ",
                                    "Logica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 MT-1B " + eqp.seccionadora89mt1b());
                }

                // ������������������������������� AÇAO DOS BOTOES DE COMUTAÇAO DE TAP'S DO MT-1
                if (e.getSource() == b4) {
                    status2.setText(" O Transformador MT-1 esta no Tap:" + eqp.getMostrarTapsmt1());
                    JOptionPane.showMessageDialog(null, "  O Transformador MT-1 esta no:  " + eqp.getMostrarTapsmt1(),
                            "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                }
                if (e.getSource() == b5) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja Subir o Tap do Transformador MT-1?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmt1() == 8)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-1 está no Tap Máximo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.aumentarTapmt1();
                        status2.setText(" Equipamento operado: "
                                + "O Transformador MT-1 está no: " + eqp.getValorTapmt1());
                        // valortap.setText(eqp.getMostrarTapsmt1());
                        tap.setText("" + eqp.getValorTapmt1());

                        if (eqp.disjuntor52mt1().equals("Disjuntor Fechado")) {
                            // tap.setText(eqp.getValorTapmt1());
                            tap.setText("" + eqp.getValorTapmt1());
                        }

                        // String usuario = tfUsuario.getText();
                        // String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-1";
                        operacao = "Tap Elevado";
                        manobra = "Bay MT-1";
                        BDE.ConectarBD();
                        // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        BDEQ.ConectarBD();
                        BDEQ.QuantAumentoTapmt1();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }

                if (e.getSource() == b6) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja Descer Tap do Transformador?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmt1() == 0)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-1 esta no Tap Minimo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.diminuirTapmt1();
                        status2.setText("                         Equipamento operado: "
                                + "O Transformador MT-1 esta no:  " + eqp.getMostrarTapsmt1());
                        // valortap.setText(eqp.getMostrarTapsmt1());
                        tap.setText("" + eqp.getValorTapmt1());

                        if (eqp.disjuntor52mt1().equals("Disjuntor Fechado")) {
                            // tap.setText(eqp.getValorTapmt1());
                            tap.setText("" + eqp.getValorTapmt1());
                        }

                        // String usuario = tfUsuario.getText();
                        // String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-1";
                        operacao = "Tap Reduzido";
                        manobra = "Bay MT-1";
                        BDE.ConectarBD();
                        // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        BDEQ.ConectarBD();
                        BDEQ.QuantDiminuirTapmt1();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }

                if (e.getSource() == b7)// ���������������������� AÇAO DO BOTAO DA CS 89 MT-RA
                {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja alterar o estado da Seccionadora 89 MT-RA?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mtra().equals("Seccionadora Aberta")) {
                            b7.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mtra();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.ConectarBD();
                            // BDE.incluir89mtrafechada(usuario, data);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mtraFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mtra();
                            // BDEQ.cadastraEquipamentos();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-RA foi Fechada com
                            // Sucesso!",
                            // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // seccionadora89mtrafechada = "Seccionadora 89MT-RA Fechada";

                            seccionadora89mtrafechada = "Seccionadora 89MT-RA Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        }

                        else if (eqp.seccionadora89mtra().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mtr().equals("Disjuntor Aberto")
                                || eqp.disjuntor52mtr().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89mtrb().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b7.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mtra();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.ConectarBD();
                            // BDE.incluir89mtraaberta(usuario, data);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mtraAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.cadastraEquipamentos();
                            // BDEQ.QuantAbertura89mtra();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-RA foi Aberta com
                            // Sucesso!",
                            // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mtraaberta = "Seccionadora 89MT-RA Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-R FECHADO! \n",
                                    "Logica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89MT-RA " + eqp.seccionadora89mtra());
                }

                // ���������������������������������������� AÇAO DO BOTAO DO DJ 52 MT-R
                if (e.getSource() == b8) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja alterar o estado do Disjuntor 52 MT-R?",
                            "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.disjuntor52mtr().equals("Disjuntor Aberto")
                                && eqp.seccionadora89mtra().equals("Seccionadora Fechada")
                                && eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                || eqp.seccionadora89mtrb().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                        && eqp.disjuntor52mtr().equals("Disjuntor Aberto")) {
                            b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                            eqp.fecharDisjuntor52mtr();
                            status2.setText(" Equipamento operado: " + "52 MT-1 " + eqp.disjuntor52mt1());
                            b10.setIcon(new javax.swing.ImageIcon("MT-Renergizado.GIF"));
                            eqp.ligarTransformadormtr();
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52mt2fechado(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento52mt2();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52mtrfechado = "Disjuntor 52MT-R Fechado";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            if (eqp.seccionadora89mtra().equals("Seccionadora Fechada")
                                    && eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                    || eqp.seccionadora89mtrb().equals("Seccionadora Fechada")
                                            && eqp.disjuntor52bt().equals("Disjuntor Fechado")
                                    || eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                            && eqp.seccionadora89mtrb().equals("Seccionadora Fechada")) {
                                // JOptionPane.showMessageDialog(null,
                                // "O Disjuntor 52 MT-R foi Fechado #TRANSFORMADOR ENERGIZADO!#", "Disjuntor",
                                // JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                                b10.setIcon(new javax.swing.ImageIcon("MT-Renergizado.GIF"));
                                tap1.setText("" + eqp.getValorTapmtr());
                                trafo1.setText(" Energizado");
                            }
                        } else if (eqp.disjuntor52mtr().equals("Disjuntor Fechado")
                                && eqp.seccionadora89mtra().equals("Seccionadora Fechada")
                                || eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                            eqp.abrirDisjuntor52mtr();
                            status2.setText(" Equipamento operado: " + "52 MT-R " + eqp.disjuntor52mtr());
                            eqp.desligarTransformadormtr();
                            b10.setIcon(new javax.swing.ImageIcon("MT-Rdesenergizado.GIF"));
                            tap1.setText("0 kV");
                            trafo1.setText("Desenergizado");
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52mt2aberto(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantAbertura52mt2();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52mtraberto = "Disjuntor 52MT-R Aberto";
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            // if (eqp.seccionadora89mtra().equals("Seccionadora Fechada")
                            // || eqp.seccionadora89mtrb().equals("Seccionadora Aberta")
                            // && eqp.disjuntor52mtr().equals("Disjuntor Aberto"))
                            // JOptionPane.showMessageDialog(null,
                            // "O Disjuntor 52 MT-R foi aberto #TRANSFORMADOR DESENERGIZADO!#", "Disjuntor",
                            // JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        } else {
                            // JOptionPane.showMessageDialog(null,
                            // "Logica de Intertravamento não Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            // "Logica", JOptionPane.INFORMATION_MESSAGE,
                            // (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    if (eqp.disjuntor52mtr().equals("Disjuntor Fechado")
                            && eqp.disjuntor52l1().equals("Disjuntor Aberto")
                            && eqp.disjuntor52l2().equals("Disjuntor Aberto")
                            && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                        status2.setText(" Equipamento operado: " + "O TRANSFORMADOR MT-R ESTÁ DESENERGIZADO");
                    } else if (eqp.disjuntor52mtr().equals("Disjuntor Fechado")
                            && eqp.seccionadora89mtra().equals("Seccionadora Aberta")
                            || eqp.seccionadora89mtrb().equals("Seccionadora Aberta")
                                    && eqp.disjuntor52l1().equals("Disjuntor Aberto")
                                    && eqp.disjuntor52l2().equals("Disjuntor Aberto")
                                    && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                        status2.setText(" Equipamento operado: " + "O TRANSFORMADOR MT-R ESTA DESENERGIZADO");
                    }
                }

                // ���������������������������������������� AÇAO DO BOTAO DA CS 89 MT-RB
                if (e.getSource() == b9) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 MT-RB?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mtrb().equals("Seccionadora Aberta")) {
                            b9.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mtrb();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.ConectarBD();
                            // BDE.incluir89mtrbfechada(usuario, data);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mtrbFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mtrb();

                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MTR-B foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mtrbfechada = "Seccionadora 89MT-RB Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else if (eqp.seccionadora89mtrb().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mtr().equals("Disjuntor Aberto")
                                || eqp.disjuntor52mtr().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89mtra().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b9.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mtrb();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.ConectarBD();
                            // BDE.incluir89mtrbaberta(usuario, data);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mtrbAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mtrb();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 MTR-B foi Aberta
                            // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mtrbaberta = "Seccionadora 89MT-RB Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-R FECHADO! \n ",
                                    "Logica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 MT-RB " + eqp.seccionadora89mtrb());
                }

                // ������������������������������� AÇAO DOS BOTOES DE COMUTAÇÃO DE TAP'S DO MT-R
                if (e.getSource() == b10) {
                    status2.setText(" O Transformador MT-R está no Tap:" + eqp.getMostrarTapsmtr());
                    JOptionPane.showMessageDialog(null, "  O Transformador MT-R está no:  " + eqp.getMostrarTapsmtr(),
                            "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                }
                if (e.getSource() == b11) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja Subir o Tap do Transformador MT-R?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmtr() == 8)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-R esta no Tap Máximo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.aumentarTapmtr();
                        status2.setText("                   Equipamento operado: " + "O Transformador MT-R está no:  "
                                + eqp.getMostrarTapsmtr());
                        // valortap1.setText(eqp.getMostrarTapsmtr());
                        tap1.setText("" + eqp.getValorTapmtr());

                        if (eqp.disjuntor52mtr().equals("Disjuntor Fechado")) {
                            // tap1.setText(eqp.getValorTapmtr());
                            tap1.setText("" + eqp.getValorTapmtr());
                        }

                        // String usuario = tfUsuario.getText();
                        // String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-R";
                        operacao = "Tap Elevado";
                        manobra = "Bay MT-R";
                        // BDE.ConectarBD();
                        // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        // BDO.ConectarBD();
                        // BDO.operaçao89mtrbFechada(data);
                        BDEQ.ConectarBD();
                        BDEQ.QuantAumentoTapmtr();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                if (e.getSource() == b12) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja Descer Tap do Transformador?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmtr() == 0)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-R esta no Tap Mínimo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.diminuirTapmtr();
                        status2.setText("                       Equipamento operado: "
                                + "O Transformador MT-R está no:  " + eqp.getMostrarTapsmtr());
                        // valortap1.setText(eqp.getMostrarTapsmtr());
                        tap1.setText("" + eqp.getValorTapmtr());

                        if (eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            // tap1.setText(eqp.getValorTapmtr());
                            tap1.setText("" + eqp.getValorTapmtr());
                        }
                        // BDE.ConectarBD();
                        // String usuario = tfUsuario.getText();
                        // String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-R";
                        operacao = "Tap Reduzido";
                        manobra = "Bay MT-R";
                        // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        BDEQ.ConectarBD();
                        BDEQ.QuantDiminuirTapmtr();
                        tap1.setText("" + eqp.getValorTapmtr());
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Lógica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }

                // �������������������������������������� AÇÃO DO BOTÃO DA CS 89 MT-2A
                if (e.getSource() == b13) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja alterar o estado da Seccionadora 89 MT-2A?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mt2a().equals("Seccionadora Aberta")) {
                            b13.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mt2a();
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89mt2afechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mt2a();
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt2aFechada(data);
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-2A foi Fechada com
                            // Sucesso!",
                            // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt2afechada = "Seccionadora 89MT-2A Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        }

                        else if (eqp.seccionadora89mt2a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt2().equals("Disjuntor Aberto")
                                || eqp.disjuntor52mt2().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89mt2b().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b13.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mt2a();
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89mt2aaberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89mt2a();
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt2aAberta(data);
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-2A foi Aberta com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt2aaberta = "Seccionadora 89MT-2A Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-2 FECHADO! \n ",
                                    "Logica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89MT-2A " + eqp.seccionadora89mt2a());
                }

                // ������������������������������������ AÇÃO DO BOTÃO DO DISJUNTOR 52 MT-2
                if (e.getSource() == b14) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado do Disjuntor 52 MT-2?",
                            "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.disjuntor52mt2().equals("Disjuntor Aberto")
                                && eqp.seccionadora89mt2b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                || eqp.seccionadora89mt2a().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                        && eqp.disjuntor52mt2().equals("Disjuntor Aberto")) {
                            b14.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                            eqp.fecharDisjuntor52mt2();
                            status2.setText(" Equipamento operado: " + "52 MT-2 " + eqp.disjuntor52mt2());
                            b16.setIcon(new javax.swing.ImageIcon("MT-2energizado.GIF"));
                            eqp.ligarTransformadormt2();
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52mt2fechado(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento52mt2();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52mt2fechado = "Disjuntor 52MT-2 Fechado";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            if (eqp.seccionadora89mt2b().equals("Seccionadora Fechada")
                                    && eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                    || eqp.seccionadora89mt2a().equals("Seccionadora Fechada")
                                            && eqp.disjuntor52bt().equals("Disjuntor Fechado")
                                    || eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                            && eqp.seccionadora89mt2b().equals("Seccionadora Fechada")) {
                                // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-2 foi Fechado
                                // #TRANSFORMADOR ENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                                // javax.swing.ImageIcon("formiga.gif")));
                                b16.setIcon(new javax.swing.ImageIcon("MT-2energizado.GIF"));
                                tap2.setText("" + eqp.getValorTapmt2());
                                trafo2.setText(" Energizado");
                            }
                        } else if (eqp.disjuntor52mt2().equals("Disjuntor Fechado")
                                && eqp.seccionadora89mt2b().equals("Seccionadora Fechada")
                                || eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b14.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                            eqp.abrirDisjuntor52mt2();
                            status2.setText(" Equipamento operado: " + "52 MT-2 " + eqp.disjuntor52mt2());
                            eqp.desligarTransformadormt2();
                            b16.setIcon(new javax.swing.ImageIcon("MT-2desenergizado.GIF"));
                            tap2.setText("0 kV");
                            trafo2.setText("Desenergizado");
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52mt2aberto(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantAbertura52mt2();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52mt2aberto = "Disjuntor 52MT-2 Aberto";
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            // if (eqp.seccionadora89mt2b().equals("Seccionadora Fechada")
                            // || eqp.seccionadora89mt2a().equals("Seccionadora Aberta")
                            // && eqp.disjuntor52mt2().equals("Disjuntor Aberto"))
                            // JOptionPane.showMessageDialog(null,
                            // "O Disjuntor 52 MT-2 foi aberto #TRANSFORMADOR DESENERGIZADO!#", "Disjuntor",
                            // JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Logica de Intertravamento não Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                                    "Logica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    if (eqp.disjuntor52mt2().equals("Disjuntor Fechado")
                            && eqp.disjuntor52l1().equals("Disjuntor Aberto")
                            && eqp.disjuntor52l2().equals("Disjuntor Aberto")
                            && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                        status2.setText("                                 Equipamento operado: "
                                + "O TRANSFORMADOR MT-2 ESTÁ DESENERGIZADO");
                    } else if (eqp.disjuntor52mtr().equals("Disjuntor Fechado")
                            && eqp.seccionadora89mtra().equals("Seccionadora Aberta")
                            || eqp.seccionadora89mtrb().equals("Seccionadora Aberta")
                                    && eqp.disjuntor52l1().equals("Disjuntor Aberto")
                                    && eqp.disjuntor52l2().equals("Disjuntor Aberto")
                                    && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                        status2.setText(" Equipamento operado: " + "O TRANSFORMADOR MT-2 EST� DESENERGIZADO");
                    }
                }

                // ��������������������������������������� AÇÃO DO BOTÃO DA CS 89 MT-2B
                if (e.getSource() == b15) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 MT-2B?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mt2b().equals("Seccionadora Aberta")) {
                            b15.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mt2b();
                            // BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            // BDE.incluir89mt2bfechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mt2b();
                            // BDEQ.cadastraEquipamentos();
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt2bFechada(data);
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT2-B foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt2bfechada = "Seccionadora 89MT-2B Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else if (eqp.seccionadora89mt2b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt2().equals("Disjuntor Aberto")
                                || eqp.disjuntor52mt2().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89mt2a().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b15.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mt2b();
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89mt2baberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantAbertura89mt2b();
                            // BDEQ.cadastraEquipamentos();
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt2bAberta(data);
                            // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 MT2-B foi Aberta
                            // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt2baberta = "Seccionadora 89MT-2B Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 MT-2 FECHADO! \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 MT-2B " + eqp.seccionadora89mt2b());
                }

                // ������������������������������ AÇÃO DOS BOTÕES DE COMUTAÇÃO DE TAP'S DO MT-2
                if (e.getSource() == b16) {
                    status2.setText(" O Transformador MT-2 está no Tap:" + eqp.getMostrarTapsmt2());
                    JOptionPane.showMessageDialog(null, "  O Transformador MT-2 está no:  " + eqp.getMostrarTapsmt2(),
                            "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                }
                if (e.getSource() == b17) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja Subir o Tap do Transformador MT-2?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmt2() == 8)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-2 está no Tap Máximo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.aumentarTapmt2();
                        status2.setText("                       Equipamento operado: "
                                + "O Transformador MT-2 está no:  " + eqp.getMostrarTapsmt2());
                        // valortap2.setText(eqp.getMostrarTapsmt2());
                        tap2.setText("" + eqp.getValorTapmt2());

                        if (eqp.disjuntor52mt2().equals("Disjuntor Fechado")) {
                            // tap2.setText(eqp.getValorTapmt2());
                            tap2.setText("" + eqp.getValorTapmt2());
                        }
                        // BDE.ConectarBD();
                        // String usuario = tfUsuario.getText();
                        // String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-2";
                        operacao = "Tap Elevado";
                        manobra = "Bay MT-2";
                        // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        BDEQ.ConectarBD();
                        BDEQ.QuantAumentoTapmt2();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Lógica de Intertravamento não Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                if (e.getSource() == b18) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja Descer o Tap do Transformador MT-2?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmt2() == 0)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-2 está no Tap Mínimo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.diminuirTapmt2();
                        status2.setText("                       Equipamento operado: "
                                + "O Transformador MT-2 está no:  " + eqp.getMostrarTapsmt2());
                        tap2.setText(eqp.getValorTapmt2());
                        // valortap2.setText(eqp.getMostrarTapsmt2());
                        tap2.setText("" + eqp.getValorTapmt2());

                        if (eqp.disjuntor52mt2().equals("Disjuntor Fechado")) {
                            tap2.setText(eqp.getValorTapmt2());
                            tap2.setText("" + eqp.getValorTapmt2());
                        }

                        // BDE.ConectarBD();
                        // String usuario = tfUsuario.getText();
                        // String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-2";
                        operacao = "Tap Reduzido";
                        manobra = "Bay MT-2";
                        // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        BDEQ.ConectarBD();
                        BDEQ.QuantDiminuirTapmt2();
                        // BDEQ.cadastraEquipamentos();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Lógica de Intertravamento não Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }

                // ############################################ BOTAO DE ACAO DA CS 89L1-A

                if (e.getSource() == b19) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 L1-A?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89l1a().equals("Seccionadora Aberta")) {
                            b19.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89l1a();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l1afechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento89l1a();

                            seccionadora89l1afechada = "Seccionadora 89L1-A Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        }

                        else if (eqp.seccionadora89l1a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52l1().equals("Disjuntor Aberto")
                                || eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89l1b().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b19.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89l1a();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Aberta com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l1aaberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89l1a();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l1aaberta = "Seccionadora 89L1-A Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 L1 FECHADO! \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 L1-A " + eqp.seccionadora89l1a());
                }

                // #################################################### ACAO DO BOTAO DA 89 L1B
                if (e.getSource() == b20) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 L1-B?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89l1b().equals("Seccionadora Aberta")) {
                            b20.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89l1b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-B foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l1bfechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento89l1b();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l1bfechada = "Seccionadora 89L1-B Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else if (eqp.seccionadora89l1b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52l1().equals("Disjuntor Aberto")
                                || eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89l1a().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b20.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89l1b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 L1-B foi Aberta
                            // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));;
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l1baberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89l1b();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l1baberta = "Seccionadora 89L1-B Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 L1 FECHADO! \n ",
                                    "Lõgica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89L1-B " + eqp.seccionadora89l1b());
                }

                // ################################################# ACAO DO BOTAO DO 52 L1
                if (e.getSource() == b21) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado do Disjuntor 52 L1?",
                            "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.disjuntor52l1().equals("Disjuntor Aberto")
                                && eqp.seccionadora89l1a().equals("Seccionadora Fechada")
                                && eqp.seccionadora89l1().equals("Seccionadora Fechada")
                                || eqp.seccionadora89l1b().equals("Seccionadora Fechada")
                                        && eqp.seccionadora89l1().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52l1().equals("Disjuntor Aberto")) {
                            b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                            eqp.fecharDisjuntor52l1();

                            disjuntor52l1fechado = "Disjuntor 52L1 Fechado";
                            status2.setText(" Equipamento operado: " + "52 L1 " + eqp.disjuntor52l1());

                            if (eqp.seccionadora89l1a().equals("Seccionadora Fechada")
                                    && eqp.seccionadora89l1().equals("Seccionadora Fechada")
                                    || eqp.seccionadora89l1b().equals("Seccionadora Fechada")
                                    || eqp.disjuntor52bt().equals("Disjuntor Fechado")
                                            && eqp.disjuntor52l1().equals("Disjuntor Aberto")) {
                                JOptionPane.showMessageDialog(null, "O Disjuntor 52 L1 foi Fechado #BARRA ENERGIZADA!#",
                                        "Disjuntor", JOptionPane.INFORMATION_MESSAGE,
                                        (new javax.swing.ImageIcon("formiga.gif")));
                                tensao.setText("Tensão Na Barra A: 235 kV");
                            }
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52l1fechado(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento52l1();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52l1fechado = "Disjuntor 52L1 Fechado";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        }

                        else if (eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                && eqp.seccionadora89l1a().equals("Seccionadora Fechada")
                                && eqp.seccionadora89l1().equals("Seccionadora Fechada")
                                && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                        // && eqp.disjuntor52mt1().equals("Disjuntor Aberto")
                        // || eqp.disjuntor52mt1().equals("Disjuntor Fechado")
                        // && eqp.seccionadora89mt1a().equals("Seccionadora Fechada"))
                        {
                            b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                            eqp.abrirDisjuntor52l1();
                            status2.setText(" Equipamento operado: " + "52 L1 " + eqp.disjuntor52l1());
                            tensao.setText("Tensão Na Barra A: 0 kV");
                            tap.setText("0 kV");
                            // if (eqp.seccionadora89l1a().equals("Seccionadora Aberta") &&
                            // eqp.seccionadora89l1b().equals("Seccionadora Aberta") &&
                            // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                            // JOptionPane.showMessageDialog(null,"O Disjuntor 52 L1 foi aberto #BARRA
                            // DESENERGIZADA!#","Disjuntor",
                            // JOptionPane.INFORMATION_MESSAGE,(new javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            // BDE.incluir52l1aberto(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura52l1();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52l1aberto = "Disjuntor 52L1 Aberto";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else if (eqp.disjuntor52bt().equals("Disjuntor Fechado")
                                && eqp.disjuntor52mt1().equals("Disjuntor Fechado")
                                && eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                && eqp.disjuntor52mtr().equals("Disjuntor Fechado")) {
                            JOptionPane.showMessageDialog(null,
                                    " Lógica de Intertratavamento não Satisfeita! \n #O Disjuntor 52 L1  ou 52 L2 não pode ser ABERTO!#",
                                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        } else {
                            JOptionPane.showMessageDialog(null, "LÓGICA DE INTERTRAVAMENTO NÃO SATISFEITA!",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    if (eqp.seccionadora89l1a().equals("Seccionadora Aberta")
                            && eqp.seccionadora89l1b().equals("Seccionadora Aberta")
                            && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                        status2.setText(" Equipamento operado: " + "AS BARRAS A E B ESTÃO DESENERGIZADAS ");
                    }
                }
                // ����������������������������������������� A��O DO BOT�O DA CS 89 L1
                if (e.getSource() == b22) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 L1?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89l1().equals("Seccionadora Aberta")
                                && eqp.disjuntor52l1().equals("Disjuntor Aberto")) {
                            b22.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89l1();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1 foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l1fechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento89l1();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l1fechada = "Seccionadora 89L1 Fechada";
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else if (eqp.seccionadora89l1().equals("Seccionadora Fechada")
                                && eqp.disjuntor52l1().equals("Disjuntor Aberto")) {
                            b22.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89l1();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 L1 foi Aberta com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l1aberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89l1();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l1aberta = "Seccionadora 89L1 Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 L1 FECHADO \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 L1 " + eqp.seccionadora89l1());
                }

                // ################################################# BOTÃO DE ACÃO DA CS 89L2-A

                if (e.getSource() == b24) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 L2-A?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89l2a().equals("Seccionadora Aberta")) {
                            b24.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89l2a();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l2afechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento89l2a();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l2afechada = "Seccionadora 89L2-A Fechada";
                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                        }

                        else if (eqp.seccionadora89l2a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52l2().equals("Disjuntor Aberto")
                                || eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89l2b().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b24.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89l2a();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Aberta com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l2aaberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89l2a();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l2aaberta = "Seccionadora 89L2-A Aberta";
                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 L2 FECHADO \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 L2-A " + eqp.seccionadora89l2a());
                }

                // #################################################### ACAO DO BOTAO DA 89 L2B
                if (e.getSource() == b25) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 L2-B?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89l2b().equals("Seccionadora Aberta")) {
                            b25.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89l2b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-B foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l2bfechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento89l2b();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l2bfechada = "Seccionadora 89L2-B Fechada";
                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                        } else if (eqp.seccionadora89l2b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52l2().equals("Disjuntor Aberto")
                                || eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89l2a().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b25.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89l2b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 L2-B foi Aberta
                            // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));;
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l2baberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89l2b();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l2baberta = "Seccionadora 89L2-B Aberta";
                            manobrainteligente.EnerL2();
                            manobrainteligente.DesenerL2InterBarra();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();

                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 L2 FECHADO \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 L2-B " + eqp.seccionadora89l2b());
                }

                // ################################################# ACÃO DO BOTÃO DO 52 L2
                if (e.getSource() == b26) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado do Disjuntor 52 L2?",
                            "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.disjuntor52l2().equals("Disjuntor Aberto")
                                && eqp.seccionadora89l2b().equals("Seccionadora Fechada")
                                && eqp.seccionadora89l2().equals("Seccionadora Fechada")
                                || eqp.seccionadora89l2a().equals("Seccionadora Fechada")
                                        && eqp.seccionadora89l2().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52l2().equals("Disjuntor Aberto")) {
                            b26.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                            eqp.fecharDisjuntor52l2();
                            status2.setText(" Equipamento operado: " + "52 L2 " + eqp.disjuntor52l2());
                            BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52l2fechado(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento52l2();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52l2fechado = "Disjuntor 52L2 Fechado";
                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.DesenerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();

                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            if (eqp.seccionadora89l2a().equals("Seccionadora Fechada")
                                    && eqp.seccionadora89l2().equals("Seccionadora Fechada")
                                    || eqp.seccionadora89l2b().equals("Seccionadora Fechada")
                                    || eqp.disjuntor52bt().equals("Disjuntor Fechado")
                                            && eqp.disjuntor52l2().equals("Disjuntor aberto")) {
                                JOptionPane.showMessageDialog(null, "O Disjuntor 52 L2 foi Fechado #BARRA ENERGIZADA!#",
                                        "Disjuntor", JOptionPane.INFORMATION_MESSAGE,
                                        (new javax.swing.ImageIcon("formiga.gif")));
                                tensao.setText("Tensão Na Barra B: 235 kV");
                            }
                        } else if (eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                && eqp.seccionadora89l2b().equals("Seccionadora Fechada")
                                && eqp.seccionadora89l2().equals("Seccionadora Fechada")
                                && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                        // && eqp.disjuntor52mt2().equals("Disjuntor Aberto")
                        // || eqp.disjuntor52mt2().equals("Disjuntor Fechado")
                        // && eqp.seccionadora89mt2b().equals("Seccionadora Fechada"))
                        {
                            b26.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                            eqp.abrirDisjuntor52l2();
                            status2.setText(" Equipamento operado: " + "52 L2 " + eqp.disjuntor52l2());
                            tensao.setText("Tensão Na Barra B: 0 kV");
                            tap1.setText("0 kV");
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52l2aberto(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura52l2();
                            // BDEQ.cadastraEquipamentos();
                            // if (eqp.seccionadora89l2a().equals("Seccionadora Aberta") &&
                            // eqp.seccionadora89l2b().equals("Seccionadora Aberta") &&
                            // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                            // JOptionPane.showMessageDialog(null,"O Disjuntor 52 L2 foi aberto #BARRA
                            // DESENERGIZADA!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            disjuntor52l2aberto = "Disjuntor 52L2 Aberto";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL2();
                            manobrainteligente.DesenerL2InterBarra();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();

                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                        } else if (eqp.disjuntor52bt().equals("Disjuntor Fechado")
                                && eqp.disjuntor52mt2().equals("Disjuntor Fechado")
                                && eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                && eqp.disjuntor52mt1().equals("Disjuntor Fechado")) {
                            JOptionPane.showMessageDialog(null,
                                    " Lógica de Intertratavamento não Satisfeita! \n #O Disjuntor 52 L1  ou 52 L2 não pode ser ABERTO!#",
                                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        } else {
                            JOptionPane.showMessageDialog(null, "LÓGICA DE INTERTRAVAMENTO NÃO SATISFEITA! ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    if (eqp.seccionadora89l2a().equals("Seccionadora Aberta")
                            && eqp.seccionadora89l2b().equals("Seccionadora Aberta")
                            && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                        status2.setText(" Equipamento operado: " + "AS BARRAS A E B ESTÃO DESENERGIZADAS ");
                    }
                }

                // ����������������������������������������� A��O DO BOT�O DA CS 89 L2
                if (e.getSource() == b27) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 L2?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89l2().equals("Seccionadora Aberta")
                                && eqp.disjuntor52l2().equals("Disjuntor Aberto")) {
                            b27.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89l2();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2 foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l2fechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento89l2();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89l2fechada = "Seccionadora 89L2 Fechada";
                            manobrainteligente.EnerL2();
                            manobrainteligente.DesenerL2InterBarra();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();

                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                        }

                        else if (eqp.seccionadora89l2().equals("Seccionadora Fechada")
                                && eqp.disjuntor52l2().equals("Disjuntor Aberto")) {
                            b27.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89l2();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 L2 foi Aberta com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));;
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89l2aberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89l2();
                            // BDEQ.cadastraEquipamentos();
                            seccionadora89l2aberta = "Seccionadora 89L2 Aberta";
                            seccionadora89l2aberta = "Seccionadora 89L2 Aberta";
                            manobrainteligente.EnerL2();
                            manobrainteligente.DesenerL2InterBarra();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();

                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 L2 FECHADO \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "CS 89 L2 " + eqp.seccionadora89l2());
                }

                // ������������������������������������ A��O DO BOT�O DA SECCIONADORA 89 BT-A
                if (e.getSource() == b29) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 BT-A?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89bta().equals("Seccionadora Aberta")
                                && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                            b29.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89bta();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89btafechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento89bta();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89btafechada = "Seccionadora 89BT-A Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        }

                        else if (eqp.seccionadora89bta().equals("Seccionadora Fechada")
                                && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                            b29.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89bta();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Aberta com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89btaaberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89bta();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89btaaberta = "Seccionadora 89BT-A Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 BT FECHADO \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 BTA " + eqp.seccionadora89bta());
                }

                // ##################################################### ACAO DO BOTAO DA 89 BTB
                if (e.getSource() == b31) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 BTB?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89btb().equals("Seccionadora Aberta")
                                && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                            b31.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89btb();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89btbfechada(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento89btb();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89btbfechada = "Seccionadora 89BT-B Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        } else if (eqp.seccionadora89btb().equals("Seccionadora Fechada")
                                && eqp.disjuntor52bt().equals("Disjuntor Aberto")) {
                            b31.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89btb();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir89btbaberta(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89btb();
                            // BDEQ.cadastraEquipamentos();

                            seccionadora89btbaberta = "Seccionadora 89BT-B Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 BT FECHADO \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 BTB " + eqp.seccionadora89btb());
                }

                // ################################################# AC�O DO BOT�O DO 52 BT
                if (e.getSource() == b33) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado do Disjuntor 52 BT?",
                            "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.disjuntor52bt().equals("Disjuntor Aberto")
                                && eqp.seccionadora89bta().equals("Seccionadora Fechada")
                                && eqp.seccionadora89btb().equals("Seccionadora Fechada")) {
                            b33.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                            eqp.fecharDisjuntor52bt();
                            status2.setText(" Equipamento operado: " + "52 BT " + eqp.disjuntor52bt());

                            if (eqp.seccionadora89bta().equals("Seccionadora Fechada")
                                    && eqp.seccionadora89btb().equals("Seccionadora Fechada")) {
                                JOptionPane.showMessageDialog(null,
                                        "O Disjuntor 52 BT foi Fechado #BARRAS INTERLIGADAS!#", "Disjuntor",
                                        JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                                tensao.setText("Corrente de Interligaçao:120 A");
                            }
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52btfechado(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantFechamento52bt();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52btfechado = "Disjuntor 52BT Fechado";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else if (eqp.disjuntor52bt().equals("Disjuntor Fechado")
                                && eqp.seccionadora89bta().equals("Seccionadora Fechada")
                                && eqp.seccionadora89btb().equals("Seccionadora Fechada")) {
                            b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                            eqp.abrirDisjuntor52bt();
                            status2.setText(" Equipamento operado: " + "52 BT " + eqp.disjuntor52bt());
                            tensao.setText("Corrente de Interligação: 0 A");
                            if (eqp.seccionadora89bta().equals("Seccionadora Aberta") &&
                                    eqp.seccionadora89btb().equals("Seccionadora Aberta"))
                                JOptionPane.showMessageDialog(null,
                                        "O Disjuntor 52 BT foi aberto #BARRAS DESINTERLIGADAS!#", "Disjuntor",
                                        JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            // BDE.incluir52btaberto(usuario, data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura52bt();
                            // BDEQ.cadastraEquipamentos();

                            disjuntor52btaberto = "Disjuntor 52BT Aberto";

                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null, "LÓGICA DE INTERTRAVAMENTO NÃO SATISFEITA!",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    if (eqp.disjuntor52l1().equals("Disjuntor Aberto")
                            && eqp.disjuntor52l2().equals("Disjuntor Aberto")) {
                        status2.setText(" Equipamento operado: " + "AS BARRAS A E B ESTAO DESENERGIZADAS");
                    }
                }
            }

            if (e.getSource() == b34) // ----------- BOTAO SAIR ----------------//
            {
                new InterfaceMenu().setVisible(true);
                setVisible(false);
            }

            if (e.getSource() == b40) {
                new InterfaceMenu().setVisible(true);
                setVisible(false);
            }

            if (e.getSource() == b42) {
                if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")
                        || tfPerfil.getText().equals("Usuario") || tfPerfil.getText().equals("usuario")) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja utilizar a configuraçao operacional padrão da Subestaçao? ",
                            "Configuraçao", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        atualizaConfiguracao();
                        limparMemoria();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Faça o LOGIN para poder acessar essa Funcionalidade!");
                }
            }
        }

        public void atualizaConfiguracao() {
            eqp.fecharSeccionadora89l1a();
            eqp.fecharSeccionadora89l1();
            eqp.fecharDisjuntor52l1();
            eqp.fecharSeccionadora89l2b();
            eqp.fecharSeccionadora89l2();
            eqp.fecharDisjuntor52l2();
            eqp.fecharSeccionadora89bta();
            eqp.fecharSeccionadora89btb();
            eqp.fecharDisjuntor52bt();
            eqp.fecharSeccionadora89mt1a();
            eqp.fecharDisjuntor52mt1();
            eqp.fecharSeccionadora89mtra();
            eqp.fecharDisjuntor52mtr();
            eqp.fecharSeccionadora89mt2b();
            eqp.fecharDisjuntor52mt2();
            b1.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b7.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b14.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b15.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b19.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b22.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b25.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b27.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b26.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b29.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b31.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b33.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b4.setIcon(new javax.swing.ImageIcon("MT-1energizado.GIF"));
            b10.setIcon(new javax.swing.ImageIcon("MT-Renergizado.GIF"));
            b16.setIcon(new javax.swing.ImageIcon("MT-2energizado.GIF"));
        }
    }

    // ############################################ CLASSE MTS 3 & 4

    public class MTS3e4 extends JFrame implements ActionListener {
        JLabel tap, valortap, tensao, trafo, barra1, barra2, tap2, tap3, valortap2, valortap3, trafo2, trafo3, subir,
                descer, Alarmes;
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22,
                b23, b24, b25;
        JButton b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46,
                b47;

        public MTS3e4() {
            Container c = getContentPane();
            c.setLayout(new BorderLayout()); // gerenciador de layout

            // Toolkit tk = Toolkit.getDefaultToolkit();
            // Dimension d = tk.getScreenSize();

            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(null,
                    "Você deseja habilitar alguma manobra para Simulação? ",
                    "Habilitar", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                MenuManobrasG MM = new MenuManobrasG();
                MM.setVisible(true);
            }

            setTitle("Tela dos MT'S 3 e 4");
            setSize(770, 600);
            c.setBackground(new Color(0, 128, 128));
            // setLocation(350, 90);
            setLocationRelativeTo(null);
            // setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JLabel l1 = new JLabel();
            l1.setFont(new Font("Arial", 1, 30));
            l1.setText("Barramento de 230 kV");
            l1.setForeground(Color.blue);

            Icon imagem1 = new ImageIcon("Carlos1.GIF");
            gif1 = new JLabel();
            gif1.setIcon(imagem1);
            gif1.setBounds(688, 470, 100, 100); // Coluna,Linha,Largura,Altura
            gif1.setBackground(new Color(192, 192, 192)); // cor de fundo do bot�o
            getContentPane().add(gif1);

            painel = new JPanel();
            painel.setLayout(null);
            painel.setBackground(new Color(0, 128, 128));
            painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            JPanel p1 = new JPanel();
            p1.setBackground(new Color(0, 128, 128));
            p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            p1.add(l1);

            b42 = new JButton(""); // BOTÃO PAINEL FRAME MENU DE TELECOMANDO
            b42.setIcon(new javax.swing.ImageIcon("telecomando.jpg"));
            b42.addActionListener(this);
            b42.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b42.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b42.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b42.setForeground(Color.black);// cor do titulo do bot�o
            b42.setEnabled(true);
            b42.setToolTipText("Pressione para Energizar na Configuraçaoo Padrao");
            b42.setMnemonic(KeyEvent.VK_B);
            b42.setActionCommand("Usuario");// define o nome da acao
            b42.setBounds(2, 0, 50, 50); // Coluna,Linha,Largura,Altura
            getContentPane().add(b42);

            c.add(p1, java.awt.BorderLayout.NORTH);

            // ���������������������������������������������� BARRAS A E B
            JPanel v = new JPanel(); // Barra A
            v.setBounds(10, 5, 650, 3);
            v.setBackground(Color.red);
            painel.add(v);

            JPanel v1 = new JPanel(); // Barra B
            v1.setBounds(10, 30, 650, 3);
            v1.setBackground(Color.red);
            painel.add(v1);

            barra1 = new JLabel("A"); // IDENTIFICAC�O DA BARRA A
            barra1.setForeground(Color.blue);
            barra1.setBounds(10, 0, 60, 30);
            painel.add(barra1);

            barra2 = new JLabel("B");
            barra2.setForeground(Color.blue);
            barra2.setBounds(10, 25, 60, 30); // IDENTIFICAC�O DA BARRA B
            painel.add(barra2);
            // ##################################### IDENTIFICAC�O DOS EQUIPAMENTOS
            mt1a = new JLabel("89 MT-4A");
            mt1a.setForeground(Color.blue);
            mt1a.setBounds(202, 40, 60, 30);
            painel.add(mt1a);
            mt1b = new JLabel("89 MT-4B");
            mt1b.setForeground(Color.blue);
            mt1b.setBounds(284, 40, 60, 30);
            painel.add(mt1b);
            mt2a = new JLabel("89 MT-3A");
            mt2a.setForeground(Color.blue);
            mt2a.setBounds(350, 40, 60, 30);
            painel.add(mt2a);
            mt2b = new JLabel("89 MT-3B");
            mt2b.setForeground(Color.blue);
            mt2b.setBounds(435, 40, 60, 30);
            painel.add(mt2b);
            mt152 = new JLabel("52 MT-4");
            mt152.setForeground(Color.blue);
            mt152.setBounds(260, 150, 60, 30);
            painel.add(mt152);
            mt252 = new JLabel("52 MT-3");
            mt252.setForeground(Color.blue);
            mt252.setBounds(410, 150, 60, 30);
            painel.add(mt252);
            tensao = new JLabel("Tensão de Linha:0 kV");
            tensao.setForeground(Color.blue);
            tensao.setBounds(465, 5, 200, 30);
            painel.add(tensao);
            subir = new JLabel("Sair");
            subir.setForeground(Color.blue);
            subir.setBounds(355, 470, 32, 40);
            painel.add(subir);

            // ������������������������������������������������� BAY TRAFO MT-3

            JPanel v13 = new JPanel(); // SECCIONADORA 89 MT-3A
            v13.setBounds(345, 8, 3, 55);
            v13.setBackground(Color.red);
            painel.add(v13);

            JPanel v14 = new JPanel(); // SECCIONADORA 89 MT-3A / DISJUNTOR 52 MT-3
            v14.setBounds(345, 103, 3, 23);
            v14.setBackground(Color.red);
            painel.add(v14);

            JPanel v15 = new JPanel(); // SECCIONADORA 89 MT-3B
            v15.setBounds(430, 30, 3, 33);
            v15.setBackground(Color.red);
            painel.add(v15);

            JPanel v16 = new JPanel(); // SECCIONADORA 89 MT-3B / DISJUNTOR
            v16.setBounds(430, 103, 3, 23);
            v16.setBackground(Color.red);
            painel.add(v16);

            JPanel v17 = new JPanel(); // DISJUNTOR / TRANSFORMADOR
            v17.setBounds(390, 185, 3, 43);
            v17.setBackground(Color.red);
            painel.add(v17);

            JPanel v18 = new JPanel(); // SECCIONADORA 89 MT-3A / SECCIONADORA 89 MT-3B
            v18.setBounds(345, 125, 88, 3);
            v18.setBackground(Color.red);
            painel.add(v18);

            JPanel v19 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v19.setBounds(390, 126, 3, 20);
            v19.setBackground(Color.red);
            painel.add(v19);

            JPanel v20 = new JPanel(); // TRANSFORMADOR / BARRA T3
            v20.setBounds(390, 272, 3, 114);
            v20.setBackground(Color.orange);
            painel.add(v20);

            JPanel v21 = new JPanel(); // BARRA T3
            v21.setBounds(325, 385, 130, 3);
            v21.setBackground(Color.orange);
            painel.add(v21);

            // �������������������������������������������� BAY MT-4

            JPanel v2 = new JPanel(); // Seccionadora 89 MT-4A
            v2.setBounds(195, 8, 3, 55);
            v2.setBackground(Color.red);
            painel.add(v2);

            JPanel v3 = new JPanel();
            v3.setBounds(195, 103, 3, 23); // Seccionadora 89 MT-4A / Disjuntor
            v3.setBackground(Color.red);
            painel.add(v3);

            JPanel v4 = new JPanel(); // Seccionadora 89 MT-4B
            v4.setBounds(280, 30, 3, 33);
            v4.setBackground(Color.red);
            painel.add(v4);

            JPanel v5 = new JPanel(); // SECCIONADORA 89 MT-4B / DISJUNTOR MT-4
            v5.setBounds(279, 103, 3, 23);
            v5.setBackground(Color.red);
            painel.add(v5);

            JPanel v6 = new JPanel(); // DISJUNTOR / TRANSFORMADOR
            v6.setBounds(240, 185, 3, 43);
            v6.setBackground(Color.red);
            painel.add(v6);

            JPanel v7 = new JPanel(); // SECCIONADORA MT-4A / SECCIONADORA MT-4B
            v7.setBounds(195, 125, 87, 3);
            v7.setBackground(Color.red);
            painel.add(v7);

            JPanel v8 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v8.setBounds(240, 126, 3, 20);
            v8.setBackground(Color.red);
            painel.add(v8);

            JPanel v9 = new JPanel(); // TRANSFORMADOR / BARRA T4
            v9.setBounds(240, 272, 3, 114);
            v9.setBackground(Color.orange);
            painel.add(v9);

            JPanel v10 = new JPanel(); // BARRA T4
            v10.setBounds(175, 385, 130, 3);
            v10.setBackground(Color.orange);
            painel.add(v10);

            // �������������������������������������� CRIA��O DO BOT�O 89 MT-3A

            b1 = new JButton(); // BOT�O CS 89 MT-3A
            b1.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b1.addActionListener(this);
            b1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b1.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b1.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b1.setForeground(Color.black);// cor do titulo do bot�o
            b1.setEnabled(true);
            b1.setToolTipText("Pressione para operar a Seccionadora 89 MT-3A");
            b1.setMnemonic(KeyEvent.VK_B);
            b1.setActionCommand("89MT3A");// define o nome da acao
            b1.setBounds(330, 62, 33, 45);
            painel.add(b1);

            // �������������������������������������� CRIA��O DO BOT�O 52 MT-3

            b2 = new JButton(); // BOT�O DJ 52 MT-3
            b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b2.addActionListener(this);
            b2.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b2.setMnemonic(KeyEvent.VK_C);
            b2.setToolTipText("Pressione para operar o Disjuntor 52 MT-3");
            b2.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b2.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
            b2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b2.setBounds(375, 145, 33, 42);
            painel.add(b2);

            // ���������������������������������� CRIA��O DO BOT�O CS 89 MT-3B

            b3 = new JButton(); // BOT�O CS 89 MT-3B
            b3.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b3.addActionListener(this);
            b3.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b3.setToolTipText("Pressione para operar a Seccionadora 89 MT-3B");
            b3.setHorizontalTextPosition(AbstractButton.CENTER);
            b3.setVerticalTextPosition(AbstractButton.CENTER);
            b3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b3.setBounds(415, 62, 33, 45);
            painel.add(b3);

            // ����������������������������������� CRIA��O DO BOT�O TRAFO MT-3

            b4 = new JButton(); // BOT�O TRANSFORMADOR MT-3
            b4.setIcon(new javax.swing.ImageIcon("MT-3desenergizado.GIF"));
            b4.addActionListener(this);
            b4.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b4.setToolTipText("Pressione para comutar o Tap do Transformador MT-3");
            b4.setHorizontalTextPosition(AbstractButton.CENTER);
            b4.setVerticalTextPosition(AbstractButton.CENTER);
            b4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b4.setBounds(361, 228, 52, 45);
            painel.add(b4);

            // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
            // MT-3

            b5 = new JButton("+"); // TAP MT-3
            b5.setBounds(425, 240, 41, 15);
            b5.addActionListener(this);
            painel.add(b5);

            b6 = new JButton("-"); // TAP MT-3
            b6.setBounds(425, 260, 41, 15);
            b6.addActionListener(this);
            painel.add(b6);

            tap2 = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA T3
            tap2.setForeground(Color.blue);
            tap2.setBounds(375, 385, 60, 30);
            painel.add(tap2);

            valortap2 = new JLabel(eqp.getMostrarTapsmt1()); // VALOR TAP MT-3
            valortap2.setForeground(Color.blue);
            valortap2.setBounds(432, 270, 60, 30);
            painel.add(valortap2);

            trafo2 = new JLabel("Desenergizado"); // CONDI��O DO TRANSFORMADOR
            trafo2.setForeground(Color.blue);
            trafo2.setBounds(300, 202, 100, 30);
            painel.add(trafo2);

            c.add(painel, java.awt.BorderLayout.CENTER);

            // ���������������������������������������� CRIA��O DO BOT�O 89 MT-4A

            b7 = new JButton(); // BOT�O CS 89 MT-4A
            b7.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b7.addActionListener(this);
            b7.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b7.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b7.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b7.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b7.setForeground(Color.black);// cor do titulo do bot�o
            b7.setEnabled(true);
            b7.setToolTipText("Pressione para operar a Seccionadora 89 MT-4A");
            b7.setMnemonic(KeyEvent.VK_B);
            b7.setActionCommand("89MT4A");// define o nome da acao
            b7.setBounds(180, 62, 33, 45);
            painel.add(b7);

            // ���������������������������������������� CRIA��O DO BOT�O 52 MT-4

            b8 = new JButton(); // BOT�O DJ 52 MT-4
            b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b8.addActionListener(this);
            b8.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b8.setMnemonic(KeyEvent.VK_C);
            b8.setToolTipText("Pressione para operar o Disjuntor 52 MT-4");
            b8.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b8.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
            b8.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b8.setBounds(225, 145, 33, 42);
            painel.add(b8);

            // ��������������������������������������� CRIA��O DO BOT�O 89 MT-4B

            b9 = new JButton();
            b9.setIcon(new javax.swing.ImageIcon("Chave1.jpg")); // Bot�o 89 MT-RB
            b9.addActionListener(this);
            b9.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b9.setToolTipText("Pressione para operar a Seccionadora 89 MT-4B");
            b9.setHorizontalTextPosition(AbstractButton.CENTER);
            b9.setVerticalTextPosition(AbstractButton.CENTER);
            b9.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b9.setBounds(265, 62, 33, 45);
            painel.add(b9);

            // ��������������������������������������� CRIA��O DO BOT�O TRAFO MT-4

            b10 = new JButton(); // GIF TRANSFORMADOR MT-4
            b10.setIcon(new javax.swing.ImageIcon("MT-4desenergizado.GIF"));
            b10.addActionListener(this);
            b10.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-4");
            b10.setHorizontalTextPosition(AbstractButton.CENTER);
            b10.setVerticalTextPosition(AbstractButton.CENTER);
            b10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b10.setBounds(211, 228, 52, 45);
            painel.add(b10);

            // ��������������������������������������� CONTROLES DO TRAFO MT-4

            b11 = new JButton("+"); // TAP MT-4
            b11.setBounds(275, 240, 41, 15);
            b11.addActionListener(this);
            painel.add(b11);

            b12 = new JButton("-"); // TAP MT-4
            b12.setBounds(275, 260, 41, 15);
            b12.addActionListener(this);
            painel.add(b12);

            tap3 = new JLabel("0 Kv"); // VALOR DE TENS�O NA BARRA T4
            tap3.setForeground(Color.blue);
            tap3.setBounds(225, 385, 60, 25);
            painel.add(tap3);

            valortap3 = new JLabel(eqp.getMostrarTapsmt1()); // TAP MT-4
            valortap3.setForeground(Color.blue);
            valortap3.setBounds(280, 277, 40, 15);
            painel.add(valortap3);

            trafo3 = new JLabel("Desenergizado"); // CONDI��O DO TRANSFORMADOR
            trafo3.setForeground(Color.blue);
            trafo3.setBounds(150, 200, 100, 30);
            painel.add(trafo3);

            // ��������������������������������������� CRIA��O DO BOT�O SAIR

            b34 = new JButton("");
            b34.setIcon(new javax.swing.ImageIcon("Porta.jpg"));
            b34.addActionListener(this);
            b34.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b34.setToolTipText("Pressione para encerrar o programa");
            b34.setHorizontalTextPosition(AbstractButton.CENTER);
            b34.setVerticalTextPosition(AbstractButton.CENTER);
            b34.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b34.setBounds(350, 440, 32, 58);
            painel.add(b34);

            // ��������������������������������������� BOT�O SETA

            b40 = new JButton("");
            b40.setIcon(new javax.swing.ImageIcon("Seta.jpg"));
            b40.addActionListener(this);
            b40.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b40.setToolTipText("Pressione para retornar ao Menu das Telas MTS");
            b40.setHorizontalTextPosition(AbstractButton.CENTER);
            b40.setVerticalTextPosition(AbstractButton.CENTER);
            b40.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b40.setBounds(80, 240, 30, 30);
            painel.add(b40);

            // atualizaConfiguracao();
        }

        // -��������������������������������������������������������������
        public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
        {
            if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")
                    || tfPerfil.getText().equals("Usuario") || tfPerfil.getText().equals("usuario")
                    || tfPerfil.getText().equals("usuario")) {
                if (e.getSource() == b1)// ���������������������� AÇÃO DO BOTÃO DA CS 89 MT-3A �����
                {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 MT-3A?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mt3a().equals("Seccionadora Aberta")) {
                            b1.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mt3a();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 MT-3A";
                            operacao = "Seccionadora Fechada";
                            manobra = "Bay MT-3";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt3bFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mt3b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT3-B foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt3afechada = "Seccionadora 89MT-3A Fechada";
                            manobrainteligente.DesenerL1InterBarra();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        } else if (eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt3().equals("Disjuntor Aberto")
                                || eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                                || eqp.seccionadora89mt3b().equals("Seccionadora Aberta")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b1.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mt3a();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 MT-3A";
                            operacao = "Seccionadora Aberta";
                            manobra = "Bay MT-3";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt3bAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mt3b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora está 89 MT3-B foi Aberta
                            // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt3aaberta = "Seccionadora 89MT-3A Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-3 FECHADO! \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 MT-3A " + eqp.seccionadora89mt3a());
                }

                // ���������������������������������������� AÇAO DO BOTAO DO DJ 52 MT-3
                if (e.getSource() == b2) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado do Disjuntor 52 MT-3?",
                            "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.disjuntor52mt3().equals("Disjuntor Aberto")) // &&
                        // eqp.seccionadora89mt3a().equals("Seccionadora Fechada") &&
                        // eqp.disjuntor52l1().equals("Disjuntor Fechado"))
                        // eqp.seccionadora89mt3a().equals("Seccionadora Fechada") &&
                        // eqp.disjuntor52l1().equals("Disjuntor Fechado") &&
                        // eqp.disjuntor52mt3().equals("Disjuntor Aberto"))
                        {
                            eqp.fecharDisjuntor52mt3();
                            b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                            status2.setText(" Equipamento operado: " + "52 MT-3 " + eqp.disjuntor52mt3());

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Disjuntor 52 MT-3";
                            operacao = "Disjuntor Fechado";
                            manobra = "Bay MT-3";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento52mt4();

                            disjuntor52mt3fechado = "Disjuntor 52MT-3 Fechado";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            if (eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                                    && eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                                    || eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                                            && eqp.disjuntor52mt3().equals("Disjuntor Fechado")) {
                                // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-4 foi Fechado
                                // #TRANSFORMADOR ENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                                // javax.swing.ImageIcon("formiga.gif")));
                                eqp.ligarTransformadormt3();
                                b4.setIcon(new javax.swing.ImageIcon("MT-3energizado.gif"));
                                tap2.setText("" + eqp.getValorTapmt4());
                                trafo2.setText("       Energizado");
                            }

                        } else if (eqp.disjuntor52mt3().equals("Disjuntor Fechado") &&
                                eqp.seccionadora89mt3a().equals("Seccionadora Fechada") ||
                                eqp.seccionadora89mt3b().equals("Seccionadora Fechada") &&
                                        eqp.disjuntor52l1().equals("Disjuntor Fechado")
                                ||
                                eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                            eqp.abrirDisjuntor52mt3();
                            status2.setText(" Equipamento operado: " + "52 MT-3 " + eqp.disjuntor52mt3());
                            eqp.desligarTransformadormt3();
                            b4.setIcon(new javax.swing.ImageIcon("MT-3desenergizado.gif"));
                            tap2.setText("0 kV");
                            valortap2.setText(eqp.getMostrarTapsmt3());
                            trafo2.setText("Desenergizado");
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Disjuntor 52 MT-3";
                            operacao = "Disjuntor Aberto";
                            manobra = "Bay MT-3";
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao52mt1Fechado(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantAbertura52mt4();

                            disjuntor52mt3aberto = "Disjuntor 52MT-3 Aberto";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            // if (eqp.seccionadora89mtra().equals("Seccionadora Aberta") &&
                            // eqp.seccionadora89mtrb().equals("Seccionadora Aberta") &&
                            // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                            // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-R foi aberto
                            // #TRANSFORMADOR
                            // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    if (eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                            && eqp.seccionadora89mt3a().equals("Seccionadora Aberta")
                            && eqp.seccionadora89mt3b().equals("Seccionadora Aberta")) {
                        status2.setText(" Equipamento operado: " + "O TRANSFORMADOR MT-3 ESTÁ DESENERGIZADO");
                    }
                }

                // ���������������������������������������� AÇAO DO BOTAO DA CS 89 MT-3B
                if (e.getSource() == b3) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 MT-3B?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mt3b().equals("Seccionadora Aberta")) {
                            b3.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mt3b();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 MT-3B";
                            operacao = "Seccionadora Fechada";
                            manobra = "Bay MT-3";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt3bFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mt3b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT3-B foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt3bfechada = "Seccionadora 89MT-3B Fechada";
                            manobrainteligente.DesenerL1InterBarra();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        } else if (eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                                || eqp.disjuntor52mt3().equals("Disjuntor Aberto")
                                        && eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                                || eqp.seccionadora89mt3b().equals("Seccionadora Aberta")
                                || eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b3.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mt3b();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 MT-3B";
                            operacao = "Seccionadora Aberta";
                            manobra = "Bay MT-3";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt3bAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mt3b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora está 89 MT3-B foi Aberta
                            // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt3baberta = "Seccionadora 89MT-3B Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-3 FECHADO! \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 MT-3B " + eqp.seccionadora89mt3b());
                }

                // ������������������������������� AÇAO DOS BOTOES DE COMUTAÇAO DE TAP'S DO MT-3
                if (e.getSource() == b4) {
                    status2.setText(" O Transformador MT-3 está no Tap:" + eqp.getMostrarTapsmt3());
                    JOptionPane.showMessageDialog(null, "  O Transformador MT-3 esta no:  " + eqp.getMostrarTapsmt3(),
                            "Transformador", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("formiga.gif")));
                }

                if (e.getSource() == b5) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja Subir o Tap do Transformador MT-3?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmt3() == 8)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-3 esta no Tap Máximo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.aumentarTapmt3();
                        status2.setText(
                                " Equipamento operado: " + "O Transformador MT-3 está no:  " + eqp.getMostrarTapsmt3());
                        valortap2.setText(eqp.getMostrarTapsmt3());
                        if (eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                                || eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52mt3().equals("Disjuntor Fechado")) {
                            tap2.setText(eqp.getValorTapmt3());
                        }

                        String usuario = tfUsuario.getText();
                        String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-3";
                        operacao = "Tap Elevado";
                        manobra = "Bay MT-3";
                        BDE.ConectarBD();
                        BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        BDEQ.ConectarBD();
                        BDEQ.QuantAumentoTapmt3();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }

                if (e.getSource() == b6) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja Descer Tap do Transformador?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmt3() == 0)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-3 está no Tap Mínimo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.diminuirTapmt3();
                        status2.setText(
                                " Equipamento operado: " + "O Transformador MT-3 está no:  " + eqp.getMostrarTapsmt3());
                        valortap2.setText(eqp.getMostrarTapsmt3());
                        if (eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                                || eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52mt3().equals("Disjuntor Fechado")) {
                            tap2.setText(eqp.getValorTapmt3());
                        }

                        String usuario = tfUsuario.getText();
                        String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-3";
                        operacao = "Tap Diminuido";
                        manobra = "Bay MT-3";
                        BDE.ConectarBD();
                        BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        BDEQ.ConectarBD();
                        BDEQ.QuantDiminuirTapmt3();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Lógica de Intertravamento não Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }

                if (e.getSource() == b7)// ���������������������� AÇAO DO BOTÃO DA CS 89 MT-4A
                {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 MT-4A?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mt4a().equals("Seccionadora Aberta")) {
                            b7.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mt4a();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 MT-4A";
                            operacao = "Seccionadora Fechada";
                            manobra = "Bay MT-4";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt4aFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mt4a();

                            seccionadora89mt4afechada = "Seccionadora 89MT-4A Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        }

                        else if (eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt4().equals("Disjuntor Aberto")
                                || eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                                        && eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                                || eqp.seccionadora89mt4b().equals("Seccionadora Aberta")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b7.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mt4a();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 MT-4A";
                            operacao = "Seccionadora Aberta";
                            manobra = "Bay MT-4";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt4aAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89mt4a();

                            seccionadora89mt4aaberta = "Seccionadora 89MT-4A Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-4 FECHADO! \n",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89MT-4A " + eqp.seccionadora89mt4a());
                }

                // ���������������������������������������� AÇAO DO BOTAO DO DJ 52 MT-4
                if (e.getSource() == b8) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado do Disjuntor 52 MT-4?",
                            "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.disjuntor52mt4().equals("Disjuntor Aberto") &&
                                eqp.seccionadora89mt4b().equals("Seccionadora Fechada") &&
                                eqp.disjuntor52l1().equals("Disjuntor Fechado") ||
                                eqp.seccionadora89mt4b().equals("Seccionadora Fechada") &&
                                        eqp.disjuntor52l2().equals("Disjuntor Fechado") &&
                                        eqp.disjuntor52mt4().equals("Disjuntor Aberto")) {
                            eqp.fecharDisjuntor52mt4();
                            b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                            status2.setText(" Equipamento operado: " + "52 MT-4 " + eqp.disjuntor52mt4());

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Disjuntor 52 MT-4";
                            operacao = "Disjuntor Fechado";
                            manobra = "Bay MT-4";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento52mt4();

                            disjuntor52mt4fechado = "Disjuntor 52MT-4 Fechado";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            if (eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                                    && eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                                    || eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                                            && eqp.disjuntor52mt4().equals("Disjuntor Fechado")) {
                                // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-4 foi Fechado
                                // #TRANSFORMADOR ENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                                // javax.swing.ImageIcon("formiga.gif")));
                                eqp.ligarTransformadormt4();
                                b10.setIcon(new javax.swing.ImageIcon("MT-4energizado.gif"));
                                tap3.setText("" + eqp.getValorTapmt4());
                                trafo3.setText("       Energizado");
                            }

                        } else if (eqp.disjuntor52mt4().equals("Disjuntor Fechado") &&
                                eqp.seccionadora89mt4b().equals("Seccionadora Fechada") ||
                                eqp.seccionadora89mt4a().equals("Seccionadora Fechada") &&
                                        eqp.disjuntor52l2().equals("Disjuntor Fechado")
                                ||
                                eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                            eqp.abrirDisjuntor52mt4();
                            status2.setText(" Equipamento operado: " + "52 MT-4 " + eqp.disjuntor52mt4());
                            eqp.desligarTransformadormt4();
                            b10.setIcon(new javax.swing.ImageIcon("MT-4desenergizado.gif"));
                            tap3.setText("0 kV");
                            valortap3.setText(eqp.getMostrarTapsmt4());
                            trafo3.setText("Desenergizado");
                            // BDE.ConectarBD();
                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Disjuntor 52 MT-4";
                            operacao = "Disjuntor Aberto";
                            manobra = "Bay MT-4";
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao52mt1Fechado(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantAbertura52mt4();

                            disjuntor52mt4aberto = "Disjuntor 52MT-4 Aberto";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            // if (eqp.seccionadora89mtra().equals("Seccionadora Aberta") &&
                            // eqp.seccionadora89mtrb().equals("Seccionadora Aberta") &&
                            // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                            // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-R foi aberto
                            // #TRANSFORMADOR
                            // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    if (eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                            && eqp.seccionadora89mt4b().equals("Seccionadora Aberta")
                            && eqp.seccionadora89mt4a().equals("Seccionadora Aberta")) {
                        status2.setText(" Equipamento operado: " + "O TRANSFORMADOR MT-4 ESTÁ DESENERGIZADO");
                    }
                }

                // ���������������������������������������� AÇAO DO BOTÃO DA CS 89 MT-4B
                if (e.getSource() == b9) {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 MT-4B?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89mt4b().equals("Seccionadora Aberta")) {
                            b9.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89mt4b();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 MT-4B";
                            operacao = "Seccionadora Fechada";
                            manobra = "Bay MT-4";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt4bFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89mt4b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MTR-B foi Fechada com
                            // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));

                            seccionadora89mt4bfechada = "Seccionadora 89MT-4B Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        } else if (eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt4().equals("Disjuntor Aberto")
                                && eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                                || eqp.seccionadora89mt4a().equals("Seccionadora Aberta")
                                || eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                                        && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                            b9.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89mt4b();

                            // String usuario = tfUsuario.getText();
                            // String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 MT-4B";
                            operacao = "Seccionadora Aberta";
                            manobra = "Bay MT-4";

                            // BDE.ConectarBD();
                            // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89mt4bAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantAbertura89mt4b();
                            // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 MTR-B foi Aberta
                            // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                            // seccionadora89mt4baberta = "Seccionadora 89MT-4B Aberta";

                            seccionadora89mt4baberta = "Seccionadora 89MT-4B Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 MT-4 FECHADO! \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    status2.setText(" Equipamento operado: " + "89 MT-4B " + eqp.seccionadora89mt4b());
                }

                // ������������������������������� AÇAO DOS BOTOES DE COMUTAÇAO DE TAP'S DO MT-4
                if (e.getSource() == b10) {
                    status2.setText(" O Transformador MT-4 esta no Tap:" + eqp.getMostrarTapsmt4());
                    JOptionPane.showMessageDialog(null, "  O Transformador MT-4 esta no:  " + eqp.getMostrarTapsmt4(),
                            "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                }

                if (e.getSource() == b11) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja Subir o Tap do Transformador MT-4?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmtr() == 8)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-4 esta no Tap Maximo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.aumentarTapmt4();
                        status2.setText(" O Transformador MT-4 esta no:  " + eqp.getMostrarTapsmt4());
                        valortap3.setText(eqp.getMostrarTapsmt4());

                        if (eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                                || eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52mt4().equals("Disjuntor Fechado")) {
                            tap3.setText(eqp.getValorTapmt4());
                        }

                        // String usuario = tfUsuario.getText();
                        // String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-4";
                        operacao = "Tap Elevado";
                        manobra = "Bay MT-4";

                        BDE.ConectarBD();
                        BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        BDEQ.ConectarBD();
                        BDEQ.QuantAumentoTapmt4();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }

                if (e.getSource() == b12) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja Descer Tap do Transformador?",
                            "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.getTapsmt4() == 0)
                            JOptionPane.showMessageDialog(null, "O Transformador MT-4 está no Tap Mínimo!", "Tap",
                                    JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                        eqp.diminuirTapmt4();
                        status2.setText(" O Transformador MT-4 está no:  " + eqp.getMostrarTapsmt4());
                        valortap3.setText(eqp.getMostrarTapsmt4());

                        if (eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                                || eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                                        && eqp.disjuntor52mt4().equals("Disjuntor Fechado")) {
                            tap3.setText(eqp.getValorTapmt4());
                        }

                        // String usuario = tfUsuario.getText();
                        // String data = tfData.getText();
                        tagequipamento = "TAP TRAFO MT-4";
                        operacao = "Tap Diminuido";
                        manobra = "Bay MT-4";

                        BDE.ConectarBD();
                        BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                        BDEQ.ConectarBD();
                        BDEQ.QuantDiminuirTapmt4();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Lógica de Intertravamento não Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
            }

            if (e.getSource() == b34) // ----------- BOTAO SAIR ----------------//

            {
                new InterfaceMenu().setVisible(true);
                setVisible(false);
            }

            if (e.getSource() == b40) {
                new InterfaceMenu().setVisible(true);
                setVisible(false);
            }

            if (e.getSource() == b42) {
                if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")
                        || tfPerfil.getText().equals("Usuario") || tfPerfil.getText().equals("usuario")) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja utilizar a configuração operacional padrão da dos MT'S 3 e 4? ",
                            "Configuraçao", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION)
                        atualizaConfiguracao();
                }
            }
        }

        public void atualizaConfiguracao() {
            eqp.fecharSeccionadora89mt3a();
            eqp.fecharDisjuntor52mt3();
            eqp.fecharSeccionadora89mt4b();
            eqp.fecharDisjuntor52mt4();
            b1.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b9.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b4.setIcon(new javax.swing.ImageIcon("MT-3energizado.gif"));
            b10.setIcon(new javax.swing.ImageIcon("MT-4energizado.gif"));
        }
    }

    // ################################################### CLASSE INTERFACE ALUNORTE

    public class InterfaceAlunorte extends JFrame implements ActionListener {
        JLabel Alarmes, gif1, tensao;

        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22,
                b23, b24, b25;
        JButton b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46,
                b47, b48;

        ImageIcon icone = new ImageIcon("");
        JPanel painel;

        public InterfaceAlunorte() {
            Container c = getContentPane();
            c.setLayout(new BorderLayout()); // gerenciador de layout

            setTitle(" Bay da Alunorte ");
            setSize(820, 560);
            c.setBackground(new Color(0, 128, 128));
            // setLocation(100, 50);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(null,
                    "Você deseja habilitar alguma manobra para Simulação? ",
                    "Habilitar", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                MenuManobrasG MM = new MenuManobrasG();
                MM.setVisible(true);
            }

            JLabel l1 = new JLabel();
            l1.setFont(new Font("ARIAL", 1, 30));
            l1.setText(" BARRAMENTO DE 230 KV ");
            l1.setForeground(Color.blue);

            Icon imagem1 = new ImageIcon("Carlos4.GIF");
            gif1 = new JLabel();
            gif1.setIcon(imagem1);
            gif1.setBackground(new Color(0, 128, 128)); // cor de fundo do bot�o
            gif1.setBounds(750, 440, 100, 100); // Coluna,Linha,Largura,Altura
            getContentPane().add(gif1);

            // -���������������������������-CRIAÇÃO DO PANEL E ADIÇÃO NO CONTAINER

            painel = new JPanel();
            painel.setLayout(null);
            painel.setBackground(new Color(0, 128, 128));
            painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            JPanel p1 = new JPanel();
            p1.setBackground(new Color(02, 128, 128));
            p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            p1.add(l1);
            c.add(p1, java.awt.BorderLayout.NORTH);

            b42 = new JButton("");
            b42.setIcon(new javax.swing.ImageIcon("telecomando.jpg"));
            b42.addActionListener(this);
            b42.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b42.setToolTipText("Pressione para energizar na configuração padrão");
            b42.setHorizontalTextPosition(AbstractButton.CENTER);
            b42.setVerticalTextPosition(AbstractButton.CENTER);
            b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b42.setBounds(2, 0, 50, 50);
            painel.add(b42);

            // ���������������������������������������������� BARRAS A E B
            JPanel v = new JPanel(); // Barra A
            v.setBounds(400, 5, 400, 3);
            v.setBackground(Color.red);
            painel.add(v);

            JPanel v1 = new JPanel(); // Barra B
            v1.setBounds(400, 30, 400, 3);
            v1.setBackground(Color.red);
            painel.add(v1);

            barra1 = new JLabel("A"); // IDENTIFICAC�O DA BARRA A
            barra1.setForeground(Color.blue);
            barra1.setBounds(400, 0, 60, 30);
            painel.add(barra1);

            barra2 = new JLabel("B");
            barra2.setForeground(Color.blue);
            barra2.setBounds(400, 25, 60, 30); // IDENTIFICACAO DA BARRA B
            painel.add(barra2);

            // ##################################### IDENTIFICACAO DOS EQUIPAMENTOS
            l1a = new JLabel("89 AL-A");
            l1a.setForeground(Color.blue);
            l1a.setBounds(510, 40, 60, 30);
            painel.add(l1a);
            l1b = new JLabel("89 AL-B");
            l1b.setForeground(Color.blue);
            l1b.setBounds(595, 40, 60, 30);
            painel.add(l1b);
            l189 = new JLabel("89 AL");
            l189.setForeground(Color.blue);
            l189.setBounds(570, 215, 60, 30);
            painel.add(l189);
            l157 = new JLabel("57 AL");
            l157.setForeground(Color.blue);
            l157.setBounds(510, 280, 60, 30);
            painel.add(l157);
            l1 = new JLabel("Alimentação 230 Kv");
            l1.setForeground(Color.blue);
            l1.setBounds(502, 342, 150, 30);
            painel.add(l1);
            l1 = new JLabel("ALUNORTE");
            l1.setForeground(Color.blue);
            l1.setBounds(528, 355, 150, 30);
            painel.add(l1);
            l2a = new JLabel("89 BP-A");
            l2a.setForeground(Color.blue);
            l2a.setBounds(660, 40, 60, 30);
            painel.add(l2a);
            l2b = new JLabel("89 BP-B");
            l2b.setForeground(Color.blue);
            l2b.setBounds(743, 40, 60, 30);
            painel.add(l2b);

            l152 = new JLabel("52 AL");
            l152.setForeground(Color.blue);
            l152.setBounds(570, 150, 60, 30);
            painel.add(l152);

            tensao = new JLabel("Tensao de Linha:0 kV");
            tensao.setForeground(Color.blue);
            tensao.setBounds(665, 5, 200, 30);
            painel.add(tensao);
            subir = new JLabel("Sair");
            subir.setForeground(Color.blue);
            subir.setBounds(395, 429, 32, 40);
            painel.add(subir);

            // ������������������������������������������� BAY DA LINHA AL

            JPanel v22 = new JPanel(); // SECCIONADORA 89 AL-A
            v22.setBounds(505, 8, 3, 55);
            v22.setBackground(Color.red);
            painel.add(v22);

            JPanel v23 = new JPanel();
            v23.setBounds(505, 103, 3, 23); // Seccionadora 89 AL-A / Disjuntor
            v23.setBackground(Color.red);
            painel.add(v23);

            JPanel v24 = new JPanel(); // Seccionadora 89 AL-B
            v24.setBounds(590, 30, 3, 33);
            v24.setBackground(Color.red);
            painel.add(v24);

            JPanel v25 = new JPanel(); // SECCIONADORA 89 L1-A / DISJUNTOR 52 AL
            v25.setBounds(590, 103, 3, 23);
            v25.setBackground(Color.red);
            painel.add(v25);

            JPanel v26 = new JPanel(); // DISJUNTOR / SECCIONADORA 89 AL-A
            v26.setBounds(550, 185, 3, 23);
            v26.setBackground(Color.red);
            painel.add(v26);

            JPanel v27 = new JPanel(); // SECCIONADORA AL-A / SECCIONADORA AL-B
            v27.setBounds(505, 125, 88, 3);
            v27.setBackground(Color.red);
            painel.add(v27);

            JPanel v28 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v28.setBounds(550, 126, 3, 20);
            v28.setBackground(Color.red);
            painel.add(v28);

            JPanel v48 = new JPanel();
            v48.setBounds(550, 252, 3, 88); // Seccionadora 89 AL / Alimentador AL
            v48.setBackground(Color.red);
            painel.add(v48);

            JPanel v66 = new JPanel(); // SETA
            v66.setBounds(546, 338, 11, 5);
            v66.setBackground(Color.red);
            painel.add(v66);

            JPanel v67 = new JPanel(); // SETA
            v67.setBounds(547, 343, 9, 4);
            v67.setBackground(Color.red);
            painel.add(v67);

            JPanel v68 = new JPanel(); // SETA
            v68.setBounds(548, 346, 7, 3);
            v68.setBackground(Color.red);
            painel.add(v68);

            JPanel v69 = new JPanel(); // SETA
            v69.setBounds(549, 349, 5, 2);
            v69.setBackground(Color.red);
            painel.add(v69);

            JPanel v70 = new JPanel(); // SETA
            v70.setBounds(550, 351, 3, 2);
            v70.setBackground(Color.red);
            painel.add(v70);

            JPanel v49 = new JPanel(); // SECCIONADORA 57 AL-A / SECCIONADORA 89 AL
            v49.setBounds(490, 256, 60, 3);
            v49.setBackground(Color.red);
            painel.add(v49);

            JPanel v50 = new JPanel(); // SECCIONADORA 57 AL-A / SECCIONADORA 89 AL
            v50.setBounds(490, 256, 3, 20);
            v50.setBackground(Color.red);
            painel.add(v50);

            JPanel v51 = new JPanel(); // SECCIONADORA 57 AL / ATERRAMENTO
            v51.setBounds(490, 316, 3, 20);
            v51.setBackground(Color.red);
            painel.add(v51);

            JPanel v56 = new JPanel(); // ATERRAMENTO
            v56.setBounds(484, 335, 15, 1);
            v56.setBackground(Color.red);
            painel.add(v56);

            JPanel v57 = new JPanel(); // ATERRAMENTO
            v57.setBounds(486, 337, 12, 1);
            v57.setBackground(Color.red);
            painel.add(v57);

            JPanel v58 = new JPanel(); // ATERRAMENTO
            v58.setBounds(488, 339, 9, 1);
            v58.setBackground(Color.red);
            painel.add(v58);

            JPanel v59 = new JPanel(); // ATERRAMENTO
            v59.setBounds(490, 341, 6, 1);
            v59.setBackground(Color.red);
            painel.add(v59);

            JPanel v60 = new JPanel(); // ATERRAMENTO
            v60.setBounds(492, 343, 3, 1);
            v60.setBackground(Color.red);
            painel.add(v60);

            // ���������������������������������������� BAY DA SECCIONADORA 89 AL

            JPanel v29 = new JPanel(); // SECCIONADORA 89 AL-A
            v29.setBounds(655, 8, 3, 55);
            v29.setBackground(Color.red);
            painel.add(v29);

            JPanel v30 = new JPanel();
            v30.setBounds(655, 103, 3, 23); // Seccionadora 89 AL-A / Disjuntor
            v30.setBackground(Color.red);
            painel.add(v30);

            JPanel v31 = new JPanel(); // Seccionadora 89 AL-B
            v31.setBounds(740, 30, 3, 33);
            v31.setBackground(Color.red);
            painel.add(v31);

            JPanel v32 = new JPanel(); // SECCIONADORA 89 AL-A / DISJUNTOR 52 AL
            v32.setBounds(740, 103, 3, 23);
            v32.setBackground(Color.red);
            painel.add(v32);

            JPanel v34 = new JPanel(); // SECCIONADORA AL-A / SECCIONADORA AL-B
            v34.setBounds(655, 125, 88, 3);
            v34.setBackground(Color.red);
            painel.add(v34);

            JPanel v52 = new JPanel(); // SECCIONADORA 89 AL / ALIMENTADOR
            v52.setBounds(701, 126, 3, 133);
            v52.setBackground(Color.red);
            painel.add(v52);

            JPanel v53 = new JPanel(); // SECCIONADORA AL-A / SECCIONADORA AL-B
            v53.setBounds(552, 256, 150, 3);
            v53.setBackground(Color.red);
            painel.add(v53);

            // ����������������������������������� CRIAÇÃO DO BOTÃO 89 AL-A

            b19 = new JButton(); // BOTAO CS 89 AL-A
            b19.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b19.addActionListener(this);
            b19.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b19.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b19.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b19.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b19.setForeground(Color.black);// cor do titulo do bot�o
            b19.setEnabled(true);
            b19.setToolTipText("Pressione para operar a Seccionadora 89 AL-A");
            b19.setMnemonic(KeyEvent.VK_B);
            b19.setActionCommand("89ALA");// define o nome da acao
            b19.setBounds(490, 62, 33, 45);
            painel.add(b19);

            // ����������������������������������� CRIAÇÃO DO BOTÃO 89 AL-B

            b20 = new JButton(); // BOTAO CS 89 AL-B
            b20.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b20.addActionListener(this);
            b20.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b20.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b20.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b20.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b20.setForeground(Color.black);// cor do titulo do bot�o
            b20.setEnabled(true);
            b20.setToolTipText("Pressione para operar a Seccionadora 89 AL-B");
            b20.setMnemonic(KeyEvent.VK_B);
            b20.setActionCommand("89ALB");// define o nome da acao
            b20.setBounds(575, 62, 33, 45);
            painel.add(b20);

            // ����������������������������������� CRIAÇÃO DO BOTÃO 52 AL

            b21 = new JButton(); // BOTAO 52 AL
            b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b21.addActionListener(this);
            b21.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b21.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b21.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b21.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b21.setForeground(Color.black);// cor do titulo do bot�o
            b21.setEnabled(true);
            b21.setToolTipText("Pressione para operar O Disjuntor 52 AL");
            b21.setMnemonic(KeyEvent.VK_B);
            b21.setActionCommand("52AL");// define o nome da acao
            b21.setBounds(535, 145, 33, 42);
            painel.add(b21);

            // ����������������������������������� CRIAÇÃO DO BOTÃO 89 AL

            b22 = new JButton(); // BOTÃO CS 89 AL
            b22.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b22.addActionListener(this);
            b22.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b22.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b22.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b22.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b22.setForeground(Color.black);// cor do titulo do bot�o
            b22.setEnabled(true);
            b22.setToolTipText("Pressione para operar a Seccionadora 89 AL");
            b22.setMnemonic(KeyEvent.VK_B);
            b22.setActionCommand("89AL");// define o nome da acao
            b22.setBounds(535, 208, 33, 45);
            painel.add(b22);

            // ����������������������������������� CRIAÇAO DO BOTAO 57 AL

            b23 = new JButton(); // BOT�O CS 57 L1
            b23.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b23.setHorizontalTextPosition(AbstractButton.CENTER); // posicao do texto
            b23.setVerticalTextPosition(AbstractButton.CENTER); // posi��o do texto
            b23.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b23.setBackground(new Color(192, 192, 192)); // cor de fundo do bot�o
            b23.setBounds(475, 276, 33, 45);
            painel.add(b23);

            // ����������������������������������� CRIAÇÃO DO BOTÃO 89 BPA

            b24 = new JButton(); // BOTAO CS 89 BP-A
            b24.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b24.addActionListener(this);
            b24.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b24.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b24.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b24.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b24.setForeground(Color.black);// cor do titulo do bot�o
            b24.setEnabled(true);
            b24.setToolTipText("Pressione para operar a Seccionadora 89 BP-A");
            b24.setMnemonic(KeyEvent.VK_B);
            b24.setActionCommand("89BPA");// define o nome da acao
            b24.setBounds(640, 62, 33, 45);
            painel.add(b24);

            // ����������������������������������� CRIAÇÃO DO BOTÃO 89 BP-B

            b25 = new JButton(); // BOTÃO CS 89 BP-B
            b25.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
            b25.addActionListener(this);
            b25.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b25.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b25.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b25.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b25.setForeground(Color.black);// cor do titulo do bot�o
            b25.setEnabled(true);
            b25.setToolTipText("Pressione para operar a Seccionadora 89 BP-B");
            b25.setMnemonic(KeyEvent.VK_B);
            b25.setActionCommand("89BPB");// define o nome da acao
            b25.setBounds(725, 62, 33, 45);
            painel.add(b25);

            // ��������������������������������������� CRIAÇãO DO BOTÃO SAIR

            b34 = new JButton("");
            b34.setIcon(new javax.swing.ImageIcon("Porta.jpg"));
            b34.addActionListener(this);
            b34.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b34.setToolTipText("Pressione para encerrar o programa");
            b34.setHorizontalTextPosition(AbstractButton.CENTER);
            b34.setVerticalTextPosition(AbstractButton.CENTER);
            b34.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b34.setBounds(390, 399, 32, 58); // coluna, linha, altura, largura
            painel.add(b34);

            // ��������������������������������������� BOTAO SETA

            b40 = new JButton("");
            b40.setIcon(new javax.swing.ImageIcon("Seta.jpg"));
            b40.addActionListener(this);
            b40.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
            b40.setToolTipText("Pressione para retornar ao Menu das Telas de Telecomando");
            b40.setHorizontalTextPosition(AbstractButton.CENTER);
            b40.setVerticalTextPosition(AbstractButton.CENTER);
            b40.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b40.setBounds(80, 240, 30, 30);
            painel.add(b40);

            c.add(painel, java.awt.BorderLayout.CENTER);
            // setDefaultOpenOperation(javax.swing.WindowConstants.AlwaysOnTop);
            // atualizaConfiguracao();
        }

        // -��������������������������������������������������������������
        public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
        {
            if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")
                    || tfPerfil.getText().equals("Usuario") || tfPerfil.getText().equals("usuario")
                    || tfPerfil.getText().equals("usuario")) {

                if (e.getSource() == b19)// ���������������������� AÇAO DO BOTAO DA CS 89 AL-A
                {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 AL-A?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89ala().equals("Seccionadora Aberta")) {
                            b19.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89ala();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 AL-A";
                            operacao = "Seccionadora Fechada";
                            manobra = "Bay AL-A";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89ala();

                            seccionadora89alafechada = "Seccionadora 89AL-A Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        }

                        else if (eqp.seccionadora89ala().equals("Seccionadora Fechada")
                                && eqp.disjuntor52al().equals("Disjuntor Aberto")
                                || eqp.seccionadora89alb().equals("Seccionadora Aberta"))
                        // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                        {
                            b19.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89ala();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 AL-A";
                            operacao = "Seccionadora Aberta";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89ala();
                            seccionadora89alaaberta = "Seccionadora 89AL-A Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                        status2.setText(" Equipamento operado: " + "89AL-A " + eqp.seccionadora89ala());
                    }
                }

                // ���������������������������������������� AÇAO DO BOTAO DO DJ 52 AL
                if (e.getSource() == b21) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado do Disjuntor 52 AL?",
                            "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.disjuntor52al().equals("Disjuntor Aberto")) // &&
                                                                            // eqp.seccionadora89mt4b().equals("Seccionadora
                                                                            // Fechada") &&
                                                                            // eqp.disjuntor52l1().equals("Disjuntor
                                                                            // Fechado") ||
                                                                            // eqp.seccionadora89mt4b().equals("Seccionadora
                                                                            // Fechada") &&
                                                                            // eqp.disjuntor52l2().equals("Disjuntor
                                                                            // Fechado") &&
                                                                            // eqp.disjuntor52mt4().equals("Disjuntor
                                                                            // Aberto"))
                        {
                            eqp.fecharDisjuntor52al();
                            b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                            status2.setText(" Equipamento operado: " + "52 AL " + eqp.disjuntor52al());
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Disjuntor 52 AL";
                            operacao = "Disjuntor Fechado";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento52al();
                            disjuntor52alfechado = "Disjuntor 52AL Fechado";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        } else if (eqp.disjuntor52al().equals("Disjuntor Fechado")) // &&
                                                                                    // eqp.seccionadora89mtra().equals("Seccionadora
                                                                                    // Fechada") ||
                                                                                    // eqp.seccionadora89mtrb().equals("Seccionadora
                                                                                    // Fechada") &&
                                                                                    // eqp.disjuntor52l1().equals("Disjuntor
                                                                                    // Fechado") ||
                                                                                    // eqp.disjuntor52l2().equals("Disjuntor
                                                                                    // Fechado"))
                        {
                            b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                            eqp.abrirDisjuntor52al();
                            status2.setText(" Equipamento operado: " + "52 AL " + eqp.disjuntor52al());
                            // eqp.desligarTransformadormt4();
                            // b21.setIcon(new javax.swing.ImageIcon("MT-4desenergizado.gif"));
                            // tap3.setText("0 kV");
                            // valortap3.setText(eqp.getMostrarTapsmt4());
                            // trafo3.setText("Desenergizado");
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Disjuntor 52 AL";
                            operacao = "Disjuntor Aberto";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao52alFechado(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantAbertura52al();
                            disjuntor52alaberto = "Disjuntor 52AL Aberto";
                            manobrainteligente.EnerAlbras();
                            manobrainteligente.DesenAlbras();
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                            // if (eqp.seccionadora89mtra().equals("Seccionadora Aberta") &&
                            // eqp.seccionadora89mtrb().equals("Seccionadora Aberta") &&
                            // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                            // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-R foi aberto
                            // #TRANSFORMADOR
                            // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                            // javax.swing.ImageIcon("formiga.gif")));
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                    }
                    if (eqp.disjuntor52al().equals("Disjuntor Fechado")
                            && eqp.seccionadora89alb().equals("Seccionadora Aberta")
                            && eqp.seccionadora89ala().equals("Seccionadora Aberta")) {
                        status2.setText(" Equipamento operado: " + "O Bay AL ESTÁ DESENERGIZADO");
                    }
                }

                // ���������������������������������������� AÇAO DO BOTAO DA CS 89 AL-B
                if (e.getSource() == b20) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 AL-B?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89alb().equals("Seccionadora Aberta")) {
                            b20.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89alb();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 AL-B";
                            operacao = "Seccionadora Fechada";
                            manobra = "Bay AL-B";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89ala();

                            seccionadora89albfechada = "Seccionadora 89AL-B Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        }

                        else if (eqp.seccionadora89alb().equals("Seccionadora Fechada")
                                && eqp.disjuntor52al().equals("Disjuntor Aberto")
                                || eqp.seccionadora89ala().equals("Seccionadora Aberta"))
                        // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                        {
                            b20.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89alb();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 AL-B";
                            operacao = "Seccionadora Aberta";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89ala();
                            seccionadora89albaberta = "Seccionadora 89AL-B Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                        status2.setText(" Equipamento operado: " + "89 AL-B " + eqp.seccionadora89alb());
                    }
                }

                // ���������������������������������������� AÇAO DO BOTAO DA CS 89 AL
                if (e.getSource() == b22) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 AL?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89al().equals("Seccionadora Aberta")
                                && eqp.disjuntor52al().equals("Disjuntor Aberto")) {
                            b22.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89al();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 AL";
                            operacao = "Seccionadora Fechada";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89ala();

                            seccionadora89alfechada = "Seccionadora 89AL Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        }

                        else if (eqp.seccionadora89al().equals("Seccionadora Fechada")
                                && eqp.disjuntor52al().equals("Disjuntor Aberto")
                                && eqp.seccionadora89ala().equals("Seccionadora Aberta")
                                && eqp.seccionadora89alb().equals("Seccionadora Aberta"))
                        // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                        {
                            b22.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89al();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 AL-B";
                            operacao = "Seccionadora Aberta";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89ala();
                            seccionadora89alaberta = "Seccionadora 89AL Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                        status2.setText(" Equipamento operado: " + "89 AL " + eqp.seccionadora89al());
                    }
                }

                if (e.getSource() == b24)// ���������������������� AÇÃO DO BOTÃO DA CS 89 BP-A
                {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 BPA?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89bpa().equals("Seccionadora Aberta")) {
                            b24.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89bpa();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 BPA";
                            operacao = "Seccionadora Fechada";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89ala();

                            seccionadora89bpafechada = "Seccionadora 89BPA Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        }

                        else if (eqp.seccionadora89bpa().equals("Seccionadora Fechada")
                                && eqp.disjuntor52al().equals("Disjuntor Aberto")
                                || eqp.seccionadora89bpb().equals("Seccionadora Aberta")
                                || eqp.seccionadora89al().equals("Seccionadora Aberta"))
                        // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                        {
                            b24.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89bpa();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 BP-A";
                            operacao = "Seccionadora Aberta";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89ala();
                            seccionadora89bpaaberta = "Seccionadora 89BP-A Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                        status2.setText(" Equipamento operado: " + "BP-A " + eqp.seccionadora89bpa());
                    }
                }

                // ���������������������������������������� AÇAO DO BOTAO DA CS 89 BP-B
                if (e.getSource() == b25) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Você realmente deseja alterar o estado da Seccionadora 89 BPB?",
                            "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION) {
                        if (eqp.seccionadora89bpb().equals("Seccionadora Aberta")) {
                            b25.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                            eqp.fecharSeccionadora89bpb();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 BPB";
                            operacao = "Seccionadora Fechada";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaFechada(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.QuantFechamento89ala();

                            seccionadora89bpbfechada = "Seccionadora 89BP-B Fechada";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();

                        }

                        else if (eqp.seccionadora89bpb().equals("Seccionadora Fechada")
                                && eqp.disjuntor52al().equals("Disjuntor Aberto")
                                || eqp.seccionadora89bpa().equals("Seccionadora Aberta")
                                || eqp.seccionadora89al().equals("Seccionadora Aberta"))
                        // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                        {
                            b25.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                            eqp.abrirSeccionadora89bpb();
                            BDE.ConectarBD();
                            String usuario = tfUsuario.getText();
                            String data = tfData.getText();
                            tagequipamento = "Seccionadora 89 BP-B";
                            operacao = "Seccionadora Aberta";
                            manobra = "Bay AL";
                            BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                            // BDO.ConectarBD();
                            // BDO.operaçao89alaAberta(data);
                            // BDEQ.ConectarBD();
                            // BDEQ.quantAbertura89ala();
                            seccionadora89bpbaberta = "Seccionadora 89BP-B Aberta";
                            manobrainteligente.EnerL1();
                            manobrainteligente.EnerL1InterBarra();
                            manobrainteligente.EnerMT1BarraA();
                            manobrainteligente.EnerMTRBarraA();
                            manobrainteligente.EnerMT3BarraA();
                            manobrainteligente.DesenMT1BarraA();
                            manobrainteligente.DesenMTRBarraA();
                            manobrainteligente.DesenMT2BarraB();
                            manobrainteligente.DesenMT3BarraA();
                            manobrainteligente.DesenerL1();
                            manobrainteligente.DesenerL1InterBarra();

                            manobrainteligente.EnerL2();
                            manobrainteligente.EnerL2InterBarra();
                            manobrainteligente.EnerMT2BarraB();
                            manobrainteligente.EnerMT4BarraB();
                            manobrainteligente.DesenMT4BarraB();
                            manobrainteligente.DesenerL2();
                            manobrainteligente.DesenerL2InterBarra();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                                    "Lógica", JOptionPane.INFORMATION_MESSAGE,
                                    (new javax.swing.ImageIcon("java1.jpg")));
                        }
                        status2.setText(" Equipamento operado: " + "BP-B " + eqp.seccionadora89bpb());
                    }
                }
            }

            if (e.getSource() == b34) // ----------- BOTAO SAIR ----------------//
            {
                new InterfaceMenu().setVisible(true);
                setVisible(false);
                // setVisible(false);
            }

            if (e.getSource() == b40) {
                new InterfaceMenu().setVisible(true);
                setVisible(false);
            }

            if (e.getSource() == b42) {
                if (tfPerfil.getText().equals("Administrador") || tfPerfil.getText().equals("administrador")
                        || tfPerfil.getText().equals("Usuario") || tfPerfil.getText().equals("usuario")) {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(this,
                            "Voce realmente deseja utilizar a configuração operacional padrão da Alunorte? ",
                            "Configuraçao", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                    if (n == JOptionPane.YES_OPTION)
                        atualizaConfiguracao();
                }
            }
        }

        public void atualizaConfiguracao() {
            eqp.fecharSeccionadora89ala();
            eqp.abrirDisjuntor52al();
            eqp.abrirSeccionadora89al();
            b19.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
            b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b22.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
        }
    }

    // ############################################## CLASSE MENU GERAL DAS MANOBRAS
    public class MenuManobrasG extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobrasG() // --- Configuraçao do Frame
        {
            super("Menu das Manobras");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout

            setSize(420, 300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(380, 150);
            // setVisible(true);

            JLabel lbIndice;

            JButton bManEletronorte;
            JButton bMan230;
            JButton bManReduçao;
            JButton bManTransferencia;
            JButton bManGeradores;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);

            projeto = new JLabel("Menu das Manobras", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 28));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbIndice = new JLabel("        Habilitar Classes de Manobras");
            lbIndice.setFont(new Font("Arial", 1, 20));
            lbIndice.setForeground(Color.black);
            lbIndice.setBounds(20, 70, 400, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbIndice);

            container.add(painel);

            bManEletronorte = new JButton("Manobras da ELETRONORTE"); // BOT�O TABELA DE EVENTOS
            bManEletronorte.setToolTipText("Pressione para chamar o Menu das Manobras da ELETRONORTE");
            bManEletronorte.setMnemonic(KeyEvent.VK_E);
            bManEletronorte.setActionCommand("ManobraEletronorte");// define o nome da acao
            bManEletronorte.setBounds(2, 110, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManEletronorte);

            bMan230 = new JButton("Manobras de 230 kV");
            bMan230.setToolTipText("Pressione para chamar o Menu das Manobras de 230 kV");
            bMan230.setMnemonic(KeyEvent.VK_2);
            bMan230.setActionCommand("Manobra230");// define o nome da acao
            bMan230.setBounds(202, 110, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bMan230);

            bManReduçao = new JButton("Manobras da Reduçao");
            bManReduçao.setToolTipText("Pressione para chamar o Menu das Manobras da Reduçao");
            bManReduçao.setMnemonic(KeyEvent.VK_R);
            bManReduçao.setActionCommand("Redução");// define o nome da acao
            bManReduçao.setBounds(2, 149, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManReduçao);

            bManTransferencia = new JButton("Manobras de Transferencia");
            bManTransferencia.setToolTipText("Pressione para chamar o Menu das Manobras de Transferencia");
            bManTransferencia.setMnemonic(KeyEvent.VK_T);
            bManTransferencia.setActionCommand("Transferencia");// define o nome da acao
            bManTransferencia.setBounds(202, 149, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManTransferencia);

            bManGeradores = new JButton("Manobras Geradores");
            bManGeradores.setToolTipText("Pressione para chamar o Menu das Manobras dos Geradores");
            bManGeradores.setMnemonic(KeyEvent.VK_G);
            bManGeradores.setActionCommand("Geradores");// define o nome da acao
            bManGeradores.setBounds(2, 189, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManGeradores);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_B);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(202, 189, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bSair);

            // bManEletronorte.setBackground(new Color(180,180,250));
            // bMan230.setBackground(new Color(180,180,250));
            // bManReduçao.setBackground(new Color(180,180,250));
            // bManTransferencia.setBackground(new Color(180,180,250));
            // bManGeradores.setBackground(new Color(180,180,250));
            // bSair.setBackground(new Color(180,180,250));

            container.add(painel);

            bManEletronorte.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MEActionPerformed(evt);
                }
            });

            bMan230.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    M2ActionPerformed(evt);
                }
            });

            bManTransferencia.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MTActionPerformed(evt);
                }
            });

            bManReduçao.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MRActionPerformed(evt);
                }
            });

            bManGeradores.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MAGActionPerformed(evt);
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    setVisible(false);
                }
            });
        }

        // --- Metodo que aglutina os eventos dos Bot�es
        public void actionPerformed(ActionEvent e) {
        }

        private void MEActionPerformed(ActionEvent evt) {
            new MenuManobrasELN().setVisible(true);
            setVisible(false);
            // this.hide();
        }

        private void M2ActionPerformed(ActionEvent evt) {
            new MenuManobras().setVisible(true);
            setVisible(false);
            // this.hide();
        }

        private void MRActionPerformed(ActionEvent evt) {
            new MenuManobrasReduçao().setVisible(true);
            setVisible(false);
            // this.hide();
        }

        private void MTActionPerformed(ActionEvent evt) {
            new MenuManobrasTransf().setVisible(true);
            setVisible(false);
            // this.hide();
        }

        private void MAGActionPerformed(ActionEvent evt) {
            new MenuManobrasGerador().setVisible(true);
            setVisible(false);
            // this.hide();
        }
    }

    // ################################################# CLASSE MENU MANOBRAS ######
    public class MenuManobras extends JFrame implements ActionListener {
        JLabel jLCodigo;
        JLabel jLTagEquipamento;
        JLabel jLUsuario;
        JLabel jLData;
        JLabel jLOperaçao;
        JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobras() // --- Configuraçao do Frame
        {
            super("Menu Manobras de 230 kV");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 630);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bEnerL1;
            JButton bEnerL2;
            JButton bEnerL1BarraA;
            JButton bEnerL2IntBarra;
            // JButton bEnerBayBT;
            JButton bEnerBayMT1;
            JButton bEnerBayMTR;
            JButton bEnerBayMT2;
            JButton bEnerBayMT3;
            JButton bEnerBayMT4;
            JButton bDesenL1;
            JButton bDesenL2;
            JButton bDesenBayMT1;
            JButton bDesenBayMTR;
            JButton bDesenBayMT2;
            JButton bDesenBayMT3;
            JButton bDesenBayMT4;
            JButton bDesenL1BarraA;
            JButton bDesenL2IntBarra;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);
            projeto = new JLabel(" Manobras de 230 kV", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras de 230 kV");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(170, 70, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bEnerL1 = new JButton(" Energizar Bay da Linha 1 "); // BOT�O TABELA DE EVENTOS
            bEnerL1.setToolTipText("Pressione para executar a manobra de energização da Linha 1");
            bEnerL1.setMnemonic(KeyEvent.VK_1);
            bEnerL1.setActionCommand("Manobras");// define o nome da acao
            bEnerL1.setBounds(2, 109, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerL1);

            bEnerL2 = new JButton(" Energizar Bay da Linha 2 "); // BOT�O TABELA DE EVENTOS
            bEnerL2.setToolTipText("Pressione para executar a manobra de energização da Linha 2");
            bEnerL2.setMnemonic(KeyEvent.VK_2);
            bEnerL2.setActionCommand("Manobras");// define o nome da acao
            bEnerL2.setBounds(306, 109, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerL2);

            bEnerL1BarraA = new JButton("Energizar Bay da Linha 1 e Barra 'A' "); // BOT�O TABELA DE EVENTOS
            bEnerL1BarraA.setToolTipText("Pressione para executar a manobra de energização da Linha 1 e Barra 'A'");
            bEnerL1BarraA.setMnemonic(KeyEvent.VK_1);
            bEnerL1BarraA.setActionCommand("Manobras");// define o nome da acao
            bEnerL1BarraA.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerL1BarraA);

            bEnerL2IntBarra = new JButton("Energizar Bay da Linha 2 e Barra 'B' "); // BOT�O TABELA DE EVENTOS
            bEnerL2IntBarra.setToolTipText("Pressione para executar a manobra de energização da Linha 2 e Barra 'B'");
            bEnerL2IntBarra.setMnemonic(KeyEvent.VK_2);
            bEnerL2IntBarra.setActionCommand("Manobras");// define o nome da acao
            bEnerL2IntBarra.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerL2IntBarra);

            bEnerBayMT1 = new JButton("Energizar Bay do Trafo MT-1 e Barra 'A'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMT1.setToolTipText("Pressione para executar a manobra de energização do Trafo MT-1 e Barra 'A'");
            bEnerBayMT1.setMnemonic(KeyEvent.VK_1);
            bEnerBayMT1.setActionCommand("Manobras");// define o nome da acao
            bEnerBayMT1.setBounds(2, 189, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMT1);

            bEnerBayMTR = new JButton("Energizar Bay do Trafo MT-R e Barra 'A'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMTR.setToolTipText("Pressione para executar a manobra de enrgizaçao do Trafo MT-R e Barra 'A'");
            bEnerBayMTR.setMnemonic(KeyEvent.VK_R);
            bEnerBayMTR.setActionCommand("Manobras");// define o nome da a��o
            bEnerBayMTR.setBounds(306, 189, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMTR);

            bEnerBayMT2 = new JButton("Energizar Bay do Trafo MT-2 e Barra 'B'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMT2.setToolTipText("Pressione para executar a manobra de energização do Trafo MT-2 e Barra 'B'");
            bEnerBayMT2.setMnemonic(KeyEvent.VK_2);
            bEnerBayMT2.setActionCommand("Manobras");// define o nome da acao
            bEnerBayMT2.setBounds(2, 229, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMT2);

            bEnerBayMT3 = new JButton("Energizar Bay do Trafo MT-3 e Barra 'A'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMT3.setToolTipText("Pressione para executar a manobra de enrgização do Trafo MT-3 e Barra 'A'");
            bEnerBayMT3.setMnemonic(KeyEvent.VK_3);
            bEnerBayMT3.setActionCommand("Manobras");// define o nome da acao
            bEnerBayMT3.setBounds(306, 229, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMT3);

            bEnerBayMT4 = new JButton("Energizar Bay do Trafo MT-4 e Barra 'B'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMT4.setToolTipText("Pressione para executar a manobra de energização do Trafo MT-4 e Barra 'B'");
            bEnerBayMT4.setMnemonic(KeyEvent.VK_4);
            bEnerBayMT4.setActionCommand("Manobras");// define o nome da acao
            bEnerBayMT4.setBounds(2, 269, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMT4);

            bDesenL1 = new JButton(" Desenergizar Bay da Linha 1 "); // BOT�O TABELA DE EVENTOS
            bDesenL1.setToolTipText("Pressione para executar a manobra de Desligamento do Bay da Linha 1");
            bDesenL1.setMnemonic(KeyEvent.VK_1);
            bDesenL1.setActionCommand("Manobras");// define o nome da acao
            bDesenL1.setBounds(306, 269, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenL1);

            bDesenL2 = new JButton(" Desenergizar Bay da Linha 2 "); // BOT�O TABELA DE EVENTOS
            bDesenL2.setToolTipText("Pressione para executar a manobra de Desligamento do Bay da Linha 2");
            bDesenL2.setMnemonic(KeyEvent.VK_2);
            bDesenL2.setActionCommand("Manobras");// define o nome da acao
            bDesenL2.setBounds(2, 309, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenL2);

            bDesenBayMT1 = new JButton(" Desenergizar Bay do Trafo MT-1 e Barra 'A' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMT1.setToolTipText("Pressione para executar a manobra de Desligamento do Bay do Trafo MT-1");
            bDesenBayMT1.setMnemonic(KeyEvent.VK_1);
            bDesenBayMT1.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMT1.setBounds(306, 309, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenBayMT1);

            bDesenBayMTR = new JButton(" Desenergizar Bay do Trafo MT-R e Barra 'A' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMTR.setToolTipText("Pressione para executar a manobra de Desligamento do Trafo MT-R");
            bDesenBayMTR.setMnemonic(KeyEvent.VK_3);
            bDesenBayMTR.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMTR.setBounds(2, 349, 304, 40);
            getContentPane().add(bDesenBayMTR);

            bDesenBayMT2 = new JButton(" Desenergizar Bay do Trafo MT-2 e Barra 'B' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMT2.setToolTipText("Pressione para executar a manobra de Desligamento do Bay do Trafo MT-2");
            bDesenBayMT2.setMnemonic(KeyEvent.VK_2);
            bDesenBayMT2.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMT2.setBounds(306, 349, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenBayMT2);

            bDesenBayMT3 = new JButton(" Desenergizar Bay do Trafo MT-3 e Barra 'A' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMT3.setToolTipText("Pressione para executar a manobra de Desligamento do Trafo MT-3");
            bDesenBayMT3.setMnemonic(KeyEvent.VK_3);
            bDesenBayMT3.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMT3.setBounds(2, 389, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenBayMT3);

            bDesenBayMT4 = new JButton(" Desenergizar Bay do Trafo MT-4 e Barra 'B' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMT4.setToolTipText("Pressione para executar a manobra de Desligamento do Trafo MT-4");
            bDesenBayMT4.setMnemonic(KeyEvent.VK_4);
            bDesenBayMT4.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMT4.setBounds(306, 389, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenBayMT4);

            bDesenL1BarraA = new JButton("Desenergizar Bay Linha 1 e Barra 'A'"); // BOT�O TABELA DE EVENTOS
            bDesenL1BarraA.setToolTipText("Pressione para executar a manobra de Desenergização da Linha 1 e Barra 'A'");
            bDesenL1BarraA.setMnemonic(KeyEvent.VK_1);
            bDesenL1BarraA.setActionCommand("Eventos");// define o nome da acao
            bDesenL1BarraA.setBounds(2, 429, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenL1BarraA);

            bDesenL2IntBarra = new JButton("Desenergizar Bay Linha 2 e Barra 'B'"); // BOT�O TABELA DE EVENTOS
            bDesenL2IntBarra
                    .setToolTipText("Pressione para executar a manobra de Desenergização da Linha 2 e Barra 'B'");
            bDesenL2IntBarra.setMnemonic(KeyEvent.VK_2);
            bDesenL2IntBarra.setActionCommand("Eventos");// define o nome da acao
            bDesenL2IntBarra.setBounds(306, 429, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenL2IntBarra);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 469, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione conferir a manobra Executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 509, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrao "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione conferir a manobra Padrão");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 509, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteudo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione para limpar a memória");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 549, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 549, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            // bEnerL1.setBackground(new Color(180,180,250));
            // bEnerL2.setBackground(new Color(180,180,250));
            // bEnerL1BarraA.setBackground(new Color(180,180,250));
            // bEnerBayBT.setBackground(new Color(180,180,250));
            // bEnerBayMT1.setBackground(new Color(180,180,250));
            // bEnerBayMT3.setBackground(new Color(180,180,250));
            // bDesenL1BarraA.setBackground(new Color(180,180,250));

            container.add(painel);

            bEnerL1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.EnerL1="EnergizarLinha1";
                        EnerL1 = "EnergizarLinha1";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para Energizar a linha 1");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para Energizar a linha 1 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerL2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.EnerL2="EnergizarLinha2";
                        EnerL2 = "EnergizarLinha2";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar linha 2");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para energizar linha 2 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerBayMT1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.EnerMT1BarraA="EnergizarMT1BarraA";
                    EnerMT1BarraA = "EnergizarMT1BarraA";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Bay do MT-1");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para energizar o Bay do MT-1 e Barra 'A' foi Habilitada com Sucesso!!!");
                }
            });

            bEnerBayMTR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.EnerMTRBarraA="EnergizarMTRBarraA";
                    EnerMTRBarraA = "EnergizarMTRBarraA";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Bay do MT-R");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para energizar o Bay do MT-R e Barra 'A' foi Habilitada com Sucesso!!!");
                }
            });

            bEnerBayMT2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.EnerMT2BarraB="EnergizarMT2BarraB";
                        EnerMT2BarraB = "EnergizarMT2BarraB";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Bay do MT-2");
                        JOptionPane.showMessageDialog(null,
                                "A manobras para energizar Bay do MT-2 e Barra 'B'  foi habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerBayMT3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.EnerMT3BarraA="EnergizarMT3BarraA";
                    EnerMT3BarraA = "EnergizarMT3BarraA";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Bay do MT-3");
                    JOptionPane.showMessageDialog(null,
                            "Manobra para energizar o Bay do MT-3 e Barra 'A' foi habilitada com Sucesso!!!");
                }
            });

            bEnerBayMT4.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnerMT4BarraB = "EnergizarMT4BarraB";
                        // manobrainteligente.EnerMT4BarraB="EnergizarMT4BarraB";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para energizar o Bay do MT-4");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para energizar o Bay do MT-4 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerL1BarraA.addActionListener(new ActionListener() // Açao do botao Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnerL1BarraA = "EnergizarLinha1BarraA";
                        // manobrainteligente.EnerL1BarraA="EnergizarLinha1BarraA";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para energizar a linha 1 e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para energizar a linha 1 e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerL2IntBarra.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnerL2IntBarra = "EnergizarLinha2IntBarra";
                        // manobrainteligente.EnerL2IntBarra="EnergizarLinha2IntBarra";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para energizar a linha 2 e Barra 'B'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para energizar a linha 2 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenL1.addActionListener(new ActionListener() // Açao do botao Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenL1 = "DesenergizarLinha1";
                        // manobrainteligente.DesenL1="DesenergizarLinha1";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar a Linha 1");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar a Linha 1 foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenL2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenL2 = "DesenergizarLinha2";
                        // manobrainteligente.DesenL2="DesenergizarLinha2";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para desenergizar a Linha 2");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar a Linha 2 foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMT1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMT1BarraA = "DesenergizarMT1BarraA";
                        // manobrainteligente.DesenMT1BarraA="DesenergizarMT1BarraA";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MT1 e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-1 e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMTR.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMTRBarraA = "DesenergizarMTRBarraA";
                        // manobrainteligente.DesenMTRBarraA="DesenergizarMTRBarraA";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MTR e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-R e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMT2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMT2BarraB = "DesenergizarMT2BarraB";
                        // manobrainteligente.DesenMT2BarraB="DesenergizarMT2BarraB";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MT2 e Barra 'B'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-2 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMT3.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMT3BarraA = "DesenergizarMT3BarraA";
                        // manobrainteligente.DesenMT3BarraA="DesenergizarMT3BarraA";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MT3 e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-3 e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMT4.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMT4BarraB = "DesenergizarMT4BarraB";
                        // manobrainteligente.DesenMT4BarraB="DesenergizarMT4BarraB";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MT4 e Barra 'B'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-4 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenL1BarraA.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenL1BarraA = "DesenergizarLinha1BarraA";
                        // manobrainteligente.DesenL1BarraA="DesenergizarLinha1BarraA";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: "
                                + "Manobra para desenergizar a Linha 1 e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar a Linha 1 e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenL2IntBarra.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenL2IntBarra = "DesenergizarLinha2IntBarra";
                        // manobrainteligente.DesenL2IntBarra="DesenergizarLinha2IntBarra";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: "
                                + "Manobra para desenergizar a Linha 2 e Barra 'B'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar a Linha 2 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ############################## CLASSE MENU DAS MANOBRAS DA ELETRONORTE
    public class MenuManobrasELN extends JFrame implements ActionListener {
        JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobrasELN() // --- Configura��o do Frame
        {
            super("Menu Manobras ELETRONORTE");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 377);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bDesenAlbras;
            JButton bEnerAlbras;
            JButton bPrepAlbras;
            JButton bEnerGerador;
            // JButton bOrdemManobra;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);
            projeto = new JLabel(" Manobras ELETRONORTE", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras da ELETRONORTE");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(120, 70, 400, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bDesenAlbras = new JButton("Desenergizar a SE ALBRAS - ELETRONORTE"); // BOT�O TABELA DE EVENTOS
            bDesenAlbras.setToolTipText("Pressione para executar a manobra para desenergizar a ALBRAS");
            bDesenAlbras.setMnemonic(KeyEvent.VK_1);
            bDesenAlbras.setActionCommand("Manobras");// define o nome da acao
            bDesenAlbras.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenAlbras);

            bEnerAlbras = new JButton("Energizar a SE ALBRAS - ELETRONORTE"); // BOT�O TABELA DE EVENTOS
            bEnerAlbras.setToolTipText("Pressione para executar a manobra para Energizar a ALBRAS pela ELETRONORTE");
            bEnerAlbras.setMnemonic(KeyEvent.VK_2);
            bEnerAlbras.setActionCommand("Manobras");// define o nome da acao
            bEnerAlbras.setBounds(306, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerAlbras);

            bPrepAlbras = new JButton("Preparação SE ALBRAS - Deslig. ELETRONORTE"); // BOT�O TABELA DE EVENTOS
            bPrepAlbras.setToolTipText("Pressione para executar a manobra de preparação da Subestação");
            bPrepAlbras.setMnemonic(KeyEvent.VK_1);
            bPrepAlbras.setActionCommand("Manobras");// define o nome da acao
            bPrepAlbras.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bPrepAlbras);

            bEnerGerador = new JButton("Energizar o Gerador "); // BOT�O TABELA DE EVENTOS
            bEnerGerador.setToolTipText("Pressione para executar a manobra de energizaçãoo do Gerador");
            bEnerGerador.setMnemonic(KeyEvent.VK_2);
            bEnerGerador.setActionCommand("Manobras");// define o nome da acao
            bEnerGerador.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerGerador);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 183, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione para conferir a manobra executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 218, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrão "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione para conferir a manobra Padrão");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 218, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteudo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione limpar a memoria");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 257, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 257, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            container.add(painel);

            bEnerAlbras.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.EnerAlbras="EnergizarAlbras";
                        EnerAlbras = "EnergizarAlbras";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para Energizar a SE ALBRAS");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para Energizar a SE ALBRAS foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenAlbras.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.DesenAlbras="DesenergizarAlbras";
                        DesenAlbras = "DesenergizarAlbras";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Desenergizar a SE ALBRAS");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para Desenergizar a SE ALBRAS foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bPrepAlbras.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.PrepAlbras="PrepAlbras";
                    PrepAlbras = "PrepAlbras";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: "
                            + " Manobra de preparaçao para energizaçao pelo Gerador");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para preparar a Subestação foi Habilitada com Sucesso!!!");
                }
            });

            bEnerGerador.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.EnerGerador="EnergizarGerador";
                    EnerGerador = "EnergizarGerador";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Gerador");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para energizar o o Gerador foi Habilitada com Sucesso!!!");
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ################################ CLASSE MENU DAS MANOBRAS DE TRANSFERÊNCIA
    public class MenuManobrasTransf extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobrasTransf() // --- Configura��o do Frame
        {
            super("Menu Manobras Transferência");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 456);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bTransfMT1MTR;
            JButton bTransfMTRMT1;
            JButton bTransfMT2MTR;
            JButton bTransfMTRMT2;
            JButton bTransfMT3MTR;
            JButton bTransfMTRMT3;
            JButton bTransfMT4MTR;
            JButton bTransfMTRMT4;
            // JButton bOrdemManobra;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);
            projeto = new JLabel("Manobras de Transferencia", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras de Transferência");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(140, 70, 380, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bTransfMT1MTR = new JButton("Transferencia do MT-1 para o MT-R");
            bTransfMT1MTR
                    .setToolTipText("Pressione para executar a manobra para transferir as cargas do MT-1 para MT-R");
            bTransfMT1MTR.setMnemonic(KeyEvent.VK_1);
            bTransfMT1MTR.setActionCommand("Manobras");// define o nome da acao
            bTransfMT1MTR.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMT1MTR);

            bTransfMTRMT1 = new JButton("Transferencia do MT-R para o MT-1"); // BOT�O TABELA DE EVENTOS
            bTransfMTRMT1
                    .setToolTipText("Pressione para executar a manobra para transferir as cargas do MT-R para MT-1");
            bTransfMTRMT1.setMnemonic(KeyEvent.VK_R);
            bTransfMTRMT1.setActionCommand("Manobras");// define o nome da acao
            bTransfMTRMT1.setBounds(306, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMTRMT1);

            bTransfMT2MTR = new JButton("Transferencia do MT-2 para MT-R "); // BOT�O TABELA DE EVENTOS
            bTransfMT2MTR
                    .setToolTipText("Pressione para executar a manobra de transferencia de carga do MT-2 para o MT-R");
            bTransfMT2MTR.setMnemonic(KeyEvent.VK_2);
            bTransfMT2MTR.setActionCommand("Manobras");// define o nome da acao
            bTransfMT2MTR.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMT2MTR);

            bTransfMTRMT2 = new JButton("Transferencia do MT-R para o MT-2 "); // BOT�O TABELA DE EVENTOS
            bTransfMTRMT2
                    .setToolTipText("Pressione para executar a manobra de transferencia de carga do MT-R para o MT-2");
            bTransfMTRMT2.setMnemonic(KeyEvent.VK_R);
            bTransfMTRMT2.setActionCommand("Manobras");// define o nome da acao
            bTransfMTRMT2.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMTRMT2);

            bTransfMT3MTR = new JButton("Transferencia do MT-3 para o MT-R");
            bTransfMT3MTR
                    .setToolTipText("Pressione para executar a manobra para transferir as cargas do MT-3 para MT-R");
            bTransfMT3MTR.setMnemonic(KeyEvent.VK_3);
            bTransfMT3MTR.setActionCommand("Manobras");// define o nome da acao
            bTransfMT3MTR.setBounds(2, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMT3MTR);

            bTransfMTRMT3 = new JButton("Transferencia do MT-R para o MT-3"); // BOT�O TABELA DE EVENTOS
            bTransfMTRMT3
                    .setToolTipText("Pressione para executar a manobra para transferir as cargas do MT-R para MT-3");
            bTransfMTRMT3.setMnemonic(KeyEvent.VK_R);
            bTransfMTRMT3.setActionCommand("Manobras");// define o nome da acao
            bTransfMTRMT3.setBounds(306, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMTRMT3);

            bTransfMT4MTR = new JButton("Transferencia do MT-4 para MT-R "); // BOT�O TABELA DE EVENTOS
            bTransfMT4MTR
                    .setToolTipText("Pressione para executar a manobra de transferencia de carga do MT-4 para o MT-R");
            bTransfMT4MTR.setMnemonic(KeyEvent.VK_4);
            bTransfMT4MTR.setActionCommand("Manobras");// define o nome da acao
            bTransfMT4MTR.setBounds(2, 227, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMT4MTR);

            bTransfMTRMT4 = new JButton("Transferencia do MT-R para o MT-4 "); // BOT�O TABELA DE EVENTOS
            bTransfMTRMT4
                    .setToolTipText("Pressione para executar a manobra de transferencia de carga do MT-R para o MT-4");
            bTransfMTRMT4.setMnemonic(KeyEvent.VK_R);
            bTransfMTRMT4.setActionCommand("Manobras");// define o nome da acao
            bTransfMTRMT4.setBounds(306, 227, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMTRMT4);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 262, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione conferir a manobra executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 297, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrao "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione conferir a manobra Padrão");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 297, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteudo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione limpar a memoria");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 336, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 336, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            container.add(painel);

            bTransfMT1MTR.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.TransfMT1MTR="TransferirMT-1MT-R";
                        TransfMT1MTR = "TransferirMT1MTR";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para Transferir do MT-1 para MT-R");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-1 para o MT-R foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bTransfMTRMT1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.TransfMTRMT1="Transferir MT-R MT-1";
                        TransfMTRMT1 = "TransferirMTRMT1";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para Tranferir do MT-R para MT-1");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-R para o MT-1 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bTransfMT2MTR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT2MTR="Transferir MT-2 MT-R";
                    TransfMT2MTR = "TransferirMT2MTR";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-2 para o MT-R");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para transferir as cargas do MT-2 para o MT-R foi Habilitada com Sucesso!!!");
                }
            });

            bTransfMTRMT2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.TransfMTRMT2="Transferir MT-R MT-2";
                        TransfMTRMT2 = "TransferirMTRMT2";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para Tranferir do MT-R para MT-2");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-R para o MT-2 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bTransfMT3MTR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT3MTR="Transferir MT-3 MT-R";
                    TransfMT3MTR = "TransferirMT3MTR";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-3 para o MT-R");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para transferir as cargas do MT-3 para o MT-R foi Habilitada com Sucesso!!!");
                }
            });

            bTransfMTRMT3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT3="Transferir MT-R MT-3";
                    TransfMTRMT3 = "TransferirMTRMT3";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-R para o MT-3");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para transferir as cargas do MT-R para o MT-3 foi Habilitada com Sucesso!!!");
                }
            });

            bTransfMT4MTR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT4MTR="Transferir MT-4 MT-R";
                    TransfMT4MTR = "TransferirMT4MTR";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-4 para o MT-R");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para transferir as cargas do MT-4 para o MT-R foi Habilitada com Sucesso!!!");
                }
            });

            bTransfMTRMT4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT4="Transferir MT-R MT-4";
                    TransfMTRMT4 = "TransferirMTRMT4";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-R para o MT-4");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para transferir as cargas do MT-R para o MT-4 foi Habilitada com Sucesso!!!");
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ################################### CLASSE MENU DAS MANOBRAS DA REDUÇÃO
    public class MenuManobrasReduçao extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobrasReduçao() // --- Configura��o do Frame
        {
            super("Menu Manobras da Redução");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 456);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bDesligamentoProgRed1;
            JButton bNormalizaçaoRed1;
            JButton bDesligamentoProgRed2;
            JButton bNormalizaçaoRed2;
            JButton bDesligamentoProgRed3;
            JButton bNormalizaçaoRed3;
            JButton bDesligamentoProgRed4;
            JButton bNormalizaçaoRed4;
            // JButton bOrdemManobra;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);
            projeto = new JLabel(" Manobras da Redução", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras da Redução");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(160, 70, 380, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bDesligamentoProgRed1 = new JButton("Desligamento Programado da REDUÇÃO 1");
            bDesligamentoProgRed1.setToolTipText("Pressione para executar a manobra de Desligamento da Redução 1");
            bDesligamentoProgRed1.setMnemonic(KeyEvent.VK_1);
            bDesligamentoProgRed1.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed1.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed1);

            bNormalizaçaoRed1 = new JButton("Normalização da REDUÇÃO 1"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed1.setToolTipText("Pressione para executar a manobra de Reenergização da Redução 1");
            bNormalizaçaoRed1.setMnemonic(KeyEvent.VK_1);
            bNormalizaçaoRed1.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed1.setBounds(306, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed1);

            bDesligamentoProgRed2 = new JButton("Desligamento Programado da REDUÇAO 2"); // BOT�O TABELA DE EVENTOS
            bDesligamentoProgRed2.setToolTipText("Pressione para executar a manobra de Desligamento da Reduçao 2");
            bDesligamentoProgRed2.setMnemonic(KeyEvent.VK_2);
            bDesligamentoProgRed2.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed2.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed2);

            bNormalizaçaoRed2 = new JButton("Normalizaçao da REDUÇAO 2"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed2.setToolTipText("Pressione para executar a manobra de Reenergização da Redução 2");
            bNormalizaçaoRed2.setMnemonic(KeyEvent.VK_2);
            bNormalizaçaoRed2.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed2.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed2);

            bDesligamentoProgRed3 = new JButton("Desligamento Programado da REDUÇAO 3");
            bDesligamentoProgRed3.setToolTipText("Pressione para executar a manobra de Desligamento da Redução 3");
            bDesligamentoProgRed3.setMnemonic(KeyEvent.VK_3);
            bDesligamentoProgRed3.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed3.setBounds(2, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed3);

            bNormalizaçaoRed3 = new JButton("Normalização da REDUÇÃO 3"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed3.setToolTipText("Pressione para executar a manobra de Reenergização da Redução 3");
            bNormalizaçaoRed3.setMnemonic(KeyEvent.VK_3);
            bNormalizaçaoRed3.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed3.setBounds(306, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed3);

            bDesligamentoProgRed4 = new JButton("Desligamento Programado da REDUÇÃO 4"); // BOT�O TABELA DE EVENTOS
            bDesligamentoProgRed4.setToolTipText("Pressione para executar a manobra de Desligamento da Reduçao 4");
            bDesligamentoProgRed4.setMnemonic(KeyEvent.VK_4);
            bDesligamentoProgRed4.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed4.setBounds(2, 227, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed4);

            bNormalizaçaoRed4 = new JButton("Normalização da REDUÇAO 4"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed4.setToolTipText("Pressione para executar a manobra de Reenergização da Reduçao 4");
            bNormalizaçaoRed4.setMnemonic(KeyEvent.VK_4);
            bNormalizaçaoRed4.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed4.setBounds(306, 227, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed4);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 262, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione para conferir a manobra executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 297, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrão "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione para conferir a manobra Padrão");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 297, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteudo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione limpar a memoria");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 336, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 336, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            container.add(painel);

            bDesligamentoProgRed1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DeslProgRed1 = "DeslProgRed1";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para Desligamento da Reduçao 1");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Desligamento da Reduçao 1 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bNormalizaçaoRed1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.TransfMTRMT1="Transferir MT-R MT-1";
                        NormRed1 = "NormalizacaoRed1";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para Normalizaçao da Reduçao 1");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Normalizaçao da Reduçao 1 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bDesligamentoProgRed2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT2MTR="Transferir MT-2 MT-R";
                    DeslProgRed2 = "DeslProgRed2";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para Desligamento da Reduçao 2");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Desligamento da Reduçao 2 foi Habilitada com Sucesso!!!");
                }
            });

            bNormalizaçaoRed2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT2="Transferir MT-R MT-2";
                    NormRed2 = "NormalizacaoRed2";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para Normalizaçao da Redução 2");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Normalização da Redução 2 foi Habilitada com Sucesso!!!");
                }
            });

            bDesligamentoProgRed3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT2MTR="Transferir MT-2 MT-R";
                    DeslProgRed3 = "DeslProgRed3";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAçãO: "
                            + "Manobra para Desligamento da Redução 3                                  ");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Desligamento da Redução 3 foi Habilitada com Sucesso!!!");
                }
            });

            bNormalizaçaoRed3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT2="Transferir MT-R MT-2";
                    NormRed3 = "NormalizacaoRed3";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Normalização da Redução 3");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Normalização da Redução 3 foi Habilitada com Sucesso!!!");
                }
            });

            bDesligamentoProgRed4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT2MTR="Transferir MT-2 MT-R";
                    DeslProgRed4 = "DeslProgRed4";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para Desligamento da Reduçao 4");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Desligamento da Redução 4 foi Habilitada com Sucesso!!!");
                }
            });

            bNormalizaçaoRed4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT2="Transferir MT-R MT-2";
                    NormRed4 = "NormalizacaoRed4";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para Normalizaçao da Reduçao 4");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Normalização da Reduçao 4 foi Habilitada com Sucesso!!!");
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ##################################### CLASSE MENU DAS MANOBRAS DO GERADOR
    public class MenuManobrasGerador extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobrasGerador() // --- Configuraçao do Frame
        {
            super("Menu Manobras dos Geradores");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 377);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra, lbConferirManobra;
            JButton bEnergizaçaodaBarraEmpeloGerador;
            JButton bEnergizaçaodasCargaspeloGerador;
            JButton bDesligamentodasCargasalimentadasGerador;
            JButton bDesenergizaçaodaBarraEmpeloGerador;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);
            projeto = new JLabel(" Manobras do Gerador", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras do Gerador");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(160, 70, 380, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bEnergizaçaodaBarraEmpeloGerador = new JButton("Energizaço da Barra EM pelo Gerador");
            bEnergizaçaodaBarraEmpeloGerador.setToolTipText("Pressione para executar a manobra ");
            bEnergizaçaodaBarraEmpeloGerador.setMnemonic(KeyEvent.VK_1);
            bEnergizaçaodaBarraEmpeloGerador.setActionCommand("Manobras");// define o nome da acao
            bEnergizaçaodaBarraEmpeloGerador.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnergizaçaodaBarraEmpeloGerador);

            bEnergizaçaodasCargaspeloGerador = new JButton("Energização das Cargas pelo Gerador"); // BOT�O TABELA DE
                                                                                                   // EVENTOS
            bEnergizaçaodasCargaspeloGerador.setToolTipText("Pressione para executar a manobra ");
            bEnergizaçaodasCargaspeloGerador.setMnemonic(KeyEvent.VK_2);
            bEnergizaçaodasCargaspeloGerador.setActionCommand("Manobras");// define o nome da acao
            bEnergizaçaodasCargaspeloGerador.setBounds(306, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnergizaçaodasCargaspeloGerador);

            bDesligamentodasCargasalimentadasGerador = new JButton("Deslig. das Cargas Alimentadas pelo Gerador"); // BOT�O
                                                                                                                   // TABELA
                                                                                                                   // DE
                                                                                                                   // EVENTOS
            bDesligamentodasCargasalimentadasGerador.setToolTipText("Pressione para executar a manobra ");
            bDesligamentodasCargasalimentadasGerador.setMnemonic(KeyEvent.VK_1);
            bDesligamentodasCargasalimentadasGerador.setActionCommand("Manobras");// define o nome da acao
            bDesligamentodasCargasalimentadasGerador.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentodasCargasalimentadasGerador);

            bDesenergizaçaodaBarraEmpeloGerador = new JButton("Desenergização da Barra EM pelo Gerador"); // BOT�O
                                                                                                          // TABELA DE
                                                                                                          // EVENTOS
            bDesenergizaçaodaBarraEmpeloGerador.setToolTipText("Pressione para executar a manobra ");
            bDesenergizaçaodaBarraEmpeloGerador.setMnemonic(KeyEvent.VK_2);
            bDesenergizaçaodaBarraEmpeloGerador.setActionCommand("Manobras");// define o nome da acao
            bDesenergizaçaodaBarraEmpeloGerador.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenergizaçaodaBarraEmpeloGerador);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 183, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione para conferir a manobra executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 218, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrão "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione conferir a manobra padrão");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 218, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteúdo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione limpar a memoria");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 257, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 257, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            container.add(painel);

            bEnergizaçaodaBarraEmpeloGerador.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnergBarraEM = "EnergBarraEM";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: "
                                + "Manobra para Energizar a Barra EM pelo Gerador");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Energizar a Barra EM pelo Gerador foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bEnergizaçaodasCargaspeloGerador.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnergCargas = "EnergCargas";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇãO: "
                                + " Manobra para Energizar as Cargas pelo Gerador");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Energizar as Cargas pelo Gerador foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bDesligamentodasCargasalimentadasGerador.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    DeslCargas = "DeslCargas";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇãO: " + " Manobra para Desligar as Cargas pelo Gerador");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Desligar as Cargas pelo Gerador foi Habilitada com Sucesso!!!");
                }
            });

            bDesenergizaçaodaBarraEmpeloGerador.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    DesenBarraEM = "DesenBarraEM";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇãO: "
                            + " Manobra para Desenergizar a Barra EM pelo Gerador");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para Desenergizar a Barra EM pelo Gerador foi Habilitada com Sucesso!!!");
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ################################################# CLASSE MANOBRA EXECUTADA
    public class ManobraExecutada extends JFrame // implements ActionListener
    {
        String manobra = "";

        public ManobraExecutada() {
            setTitle("Ordem de Manobra  " + "Executada");
            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            setResizable(false);

            setSize(440, 450);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

            final JLabel mostrar1;
            final JLabel mostrar2;
            final JLabel mostrar3;
            final JLabel mostrar4;
            final JLabel mostrar5;
            final JLabel mostrar6;
            final JLabel mostrar7;
            final JLabel mostrar8;
            final JLabel mostrar9;
            final JLabel mostrar10;
            final JLabel mostrar11;
            final JLabel mostrar12;
            final JLabel mostrar13;
            final JLabel mostrar14;
            final JLabel mostrar15;
            final JLabel mostrar16;
            final JLabel mostrar17;
            final JLabel mostrar18;
            final JLabel mostrar19;
            final JLabel mostrar20;
            final JLabel mostrar21;
            final JLabel mostrar22;
            final JLabel mostrar23;
            final JLabel mostrar24;

            JButton Comparar;
            JButton Limpar;
            JButton Sair;
            // JButton Manobra;

            final JLabel lbManobra, projeto;

            JPanel painel = new JPanel();

            projeto = new JLabel("Manobra Executada!", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 28));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            Comparar = new JButton("Visualizar");
            Comparar.setBackground(new Color(180, 180, 250));
            Comparar.setBounds(100, 370, 95, 30); // Coluna,Linha,Largura,Altura
            getContentPane().add(Comparar);

            Limpar = new JButton("Limpar");
            Limpar.setBackground(new Color(180, 180, 250));
            Limpar.setBounds(200, 370, 95, 30); // Coluna,Linha,Largura,Altura
            getContentPane().add(Limpar);

            Sair = new JButton("Sair");
            Sair.setBackground(new Color(180, 180, 250));
            Sair.setBounds(300, 370, 95, 30); // Coluna,Linha,Largura,Altura
            // Sair.addActionListener(this);
            getContentPane().add(Sair);

            lbManobra = new JLabel("                               MANOBRA:                               ");
            lbManobra.setFont(new Font("Arial", 1, 16));
            lbManobra.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
            lbManobra.setForeground(Color.red);
            painel.add(lbManobra);

            mostrar1 = new JLabel();
            mostrar1.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar1);

            mostrar2 = new JLabel();
            mostrar2.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar2);

            mostrar3 = new JLabel();
            mostrar3.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar3);

            mostrar4 = new JLabel();
            mostrar4.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar4);

            mostrar5 = new JLabel();
            mostrar5.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar5);

            mostrar6 = new JLabel();
            mostrar6.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar6);

            mostrar7 = new JLabel();
            mostrar7.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar7);

            mostrar8 = new JLabel();
            mostrar8.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar8);

            mostrar9 = new JLabel();
            mostrar9.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar9);

            mostrar10 = new JLabel();
            mostrar10.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar10);

            mostrar11 = new JLabel();
            mostrar11.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar11);

            mostrar12 = new JLabel();
            mostrar12.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar12);

            mostrar13 = new JLabel();
            mostrar13.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar13);

            mostrar14 = new JLabel();
            mostrar14.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar14);

            mostrar15 = new JLabel();
            mostrar15.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar15);

            mostrar16 = new JLabel();
            mostrar16.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar16);

            mostrar17 = new JLabel();
            mostrar17.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar17);

            mostrar18 = new JLabel();
            mostrar18.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar18);

            mostrar19 = new JLabel();
            mostrar19.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar19);

            mostrar20 = new JLabel();
            mostrar20.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar20);

            mostrar21 = new JLabel();
            mostrar21.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar21);

            mostrar22 = new JLabel();
            mostrar22.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar22);

            mostrar23 = new JLabel();
            mostrar23.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar23);

            mostrar24 = new JLabel();
            mostrar24.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar24);

            // box.add(new JScrollPane(painel));
            container.add(painel);

            Comparar.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    if (EnerL1.equals("EnergizarLinha1")) {
                        mostrar1.setText("       " + seccionadora89l1fechada);
                        mostrar2.setText("                          " + seccionadora89l1afechada);
                        mostrar3.setText("                          " + seccionadora89l1bfechada);
                        mostrar4.setText("                                  " + disjuntor52l1fechado);
                    }

                    if (DesenL1.equals("DesenergizarLinha1")) {
                        mostrar5.setText("           " + disjuntor52l1aberto);
                        mostrar6.setText("                   " + seccionadora89l1aberta);
                        mostrar7.setText("                                " + seccionadora89l1aaberta);
                        mostrar8.setText("                                " + seccionadora89l1baberta);
                    }

                    if (EnerL2.equals("EnergizarLinha2")) {
                        mostrar1.setText(" " + seccionadora89l2fechada);
                        mostrar2.setText("                          " + seccionadora89l2bfechada);
                        mostrar3.setText("                          " + seccionadora89l2afechada);
                        mostrar4.setText("                                  " + disjuntor52l2fechado);
                    }

                    if (DesenL2.equals("DesenergizarLinha2")) {
                        mostrar5.setText("           " + disjuntor52l2aberto);
                        mostrar6.setText("                    " + seccionadora89l2aberta);
                        mostrar7.setText("                               " + seccionadora89l2baberta);
                        mostrar8.setText("                               " + seccionadora89l2aaberta);
                    }

                    if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                        mostrar1.setText("         " + seccionadora89l1fechada);
                        mostrar2.setText("                          " + seccionadora89l1afechada);
                        mostrar3.setText("                          " + seccionadora89btafechada);
                        mostrar4.setText("                          " + seccionadora89btbfechada);
                        mostrar5.setText("                          " + disjuntor52btfechado);
                        mostrar6.setText("                          " + disjuntor52l1fechado);
                        mostrar7.setText("                          " + seccionadora89mt1afechada);
                        mostrar8.setText("                          " + seccionadora89mt1baberta);
                        mostrar9.setText("                          " + seccionadora89mtrafechada);
                        mostrar10.setText("                          " + seccionadora89mtrbaberta);
                        mostrar11.setText("                          " + seccionadora89mt3afechada);
                        mostrar12.setText("                                          " + seccionadora89mt3baberta);
                    }

                    if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                        mostrar1.setText("         " + seccionadora89mt1bfechada);
                        mostrar2.setText("                          " + seccionadora89mt1aaberta);
                        mostrar3.setText("                          " + seccionadora89mtrbfechada);
                        mostrar4.setText("                          " + seccionadora89mtraaberta);
                        mostrar5.setText("                          " + seccionadora89mt3bfechada);
                        mostrar6.setText("                          " + seccionadora89mt3aaberta);
                        mostrar7.setText("                          " + disjuntor52l1aberto);
                        mostrar8.setText("                          " + seccionadora89l1aberta);
                        mostrar9.setText("                          " + disjuntor52btaberto);
                        mostrar10.setText("                          " + seccionadora89btaaberta);
                        mostrar11.setText("                         " + seccionadora89btbaberta);
                        mostrar12.setText("                                         " + seccionadora89l1aaberta);
                    }

                    if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                        mostrar1.setText("          " + seccionadora89l2fechada);
                        mostrar2.setText("                          " + seccionadora89l2bfechada);
                        mostrar3.setText("                          " + seccionadora89btafechada);
                        mostrar4.setText("                          " + seccionadora89btbfechada);
                        mostrar5.setText("                          " + disjuntor52btfechado);
                        mostrar6.setText("                          " + disjuntor52l2fechado);
                        mostrar7.setText("                          " + seccionadora89mt2bfechada);
                        mostrar8.setText("                          " + seccionadora89mt2aaberta);
                        mostrar9.setText("                          " + seccionadora89mt4bfechada);
                        mostrar10.setText("                                            " + seccionadora89mt4aaberta);
                    }

                    if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                        mostrar1.setText("        " + seccionadora89mt2afechada);
                        mostrar2.setText("                          " + seccionadora89mt2baberta);
                        mostrar3.setText("                          " + seccionadora89mt4afechada);
                        mostrar4.setText("                          " + seccionadora89mt4baberta);
                        mostrar5.setText("                          " + disjuntor52l2aberto);
                        mostrar6.setText("                          " + seccionadora89l2aberta);
                        mostrar7.setText("                          " + disjuntor52btaberto);
                        mostrar8.setText("                          " + seccionadora89btaaberta);
                        mostrar9.setText("                         " + seccionadora89btbaberta);
                        mostrar10.setText("                                         " + seccionadora89l2baberta);
                    }

                    if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                        mostrar1.setText("                      " + seccionadora89btafechada);
                        mostrar2.setText("                      " + seccionadora89btbfechada);
                        mostrar3.setText("                      " + disjuntor52btfechado);
                        mostrar4.setText("                      " + seccionadora89l1afechada);
                        mostrar5.setText("                      " + seccionadora89l1baberta);
                        mostrar6.setText("                      " + seccionadora89mtrafechada);
                        mostrar7.setText("                      " + seccionadora89mtrbaberta);
                        mostrar8.setText("                      " + seccionadora89mt3afechada);
                        mostrar9.setText("                      " + seccionadora89mt3baberta);
                        mostrar10.setText("                     " + seccionadora89mt1afechada);
                        mostrar11.setText("                                            " + disjuntor52mt1fechado);
                    }

                    if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                        mostrar1.setText("                          " + disjuntor52mt1aberto);
                        mostrar2.setText("                     " + seccionadora89mt1aaberta);
                        mostrar3.setText("                     " + seccionadora89l1bfechada);
                        mostrar4.setText("                     " + seccionadora89l1aaberta);
                        mostrar5.setText("                     " + seccionadora89mtrbfechada);
                        mostrar6.setText("                     " + seccionadora89mtraaberta);
                        mostrar7.setText("                     " + seccionadora89mt3bfechada);
                        mostrar8.setText("                     " + seccionadora89mt3aaberta);
                        mostrar9.setText("                     " + disjuntor52btaberto);
                        mostrar10.setText("                    " + seccionadora89btaaberta);
                        mostrar11.setText("                                            " + seccionadora89btbaberta);
                    }

                    if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                        mostrar1.setText("                      " + seccionadora89btafechada);
                        mostrar2.setText("                      " + seccionadora89btbfechada);
                        mostrar3.setText("                      " + disjuntor52btfechado);
                        mostrar4.setText("                      " + seccionadora89l1afechada);
                        mostrar5.setText("                      " + seccionadora89l1baberta);
                        mostrar6.setText("                      " + seccionadora89mt1afechada);
                        mostrar7.setText("                      " + seccionadora89mt1baberta);
                        mostrar8.setText("                      " + seccionadora89mt3afechada);
                        mostrar9.setText("                      " + seccionadora89mt3baberta);
                        mostrar10.setText("                     " + seccionadora89mtrafechada);
                        mostrar11.setText("                                            " + disjuntor52mtrfechado);
                    }

                    if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                        mostrar1.setText("                           " + disjuntor52mtraberto);
                        mostrar2.setText("                      " + seccionadora89mtraaberta);
                        mostrar3.setText("                      " + seccionadora89l1bfechada);
                        mostrar4.setText("                      " + seccionadora89l1aaberta);
                        mostrar5.setText("                      " + seccionadora89mt1bfechada);
                        mostrar6.setText("                      " + seccionadora89mt1aaberta);
                        mostrar7.setText("                      " + seccionadora89mt3bfechada);
                        mostrar8.setText("                      " + seccionadora89mt3aaberta);
                        mostrar9.setText("                      " + seccionadora89btaaberta);
                        mostrar10.setText("                     " + seccionadora89btbaberta);
                        mostrar11.setText("                                            " + disjuntor52btaberto);
                    }

                    if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                        mostrar1.setText("                       " + seccionadora89btafechada);
                        mostrar2.setText("                       " + seccionadora89btbfechada);
                        mostrar3.setText("                       " + disjuntor52btfechado);
                        mostrar4.setText("                       " + seccionadora89l2bfechada);
                        mostrar5.setText("                       " + seccionadora89l2aaberta);
                        mostrar6.setText("                       " + seccionadora89mt4bfechada);
                        mostrar7.setText("                       " + seccionadora89mt4aaberta);
                        mostrar10.setText("                      " + seccionadora89mt2bfechada);
                        mostrar11.setText("                                             " + disjuntor52mt2fechado);
                    }

                    if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                        mostrar1.setText("                      " + disjuntor52mt2aberto);
                        mostrar2.setText("                      " + seccionadora89mt2baberta);
                        mostrar3.setText("                      " + seccionadora89l2afechada);
                        mostrar4.setText("                      " + seccionadora89l2baberta);
                        mostrar5.setText("                      " + seccionadora89mt4afechada);
                        mostrar6.setText("                      " + seccionadora89mt4baberta);
                        mostrar7.setText("                      " + seccionadora89btaaberta);
                        mostrar8.setText("                      " + seccionadora89btbaberta);
                        mostrar9.setText("                                              " + disjuntor52btaberto);
                    }

                    if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                        mostrar1.setText("                        " + seccionadora89btafechada);
                        mostrar2.setText("                        " + seccionadora89btbfechada);
                        mostrar3.setText("                        " + disjuntor52btfechado);
                        mostrar4.setText("                        " + seccionadora89l1afechada);
                        mostrar5.setText("                        " + seccionadora89l1baberta);
                        mostrar6.setText("                        " + seccionadora89mt1afechada);
                        mostrar7.setText("                        " + seccionadora89mt1baberta);
                        mostrar8.setText("                        " + seccionadora89mtrafechada);
                        mostrar9.setText("                        " + seccionadora89mtrbaberta);
                        mostrar10.setText("                       " + seccionadora89mt3afechada);
                        mostrar11.setText("                                             " + disjuntor52mt3fechado);
                    }

                    if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                        mostrar1.setText("                        " + disjuntor52mt3aberto);
                        mostrar2.setText("                        " + seccionadora89mt3aaberta);
                        mostrar3.setText("                        " + seccionadora89l1bfechada);
                        mostrar4.setText("                        " + seccionadora89l1aaberta);
                        mostrar5.setText("                        " + seccionadora89mt1bfechada);
                        mostrar6.setText("                        " + seccionadora89mt1aaberta);
                        mostrar7.setText("                        " + seccionadora89mtrbfechada);
                        mostrar8.setText("                        " + seccionadora89mtraaberta);
                        mostrar9.setText("                        " + disjuntor52btaberto);
                        mostrar10.setText("                       " + seccionadora89btaaberta);
                        mostrar11.setText("                                            " + seccionadora89btbaberta);
                    }

                    if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                        mostrar1.setText("                        " + seccionadora89btafechada);
                        mostrar2.setText("                        " + seccionadora89btbfechada);
                        mostrar3.setText("                        " + disjuntor52btfechado);
                        mostrar4.setText("                        " + seccionadora89l2bfechada);
                        mostrar5.setText("                        " + seccionadora89l2aaberta);
                        mostrar6.setText("                        " + seccionadora89mt2bfechada);
                        mostrar7.setText("                        " + seccionadora89mt2aaberta);
                        mostrar8.setText("                        " + seccionadora89mt4bfechada);
                        mostrar9.setText("                        " + disjuntor52mt4fechado);
                    }

                    if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                        mostrar1.setText("                        " + disjuntor52mt4aberto);
                        mostrar2.setText("                        " + seccionadora89mt4baberta);
                        mostrar3.setText("                        " + seccionadora89l2afechada);
                        mostrar4.setText("                        " + seccionadora89l2baberta);
                        mostrar5.setText("                        " + seccionadora89mt2afechada);
                        mostrar6.setText("                        " + seccionadora89mt2baberta);
                        mostrar7.setText("                        " + seccionadora89btaaberta);
                        mostrar8.setText("                        " + seccionadora89btbaberta);
                        mostrar9.setText("                                              " + disjuntor52btaberto);
                    }

                    if (EnerAlbras.equals("EnergizarAlbras") && eqp.disjuntor52l1().equals("Disjuntor Fechado")) {
                        mostrar1.setText("          " + disjuntor52l1fechado);
                        mostrar2.setText("          " + disjuntor52l2fechado);
                        mostrar3.setText("          " + disjuntor52btfechado);
                        mostrar4.setText("          " + disjuntor52alfechado);
                        mostrar5.setText("         " + disjuntor52mt1fechado);
                        mostrar6.setText("         " + disjuntor52mtrfechado);
                        mostrar7.setText("         " + disjuntor52mt2fechado);
                        mostrar8.setText("         " + disjuntor52mt3fechado);
                        mostrar9.setText("         " + disjuntor52mt4fechado);
                        mostrar10.setText("         " + disjuntor52a1fechado);
                        mostrar11.setText("         " + disjuntor52a2fechado);
                        mostrar12.setText("         " + disjuntor52a3fechado);
                        mostrar13.setText("         " + disjuntor52a4fechado);
                        mostrar14.setText("         " + disjuntor52a5fechado);
                        mostrar15.setText("         " + disjuntor52a6fechado);
                        mostrar16.setText("         " + disjuntor52a3fechado);
                        mostrar17.setText("         " + disjuntor52a4fechado);
                        mostrar18.setText("         " + disjuntor52p1fechado);
                        mostrar19.setText("         " + disjuntor52p2fechado);
                        mostrar20.setText("         " + disjuntor52p3fechado);
                        mostrar21.setText("         " + disjuntor52p4fechado);
                        mostrar22.setText("         " + disjuntor52p5fechado);
                        mostrar23.setText("         " + disjuntor52p3fechado);
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        mostrar1.setText("           " + disjuntor52l1aberto);
                        mostrar2.setText("           " + disjuntor52l2aberto);
                        mostrar3.setText("           " + disjuntor52btaberto);
                        mostrar4.setText("           " + disjuntor52alaberto);
                        mostrar5.setText("          " + disjuntor52mt1aberto);
                        mostrar6.setText("          " + disjuntor52mtraberto);
                        mostrar7.setText("          " + disjuntor52mt2aberto);
                        mostrar8.setText("          " + disjuntor52mt3aberto);
                        mostrar9.setText("          " + disjuntor52mt4aberto);
                        mostrar10.setText("          " + disjuntor52a1aberto);
                        mostrar11.setText("          " + disjuntor52a2aberto);
                        mostrar12.setText("          " + disjuntor52a3aberto);
                        mostrar13.setText("          " + disjuntor52a4aberto);
                        mostrar14.setText("          " + disjuntor52a5aberto);
                        mostrar15.setText("          " + disjuntor52a6aberto);
                        mostrar16.setText("          " + disjuntor52a3aberto);
                        mostrar17.setText("          " + disjuntor52a4aberto);
                        mostrar18.setText("          " + disjuntor52p1aberto);
                        mostrar19.setText("          " + disjuntor52p2aberto);
                        mostrar20.setText("          " + disjuntor52p3aberto);
                        mostrar21.setText("          " + disjuntor52p4aberto);
                        mostrar22.setText("          " + disjuntor52p5aberto);
                        mostrar23.setText("          " + disjuntor52p3aberto);
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        mostrar1.setText("       " + seccionadora89a2eaberta);
                        mostrar2.setText("       " + seccionadora89a4eaberta);
                        mostrar3.setText("       " + seccionadora89a6eaberta);
                        mostrar4.setText("       " + seccionadora89a4eaberta);
                        mostrar5.setText("     " + seccionadora89lvrreaberta);
                        mostrar6.setText("      " + seccionadora89lvrraberta);
                        mostrar7.setText("        " + seccionadora89p1aberta);
                        mostrar8.setText("        " + seccionadora89p2aberta);
                        mostrar9.setText("        " + seccionadora89p3aberta);
                        mostrar10.setText("       " + seccionadora89p4aberta);
                        mostrar11.setText("       " + seccionadora89p5aberta);
                        mostrar12.setText("       " + seccionadora89p3aberta);
                        mostrar13.setText("     " + seccionadora89a2efechada);
                        mostrar14.setText("     " + seccionadora89a4efechada);
                        mostrar15.setText("     " + seccionadora89a6efechada);
                        mostrar16.setText("     " + seccionadora89a4efechada);
                        mostrar17.setText("     " + seccionadora89p1efechada);
                        mostrar18.setText("     " + seccionadora89p2efechada);
                        mostrar19.setText("     " + seccionadora89p3efechada);
                        mostrar20.setText("     " + seccionadora89p4efechada);
                        mostrar21.setText("     " + seccionadora89p5efechada);
                        mostrar22.setText("     " + seccionadora89p3efechada);
                        mostrar23.setText("     " + seccionadora89tuefechada);
                        mostrar24.setText("          " + disjuntor52tufechado);
                    }

                    if (EnergBarraEM.equals("EnergBarraEM")) {
                        mostrar1.setText("            " + disjuntor52g1fechado);
                        mostrar2.setText("            " + disjuntor52g2fechado);
                        mostrar3.setText("        " + seccionadora89tuefechada);
                        mostrar4.setText("            " + disjuntor52tufechado);
                    }

                    if (DesenBarraEM.equals("DesenBarraEM")) {
                        mostrar1.setText("            " + disjuntor52tuaberto);
                        mostrar2.setText("        " + seccionadora89tueaberta);
                        mostrar3.setText("             " + disjuntor52g1aberto);
                        mostrar4.setText("             " + disjuntor52g2aberto);
                    }

                    if (EnergCargas.equals("EnergCargas")) {
                        mostrar1.setText("            " + disjuntor52a1fechado);
                        mostrar2.setText("            " + disjuntor52a3fechado);
                        mostrar3.setText("            " + disjuntor52a5fechado);
                        mostrar4.setText("            " + disjuntor52a7fechado);
                        mostrar5.setText("            " + disjuntor52p1fechado);
                        mostrar6.setText("            " + disjuntor52p2fechado);
                        mostrar7.setText("            " + disjuntor52p3fechado);
                        mostrar8.setText("            " + disjuntor52p4fechado);
                        mostrar9.setText("            " + disjuntor52p5fechado);
                        mostrar10.setText("           " + disjuntor52p6fechado);
                    }

                    if (DeslCargas.equals("DeslCargas")) {
                        mostrar1.setText("            " + disjuntor52a1aberto);
                        mostrar2.setText("            " + disjuntor52a3aberto);
                        mostrar3.setText("            " + disjuntor52a5aberto);
                        mostrar4.setText("            " + disjuntor52a7aberto);
                        mostrar5.setText("            " + disjuntor52p1aberto);
                        mostrar6.setText("            " + disjuntor52p2aberto);
                        mostrar7.setText("            " + disjuntor52p3aberto);
                        mostrar8.setText("            " + disjuntor52p4aberto);
                        mostrar9.setText("            " + disjuntor52p5aberto);
                        mostrar10.setText("           " + disjuntor52p6aberto);
                    }

                    if (EnerL1.equals("EnergizarLinha1")) {
                        manobra = "         OM Energizar o Bay da Linha 1    ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL1.equals("DesenergizarLinha1")) {
                        manobra = " OM Desenergizar o Bay da Linha 1 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL2.equals("EnergizarLinha2")) {
                        manobra = "         OM Energizar o Bay da Linha 2    ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL2.equals("DesenergizarLinha2")) {
                        manobra = " OM Desenergizar o Bay da Linha 2 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                        manobra = " OM Energizar o Bay da Linha 1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                        manobra = " OM Desenergizar o Bay da Linha 1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                        manobra = " OM Energizar o Bay da Linha 2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                        manobra = " OM Desenergizar o Bay da Linha 2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                        manobra = " OM Energizar o Bay do MT-1 e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                        manobra = " OM Energizar o Bay do MT-R e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-R e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                        manobra = " OM Energizar o Bay do MT-2 e Barra B ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                        manobra = " OM Desenergizar o Bay do MT-2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                        manobra = " OM Energizar o Bay do MT-3 e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-3 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                        manobra = " OM Energizar o Bay do MT-4 e Barra B ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                        manobra = " OM Desenergizar o Bay do MT-4 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerAlbras.equals("EnergizarAlbras")) {
                        manobra = " OM para Energizar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        manobra = " OM para Desenergizar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        manobra = " OM para Preparar a SE ALBRAS para Normalização";
                        lbManobra.setText(manobra);
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        manobra = " OM para Energizar os Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed1.equals("DeslProgRed1")) {
                        manobra = " OM para Desligar a Redução 1";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed1.equals("NormalizacaoRed1")) {
                        manobra = " OM para Normalizar a Redução 1";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed2.equals("DeslProgRed2")) {
                        manobra = " OM para Desligar a Redução 2";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed2.equals("NormalizacaoRed2")) {
                        manobra = " OM para Normalizar a Redução 2";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        manobra = " OM para Desligar a Redução 3";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        manobra = " OM para Normalizar a Redução 3";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        manobra = " OM para Desligar a Redução 4";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed4.equals("NormalizacaoRed4")) {
                        manobra = " OM para Normalizar a Redução 4";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT1MTR.equals("TransferirMT1MTR")) {
                        manobra = " OM para Transferir do MT-1 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT1.equals("TransferirMTRMT1")) {
                        manobra = " OM para Transferir do MT-R para o MT-1";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT2MTR.equals("TransferirMT2MTR")) {
                        manobra = " OM para Transferir do MT-2 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT2.equals("TransferirMTRMT2")) {
                        manobra = " OM para Transferir do MT-R para o MT-2";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                        manobra = " OM para Transferir do MT-3 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                        manobra = " OM para Transferir do MT-R para o MT-3";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                        manobra = " OM para Transferir do MT-4 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                        manobra = " OM para Transferir do MT-R para o MT-4";
                        lbManobra.setText(manobra);
                    }

                    if (EnergBarraEM.equals("EnergBarraEM")) {
                        manobra = " OM para Energizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DesenBarraEM.equals("DesenBarraEM")) {
                        manobra = " OM para Desenergizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (EnergCargas.equals("EnergCargas")) {
                        manobra = " OM para Energizar as Cargas pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DeslCargas.equals("DeslCargas")) {
                        manobra = " OM para Desenergizar as Cargas pelo Gerador";
                        lbManobra.setText(manobra);
                    }
                }
            });

            Limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    passo = 0;
                    mostrar1.setText("");
                    mostrar2.setText("");
                    mostrar3.setText("");
                    mostrar4.setText("");
                    mostrar5.setText("");
                    mostrar6.setText("");
                    mostrar7.setText("");
                    mostrar8.setText("");
                    mostrar9.setText("");
                    mostrar10.setText("");
                    mostrar11.setText("");
                    mostrar12.setText("");
                    mostrar13.setText("");
                    mostrar14.setText("");
                    mostrar15.setText("");
                    mostrar16.setText("");
                    mostrar17.setText("");
                    mostrar18.setText("");
                    mostrar19.setText("");
                    mostrar20.setText("");
                    mostrar21.setText("");
                    mostrar22.setText("");
                    mostrar23.setText("");
                    mostrar24.setText("");
                    manobra = "                               MANOBRA:                               ";
                    lbManobra.setText(manobra);
                    limparMemoria();
                }
            });

            Sair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                    setVisible(false);
                }
            });
        }// Fim main
    }// Fim Teste

    // ####################################### CLASSE MENU DA MANOBRA PADRÃO
    public class ManobraPadrao extends JFrame // implements ActionListener
    {
        String manobra = "";

        public ManobraPadrao() {
            setTitle("Ordem de Manobra  " + "Padrão");
            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            setResizable(false);

            // Box box = Box.createHorizontalBox();

            setSize(455, 450);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(440, 285);
            // setVisible(true);

            // final JLabel lbindice;

            final JLabel mostrar1;
            final JLabel mostrar2;
            final JLabel mostrar3;
            final JLabel mostrar4;
            final JLabel mostrar5;
            final JLabel mostrar6;
            final JLabel mostrar7;
            final JLabel mostrar8;
            final JLabel mostrar9;
            final JLabel mostrar10;
            final JLabel mostrar11;
            final JLabel mostrar12;
            final JLabel mostrar13;
            final JLabel mostrar14;
            final JLabel mostrar15;
            final JLabel mostrar16;
            final JLabel mostrar17;
            final JLabel mostrar18;
            final JLabel mostrar19;
            final JLabel mostrar20;
            final JLabel mostrar21;
            final JLabel mostrar22;
            final JLabel mostrar23;
            final JLabel mostrar24;

            JButton Comparar;
            JButton Limpar;
            JButton Sair;
            // JButton Manobra;

            final JLabel lbManobra;

            JPanel painel = new JPanel();

            projeto = new JLabel(" Manobra Padrão!", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 28));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            Comparar = new JButton("Visualizar");
            Comparar.setBackground(new Color(180, 180, 250));
            Comparar.setBounds(100, 370, 95, 30); // Coluna,Linha,Largura,Altura
            getContentPane().add(Comparar);

            Limpar = new JButton("Limpar");
            Limpar.setBackground(new Color(180, 180, 250));
            Limpar.setBounds(200, 370, 95, 30); // Coluna,Linha,Largura,Altura
            getContentPane().add(Limpar);

            Sair = new JButton("Sair");
            Sair.setBackground(new Color(180, 180, 250));
            Sair.setBounds(300, 370, 95, 30); // Coluna,Linha,Largura,Altura
            // Sair.addActionListener(this);
            getContentPane().add(Sair);

            lbManobra = new JLabel("                               MANOBRA:                               ");
            // lbManobra.setEditable(false);
            lbManobra.setFont(new Font("Arial", 1, 16));
            lbManobra.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
            lbManobra.setForeground(Color.red);
            painel.add(lbManobra);

            mostrar1 = new JLabel();
            mostrar1.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar1);

            mostrar2 = new JLabel();
            mostrar2.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar2);

            mostrar3 = new JLabel();
            mostrar3.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar3);

            mostrar4 = new JLabel();
            mostrar4.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar4);

            mostrar5 = new JLabel();
            mostrar5.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar5);

            mostrar6 = new JLabel();
            mostrar6.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar6);

            mostrar7 = new JLabel();
            mostrar7.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar7);

            mostrar8 = new JLabel();
            mostrar8.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar8);

            mostrar9 = new JLabel();
            mostrar9.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar9);

            mostrar10 = new JLabel();
            mostrar10.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar10);

            mostrar11 = new JLabel();
            mostrar11.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar11);

            mostrar12 = new JLabel();
            mostrar12.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar12);

            mostrar13 = new JLabel();
            mostrar13.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar13);

            mostrar14 = new JLabel();
            mostrar14.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar14);

            mostrar15 = new JLabel();
            mostrar15.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar15);

            mostrar16 = new JLabel();
            mostrar16.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar16);

            mostrar17 = new JLabel();
            mostrar17.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar17);

            mostrar18 = new JLabel();
            mostrar18.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar18);

            mostrar19 = new JLabel();
            mostrar19.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar19);

            mostrar20 = new JLabel();
            mostrar20.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar20);

            mostrar21 = new JLabel();
            mostrar21.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar21);

            mostrar22 = new JLabel();
            mostrar22.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar22);

            mostrar23 = new JLabel();
            mostrar23.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar23);

            mostrar24 = new JLabel();
            mostrar24.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar24);

            container.add(painel);
            // container.add(new JScrollPane(painel));

            Comparar.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    if (EnerL1.equals("EnergizarLinha1")) {
                        mostrar1.setText("               1. Fechar Seccionadora 89 L1");
                        mostrar2.setText("             2. Fechar Seccionadora 89 L1-A");
                        mostrar4.setText("                              3. Fechar Disjuntor 52 L1");
                    }

                    if (DesenL1.equals("DesenergizarLinha1")) {
                        mostrar5.setText("             1. Abrir Disjuntor 52 L1     ");
                        mostrar6.setText("               2. Abrir Seccionadora 89 L1");
                        mostrar7.setText("                         3. Abrir Seccionadora 89 L1-A");
                    }

                    if (EnerL2.equals("EnergizarLinha2")) {
                        mostrar1.setText("              1. Fechar Seccionadora 89 L2");
                        mostrar2.setText("            2. Fechar Seccionadora 89 L2-B");
                        mostrar4.setText("                             3. Fechar Disjuntor 52 L2");
                    }

                    if (DesenL2.equals("DesenergizarLinha2")) {
                        mostrar5.setText("             1. Abrir Disjuntor 52 L2      ");
                        mostrar6.setText("                2. Abrir Seccionadora 89 L2");
                        mostrar7.setText("                         3. Abrir Seccionadora 89 L2-B");
                    }

                    if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                        mostrar1.setText("            1. Fechar Seccionadora 89 L1");
                        mostrar2.setText("          2. Fechar Seccionadora 89 L1-A");
                        mostrar3.setText("          3. Fechar Seccionadora 89 BT-A");
                        mostrar4.setText("          4. Fechar Seccionadora 89 BT-B");
                        mostrar5.setText("                 5. Fechar Disjuntor 52 BT");
                        mostrar6.setText("                 6. Fechar Disjuntor 52 L1");
                        mostrar7.setText("        7.  Fechar Seccionadora 89 MT-1A");
                        mostrar8.setText("          8. Abrir Seccionadora 89 MT-1B");
                        mostrar9.setText("         9. Fechar Seccionadora 89 MT-RA");
                        mostrar10.setText("        10. Abrir seccionadora 89 MT-RB");
                        mostrar11.setText("       11. Fechar Seccionadora 89 MT-3A");
                        mostrar12.setText("             12. Abrir Seccionadora 89 MT-3B");
                    }

                    if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 MT-1B ");
                        mostrar2.setText("          2. Abrir Seccionadora 89 MT-1A");
                        mostrar3.setText("         3. Fechar Seccionadora 89 MT-RB");
                        mostrar4.setText("          4. Abrir Seccionadora 89 MT-RA");
                        mostrar5.setText("         5. Fechar Seccionadora 89 MT-3B");
                        mostrar6.setText("          6. Abrir Seccionadora 89 MT-3A");
                        mostrar7.setText("                  7. Abrir Disjuntor 52 L1");
                        mostrar8.setText("             8. Abrir Seccionadora 89 L1");
                        mostrar9.setText("                9. Abrir Disjuntor 52 BT");
                        mostrar10.setText("         10. Abrir Seccionadora 89 BT-A");
                        mostrar11.setText("         11. Abrir Seccionadora 89 BT-B");
                        mostrar12.setText("                 12. Abrir Seccionadora 89 L1-A");
                    }

                    if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                        mostrar1.setText("          1. Fechar Seccionadora 89 L2 ");
                        mostrar2.setText("         2. Fechar Seccionadora 89 L2-B");
                        mostrar3.setText("         3. Fechar Seccionadora 89 BT-A");
                        mostrar4.setText("         4. Fechar Seccionadora 89 BT-B");
                        mostrar5.setText("                 5. Fechar Disjuntor 52 BT");
                        mostrar6.setText("                 6. Fechar Disjuntor 52 L2");
                        mostrar7.setText("        7. Fechar Seccionadora 89 MT-2B");
                        mostrar8.setText("         8. Abrir Seccionadora 89 MT-2A");
                        mostrar9.setText("        9. Fechar Seccionadora 89 MT-4B");
                        mostrar10.setText("       10. Abrir seccionadora 89 MT-4A");
                    }

                    if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                        mostrar1.setText("       1. Fechar Seccionadora 89 MT-2A ");
                        mostrar2.setText("         2. Abrir Seccionadora 89 MT-2B");
                        mostrar3.setText("        3. Fechar Seccionadora 89 MT-4A");
                        mostrar4.setText("         4. Abrir Seccionadora 89 MT-4B");
                        mostrar5.setText("               5. Abrir Disjuntor 52 L2");
                        mostrar6.setText("              6. Abrir Seccionadora 89 L2");
                        mostrar7.setText("                 7. Abrir Disjuntor 52 BT");
                        mostrar8.setText("            8. Abrir Seccionadora 89 BT-A");
                        mostrar9.setText("            9. Abrir Seccionadora 89 BT-B");
                        mostrar10.setText("                    10. Abrir Seccionadora 89 L2-B");
                    }

                    if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("        2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("             3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("       4. Fechar Seccionadora 89 L1-A ");
                        mostrar5.setText("         5. Abrir Seccionadora 89 L1-B");
                        mostrar6.setText("       6. Fechar Seccionadora 89 MT-RA");
                        mostrar7.setText("        7. Abrir seccionadora 89 MT-RB");
                        mostrar8.setText("       8. Fechar Seccionadora 89 MT-3A");
                        mostrar9.setText("        9. Abrir Seccionadora 89 MT-3B");
                        mostrar10.setText("     10. Fechar Seccionadora 89 MT-1A");
                        mostrar11.setText("                   11. Abrir Disjuntor 52 MT-1");
                    }

                    if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                        mostrar1.setText("             1. Abrir Disjuntor 52 MT-1");
                        mostrar2.setText("         2. Abrir Seccionadora 89 MT-1A");
                        mostrar3.setText("         3. Fechar Seccionadora 89 L1-B");
                        mostrar4.setText("          4. Abrir Seccionadora 89 L1-A");
                        mostrar5.setText("        5. Fechar Seccionadora 89 MT-RB");
                        mostrar6.setText("         6. Abrir Seccionadora 89 MT-RA");
                        mostrar7.setText("        7. Fechar Seccionadora 89 MT-3B");
                        mostrar8.setText("         8. Abrir Seccionadora 89 MT-3A");
                        mostrar9.setText("               9. Abrir Disjuntor 52 BT");
                        mostrar10.setText("        10. Abrir Seccionadora 89 BT-A");
                        mostrar11.setText("                  11. Abrir Seccionadora 89 BT-B");
                    }

                    if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                        mostrar1.setText("         1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("         2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("               3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("         4. Fechar Seccionadora 89 L1-A");
                        mostrar5.setText("          5. Abrir Seccionadora 89 L1-B");
                        mostrar6.setText("        6. Fechar Seccionadora 89 MT-1A");
                        mostrar7.setText("           7. Abrir seccionadora 89 MT-1B");
                        mostrar8.setText("          8. Fechar Seccionadora 89 MT-3A");
                        mostrar9.setText("         9. Abrir Seccionadora 89 MT-3B");
                        mostrar10.setText("      10. Fechar Seccionadora 89 MT-RA");
                        mostrar11.setText("                   11. Abrir Disjuntor 52 MT-R");
                    }

                    if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                        mostrar1.setText("            1. Abrir Disjuntor 52 MT-R");
                        mostrar2.setText("        2. Abrir Seccionadora 89 MT-RA");
                        mostrar3.setText("        3. Fechar Seccionadora 89 L1-B");
                        mostrar4.setText("         4. Abrir Seccionadora 89 L1-A");
                        mostrar5.setText("       5. Fechar Seccionadora 89 MT-1B");
                        mostrar6.setText("        6. Abrir Seccionadora 89 MT-1A");
                        mostrar7.setText("       7. Fechar Seccionadora 89 MT-3B");
                        mostrar8.setText("            8. Abrir Seccionadora 89 MT-3A");
                        mostrar9.setText("                  9. Abrir Disjuntor 52 BT");
                        mostrar10.setText("           10. Abrir Seccionadora 89 BT-A");
                        mostrar11.setText("                     11. Abrir Seccionadora 89 BT-B");
                    }

                    if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("        2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("               3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("        4. Fechar Seccionadora 89 L2-B");
                        mostrar5.setText("         5. Abrir Seccionadora 89 L2-A");
                        mostrar6.setText("       6. Fechar Seccionadora 89 MT-4B");
                        mostrar7.setText("        7. Abrir seccionadora 89 MT-4A");
                        mostrar10.setText("      8. Fechar Seccionadora 89 MT-2B");
                        mostrar11.setText("                     9. Abrir Disjuntor 52 MT-2");
                    }

                    if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                        mostrar1.setText("            1. Abrir Disjuntor 52 MT-2");
                        mostrar2.setText("        2. Abrir Seccionadora 89 MT-2B");
                        mostrar3.setText("       3. Fechar Seccionadora 89 L2-A ");
                        mostrar4.setText("        4. Abrir Seccionadora 89 L2-B ");
                        mostrar5.setText("       5. Fechar Seccionadora 89 MT-4A");
                        mostrar6.setText("        6. Abrir Seccionadora 89 MT-4B");
                        mostrar9.setText("              7.    Abrir Disjuntor 52 BT");
                        mostrar10.setText("        8. Abrir Seccionadora 89 BT-A");
                        mostrar11.setText("                      9 . Abrir Seccionadora 89 BT-B");
                    }

                    if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("        2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("             3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("        4. Fechar Seccionadora 89 L1-A");
                        mostrar5.setText("         5. Abrir Seccionadora 89 L1-B");
                        mostrar6.setText("       6. Fechar Seccionadora 89 MT-1A");
                        mostrar7.setText("        7. Abrir seccionadora 89 MT-1B");
                        mostrar8.setText("       8. Fechar Seccionadora 89 MT-RA");
                        mostrar9.setText("        9. Abrir Seccionadora 89 MT-RB");
                        mostrar10.setText("     10. Fechar Seccionadora 89 MT-3A");
                        mostrar11.setText("                     11. Abrir Disjuntor 52 MT-3");
                    }

                    if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                        mostrar1.setText("            1. Abrir Disjuntor 52 MT-3");
                        mostrar2.setText("        2. Abrir Seccionadora 89 MT-3A");
                        mostrar3.setText("        3. Fechar Seccionadora 89 L1-B");
                        mostrar4.setText("         4. Abrir Seccionadora 89 L1-A");
                        mostrar5.setText("       5. Fechar Seccionadora 89 MT-1B");
                        mostrar6.setText("        6. Abrir Seccionadora 89 MT-1A");
                        mostrar7.setText("       7. Fechar Seccionadora 89 MT-RB");
                        mostrar8.setText("        8. Abrir Seccionadora 89 MT-RA");
                        mostrar9.setText("              9. Abrir Disjuntor 52 BT");
                        mostrar10.setText("       10. Abrir Seccionadora 89 BT-A");
                        mostrar11.setText("                   11. Abrir Seccionadora 89 BT-B");
                    }

                    if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("        2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("             3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("        4. Fechar Seccionadora 89 L2-B");
                        mostrar5.setText("         5. Abrir Seccionadora 89 L2-A");
                        mostrar6.setText("       6. Fechar Seccionadora 89 MT-2B");
                        mostrar7.setText("        7. Abrir seccionadora 89 MT-2A");
                        mostrar10.setText("      8. Fechar Seccionadora 89 MT-4B");
                        mostrar11.setText("                       9. Abrir Disjuntor 52 MT-4");
                    }

                    if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                        mostrar1.setText("            1. Abrir Disjuntor 52 MT-4");
                        mostrar2.setText("        2. Abrir Seccionadora 89 MT-4B");
                        mostrar3.setText("        3. Fechar Seccionadora 89 L2-A");
                        mostrar4.setText("         4. Abrir Seccionadora 89 L2-B");
                        mostrar5.setText("       5. Fechar Seccionadora 89 MT-2A");
                        mostrar6.setText("        6. Abrir Seccionadora 89 MT-2B");
                        mostrar7.setText("              7. Abrir Disjuntor 52 BT");
                        mostrar8.setText("         8. Abrir Seccionadora 89 BT-A");
                        mostrar9.setText("                       9. Abrir Seccionadora 89 BT-B");
                    }

                    if (EnerAlbras.equals("EnergizarAlbras")) {
                        mostrar1.setText("         1. Fechar Disjuntor 52 L1");
                        mostrar2.setText("         2. Fechar Disjuntor 52 L2");
                        mostrar3.setText("         3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("         4. Fechar Disjuntor 52 AL");
                        mostrar5.setText("       5. Fechar Disjuntor 52 MT-1");
                        mostrar6.setText("       6. Fechar Disjuntor 52 MT-R");
                        mostrar7.setText("       7. Fechar Disjuntor 52 MT-2");
                        mostrar8.setText("       8. Fechar Disjuntor 52 MT-3");
                        mostrar9.setText("       9. Fechar Disjuntor 52 MT-4");
                        mostrar10.setText("       10. Fechar disjuntor 52 A1");
                        mostrar11.setText("       11. Fechar disjuntor 52 A2");
                        mostrar12.setText("       12. Fechar disjuntor 52 A3");
                        mostrar13.setText("       13. Fechar disjuntor 52 A4");
                        mostrar14.setText("       14. Fechar disjuntor 52 A5");
                        mostrar15.setText("       15. Fechar disjuntor 52 A6");
                        mostrar16.setText("       16. Fechar disjuntor 52 A7");
                        mostrar17.setText("       17. Fechar disjuntor 52 A8");
                        mostrar18.setText("       18. Fechar disjuntor 52 P1");
                        mostrar19.setText("       19. Fechar disjuntor 52 P2");
                        mostrar20.setText("       20. Fechar disjuntor 52 P3");
                        mostrar21.setText("       21. Fechar disjuntor 52 P4");
                        mostrar22.setText("       22. Fechar disjuntor 52 P5");
                        mostrar23.setText("       23. Fechar disjuntor 52 P6");
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        mostrar1.setText("         1. Abrir Disjuntor 52 L1");
                        mostrar2.setText("         2. Abrir Disjuntor 52 L2");
                        mostrar3.setText("         3. Abrir Disjuntor 52 BT");
                        mostrar4.setText("         4. Abrir Disjuntor 52 AL");
                        mostrar5.setText("       5. Abrir Disjuntor 52 MT-1");
                        mostrar6.setText("       6. Abrir Disjuntor 52 MT-R");
                        mostrar7.setText("       7. Abrir Disjuntor 52 MT-2");
                        mostrar8.setText("       8. Abrir Disjuntor 52 MT-3");
                        mostrar9.setText("       9. Abrir Disjuntor 52 MT-4");
                        mostrar10.setText("       10. Abrir disjuntor 52 A1");
                        mostrar11.setText("       11. Abrir disjuntor 52 A2");
                        mostrar12.setText("       12. Abrir disjuntor 52 A3");
                        mostrar13.setText("       13. Abrir disjuntor 52 A4");
                        mostrar14.setText("       14. Abrir disjuntor 52 A5");
                        mostrar15.setText("       15. Abrir disjuntor 52 A6");
                        mostrar16.setText("       16. Abrir disjuntor 52 A7");
                        mostrar17.setText("       17. Abrir disjuntor 52 A8");
                        mostrar18.setText("       18. Abrir disjuntor 52 P1");
                        mostrar19.setText("       19. Abrir disjuntor 52 P2");
                        mostrar20.setText("       20. Abrir disjuntor 52 P3");
                        mostrar21.setText("       21. Abrir disjuntor 52 P4");
                        mostrar22.setText("       22. Abrir disjuntor 52 P5");
                        mostrar23.setText("       23. Abrir disjuntor 52 P6");
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        mostrar1.setText("    1. Abrir Seccionadora 89 A2-E");
                        mostrar2.setText("    2. Abrir Seccionadora 89 A4-E");
                        mostrar3.setText("    3. Abrir Seccionadora 89 A6-E");
                        mostrar4.setText("    4. Abrir Seccionadora 89 A8-E");
                        mostrar5.setText(" 5. Abrir Seccionadora 89LVRR-E");
                        mostrar6.setText(" 6. Abrir Seccionadora 89LVR-R");
                        mostrar7.setText("     7. Abrir Seccionadora 89 P1");
                        mostrar8.setText("     8. Abrir Seccionadora 89 P2");
                        mostrar9.setText("     9. Abrir Seccionadora 89 P3");
                        mostrar10.setText("   10. Abrir Seccionadora 89 P4");
                        mostrar11.setText("   11. Abrir Seccionadora 89 P5");
                        mostrar12.setText("   12. Abrir Seccionadora 89 P6");
                        mostrar13.setText("13.Fechar Seccionadora 89 A2-E");
                        mostrar14.setText("14.Fechar Seccionadora 89 A4-E");
                        mostrar15.setText("15.Fechar Seccionadora 89 A6-E");
                        mostrar16.setText("16.Fechar Seccionadora 89 A8-E");
                        mostrar17.setText("17.Fechar Seccionadora 89 P1-E");
                        mostrar18.setText("18.Fechar Seccionadora 89 P2-E");
                        mostrar19.setText("19.Fechar Seccionadora 89 P3-E");
                        mostrar20.setText("20.Fechar Seccionadora 89 P4-E");
                        mostrar21.setText("21.Fechar Seccionadora 89 P5-E");
                        mostrar22.setText("22.Fechar Seccionadora 89 P6-E");
                        mostrar23.setText(" 23.Fechar Seccionadora 89 TU-E");
                        mostrar24.setText("     24. Fechar Disjuntor 52 TU");
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        mostrar1.setText("              1. Fechar Disjuntor 52 G1");
                        mostrar2.setText("                        2. Fechar Disjuntor 52 G2");
                    }

                    if (DeslProgRed1.equals("DeslProgRed1")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 C1");
                        mostrar2.setText("                   2. Desligar DisJuntor 52 C2");
                        mostrar3.setText("               3. Desligar Disjuntor 52 LVR1-A");
                        mostrar4.setText("                 4. Desligar Disjuntor 52 LVR1");
                    }

                    if (NormRed1.equals("NormalizacaoRed1")) {
                        mostrar1.setText("                   1. Ligar Disjuntor 52 LVR-1");
                        mostrar2.setText("                  2. Ligar Disjuntor 52 LVR-1A");
                        mostrar3.setText("                      3. Ligar Disjuntor 52 C1");
                        mostrar4.setText("                      4. Ligar Disjuntor 52 C2");
                    }

                    if (DeslProgRed2.equals("DeslProgRed2")) {
                        mostrar1.setText("                    1. Desligar Disjuntor 52 C3");
                        mostrar2.setText("                    2. Desligar Disjuntor 52 C4");
                        mostrar3.setText("                3. Desligar Disjuntor 52 LVR2-A");
                        mostrar4.setText("                  4. Desligar Disjuntor 52 LVR2");
                    }

                    if (NormRed2.equals("NormalizacaoRed2")) {
                        mostrar1.setText("                    1. Ligar Disjuntor 52 LVR-2");
                        mostrar2.setText("                   2. Ligar Disjuntor 52 LVR-2A");
                        mostrar3.setText("                       3. Ligar Disjuntor 52 C3");
                        mostrar4.setText("                       4. Ligar Disjuntor 52 C4");
                    }

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 C5");
                        mostrar2.setText("                   2. Desligar Disjuntor 52 C6");
                        mostrar3.setText("               3. Desligar Disjuntor 52 LVR3-A");
                        mostrar4.setText("                            4. Desligar Disjuntor 52 LVR3");
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        mostrar1.setText("                    1. Ligar Disjuntor 52 LVR-3");
                        mostrar2.setText("                   2. Ligar Disjuntor 52 LVR-3A");
                        mostrar3.setText("                       3. Ligar Disjuntor 52 C5");
                        mostrar4.setText("                                4. Ligar Disjuntor 52 C6");
                    }

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 C7");
                        mostrar2.setText("                   2. Desligar Disjuntor 52 C8");
                        mostrar3.setText("               3. Desligar Disjuntor 52 LVR4-A");
                        mostrar4.setText("                            4. Desligar Disjuntor 52 LVR4");
                    }

                    if (NormRed4.equals("NormalizacaoRed4")) {
                        mostrar1.setText("                    1. Ligar Disjuntor 52 LVR-4");
                        mostrar2.setText("                   2. Ligar Disjuntor 52 LVR-4A");
                        mostrar3.setText("                       3. Ligar Disjuntor 52 C7");
                        mostrar4.setText("                                 4. Ligar Disjuntor 52 C8");
                    }

                    if (TransfMT1MTR.equals("TransferirMT1MTR")) {
                        mostrar1.setText("     1. Desligar Disjuntor 52 P2 ");
                        mostrar2.setText("     2. Abrir Seccionadora 89 P2 ");
                        mostrar3.setText("  3. Fechar Seccionadora 89 P2-E ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C1 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C2 ");
                        mostrar6.setText("       6. Abrir Disjuntor 52 R-1 ");
                        mostrar7.setText("    7. Abrir Seccionadora 89 R-1 ");
                        mostrar8.setText("  8. Fechar Seccionadora 89 R-1E ");
                        mostrar9.setText("      9. Fechar Disjuntor 52 R-1 ");
                        mostrar10.setText("     10. Abrir Disjuntor 52 R-2 ");
                        mostrar11.setText("  11. Abrir Seccionadora 89 R-2 ");
                        mostrar12.setText("12. Fechar Seccionadora 89 R-2E ");
                        mostrar13.setText("    13. Fechar Disjuntor 52 R-2 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P2 ");
                        mostrar15.setText("      15. Abrir Disjuntor 52 P1 ");
                        mostrar16.setText("   16. Abrir Seccionadora 89 C1 ");
                        mostrar17.setText("17. Fechar Seccionadora 89 C1-E ");
                        mostrar18.setText("   18. Abrir Seccionadora 89 C2 ");
                        mostrar19.setText(" 19. Fechar Seccionadora 89 C2E ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C1 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C2 ");
                        mostrar22.setText("   22. Abrir Seccionadora 89 P1 ");
                        mostrar23.setText("23. Fechar Seccionadora 89 P1-E ");
                        mostrar24.setText("     24. Fechar Disjuntor 52 P1 ");
                    }

                    if (TransfMTRMT1.equals("TransferirMTRMT1")) {
                        mostrar1.setText("      1.Desligar Disjuntor 52 P2 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P2-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P2 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C1 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C2 ");
                        mostrar6.setText("       6. Abrir disjuntor 52 R-1 ");
                        mostrar7.setText("    7. Abrir Seccionadora89 R-1E ");
                        mostrar8.setText("  8. Fechar Secccionadora 89 R-1 ");
                        mostrar9.setText("      9. Fechar Disjuntor 52 R-1 ");
                        mostrar10.setText("     10. Abrir Disjuntor 52 R-2 ");
                        mostrar11.setText(" 11. Abrir Seccionadora 89 R-2E ");
                        mostrar12.setText(" 12. Fechar Seccionadora 89 R-2 ");
                        mostrar13.setText("    13. Fechar Disjuntor 52 R-2 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P2 ");
                        mostrar15.setText("     15. Abrir Disjuntor  52 P1 ");
                        mostrar16.setText(" 16. Abrir Seccionadora 89 C1-E ");
                        mostrar17.setText("  17. Fechar Seccionadora 89 C1 ");
                        mostrar18.setText(" 18. Abrir Seccionadora 89 C2-E ");
                        mostrar19.setText("   19. Fechar Seccionadora 89 C2");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C1 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C2 ");
                        mostrar22.setText(" 22. Abrir Seccionadora 89 P1-E ");
                        mostrar23.setText("  23. Fechar Seccionadora 89 P1 ");
                        mostrar24.setText("     24. Fechar Disjuntor 52 P1 ");
                    }

                    if (TransfMT2MTR.equals("TransferirMT2MTR")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 C3 ");
                        mostrar2.setText("        2. Abrir Disjuntor 52 C4 ");
                        mostrar3.setText("       3. Abrir Disjuntor 52 R-8 ");
                        mostrar4.setText("   4. abrir Seccionadora  89 R-8 ");
                        mostrar5.setText("  5. Fechar Seccionadora 89 R-8E ");
                        mostrar6.setText("      6. Fechar Disjuntor 52 R-8 ");
                        mostrar7.setText("       7. Abrir Disjuntor 52 R-9 ");
                        mostrar8.setText("    8. Abrir Seccionadora 89 R-9 ");
                        mostrar9.setText("  9.Fechar Seccionadora 89 R-9E: ");
                        mostrar10.setText("    10. Fechar disjuntor 52 R-9 ");
                        mostrar11.setText("      11. Abrir Disjuntor 52 P3 ");
                        mostrar12.setText("   12. Abrir Seccionadora 89 C3 ");
                        mostrar13.setText("13. Fechar Seccionadora 89 C3-E ");
                        mostrar14.setText("   14. Abrir Seccionadora 89 C4 ");
                        mostrar15.setText("15. Fechar Seccionadora  89 C4-E");
                        mostrar16.setText("     16. Fechar Disjuntor 52 C3 ");
                        mostrar17.setText("     17. Fechar Disjuntor 52 C4 ");
                        mostrar18.setText("   18. Abrir Seccionadora 89 P3 ");
                        mostrar19.setText("19. Fechar Seccionadora 89 P3-E ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 P3 ");
                    }

                    if (TransfMTRMT2.equals("TransferirMTRMT2")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 P3 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P3-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P3 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C3 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C4 ");
                        mostrar6.setText("       6. Abrir disjuntor 52 R-8 ");
                        mostrar7.setText("   7. Abrir Seccionadora 89 R-8E ");
                        mostrar8.setText("   8. Fechar Seccionadora 89 R-8 ");
                        mostrar9.setText("      9. Fechar Disjuntor 52 R-8 ");
                        mostrar10.setText("      10 Abrir Disjuntor 52 R-9 ");
                        mostrar11.setText(" 11. Abrir Seccionadora 89 R-9E ");
                        mostrar12.setText(" 12. Fechar Seccionaodra 89 R-9 ");
                        mostrar13.setText("    13. Fechar Disjuntor 52 R-9 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P3 ");
                        mostrar15.setText(" 15. Abrir Seccionadora 89 C3-E ");
                        mostrar16.setText("  16. Fechar Seccionadora 89 C3 ");
                        mostrar17.setText(" 17. Abrir Seccionadora 89 C4-E ");
                        mostrar18.setText("  18. Fechar Seccionadora 89 C4 ");
                        mostrar19.setText("     19. Fechar disjuntor 52 C3 ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C4 ");
                    }

                    if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 P5 ");
                        mostrar2.setText("     2. Abrir Seccionadora 89 P5 ");
                        mostrar3.setText("  3. Fechar Seccionadora 89 P5-E ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C5 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C6 ");
                        mostrar6.setText("      6. Abrir Disjuntor 52 R-14 ");
                        mostrar7.setText("7. Abrir Seccionadora 89 R-14 ");
                        mostrar8.setText(" 8. Fechar Seccionadora 89 R-14E ");
                        mostrar9.setText("  9. Fechar Disjuntor 52 R-14 ");
                        mostrar10.setText("    10. Abrir Disjuntor 52 R-15 ");
                        mostrar11.setText("11. Abrir Seccionadora 89 R-15");
                        mostrar12.setText("12.Fechar Seccionadora 89 R-15E ");
                        mostrar13.setText("   13. Fechar Disjuntor 52 R-15 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P5 ");
                        mostrar15.setText("      15. Abrir disjuntor 52 P4 ");
                        mostrar16.setText("   16. Abrir Seccionadora 89 C5 ");
                        mostrar17.setText("17. Fechar Seccionadora 89 C5-E ");
                        mostrar18.setText("   18. Abrir Seccionadora 89 C6 ");
                        mostrar19.setText(" 19. Fechar Seccionadora 89 C6-E");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C5 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C6 ");
                        mostrar22.setText("   22. Abrir Seccionadora 89 P4 ");
                        mostrar23.setText("23. Fechar Seccionadora 89 P4-E ");
                        mostrar24.setText("    24. Fechar Disjuntor 52 P4 ");
                    }

                    if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 P5 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P5-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P5 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C5 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C6 ");
                        mostrar6.setText("      6. Abrir Disjuntor 52 R-14 ");
                        mostrar7.setText(" 7. Abrir Seccionadora 89 R-14E ");
                        mostrar8.setText(" 8. Fechar Seccionadora 89 R-14 ");
                        mostrar9.setText("     9. Fechar Disjuntor 52 R-14 ");
                        mostrar10.setText("    10. Abrir Disjuntor 52 R-15 ");
                        mostrar11.setText("11. Abrir Seccionadora 89 R-15E");
                        mostrar12.setText("12. Fechar Seccionadora 89 R-15");
                        mostrar13.setText("   13. Fechar Disjuntor 52 R-15 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P5 ");
                        mostrar15.setText("      15. Abrir Disjuntor 52 P4 ");
                        mostrar16.setText(" 16. Abrir Seccionadora 89 C5-E ");
                        mostrar17.setText("  17. Fechar Seccionadora 89 C5 ");
                        mostrar18.setText(" 18. Abrir Seccionadora 89 C6-E ");
                        mostrar19.setText("   19. Fechar Seccionadora 89 C6");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C5 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C6 ");
                        mostrar22.setText(" 22. Abrir Seccionadora 89 P4-E ");
                        mostrar23.setText("  23. Fechar Seccionadora 89 P4 ");
                        mostrar24.setText("     24. Fechar Disjuntor 52 P4 ");
                    }

                    if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 C7 ");
                        mostrar2.setText("        2. Abrir Disjuntor 52 C8 ");
                        mostrar3.setText("      3. Abrir Disjuntor 52 R-20 ");
                        mostrar4.setText("  4. abrir Seccionadora  89 R-20 ");
                        mostrar5.setText(" 5. Fechar Seccionadora 89 R-20E ");
                        mostrar6.setText("     6. Fechar Disjuntor 52 R-20 ");
                        mostrar7.setText("      7. Abrir Disjuntor 52 R-21 ");
                        mostrar8.setText("   8. Abrir Seccionadora 89 R-21 ");
                        mostrar9.setText(" 9.Fechar Seccionadora 89 R-21E: ");
                        mostrar10.setText("   10. Fechar disjuntor 52 R-21 ");
                        mostrar11.setText("      11. Abrir Disjuntor 52 P6 ");
                        mostrar12.setText("   12. Abrir Seccionadora 89 C7 ");
                        mostrar13.setText("13. Fechar Seccionadora 89 C7-E ");
                        mostrar14.setText("   14. Abrir Seccionadora 89 C8 ");
                        mostrar15.setText("15. Fechar Seccionadora  89 C8-E");
                        mostrar16.setText("     16. Fechar Disjuntor 52 C7 ");
                        mostrar17.setText("     17. Fechar Disjuntor 52 C8 ");
                        mostrar18.setText("   18. Abrir Seccionadora 89 P6 ");
                        mostrar19.setText("19. Fechar Seccionadora 89 P6-E ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 P6 ");
                    }

                    if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 P6 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P6-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P6 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C7 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C8 ");
                        mostrar6.setText("      6. Abrir disjuntor 52 R-20 ");
                        mostrar7.setText(" 7. Abrir Seccionadora 89 R-20E ");
                        mostrar8.setText("  8. Fechar Seccionadora 89 R-20 ");
                        mostrar9.setText("     9. Fechar Disjuntor 52 R-20 ");
                        mostrar10.setText("     10 Abrir Disjuntor 52 R-21 ");
                        mostrar11.setText("11. Abrir Seccionadora 89 R-21E");
                        mostrar12.setText("12. Fechar Seccionaodra 89 R-21 ");
                        mostrar13.setText("   13. Fechar Disjuntor 52 R-21 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P6 ");
                        mostrar15.setText(" 15. Abrir Seccionadora 89 C7-E ");
                        mostrar16.setText("  16. Fechar Seccionadora 89 C7 ");
                        mostrar17.setText(" 17. Abrir Seccionadora 89 C8-E ");
                        mostrar18.setText("  18. Fechar Seccionadora 89 C8 ");
                        mostrar19.setText("     19. Fechar disjuntor 52 C7 ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C8 ");
                    }

                    if (EnergBarraEM.equals("EnergBarraEM")) {
                        mostrar1.setText("                      1. Ligar Disjuntor 52 G1");
                        mostrar2.setText("                      2. Ligar Disjuntor 52 G2");
                        mostrar3.setText("                3. Fechar Seccionadora 89 TU-E");
                        mostrar4.setText("                           4. Ligar Disjuntor 52 TU");
                    }

                    if (DesenBarraEM.equals("DesenBarraEM")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 TU ");
                        mostrar2.setText("                 2. Abrir Seccionadora 89 TU-E ");
                        mostrar3.setText("                    3. Desligar Disjuntor 52 G1");
                        mostrar4.setText("                         4. Desligar Disjuntor 52 G2");
                    }

                    if (EnergCargas.equals("EnergCargas")) {
                        mostrar1.setText("                    1. Fechar Disjuntor 52 A1");
                        mostrar2.setText("                    2. Fechar Disjuntor 52 A3");
                        mostrar3.setText("                    3. Fechar Disjuntor 52 A5");
                        mostrar4.setText("                    4. Fechar Disjuntor 52 A7");
                        mostrar5.setText("                    5. Fechar Disjuntor 52 P1");
                        mostrar6.setText("                    6. Fechar Disjuntor 52 P2");
                        mostrar7.setText("                    7. Fechar Disjuntor 52 P3");
                        mostrar8.setText("                    8. Fechar Disjuntor 52 P4");
                        mostrar9.setText("                    9. Fechar Disjuntor 52 P5");
                        mostrar10.setText("                  10. Fechar Disjuntor 52 P6");
                    }

                    if (DeslCargas.equals("DeslCargas")) {
                        mostrar1.setText("                    1. Abrir Disjuntor 52 A1");
                        mostrar2.setText("                    2. Abrir Disjuntor 52 A3");
                        mostrar3.setText("                    3. Abrir Disjuntor 52 A5");
                        mostrar4.setText("                    4. Abrir Disjuntor 52 A7");
                        mostrar5.setText("                    5. Abrir Disjuntor 52 P1");
                        mostrar6.setText("                    6. Abrir Disjuntor 52 P2");
                        mostrar7.setText("                    7. Abrir Disjuntor 52 P3");
                        mostrar8.setText("                    8. Abrir Disjuntor 52 P4");
                        mostrar9.setText("                    9. Abrir Disjuntor 52 P5");
                        mostrar10.setText("                  10. Abrir Disjuntor 52 P6");
                    }

                    if (EnerL1.equals("EnergizarLinha1")) {
                        manobra = "         OM Energizar o Bay da Linha 1    ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL1.equals("DesenergizarLinha1")) {
                        manobra = " OM Desenergizar o Bay da Linha 1 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL2.equals("EnergizarLinha2")) {
                        manobra = "         OM Energizar o Bay da Linha 2    ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL2.equals("DesenergizarLinha2")) {
                        manobra = " OM Desenergizar o Bay da Linha 2 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                        manobra = " OM Energizar o Bay da Linha 1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                        manobra = " OM Desenergizar o Bay da Linha 1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                        manobra = " OM Energizar o Bay da Linha 2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                        manobra = " OM Desenergizar o Bay da Linha 2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                        manobra = " OM Energizar o Bay do MT-1 e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                        manobra = " OM Energizar o Bay do MT-R e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-R e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                        manobra = " OM Energizar o Bay do MT-2 e Barra B ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                        manobra = " OM Desenergizar o Bay do MT-2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                        manobra = " OM Energizar o Bay do MT-3 e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-3 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                        manobra = " OM Energizar o Bay do MT-4 e Barra B ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                        manobra = " OM Desenergizar o Bay do MT-4 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerAlbras.equals("EnergizarAlbras")) {
                        manobra = " OM para Energizar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        manobra = " OM para Desenergizar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        manobra = " OM para Preparar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        manobra = " OM para Energizar os Geradores ";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed1.equals("DeslProgRed1")) {
                        manobra = " OM para Desligar a Redução 1 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed1.equals("NormalizacaoRed1")) {
                        manobra = " OM para Normalizar a Redução 1 ";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed2.equals("DeslProgRed2")) {
                        manobra = " OM para Desligar a Redução 2 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed2.equals("NormalizacaoRed2")) {
                        manobra = " OM para Normalizar a Redução 2 ";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        manobra = " OM para Desligar a Redução 3 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        manobra = " OM para Normalizar a Redução 3 ";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        manobra = " OM para Desligar a Redução 4 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed4.equals("NormalizacaoRed4")) {
                        manobra = " OM para Normalizar a Redução 4 ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT1MTR.equals("TransferirMT1MTR")) {
                        manobra = " OM para Transferir do Trafo MT-1 para o MT-R ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT1.equals("TransferirMTRMT1")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-1 ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT2MTR.equals("TransferirMT2MTR")) {
                        manobra = " OM para Transferir do Trafo MT-2 para o MT-R ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT2.equals("TransferirMTRMT2")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-2 ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                        manobra = " OM para Transferir do Trafo MT-3 para o MT-R ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-3 ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                        manobra = " OM para Transferir do Trafo MT-4 para o MT-R ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-4 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnergBarraEM.equals("EnergBarraEM")) {
                        manobra = " OM para Energizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DesenBarraEM.equals("DesenBarraEM")) {
                        manobra = " OM para Desenergizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (EnergCargas.equals("EnergCargas")) {
                        manobra = " OM para Energizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DeslCargas.equals("DeslCargas")) {
                        manobra = " OM para Desenergizar as Cargas pelo Gerador";
                        lbManobra.setText(manobra);
                    }
                }
            });

            Limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    passo = 0;
                    mostrar1.setText("");
                    mostrar2.setText("");
                    mostrar3.setText("");
                    mostrar4.setText("");
                    mostrar5.setText("");
                    mostrar6.setText("");
                    mostrar7.setText("");
                    mostrar8.setText("");
                    mostrar9.setText("");
                    mostrar10.setText("");
                    mostrar11.setText("");
                    mostrar12.setText("");
                    mostrar13.setText("");
                    mostrar14.setText("");
                    mostrar15.setText("");
                    mostrar16.setText("");
                    mostrar17.setText("");
                    mostrar18.setText("");
                    mostrar19.setText("");
                    mostrar20.setText("");
                    mostrar21.setText("");
                    mostrar22.setText("");
                    mostrar23.setText("");
                    mostrar24.setText("");
                    manobra = "                               MANOBRA:                               ";
                    lbManobra.setText(manobra);
                    limparMemoria();
                }
            });

            Sair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                    setVisible(false);
                }
            });
        }// Fim main
    }// Fim Teste

    // ################################################# CLASSE MANOBRA INTELIGENTE
    public class ManobraInteligente {
        Relogio relogio = new Relogio();

        int passo = 0;
        int performance = 0;

        public ManobraInteligente() {
        }

        public void EnerL1() {
            if (EnerL1.equals("EnergizarLinha1")) {
                relogio.quantpassos = 3;
                if (seccionadora89l1fechada.equals("Seccionadora 89L1 Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    passo = passo + 1;
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso!", "Energizar Bay da Linha 1",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!", "Energizar Bay da Linha 1",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso!", "Energizar Bay da Linha 1",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 3 && seccionadora89l1fechada.equals("Seccionadora 89L1 Fechada") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay da Linha 1! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay da Linha 1 Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenerL1() {
            if (DesenL1.equals("DesenergizarLinha1")) {
                relogio.quantpassos = 3;
                if (disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso!",
                            "Desenergizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aberta.equals("Seccionadora 89L1 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!",
                            "Desenergizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 3;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    if (passo == 3 && disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") &&
                            seccionadora89l1aberta.equals("Seccionadora 89L1 Aberta") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") ||
                            seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay da Linha 1! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.setVisible(false);
                    relogio.passo = 3;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null,
                            "OM para Desenergizar Bay da Linha 1! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                            "Energizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar a Linha 1 incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerL2() {
            if (EnerL2.equals("EnergizarLinha2")) {
                relogio.quantpassos = 3;
                if (seccionadora89l2fechada.equals("Seccionadora 89L2 Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso com sucesso!",
                            "Energizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso com sucesso!",
                            "Energizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!!! com sucesso!",
                            "Energizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 3 && seccionadora89l2fechada.equals("Seccionadora 89L2 Fechada") &&
                            seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") &&
                            disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") ||
                            seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay da Linha 2! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar a Linha 2 incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenerL2() {
            if (DesenL2.equals("DesenergizarLinha2")) {
                relogio.quantpassos = 3;
                if (disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso com sucesso!",
                            "Desenergizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2aberta.equals("Seccionadora 89L2 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso com sucesso!",
                            "Desenergizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 3;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    if (passo == 3 && disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") &&
                            seccionadora89l2aberta.equals("Seccionadora 89L2 Aberta") &&
                            seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") ||
                            seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay da Linha 2! Concluída com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                }

                else if (seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null,
                            "OM para Desenergizar Bay da Linha 2! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                            "Desenergizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar a Linha 2 incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerL1InterBarra() {
            if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                relogio.quantpassos = 12;
                if (seccionadora89l1fechada.equals("Seccionadora 89L1 Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 1) {
                    seccionadora89l1afechada = "Seccionadora 89L1-A Fechada";
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluído com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluído com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluído com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluído com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluído com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluído com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 concluído com sucesso!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") && passo == 11) {
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.atualizaTempo();
                    relogio.passo = 12;
                    relogio.rendimento();

                    if (passo == 12 && seccionadora89l1fechada.equals("Seccionadora 89L1 Fechada") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") &&
                            seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") &&
                            seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") &&
                            seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") &&
                            seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") ||
                            passo != 12)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay da Linha 1 e Barra 'A'! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                    status2.setText("OM para Energizar Bay da Linha 1 e Barra 'A' Concluida com sucesso!");
                } else {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar a Linha 1 e Barra 'A' incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenerL1InterBarra() {
            if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                relogio.quantpassos = 12;
                if (seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aberta.equals("Seccionadora 89L1 Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                    disjuntor52btfechado = "Disjuntor 52BT Fechado";
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 concluido com sucesso!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 11) {
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 12 && seccionadora89l1aberta.equals("Seccionadora 89L1 Aberta") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") &&
                            seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") &&
                            seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") &&
                            seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") &&
                            seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") &&
                            seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay da Linha 1 e Barra 'A'! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                    status2.setText("OM para Desenergizar Bay da Linha 1 e Barra 'A'! Concluida com sucesso!");
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null,
                            "OM para Desenergizar Bay da Linha 1 e Barra 'A'! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay da Linha 1 e Barra 'A' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerL2InterBarra() {
            if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                relogio.quantpassos = 12;
                if (seccionadora89l2fechada.equals("Seccionadora 89L2 Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concludo com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2aaberta.equals("Seccionadora 89MT-2A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4aaberta.equals("Seccionadora 89MT-4A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 12;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    if (passo == 10 && seccionadora89l2fechada.equals("Seccionadora 89L2 Fechada") &&
                            seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") &&
                            seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                            seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") &&
                            seccionadora89mt2aaberta.equals("Seccionadora 89MT-2A Aberta") &&
                            seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") &&
                            seccionadora89mt4aaberta.equals("Seccionadora 89MT-4A Aberta") ||
                            passo != 10)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay da Linha 2 e Barra 'B'! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay da Linha 2 e Barra 'B' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenerL2InterBarra() {
            if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                relogio.quantpassos = 12;
                if (seccionadora89mt2afechada.equals("Seccionadora 89MT-2A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4afechada.equals("Seccionadora 89MT-4A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2aberta.equals("Seccionadora 89L2 Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 12;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 10 && seccionadora89l2aberta.equals("Seccionadora 89L2 Aberta") &&
                            seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") &&
                            seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") &&
                            seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") &&
                            seccionadora89mt2afechada.equals("Seccionadora 89MT-2A Fechada") &&
                            seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") &&
                            seccionadora89mt4afechada.equals("Seccionadora 89MT-4A Fechada"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay da Linha 2 e Barra 'B'! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                }

                else if (seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") && passo == 9) {
                    passo = passo + 1;
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay da Linha 2 e Barra 'B' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMT1BarraA() {
            if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                relogio.quantpassos = 11;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluído com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluído com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluído com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluído com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluído com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluído com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluído com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluído com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluído com sucesso!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") && passo == 10) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") &&
                            seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") &&
                            seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") &&
                            seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") &&
                            seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") &&
                            seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") &&
                            disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-1 e Barra A! Concluída com sucesso! Não esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-1e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MT-1 e Barra 'A' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMT1BarraA() {
            if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                relogio.quantpassos = 11;
                if (disjuntor52mt1aberto.equals("Disjuntor 52MT-1 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") &&
                            seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") &&
                            seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") &&
                            seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") &&
                            seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") &&
                            seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") &&
                            seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") &&
                            disjuntor52mt1aberto.equals("Disjuntor 52MT-1 Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-1 e Barra A! Concluida com sucesso! Não esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-1e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MT-1 e Barra 'A' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMTRBarraA() {
            if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                relogio.quantpassos = 11;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 3) {
                    seccionadora89l1afechada = "Seccionadora 89L1-A Fechada";
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 5) {
                    seccionadora89mt1afechada = "Seccionadora 89MT-1A Fechada";
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") && passo == 10) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") &&
                            seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") &&
                            seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") &&
                            seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") &&
                            seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") &&
                            seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") &&
                            disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-R e Barra A Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-R", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MTR e Barra 'A' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMTRBarraA() {
            if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                relogio.quantpassos = 11;
                if (disjuntor52mtraberto.equals("Disjuntor 52MT-R Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") &&
                            seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") &&
                            seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") &&
                            seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") &&
                            seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") &&
                            seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") &&
                            seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") &&
                            disjuntor52mtraberto.equals("Disjuntor 52MT-R Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-R e Barra A! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MTR e Barra 'A' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMT2BarraB() {
            if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                relogio.quantpassos = 9;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4aaberta.equals("Seccionadora 89MT-4A Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 9;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 9 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") &&
                            seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") &&
                            seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") &&
                            seccionadora89mt4aaberta.equals("Seccionadora 89MT-4A Aberta") &&
                            seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") &&
                            disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") ||
                            passo != 9)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-2 e Barra B Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-2", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MT-2 e Barra 'B' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMT2BarraB() {
            if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                relogio.quantpassos = 9;
                if (disjuntor52mt2aberto.equals("Disjuntor 52MT-2 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4afechada.equals("Seccionadora 89MT-4A Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Desenergizar Bay do MT-1 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 9 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") &&
                            seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") &&
                            seccionadora89mt4afechada.equals("Seccionadora 89MT-4A Fechada") &&
                            seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") &&
                            seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") &&
                            disjuntor52mt2aberto.equals("Disjuntor 52MT-2 Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-2 e Barra 'B' Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MT-2 e Barra 'B' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMT3BarraA() {
            if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                relogio.quantpassos = 11;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 3) {
                    seccionadora89l1afechada = "Seccionadora 89L1-A Fechada";
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") && passo == 10) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") &&
                            seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") &&
                            seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") &&
                            seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") &&
                            seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") &&
                            seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") &&
                            disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-3 e Barra A Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-3", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MT-3 e Barra 'A' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMT3BarraA() {
            if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                relogio.quantpassos = 11;
                if (disjuntor52mt3aberto.equals("Disjuntor 52MT-3 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") &&
                            seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") &&
                            seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") &&
                            seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") &&
                            seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") &&
                            seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") &&
                            seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") &&
                            disjuntor52mt3aberto.equals("Disjuntor 52MT-3 Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-3 e Barra A! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MT-3 e Barra 'A' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMT4BarraB() {
            if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                relogio.quantpassos = 9;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2aaberta.equals("Seccionadora 89MT-2A Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 9;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 9 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") &&
                            seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") &&
                            seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") &&
                            seccionadora89mt2aaberta.equals("Seccionadora 89MT-2A Aberta") &&
                            seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") &&
                            disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") ||
                            passo != 9)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-4 e Barra 'B'! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-4", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MT-4 e Barra 'B' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMT4BarraB() {
            if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                relogio.quantpassos = 9;
                if (disjuntor52mt4aberto.equals("Disjuntor 52MT-4 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2afechada.equals("Seccionadora 89MT-2A Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 9 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") &&
                            seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") &&
                            seccionadora89mt2afechada.equals("Seccionadora 89MT-2A Fechada") &&
                            seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") &&
                            seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") &&
                            disjuntor52mt4aberto.equals("Disjuntor 52MT-4 Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-4 e Barra 'B'! Concluida com sucesso! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MT-4 e Barra 'B' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerAlbras() {
            if (EnerAlbras.equals("EnergizarAlbras")) {
                relogio.quantpassos = 23;
                if (disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52alfechado.equals("Disjuntor 52AL Fechado") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a1fechado.equals("Disjuntor 52A1 Fechado") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a2fechado.equals("Disjuntor 52A2 Fechado") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a3fechado.equals("Disjuntor 52A3 Fechado") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a4fechado.equals("Disjuntor 52A4 Fechado") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a5fechado.equals("Disjuntor 52A5 Fechado") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a6fechado.equals("Disjuntor 52A6 Fechado") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a7fechado.equals("Disjuntor 52A7 Fechado") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a8fechado.equals("Disjuntor 52A8 Fechado") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p2fechado.equals("Disjuntor 52P2 Fechado") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p3fechado.equals("Disjuntor 52P3 Fechado") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p4fechado.equals("Disjuntor 52P4 Fechado") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 23 && disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 23)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar a SE ALBRAS ! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar a SE ALBRAS Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenAlbras() {
            if (DesenAlbras.equals("DesenergizarAlbras")) {
                relogio.quantpassos = 23;
                if (disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52alaberto.equals("Disjuntor 52AL Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt1aberto.equals("Disjuntor 52MT-1 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso!",
                            "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mtraberto.equals("Disjuntor 52MT-R Aberto") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt2aberto.equals("Disjuntor 52MT-2 Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt3aberto.equals("Disjuntor 52MT-3 Aberto") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt4aberto.equals("Disjuntor 52MT-4 Aberto") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52alaberto.equals("Disjuntor 52A1 Aberto") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a2aberto.equals("Disjuntor 52A2 Aberto") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a3aberto.equals("Disjuntor 52A3 Aberto") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a4aberto.equals("Disjuntor 52A4 Aberto") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a5aberto.equals("Disjuntor 52A5 Aberto") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a6aberto.equals("Disjuntor 52A6 Aberto") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a7aberto.equals("Disjuntor 52A7 Aberto") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a8aberto.equals("Disjuntor 52A8 Aberto") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p1aberto.equals("Disjuntor 52P1 Aberto") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p2aberto.equals("Disjuntor 52P2 Aberto") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p3aberto.equals("Disjuntor 52P3 Aberto") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p4aberto.equals("Disjuntor 52P4 Aberto") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p5aberto.equals("Disjuntor 52P5 Aberto") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p6aberto.equals("Disjuntor 52P6 Aberto") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 23 && disjuntor52p6aberto.equals("Disjuntor 52P6 Aberto") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 23)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar a SE ALBRAS ! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar a SE ALBRAS Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void PrepAlbras() {
            if (PrepAlbras.equals("PrepAlbras")) {
                relogio.quantpassos = 33;
                if (seccionadora89a2eaberta.equals("Seccionadora 89A2E Aberta") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89a4eaberta.equals("Seccionadora 89A4E Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89a6eaberta.equals("Seccionadora 89A6E Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89a8eaberta.equals("Seccionadora 89A8E Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89lvrreaberta.equals("Seccionadora 89LVRRE Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89lvrraberta.equals("Seccionadora 89LVRR Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1aberta.equals("Seccionadora 89P1 Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p2aberta.equals("Seccionadora 89P2 Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p3aberta.equals("Seccionadora 89P3 Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p4aberta.equals("Seccionadora 89P4 Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p5aberta.equals("Seccionadora 89P5 Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p6aberta.equals("Seccionadora 89P6 Aberta") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89a2efechada.equals("Seccionadora 89A2E Fechada") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89a4efechada.equals("Seccionadora 89A4E Fechada") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89a6efechada.equals("Seccionadora 89A6E Fechada") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89a8efechada.equals("Seccionadora 89A8E Fechada") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p1efechada.equals("Seccionadora 89P1E Fechada") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p2efechada.equals("Seccionadora 89P2E Fechada") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p3efechada.equals("Seccionadora 89P3E Fechada") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p4efechada.equals("Seccionadora 89P4E Fechada") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p5efechada.equals("Seccionadora 89P5E Fechada") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p6efechada.equals("Seccionadora 89P6E Fechada") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89tuefechada.equals("Seccionadora 89tuE Fechada") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52tufechado.equals("Disjuntor 52TU Fechado") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a2fechado.equals("Disjuntor 52A2 Fechado") && passo == 23) {
                    passo = passo + 1;
                    relogio.passo = 24;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 24 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a4fechado.equals("Disjuntor 52A4 Fechado") && passo == 24) {
                    passo = passo + 1;
                    relogio.passo = 25;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 25 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a6fechado.equals("Disjuntor 52A6 Fechado") && passo == 25) {
                    passo = passo + 1;
                    relogio.passo = 26;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 26 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a8fechado.equals("Disjuntor 52A8 Fechado") && passo == 26) {
                    passo = passo + 1;
                    relogio.passo = 27;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 27 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 27) {
                    passo = passo + 1;
                    relogio.passo = 28;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 28 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p2fechado.equals("Disjuntor 52P2 Fechado") && passo == 28) {
                    passo = passo + 1;
                    relogio.passo = 29;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 29 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p3fechado.equals("Disjuntor 52P3 Fechado") && passo == 29) {
                    passo = passo + 1;
                    relogio.passo = 30;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 30 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p4fechado.equals("Disjuntor 52P4 Fechado") && passo == 30) {
                    passo = passo + 1;
                    relogio.passo = 31;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 31 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") && passo == 31) {
                    passo = passo + 1;
                    relogio.passo = 32;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 32 realizado com sucesso!",
                            "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") && passo == 32) {
                    passo = passo + 1;
                    relogio.passo = 33;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 33 && disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 33)
                        JOptionPane.showMessageDialog(null,
                                "OM para Preparar a SE ALBRAS ! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Preparar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para preparar a SE ALBRAS Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void TransfMT1MTR() {
            if (TransfMT1MTR.equals("TransfMT1MTR")) {
                relogio.quantpassos = 24;
                if (disjuntor52p2aberto.equals("Disjuntor 52P2 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p2aberta.equals("Seccionadora 89P2 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p2efechada.equals("Seccionadora 89P2E Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c1aberto.equals("Disjuntor 52C1 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c2aberto.equals("Disjuntor 52C2 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r1aberto.equals("Disjuntor 52R1 Aberto") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r1aberta.equals("Seccionadora 89R1 Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r1efechada.equals("Seccionadora 89R1E fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r1fechado.equals("Disjuntor 52R1 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r2aberto.equals("Disjuntor 52R2 Aberto") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r2aberta.equals("Seccionadora 89R2 Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89r2efechada.equals("Seccionadora 89R2E Fechada") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52r2fechado.equals("Disjuntor 52R2 Fechado") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p2fechado.equals("Disjuntor 52P2 Fechado") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p1aberto.equals("Disjuntor 52P1 Aberto") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c1aberta.equals("Seccionadora 89C1 Aberta") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c1efechada.equals("Seccionadora 89C1E Fechada") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p2efechada.equals("Seccionadora 89P2E Fechada") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c2aberta.equals("Seccionadora 89c2 Aberta") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c2efechada.equals("Seccionadora 89C2E Fechada") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52c1fechado.equals("Disjuntor 52C1 Fechado") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52c2fechado.equals("Disjuntor 52C2 Fechado") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1aberta.equals("Seccionadora 89P1 Aberta") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1efechada.equals("Seccionadora 89P1E Fechada") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 32) {
                    passo = passo + 1;
                    relogio.passo = 24;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 24 && disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 24)
                        JOptionPane.showMessageDialog(null,
                                "OM para Transferir do MT-1 para MT-R ! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para preparar a SE ALBRAS Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

    }// Fim Teste

    public void limparMemoria() {
        manobrainteligente.passo = 0;
        seccionadora89l1fechada = "";
        seccionadora89l1afechada = "";
        seccionadora89l1bfechada = "";
        seccionadora89l1aberta = "";
        seccionadora89l1aaberta = "";
        seccionadora89l1baberta = "";
        seccionadora89l2fechada = "";
        seccionadora89l2afechada = "";
        seccionadora89alafechada = "";
        seccionadora89l2bfechada = "";
        seccionadora89l2aberta = "";
        seccionadora89l2aaberta = "";
        seccionadora89l2baberta = "";
        seccionadora89albfechada = "";
        seccionadora89albaberta = "";
        seccionadora89btafechada = "";
        seccionadora89btbfechada = "";
        seccionadora89btaaberta = "";
        seccionadora89btbaberta = "";
        seccionadora89mt1afechada = "";
        seccionadora89mt1aaberta = "";
        seccionadora89mt1bfechada = "";
        seccionadora89mt1baberta = "";
        seccionadora89mtrafechada = "";
        seccionadora89mtraaberta = "";
        seccionadora89mtrbfechada = "";
        seccionadora89mtrbaberta = "";
        seccionadora89mt2afechada = "";
        seccionadora89mt2aaberta = "";
        seccionadora89mt2bfechada = "";
        seccionadora89mt2baberta = "";
        seccionadora89mt3afechada = "";
        seccionadora89mt3aaberta = "";
        seccionadora89mt3bfechada = "";
        seccionadora89mt3baberta = "";
        seccionadora89mt4afechada = "";
        seccionadora89mt4aaberta = "";
        seccionadora89mt4bfechada = "";
        seccionadora89mt4baberta = "";
        seccionadora89a2eaberta = "";
        seccionadora89a4eaberta = "";
        seccionadora89a6eaberta = "";
        seccionadora89a8eaberta = "";
        seccionadora89p1aberta = "";
        seccionadora89lvrreaberta = "";
        seccionadora89lvrraberta = "";
        seccionadora89p2aberta = "";
        seccionadora89p3aberta = "";
        seccionadora89p4aberta = "";
        seccionadora89p5aberta = "";
        seccionadora89p6aberta = "";
        seccionadora89a2efechada = "";
        seccionadora89a4efechada = "";
        seccionadora89a6efechada = "";
        seccionadora89a8efechada = "";
        seccionadora89p1efechada = "";
        seccionadora89p2efechada = "";
        seccionadora89p3efechada = "";
        seccionadora89p4efechada = "";
        seccionadora89p5efechada = "";
        seccionadora89p6efechada = "";
        seccionadora89tuefechada = "";
        seccionadora89c1aberta = "";
        seccionadora89c2aberta = "";
        seccionadora89c3aberta = "";
        seccionadora89c4aberta = "";
        seccionadora89c5aberta = "";
        seccionadora89c6aberta = "";
        seccionadora89c1eaberta = "";
        seccionadora89c2eaberta = "";
        seccionadora89c3eaberta = "";
        seccionadora89c4eaberta = "";
        seccionadora89c5eaberta = "";
        seccionadora89c6eaberta = "";
        seccionadora89c1efechada = "";
        seccionadora89c2efechada = "";
        seccionadora89c3efechada = "";
        seccionadora89c4efechada = "";
        seccionadora89c5efechada = "";
        seccionadora89c6efechada = "";
        seccionadora89r1aberta = "";
        seccionadora89r2aberta = "";
        seccionadora89r3aberta = "";
        seccionadora89r4aberta = "";
        seccionadora89r5aberta = "";
        seccionadora89r6aberta = "";
        seccionadora89r1eaberta = "";
        seccionadora89r2eaberta = "";
        seccionadora89r3eaberta = "";
        seccionadora89r4eaberta = "";
        seccionadora89r5eaberta = "";
        seccionadora89r6eaberta = "";
        seccionadora89r1efechada = "";
        seccionadora89r2efechada = "";
        seccionadora89r3efechada = "";
        seccionadora89r4efechada = "";
        seccionadora89r5efechada = "";
        seccionadora89r6efechada = "";
        disjuntor52l1fechado = "";
        disjuntor52l1aberto = "";
        disjuntor52l2fechado = "";
        disjuntor52l2aberto = "";
        disjuntor52alfechado = "";
        disjuntor52alaberto = "";
        disjuntor52btfechado = "";
        disjuntor52btaberto = "";
        disjuntor52mt1fechado = "";
        disjuntor52mt1aberto = "";
        disjuntor52mtrfechado = "";
        disjuntor52mtraberto = "";
        disjuntor52mt2fechado = "";
        disjuntor52mt2aberto = "";
        disjuntor52mt3fechado = "";
        disjuntor52mt3aberto = "";
        disjuntor52mt4fechado = "";
        disjuntor52mt4aberto = "";
        disjuntor52a1fechado = "";
        disjuntor52a1aberto = "";
        disjuntor52a2fechado = "";
        disjuntor52a2aberto = "";
        disjuntor52a3fechado = "";
        disjuntor52a3aberto = "";
        disjuntor52a4fechado = "";
        disjuntor52a4aberto = "";
        disjuntor52a5fechado = "";
        disjuntor52a5aberto = "";
        disjuntor52a6fechado = "";
        disjuntor52a6aberto = "";
        disjuntor52a7fechado = "";
        disjuntor52a7aberto = "";
        disjuntor52a8fechado = "";
        disjuntor52a8aberto = "";
        disjuntor52p1fechado = "";
        disjuntor52p1aberto = "";
        disjuntor52p2fechado = "";
        disjuntor52p2aberto = "";
        disjuntor52p3fechado = "";
        disjuntor52p3aberto = "";
        disjuntor52p4fechado = "";
        disjuntor52p4aberto = "";
        disjuntor52p5fechado = "";
        disjuntor52p5aberto = "";
        disjuntor52p6fechado = "";
        disjuntor52p6aberto = "";
        disjuntor52tufechado = "";
        disjuntor52lvr1fechado = "";
        disjuntor52c1fechado = "";
        disjuntor52c1aberto = "";
        disjuntor52c2fechado = "";
        disjuntor52c2aberto = "";
        disjuntor52c3fechado = "";
        disjuntor52c3aberto = "";
        disjuntor52c4fechado = "";
        disjuntor52c4aberto = "";
        disjuntor52c5fechado = "";
        disjuntor52c5aberto = "";
        disjuntor52c6fechado = "";
        disjuntor52c6aberto = "";
        disjuntor52c7fechado = "";
        disjuntor52c7aberto = "";
        disjuntor52c8fechado = "";
        disjuntor52c8aberto = "";
        disjuntor52r1fechado = "";
        disjuntor52r1aberto = "";
        disjuntor52r2fechado = "";
        disjuntor52r2aberto = "";
        disjuntor52r3fechado = "";
        disjuntor52r3aberto = "";
        disjuntor52r4fechado = "";
        disjuntor52r4aberto = "";
        disjuntor52r5fechado = "";
        disjuntor52r5aberto = "";
        disjuntor52r6fechado = "";
        disjuntor52r6aberto = "";
        disjuntor52r7fechado = "";
        disjuntor52r7aberto = "";
        disjuntor52r8fechado = "";
        disjuntor52r8aberto = "";
        disjuntor52g1fechado = "";
        disjuntor52g1aberto = "";
        disjuntor52g2fechado = "";
        disjuntor52g2aberto = "";
        disjuntor52tufechado = "";
        disjuntor52tuaberto = "";
        EnerL1 = "";
        EnerL2 = "";
        DesenL1 = "";
        DesenL2 = "";
        EnerBayBT = "";
        EnerL1BarraA = "";
        EnerL2IntBarra = "";
        EnerMT1BarraA = "";
        EnerMTRBarraA = "";
        EnerMT2BarraB = "";
        EnerMT3BarraA = "";
        EnerMT4BarraB = "";
        DesenMT1BarraA = "";
        DesenMTRBarraA = "";
        DesenMT2BarraB = "";
        DesenMT3BarraA = "";
        DesenMT4BarraB = "";
        DesenL1BarraA = "";
        DesenL2IntBarra = "";
        EnerAlbras = "";
        DesenAlbras = "";
        PrepAlbras = "";
        EnerGerador = "";
        NormRed1 = "";
        NormRed2 = "";
        NormRed3 = "";
        NormRed4 = "";
        DeslProgRed1 = "";
        DeslProgRed2 = "";
        DeslProgRed3 = "";
        DeslProgRed4 = "";
        TransfMT1MTR = "";
        TransfMTRMT1 = "";
        TransfMT2MTR = "";
        TransfMTRMT2 = "";
        TransfMT3MTR = "";
        TransfMTRMT3 = "";
        TransfMT4MTR = "";
        TransfMTRMT4 = "";
        EnergBarraEM = "";
        EnergCargas = "";
        DeslCargas = "";
        DesenBarraEM = "";
        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "NENHUMA");
        JOptionPane.showMessageDialog(null, " Você já pode HABILITAR a próxima manobra para Simulação! ");
    }

    public static void main(String args[]) {
        SimuladorAlbras frame = new SimuladorAlbras();
        frame.setVisible(true);
    }

}
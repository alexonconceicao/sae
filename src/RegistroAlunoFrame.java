
import java.awt.HeadlessException;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexon Conceição
 */
public class RegistroAlunoFrame extends javax.swing.JFrame {

    public RegistroAlunoFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        infoDocumento = new javax.swing.JTextField();
        turmaAluno = new javax.swing.JTextField();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JButton btnRegistrarAluno = new javax.swing.JButton();
        javax.swing.JButton btnLimparCampoAluno = new javax.swing.JButton();
        javax.swing.JButton btnSalvarAluno = new javax.swing.JButton();
        selDataNascimento = new com.toedter.calendar.JDateChooser();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        paiAluno = new javax.swing.JTextField();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        maeAluno = new javax.swing.JTextField();
        selComboDocumento = new javax.swing.JComboBox<>();
        selComboSerie = new javax.swing.JComboBox<>();
        javax.swing.JButton btnRemoverAluno = new javax.swing.JButton();
        javax.swing.JButton btnCopiarDados = new javax.swing.JButton();
        selComboSexo = new javax.swing.JComboBox<>();
        selComboTurno = new javax.swing.JComboBox<>();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JButton btnVoltarRegistros = new javax.swing.JButton();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SAE - Escola Criativa");
        setMinimumSize(new java.awt.Dimension(1163, 561));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graduated.png"))); // NOI18N
        jLabel1.setText("Registro de Alunos:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)), "Novo Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setToolTipText("Painel de registro de novo aluno");
        jPanel2.setOpaque(false);

        jLabel2.setText("Nome");

        jLabel3.setText("Data de Nascimento");

        jLabel4.setText("Sexo");

        jLabel5.setText("Documento (CPF/RG)");

        jLabel8.setText("Turma");

        jLabel9.setText("Série");

        btnRegistrarAluno.setBackground(new java.awt.Color(255, 204, 153));
        btnRegistrarAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        btnRegistrarAluno.setText("Registrar");
        btnRegistrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlunoActionPerformed(evt);
            }
        });

        btnLimparCampoAluno.setBackground(new java.awt.Color(255, 204, 153));
        btnLimparCampoAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimparCampoAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eraser.png"))); // NOI18N
        btnLimparCampoAluno.setText("Limpar");
        btnLimparCampoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCampoAlunoActionPerformed(evt);
            }
        });

        btnSalvarAluno.setBackground(new java.awt.Color(255, 204, 153));
        btnSalvarAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnSalvarAluno.setText("Salvar");
        btnSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlunoActionPerformed(evt);
            }
        });

        selDataNascimento.setDateFormatString("dd/MM/yyyy");

        jLabel11.setText("Turno");

        jLabel12.setText("Pai");

        jLabel13.setText("Mãe");

        selComboDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF", "RG" }));
        selComboDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selComboDocumentoActionPerformed(evt);
            }
        });

        selComboSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1°", "2°", "3°", "4°", "5°", "6°", "7°", "8°" }));
        selComboSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selComboSerieActionPerformed(evt);
            }
        });

        btnRemoverAluno.setBackground(new java.awt.Color(255, 204, 153));
        btnRemoverAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemoverAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin.png"))); // NOI18N
        btnRemoverAluno.setText("Remover");
        btnRemoverAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverAlunoActionPerformed(evt);
            }
        });

        btnCopiarDados.setBackground(new java.awt.Color(255, 204, 153));
        btnCopiarDados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCopiarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/copy.png"))); // NOI18N
        btnCopiarDados.setText("Copiar");
        btnCopiarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarDadosActionPerformed(evt);
            }
        });

        selComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        selComboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selComboSexoActionPerformed(evt);
            }
        });

        selComboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(selComboDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(infoDocumento)
                                            .addGap(5, 5, 5))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(btnLimparCampoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRegistrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(selComboSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(turmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(btnRemoverAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnCopiarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(btnSalvarAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomeAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(maeAluno, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paiAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selComboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {selComboDocumento, selComboSerie});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCopiarDados, btnLimparCampoAluno, btnRegistrarAluno, btnRemoverAluno});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selComboDocumento)
                    .addComponent(infoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selComboSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selComboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paiAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCampoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCopiarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {infoDocumento, turmaAluno});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {selComboDocumento, selComboSerie, selComboSexo});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLimparCampoAluno, btnRegistrarAluno, btnRemoverAluno});

        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "DT_NASCIMENTO", "SEXO", "CPF", "RG", "SÉRIE", "TURMA", "TURNO", "PAI", "MÃE", "DT_INSERIDO"
            }
        ));
        jScrollPane1.setViewportView(tabelaAluno);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("©Copyright 2024 | Desenvolvido por NoxCorp");

        jLabel10.setText("*Para ALTERAR os dados do aluno, basta clicar na informação que deseja alterar no aluno desejado");

        btnVoltarRegistros.setBackground(new java.awt.Color(255, 204, 153));
        btnVoltarRegistros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVoltarRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undo.png"))); // NOI18N
        btnVoltarRegistros.setText("Voltar");
        btnVoltarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarRegistrosActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SISTEMA DE AUXÍLIO ESCOLAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVoltarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap())
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparCampoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCampoAlunoActionPerformed
        nomeAluno.setText("");                       // Limpa o campo de nome
        selDataNascimento.setDate(null);             // Limpa o campo de data de nascimento
        selComboSexo.setSelectedIndex(0);               // Limpa o campo de sexo, selecionando a primeira opção
        selComboDocumento.setSelectedIndex(0);          // Limpa o campo de documento, selecionando a primeira opção
        infoDocumento.setText("");                    // Limpa o campo de número do documento
        selComboSerie.setSelectedIndex(0);              // Limpa o campo de série, selecionando a primeira opção
        turmaAluno.setText("");                           // Limpa o campo de turma
        selComboTurno.setSelectedIndex(0);              // Limpa o campo de turno, selecionando a primeira opção
        paiAluno.setText("");                        // Limpa o campo do nome do pai
        maeAluno.setText("");                        // Limpa o campo do nome da mãe
    }//GEN-LAST:event_btnLimparCampoAlunoActionPerformed

    private void btnRegistrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlunoActionPerformed
        String nome = nomeAluno.getText();
        Date dataNascimento = selDataNascimento.getDate();
        String comboSexo = (String) selComboSexo.getSelectedItem();
        String comboDocumento = (String) selComboDocumento.getSelectedItem();
        String documento = infoDocumento.getText();
        String serie = (String) selComboSerie.getSelectedItem();
        String turma = turmaAluno.getText();
        String comboTurno = (String) selComboTurno.getSelectedItem();
        String pai = paiAluno.getText();
        String mae = maeAluno.getText();

        // Verificação de campos obrigatórios
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Nome é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (dataNascimento == null) {
            JOptionPane.showMessageDialog(this, "O campo Data de Nascimento é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (comboSexo == null) {
            JOptionPane.showMessageDialog(this, "O campo Sexo é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (comboDocumento == null) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de documento!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (documento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Documento é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (serie == null) {
            JOptionPane.showMessageDialog(this, "O campo Série é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (turma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Turma é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (comboTurno == null) {
            JOptionPane.showMessageDialog(this, "O campo Turno é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (pai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Nome do Pai é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (mae.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Nome da Mãe é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria um objeto com os dados do aluno
        Vector<String> dadosAluno = new Vector<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataNascFormatada = sdf.format(dataNascimento);

        // Formata a data de inserção
        String dataInsercao = sdf.format(new Date()); // Data atual

        // Define RG ou CPF como nulo com base na seleção do comboDocumento
        String rg = comboDocumento.equals("CPF") ? null : (comboDocumento.equals("RG") ? documento : null);
        String cpf = comboDocumento.equals("RG") ? null : (comboDocumento.equals("CPF") ? documento : null);

        dadosAluno.add(nome);
        dadosAluno.add(dataNascFormatada);
        dadosAluno.add(comboSexo);
        dadosAluno.add(cpf); // Adiciona CPF ou nulo
        dadosAluno.add(rg); // Adiciona RG ou nulo
        dadosAluno.add(serie);
        dadosAluno.add(turma);
        dadosAluno.add(comboTurno);
        dadosAluno.add(pai);
        dadosAluno.add(mae);
        dadosAluno.add(dataInsercao); // Adiciona a data de inserção

        // Caminho para o arquivo de dados
        String path = System.getProperty("user.home") + File.separator + "SAE" + File.separator + "database" + File.separator + "alunos.bin";
        File file = new File(path);
        Vector<Vector> tableData;

        // Verifica se o arquivo existe e lê os dados existentes
        if (file.exists()) {
            try (FileInputStream fileInput = new FileInputStream(path); ObjectInputStream input = new ObjectInputStream(fileInput)) {
                tableData = (Vector<Vector>) input.readObject();
            } catch (Exception ex) {
                ex.printStackTrace();
                tableData = new Vector<>();
            }
        } else {
            tableData = new Vector<>();
        }

        // Adiciona os dados do aluno ao vetor de dados
        tableData.add(dadosAluno);

        DefaultTableModel model = (DefaultTableModel) tabelaAluno.getModel();
        model.addRow(dadosAluno);

        btnLimparCampoAlunoActionPerformed(null);
    }//GEN-LAST:event_btnRegistrarAlunoActionPerformed

    private void btnRemoverAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverAlunoActionPerformed
        int row = tabelaAluno.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "Nenhum aluno foi selecionado!\nPor favor selecione um aluno!",
                    "Selecione um aluno!",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tabelaAluno.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnRemoverAlunoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resposta = JOptionPane.showOptionDialog(this,
                "Confirme se salvou o registro!\nTem certeza que deseja ENCERRAR A APLICAÇÃO? ",
                "Encerrando aplicação",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sim", "Não"}, null);

        if (resposta == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Vector<Vector> tableData = new Vector<>(); // Inicializa o vetor
        String path = System.getProperty("user.home") + File.separator + "SAE" + File.separator + "database" + File.separator + "alunos.bin";

        // Verifica se o arquivo existe
        File file = new File(path);
        if (!file.exists()) {
            // Cria o arquivo caso não exista
            try {
                file.getParentFile().mkdirs(); // Cria os diretórios, se não existirem
                file.createNewFile(); // Cria o arquivo alunos.bin
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao criar o arquivo de alunos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return; // Sai da função em caso de erro
            }
        }

        try (FileInputStream fileInput = new FileInputStream(path); ObjectInputStream input = new ObjectInputStream(fileInput)) {
            // Deserializa o objeto
            tableData = (Vector<Vector>) input.readObject();
        } catch (EOFException ex) {
            ex.printStackTrace();
            // Se o arquivo estiver vazio, não faz nada, já que tableData já está inicializado
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar os dados dos alunos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Sai da função em caso de erro
        }

        // Preenche a tabela com os dados
        DefaultTableModel model = (DefaultTableModel) tabelaAluno.getModel();
        for (Vector row : tableData) {
            model.addRow(row.toArray());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlunoActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaAluno.getModel();
        Vector<Vector> tableData = model.getDataVector();

        //Saving of object in a file
        try {
            String path = System.getProperty("user.home") + File.separator + "SAE" + File.separator + "database" + File.separator + "alunos.bin";
            try (FileOutputStream file = new FileOutputStream(path); ObjectOutputStream output = new ObjectOutputStream(file)) {

                // Method for serialization of object
                output.writeObject(tableData);

                JOptionPane.showMessageDialog(this, "Dados do aluno salvos com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (HeadlessException | IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSalvarAlunoActionPerformed

    private void selComboDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selComboDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selComboDocumentoActionPerformed

    private void selComboSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selComboSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selComboSerieActionPerformed

    private void btnVoltarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarRegistrosActionPerformed
        TelaRegistrosFrame telaRegistrosFrame = new TelaRegistrosFrame();
        telaRegistrosFrame.setLocationRelativeTo(this);
        telaRegistrosFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarRegistrosActionPerformed

    private void btnCopiarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarDadosActionPerformed

    private void selComboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selComboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selComboSexoActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            RegistroAlunoFrame registroAlunoFrame = new RegistroAlunoFrame();
            registroAlunoFrame.setVisible(true);
            registroAlunoFrame.setLocationRelativeTo(null);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField infoDocumento;
    private javax.swing.JTextField maeAluno;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField paiAluno;
    private javax.swing.JComboBox<String> selComboDocumento;
    private javax.swing.JComboBox<String> selComboSerie;
    private javax.swing.JComboBox<String> selComboSexo;
    private javax.swing.JComboBox<String> selComboTurno;
    private com.toedter.calendar.JDateChooser selDataNascimento;
    private javax.swing.JTable tabelaAluno;
    private javax.swing.JTextField turmaAluno;
    // End of variables declaration//GEN-END:variables
}

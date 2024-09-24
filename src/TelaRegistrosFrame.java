
import javax.swing.JOptionPane;

/**
 *
 * @author Alexon Conceição
 */
public class TelaRegistrosFrame extends javax.swing.JFrame {

    public TelaRegistrosFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel logo = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        btnAbrirTelaRegistroAluno = new javax.swing.JButton();
        btnAbrirTelaRegistroFuncionarios = new javax.swing.JButton();
        btnAbrirTelaRegistroSeries = new javax.swing.JButton();
        btnAbrirTelaRegistroProfessor = new javax.swing.JButton();
        btnAbrirTelaRegistroDisciplinas = new javax.swing.JButton();
        btnAbrirTelaRegistroTurmas = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
        javax.swing.JTextField jTextField2 = new javax.swing.JTextField();
        btnVoltarMainFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAE - Escola Criativa");
        setResizable(false);
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
        jPanel1.setMinimumSize(new java.awt.Dimension(582, 571));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_criativa.jpg"))); // NOI18N
        logo.setMaximumSize(new java.awt.Dimension(648, 648));
        logo.setMinimumSize(new java.awt.Dimension(648, 648));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SISTEMA DE AUXÍLIO ESCOLAR");

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)), "Registros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Selecione:");

        btnAbrirTelaRegistroAluno.setBackground(new java.awt.Color(255, 204, 153));
        btnAbrirTelaRegistroAluno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirTelaRegistroAluno.setText("Registro de Aluno");
        btnAbrirTelaRegistroAluno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        btnAbrirTelaRegistroAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirTelaRegistroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTelaRegistroAlunoActionPerformed(evt);
            }
        });

        btnAbrirTelaRegistroFuncionarios.setBackground(new java.awt.Color(255, 204, 153));
        btnAbrirTelaRegistroFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirTelaRegistroFuncionarios.setText("Registro de Funcionários");
        btnAbrirTelaRegistroFuncionarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        btnAbrirTelaRegistroFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirTelaRegistroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTelaRegistroFuncionariosActionPerformed(evt);
            }
        });

        btnAbrirTelaRegistroSeries.setBackground(new java.awt.Color(255, 204, 153));
        btnAbrirTelaRegistroSeries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirTelaRegistroSeries.setText("Registro de Séries");
        btnAbrirTelaRegistroSeries.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        btnAbrirTelaRegistroSeries.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirTelaRegistroSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTelaRegistroSeriesActionPerformed(evt);
            }
        });

        btnAbrirTelaRegistroProfessor.setBackground(new java.awt.Color(255, 204, 153));
        btnAbrirTelaRegistroProfessor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirTelaRegistroProfessor.setText("Registro de Professor");
        btnAbrirTelaRegistroProfessor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        btnAbrirTelaRegistroProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirTelaRegistroProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTelaRegistroProfessorActionPerformed(evt);
            }
        });

        btnAbrirTelaRegistroDisciplinas.setBackground(new java.awt.Color(255, 204, 153));
        btnAbrirTelaRegistroDisciplinas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirTelaRegistroDisciplinas.setText("Registro de Disciplinas");
        btnAbrirTelaRegistroDisciplinas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        btnAbrirTelaRegistroDisciplinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirTelaRegistroDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTelaRegistroDisciplinasActionPerformed(evt);
            }
        });

        btnAbrirTelaRegistroTurmas.setBackground(new java.awt.Color(255, 204, 153));
        btnAbrirTelaRegistroTurmas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrirTelaRegistroTurmas.setText("Registro de Turmas");
        btnAbrirTelaRegistroTurmas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        btnAbrirTelaRegistroTurmas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirTelaRegistroTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTelaRegistroTurmasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbrirTelaRegistroAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(btnAbrirTelaRegistroSeries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbrirTelaRegistroTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbrirTelaRegistroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirTelaRegistroFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirTelaRegistroDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAbrirTelaRegistroAluno, btnAbrirTelaRegistroProfessor});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAbrirTelaRegistroDisciplinas, btnAbrirTelaRegistroFuncionarios, btnAbrirTelaRegistroSeries, btnAbrirTelaRegistroTurmas});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirTelaRegistroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirTelaRegistroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirTelaRegistroSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirTelaRegistroFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirTelaRegistroTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirTelaRegistroDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("©Copyright 2024 | Desenvolvido por NoxCorp");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Bem vindo à Escola Criativa!");
        jTextField1.setBorder(null);
        jTextField1.setRequestFocusEnabled(false);
        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setSelectionColor(new java.awt.Color(204, 255, 204));
        jTextField1.setSelectionEnd(0);
        jTextField1.setSelectionStart(0);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Aqui sua dedicação molda  o futuro!");
        jTextField2.setBorder(null);
        jTextField2.setRequestFocusEnabled(false);
        jTextField2.setSelectionEnd(0);
        jTextField2.setSelectionStart(0);

        btnVoltarMainFrame.setBackground(new java.awt.Color(255, 204, 153));
        btnVoltarMainFrame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoltarMainFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undo.png"))); // NOI18N
        btnVoltarMainFrame.setText("Voltar");
        btnVoltarMainFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        btnVoltarMainFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltarMainFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMainFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnVoltarMainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnVoltarMainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnAbrirTelaRegistroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTelaRegistroAlunoActionPerformed
        RegistroAlunoFrame registroAlunoFrame = new RegistroAlunoFrame();
        registroAlunoFrame.setLocationRelativeTo(this);
        registroAlunoFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAbrirTelaRegistroAlunoActionPerformed

    private void btnAbrirTelaRegistroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTelaRegistroFuncionariosActionPerformed
        JOptionPane.showMessageDialog(this, "A criação da tela de registro de funcionários está em andamento.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAbrirTelaRegistroFuncionariosActionPerformed

    private void btnAbrirTelaRegistroSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTelaRegistroSeriesActionPerformed
        JOptionPane.showMessageDialog(this, "A criação da tela de registro de séries está em andamento.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAbrirTelaRegistroSeriesActionPerformed

    private void btnAbrirTelaRegistroProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTelaRegistroProfessorActionPerformed
        JOptionPane.showMessageDialog(this, "A criação da tela de registro de professores está em andamento.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAbrirTelaRegistroProfessorActionPerformed

    private void btnAbrirTelaRegistroDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTelaRegistroDisciplinasActionPerformed
        JOptionPane.showMessageDialog(this, "A criação da tela de registro de disciplinas está em andamento.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAbrirTelaRegistroDisciplinasActionPerformed

    private void btnAbrirTelaRegistroTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTelaRegistroTurmasActionPerformed
        JOptionPane.showMessageDialog(this, "A criação da tela de registro de turmas está em andamento.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAbrirTelaRegistroTurmasActionPerformed

    private void btnVoltarMainFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMainFrameActionPerformed
        Utils.abrirMainFrame(this);
    }//GEN-LAST:event_btnVoltarMainFrameActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            TelaRegistrosFrame telaRegistrosFrame = new TelaRegistrosFrame();
            telaRegistrosFrame.setVisible(true);
            telaRegistrosFrame.setLocationRelativeTo(null);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirTelaRegistroAluno;
    private javax.swing.JButton btnAbrirTelaRegistroDisciplinas;
    private javax.swing.JButton btnAbrirTelaRegistroFuncionarios;
    private javax.swing.JButton btnAbrirTelaRegistroProfessor;
    private javax.swing.JButton btnAbrirTelaRegistroSeries;
    private javax.swing.JButton btnAbrirTelaRegistroTurmas;
    private javax.swing.JButton btnVoltarMainFrame;
    // End of variables declaration//GEN-END:variables
}

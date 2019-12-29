package Visao;

import dao.AreaTccDAO;
import dao.CursoDAO;
import dao.TccDAO;
import java.awt.Toolkit;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.AreaTcc;
import modelo.Tcc;

public class CadastroTCC extends javax.swing.JFrame {

    public String dest;
    CursoDAO cdao = new CursoDAO();
    private Integer id_curso;
    AreaTccDAO atccdao = new AreaTccDAO();
    List<AreaTcc> alist = atccdao.listar();

    public CadastroTCC() {
        initComponents();
        setIcon();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/home/thales/Downloads/Nova Pasta/Biblio2/src/img/logo-urcamp(1).png")));
    }

    public Integer getIdCurso() {
        return id_curso;
    }

    public void setIdCurso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    public void PDF() {
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(null);
        String caminho = jf.getSelectedFile().getAbsolutePath();
        String destino = "/home/thales/Downloads/Nova Pasta/Biblio2/src/pdf/" + jf.getSelectedFile().getName();
        dest = destino;
        try {
            Files.copy(Paths.get(caminho), Paths.get(destino));
        } catch (IOException ex) {
            Logger.getLogger(CadastroTCC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfOrientador = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        tfTitulo = new javax.swing.JTextField();
        cbxSem = new javax.swing.JComboBox<>();
        btnAsk1 = new javax.swing.JButton();
        btnAsk2 = new javax.swing.JButton();
        btnAsk3 = new javax.swing.JButton();
        btnAsk0 = new javax.swing.JButton();
        btnAsk4 = new javax.swing.JButton();
        lblObservacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAOb = new javax.swing.JTextArea();
        lblArquivo = new javax.swing.JLabel();
        btnArquivo = new javax.swing.JToggleButton();
        lblObrigatorio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MConf = new javax.swing.JMenu();
        MAjuda = new javax.swing.JMenu();
        MSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tipo:*");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 46, -1, -1));

        lblTitulo.setText("Título:*");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 97, -1, -1));

        tfAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAutorActionPerformed(evt);
            }
        });
        jPanel1.add(tfAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 142, 393, -1));

        lblAutor.setText("Autor:*");
        jPanel1.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 148, -1, -1));

        lblAno.setText("Ano:*");
        jPanel1.add(lblAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 244, -1, -1));
        jPanel1.add(tfAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 238, 159, -1));

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 484, -1, -1));

        jLabel5.setText("Orientador:*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 193, -1, -1));
        jPanel1.add(tfOrientador, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 187, 393, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monografia", "Artigo", "Projeto", "Tcc" }));
        cbxTipo.setSelectedIndex(1);
        cbxTipo.setToolTipText("");
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 40, 393, -1));

        tfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloActionPerformed(evt);
            }
        });
        jPanel1.add(tfTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 91, 393, -1));

        cbxSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        jPanel1.add(cbxSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 238, 228, -1));

        btnAsk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/information (2).png"))); // NOI18N
        btnAsk1.setText("\n");
        jPanel1.add(btnAsk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 90, -1, -1));

        btnAsk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/information (2).png"))); // NOI18N
        btnAsk2.setText("\n");
        jPanel1.add(btnAsk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 141, -1, -1));

        btnAsk3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/information (2).png"))); // NOI18N
        btnAsk3.setText("\n");
        jPanel1.add(btnAsk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 186, -1, -1));

        btnAsk0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/information (2).png"))); // NOI18N
        btnAsk0.setText("\n");
        jPanel1.add(btnAsk0, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 39, -1, -1));

        btnAsk4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/information (2).png"))); // NOI18N
        btnAsk4.setText("\n");
        jPanel1.add(btnAsk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 237, -1, -1));

        lblObservacoes.setText("Observações:");
        jPanel1.add(lblObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 288, -1, -1));

        txtAOb.setColumns(20);
        txtAOb.setRows(5);
        jScrollPane1.setViewportView(txtAOb);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 288, 446, 105));

        lblArquivo.setText("Arquivo:*");
        jPanel1.add(lblArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 422, -1, -1));

        btnArquivo.setText("Clique aqui pra inserir o arquivo");
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 415, 446, -1));

        lblObrigatorio.setText("* Campo Obrigatório");
        jPanel1.add(lblObrigatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 491, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-urcamp(1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 110, -1));

        MConf.setText("Configurações");
        jMenuBar1.add(MConf);

        MAjuda.setText("Ajuda");
        jMenuBar1.add(MAjuda);

        MSair.setText("Sair");
        jMenuBar1.add(MSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAutorActionPerformed

    }//GEN-LAST:event_tfAutorActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (tfAutor.getText().length() > 0 && tfAno.getText().length() > 0 && tfOrientador.getText().length() > 0 && tfTitulo.getText().length() > 0) {
            TccDAO tccdao = new TccDAO();
            Tcc tcc = new Tcc();
            switch (cbxTipo.getSelectedIndex()) {
                case 0:
                    tcc.setIdAreatcc(atccdao.buscarPorChavePrimaria(0));
                    break;
                case 1:
                    tcc.setIdAreatcc(atccdao.buscarPorChavePrimaria(1));
                    break;
                case 2:
                    tcc.setIdAreatcc(atccdao.buscarPorChavePrimaria(2));
                    break;
                case 3:
                    tcc.setIdAreatcc(atccdao.buscarPorChavePrimaria(3));
            }
            switch (cbxSem.getSelectedIndex()) {
                case 0:
                    tcc.setSemestreTcc(1);
                    break;
                case 1:
                    tcc.setSemestreTcc(2);
                    break;
            }
            tcc.setAnoTcc(Integer.parseInt(tfAno.getText()));
            tcc.setAutorTcc(tfAutor.getText());
            tcc.setTituloTcc(tfTitulo.getText());
            tcc.setOrientadorTcc(tfOrientador.getText());
            tcc.setObservacoesTcc(txtAOb.getText());
            tcc.setIdCurso(cdao.buscarPorChavePrimaria(id_curso));
            tcc.setPdfTcc(dest);
            if (tccdao.incluir(tcc)) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado!");
                AbreCurso abre = new AbreCurso(id_curso);
                abre.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro, tente novamente!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloActionPerformed

    }//GEN-LAST:event_tfTituloActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoActionPerformed
        PDF();
    }//GEN-LAST:event_btnArquivoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTCC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAjuda;
    private javax.swing.JMenu MConf;
    private javax.swing.JMenu MSair;
    private javax.swing.JToggleButton btnArquivo;
    private javax.swing.JButton btnAsk0;
    private javax.swing.JButton btnAsk1;
    private javax.swing.JButton btnAsk2;
    private javax.swing.JButton btnAsk3;
    private javax.swing.JButton btnAsk4;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cbxSem;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblArquivo;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblObrigatorio;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JTextField tfOrientador;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextArea txtAOb;
    // End of variables declaration//GEN-END:variables
}

package Visao;

import dao.TccDAO;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Tcc;

public class AbreCurso extends javax.swing.JFrame {

    public Integer id_curso;

    String nomeVar;

    public AbreCurso(Integer id_curso) {
        this.id_curso = id_curso;
        initComponents();
        setIcon();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        System.out.println(id_curso);
        populaTabela();
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

    public void populaTabela() {
        Integer idcurso = id_curso;
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        TccDAO tccdao = new TccDAO();
        for (Tcc t : tccdao.listar()) {
            System.out.println(t.getIdCurso().getIdCurso());
            if (t.getIdCurso().getIdCurso() == id_curso) {
                modelo.addRow(new Object[]{
                    t.getIdTcc(), t.getTituloTcc(), t.getAutorTcc(), t.getOrientadorTcc(), t.getAnoTcc(), t.getSemestreTcc(), t.getObservacoesTcc(), t.getPdfTcc()
                });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCatalogar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MConf = new javax.swing.JMenu();
        MAjuda = new javax.swing.JMenu();
        MSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCatalogar.setBackground(new java.awt.Color(255, 255, 255));
        btnCatalogar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCatalogar.setText("CATALOGAR");
        btnCatalogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCatalogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 125, -1, 27));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.setText("Buscar");
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 128, -1, -1));
        jPanel1.add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 125, 442, 25));

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparency.png"))); // NOI18N
        jPanel1.add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 125, -1, 27));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 158, 800, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Autor", "Orientador", "Ano", "Semestre", "Observações", "Download"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 173, 800, -1));

        btnLimpar.setText("LIMPAR");
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, -1, -1));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 620, -1, -1));

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, -1, -1));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/previous.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 610, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-urcamp(1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCatalogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogarActionPerformed
        CadastroTCC cad = new CadastroTCC();
        cad.setIdCurso(id_curso);
        cad.setVisible(true);
        disable();
    }//GEN-LAST:event_btnCatalogarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            Integer id;
            id = (Integer) modelo.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn());
            modelo.removeRow(jTable1.getSelectedRow());
            TccDAO tccdao = new TccDAO();
            tccdao.excluir(id);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            Integer id_tcc;
            id_tcc = (Integer) modelo.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn());
            AlterarTCC alter = new AlterarTCC(id_tcc);
            alter.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para alterar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(AbreCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbreCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbreCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbreCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbreCursot(id_curso).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAjuda;
    private javax.swing.JMenu MConf;
    private javax.swing.JMenu MSair;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCatalogar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JLabel txtBuscar;
    // End of variables declaration//GEN-END:variables
}

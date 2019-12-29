
package Visao;

import dao.TipoUsuarioDAO;
import dao.UsuarioDAO;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TipoUsuario;
import modelo.Usuario;

public class CadastroUsuario extends javax.swing.JFrame {

    UsuarioDAO udao = new UsuarioDAO();
    Usuario usu = new Usuario();
    TipoUsuarioDAO tudao = new TipoUsuarioDAO();
    List<TipoUsuario> listTU = tudao.listar();


    public CadastroUsuario() {
        initComponents();
        setIcon();
    }
 private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/home/thales/Downloads/Nova Pasta/Biblio2/src/img/logo-urcamp(1).png")));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MConf = new javax.swing.JMenu();
        MAjuda = new javax.swing.JMenu();
        MSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 47, -1, -1));

        tfID.setEditable(false);
        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });
        jPanel1.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 41, 393, -1));

        jLabel2.setText("Nome Completo: *");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 96, -1, -1));

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        jPanel1.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 90, 393, -1));

        jLabel3.setText("Cargo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 145, -1, -1));

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bibliotecário", "Estagiário", "Ajudante de biblioteca", "Outros" }));
        cbxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCargoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 139, 393, -1));

        jLabel4.setText("Senha: *");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 242, -1, -1));
        jPanel1.add(tfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 236, 393, -1));

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 273, -1, -1));

        jLabel5.setText("Matrícula:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 193, -1, -1));
        jPanel1.add(tfMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 187, 393, -1));

        jLabel6.setText("* dados obrigatórios");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 317, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-urcamp(1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 120, 150));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
       
    }//GEN-LAST:event_tfNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (tfNome.getText().length() > 0 && tfSenha.getText().length() > 0 && tfMatricula.getText().length() > 0) {
            switch (cbxCargo.getSelectedIndex()){
                case 0:
                    usu.setIdTipousuario(listTU.get(0));
                    break;
                case 1:
                    usu.setIdTipousuario(listTU.get(1));
                    break;
                case 2:
                    usu.setIdTipousuario(listTU.get(2));
                    break;
                case 3:
                    usu.setIdTipousuario(listTU.get(3));
                    break;
            }
            usu.setMatriculaUsuario(Integer.parseInt(tfMatricula.getText()));
            usu.setNomeUsuario(tfNome.getText());
            usu.setSenhaUsuario(tfSenha.getText());
            udao.incluir(usu);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cbxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCargoActionPerformed
      
    }//GEN-LAST:event_cbxCargoActionPerformed

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
      
    }//GEN-LAST:event_tfIDActionPerformed

    
    public static void main(String args[]) {
       
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
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAjuda;
    private javax.swing.JMenu MConf;
    private javax.swing.JMenu MSair;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSenha;
    // End of variables declaration//GEN-END:variables
}

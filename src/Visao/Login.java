package Visao;

import Visao.Principal;
import dao.UsuarioDAO;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.util.List;
import modelo.Usuario;

public class Login extends javax.swing.JFrame {

    private Usuario usuariologado;

    public Login() {
        initComponents();
        setIcon();
        txtSenhaReq.setVisible(false);
        txtMatrículaReq.setVisible(false);
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/home/thales/Downloads/Nova Pasta/Biblio2/src/img/logo-urcamp(1).png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMatrículaReq = new javax.swing.JLabel();
        txtSenhaReq = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MConf = new javax.swing.JMenu();
        MCriar = new javax.swing.JMenuItem();
        MAjuda = new javax.swing.JMenu();
        MSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMatricula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 173, 219, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Matrícula:*");
        jLabel1.setPreferredSize(new java.awt.Dimension(67, 22));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 176, 163, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Senha:*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 223, 163, -1));

        pSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(pSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 222, 219, -1));

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setPreferredSize(new java.awt.Dimension(40, 40));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 290, 106, 22));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("* campos obrigatórios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 259, -1, -1));

        txtMatrículaReq.setForeground(new java.awt.Color(204, 51, 10));
        txtMatrículaReq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMatrículaReq.setText("Campo obrigatório preenchimento");
        jPanel1.add(txtMatrículaReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));

        txtSenhaReq.setForeground(new java.awt.Color(204, 51, 0));
        txtSenhaReq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSenhaReq.setText("Campo obrigatório preenchimento");
        jPanel1.add(txtSenhaReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, -1, -1));

        jLabel4.setText("Versão X.XX Desenvolvido por XXXXXXXXXXXXXX XXXXXXXXXXXX XXXXXXXXXXXXXXXXX para XXXXXXXXXXXXXXXXXXXXX XXXXXXXXXXXXX");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-urcamp(1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -20, 620, 620));

        MConf.setText("Configurações");

        MCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inserir.JPG"))); // NOI18N
        MCriar.setText("Criar Cadastro");
        MCriar.setFocusable(true);
        MCriar.setSelected(true);
        MCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MCriarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MCriarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MCriarMousePressed(evt);
            }
        });
        MConf.add(MCriar);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (txtMatricula.getText().length() > 0 && pSenha.getText().length() > 0) {
            UsuarioDAO udao = new UsuarioDAO();
            List<Usuario> listu = udao.listar();
            for (Usuario u : listu) {
                if (u.getMatriculaUsuario().toString().equals(txtMatricula.getText())) {
                    if (u.getSenhaUsuario().equals(pSenha.getText())) {
                        Principal p = new Principal();
                        p.setVisible(true);
                        dispose();
                    } else {
                        txtMatrículaReq.setText("Usuario ou senha inválidos");
                        txtMatrículaReq.setVisible(true);
                    }
                } else {
                    txtMatrículaReq.setText("Usuario ou senha inválidos");
                    txtMatrículaReq.setVisible(true);
                }
            }
        } else {

            if (txtMatricula.getText().length() == 0) {
                txtMatrículaReq.setVisible(true);
            } else {
                txtMatrículaReq.setVisible(false);
            }
            if (pSenha.getText().length() == 0) {
                txtSenhaReq.setVisible(true);
            } else {
                txtSenhaReq.setVisible(false);
            }

            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void MCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MCriarMouseClicked

    }//GEN-LAST:event_MCriarMouseClicked

    private void MCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MCriarMouseEntered

    }//GEN-LAST:event_MCriarMouseEntered

    private void MCriarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MCriarMousePressed
        CadastroUsuario c = new CadastroUsuario();
        c.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_MCriarMousePressed

    private void pSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pSenhaActionPerformed

    }//GEN-LAST:event_pSenhaActionPerformed

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public Usuario getUsuariologado() {
        return usuariologado;
    }

    public void setUsuariologado(Usuario usuariologado) {
        this.usuariologado = usuariologado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAjuda;
    private javax.swing.JMenu MConf;
    private javax.swing.JMenuItem MCriar;
    private javax.swing.JMenu MSair;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pSenha;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JLabel txtMatrículaReq;
    private javax.swing.JLabel txtSenhaReq;
    // End of variables declaration//GEN-END:variables
}

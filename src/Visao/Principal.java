package Visao;

import java.awt.Toolkit;
import modelo.Usuario;

public class Principal extends javax.swing.JFrame {

    private Usuario usuario_logado;
    public String nomeCurso;
    public Integer id_usuario;

    public Principal() {
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
        btnAdmin = new javax.swing.JButton();
        btnAgronomia = new javax.swing.JButton();
        btnArqUrb = new javax.swing.JButton();
        btnBiologia = new javax.swing.JButton();
        btnCienciasContab = new javax.swing.JButton();
        btnDireito = new javax.swing.JButton();
        btnEducacaoFis = new javax.swing.JButton();
        btnEnfermagem = new javax.swing.JButton();
        btnEngenhariaCiv = new javax.swing.JButton();
        btnFarmacia = new javax.swing.JButton();
        btnFisioterapia = new javax.swing.JButton();
        btnJornalismo = new javax.swing.JButton();
        btnLetras = new javax.swing.JButton();
        btnMedicinaVet = new javax.swing.JButton();
        btnNutricao = new javax.swing.JButton();
        btnPedagogia = new javax.swing.JButton();
        btnPsicologia = new javax.swing.JButton();
        btnSistemasInfo = new javax.swing.JButton();
        btnTecnologiaAgro = new javax.swing.JButton();
        btnGastronomia = new javax.swing.JButton();
        btnHistoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        MConf = new javax.swing.JMenu();
        MAjuda = new javax.swing.JMenu();
        MSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Administração.jpg"))); // NOI18N
        btnAdmin.setPreferredSize(new java.awt.Dimension(135, 135));
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        btnAgronomia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agronomia_1.jpg"))); // NOI18N
        btnAgronomia.setPreferredSize(new java.awt.Dimension(135, 135));
        btnAgronomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgronomiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        btnArqUrb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arquitetura e Urbanismo.jpg"))); // NOI18N
        btnArqUrb.setPreferredSize(new java.awt.Dimension(135, 135));
        btnArqUrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArqUrbActionPerformed(evt);
            }
        });
        jPanel1.add(btnArqUrb, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        btnBiologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Biologia.jpg"))); // NOI18N
        btnBiologia.setPreferredSize(new java.awt.Dimension(135, 135));
        btnBiologia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBiologiaMouseClicked(evt);
            }
        });
        btnBiologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiologiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        btnCienciasContab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ciências Contábeis_1.jpg"))); // NOI18N
        btnCienciasContab.setPreferredSize(new java.awt.Dimension(135, 135));
        btnCienciasContab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCienciasContabActionPerformed(evt);
            }
        });
        jPanel1.add(btnCienciasContab, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, -1));

        btnDireito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Direito_1.jpg"))); // NOI18N
        btnDireito.setPreferredSize(new java.awt.Dimension(135, 135));
        btnDireito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDireito, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, -1, -1));

        btnEducacaoFis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Educação Física_1.jpg"))); // NOI18N
        btnEducacaoFis.setPreferredSize(new java.awt.Dimension(135, 135));
        btnEducacaoFis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEducacaoFisActionPerformed(evt);
            }
        });
        jPanel1.add(btnEducacaoFis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 130, -1, -1));

        btnEnfermagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enfermagem_1.jpg"))); // NOI18N
        btnEnfermagem.setPreferredSize(new java.awt.Dimension(135, 135));
        btnEnfermagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnfermagemActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnfermagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        btnEngenhariaCiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Engenharia Civil_1.jpg"))); // NOI18N
        btnEngenhariaCiv.setPreferredSize(new java.awt.Dimension(135, 135));
        btnEngenhariaCiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngenhariaCivActionPerformed(evt);
            }
        });
        jPanel1.add(btnEngenhariaCiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        btnFarmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Farmácia_1.jpg"))); // NOI18N
        btnFarmacia.setPreferredSize(new java.awt.Dimension(135, 135));
        btnFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmaciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFarmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        btnFisioterapia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fisioterapia_1.jpg"))); // NOI18N
        btnFisioterapia.setPreferredSize(new java.awt.Dimension(135, 135));
        btnFisioterapia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFisioterapiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFisioterapia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        btnJornalismo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Jornalismo_1.jpg"))); // NOI18N
        btnJornalismo.setPreferredSize(new java.awt.Dimension(135, 135));
        btnJornalismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJornalismoActionPerformed(evt);
            }
        });
        jPanel1.add(btnJornalismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        btnLetras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Letras_1.jpg"))); // NOI18N
        btnLetras.setPreferredSize(new java.awt.Dimension(135, 135));
        btnLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, -1));

        btnMedicinaVet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Med. Veterinária.jpg"))); // NOI18N
        btnMedicinaVet.setPreferredSize(new java.awt.Dimension(135, 135));
        btnMedicinaVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicinaVetActionPerformed(evt);
            }
        });
        jPanel1.add(btnMedicinaVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280, -1, -1));

        btnNutricao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nutrição_1.jpg"))); // NOI18N
        btnNutricao.setPreferredSize(new java.awt.Dimension(135, 135));
        btnNutricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNutricaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNutricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        btnPedagogia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pedagogia_1.jpg"))); // NOI18N
        btnPedagogia.setPreferredSize(new java.awt.Dimension(135, 135));
        btnPedagogia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedagogiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPedagogia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        btnPsicologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Psicologia_1.jpg"))); // NOI18N
        btnPsicologia.setPreferredSize(new java.awt.Dimension(135, 135));
        btnPsicologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsicologiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPsicologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        btnSistemasInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sistemas de informação_1.jpg"))); // NOI18N
        btnSistemasInfo.setPreferredSize(new java.awt.Dimension(135, 135));
        btnSistemasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemasInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSistemasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        btnTecnologiaAgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agronegócio.jpg"))); // NOI18N
        btnTecnologiaAgro.setPreferredSize(new java.awt.Dimension(135, 135));
        btnTecnologiaAgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecnologiaAgroActionPerformed(evt);
            }
        });
        jPanel1.add(btnTecnologiaAgro, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, -1));

        btnGastronomia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gastronomia.jpg"))); // NOI18N
        btnGastronomia.setPreferredSize(new java.awt.Dimension(135, 135));
        btnGastronomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastronomiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGastronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, -1, -1));

        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/História.jpg"))); // NOI18N
        btnHistoria.setPreferredSize(new java.awt.Dimension(135, 135));
        btnHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Para pesquisar ou catalogar um TCC, selecione o curso:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-urcamp(1).png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel3.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 120, 140));

        MConf.setText("Configurações");
        jMenuBar2.add(MConf);

        MAjuda.setText("Ajuda");
        jMenuBar2.add(MAjuda);

        MSair.setText("Sair");
        jMenuBar2.add(MSair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDireitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireitoActionPerformed
        AbreCurso abre = new AbreCurso(1);
        abre.id_curso = 1;
        abre.setVisible(true);
        nomeCurso = "Direito";
        dispose();
    }//GEN-LAST:event_btnDireitoActionPerformed

    private void btnBiologiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBiologiaMouseClicked
//        AbreCurso abre = new AbreCurso();
//        abre.setIdCurso(1);
//        abre.setVisible(true);
//        nomeCurso = "Biologia";
//        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btnBiologiaMouseClicked

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        AbreCurso abre = new AbreCurso(2);
        abre.id_curso = 2;
        abre.setVisible(true);
        nomeCurso = "Administração";
        dispose();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnEnfermagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnfermagemActionPerformed
        AbreCurso abre = new AbreCurso(3);
        abre.id_curso = 3;
        abre.setVisible(true);
        nomeCurso = "Enfermagem";
        dispose();
    }//GEN-LAST:event_btnEnfermagemActionPerformed

    private void btnAgronomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgronomiaActionPerformed
        AbreCurso abre = new AbreCurso(4);
        abre.id_curso = 4;
        abre.setVisible(true);
        nomeCurso = "Agronomia";
        dispose();
    }//GEN-LAST:event_btnAgronomiaActionPerformed

    private void btnArqUrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArqUrbActionPerformed
        AbreCurso abre = new AbreCurso(5);
        abre.id_curso = 5;
        abre.setVisible(true);
        nomeCurso = "Arquitetura e Urbanismo";
        dispose();
    }//GEN-LAST:event_btnArqUrbActionPerformed

    private void btnBiologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiologiaActionPerformed
        AbreCurso abre = new AbreCurso(6);
        abre.id_curso = 6;
        abre.setVisible(true);
        nomeCurso = "Biologia";
        dispose();
    }//GEN-LAST:event_btnBiologiaActionPerformed

    private void btnCienciasContabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCienciasContabActionPerformed
        AbreCurso abre = new AbreCurso(7);
        abre.id_curso = 7;
        abre.setVisible(true);
        nomeCurso = "Ciências  Contábeis";

        dispose();
    }//GEN-LAST:event_btnCienciasContabActionPerformed

    private void btnEducacaoFisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEducacaoFisActionPerformed
        AbreCurso abre = new AbreCurso(8);
        abre.id_curso = 8;
        abre.setVisible(true);
        nomeCurso = "Educação Física";
        dispose();
    }//GEN-LAST:event_btnEducacaoFisActionPerformed

    private void btnEngenhariaCivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngenhariaCivActionPerformed
        AbreCurso abre = new AbreCurso(9);
        abre.id_curso = 9;
        abre.setVisible(true);
        nomeCurso = "Engenharia Cívil";
        dispose();
    }//GEN-LAST:event_btnEngenhariaCivActionPerformed

    private void btnFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmaciaActionPerformed
        AbreCurso abre = new AbreCurso(10);
        abre.id_curso = 10;
        abre.setVisible(true);
        nomeCurso = "Farmácia";
        dispose();
    }//GEN-LAST:event_btnFarmaciaActionPerformed

    private void btnFisioterapiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFisioterapiaActionPerformed
        AbreCurso abre = new AbreCurso(11);
        abre.id_curso = 11;
        abre.setVisible(true);
        nomeCurso = "Fisioterapia";
        dispose();
    }//GEN-LAST:event_btnFisioterapiaActionPerformed

    private void btnJornalismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJornalismoActionPerformed
        AbreCurso abre = new AbreCurso(12);
        abre.id_curso = 12;
        abre.setVisible(true);
        nomeCurso = "Jornalismo";
        dispose();
    }//GEN-LAST:event_btnJornalismoActionPerformed

    private void btnLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetrasActionPerformed
        AbreCurso abre = new AbreCurso(13);
        abre.id_curso = 13;
        System.out.println(abre.getIdCurso());
        abre.setVisible(true);
        nomeCurso = "Letras";
        dispose();
    }//GEN-LAST:event_btnLetrasActionPerformed

    private void btnMedicinaVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicinaVetActionPerformed
        AbreCurso abre = new AbreCurso(14);
        abre.id_curso = 14;
        abre.setVisible(true);
        nomeCurso = "Medicina";
        dispose();
    }//GEN-LAST:event_btnMedicinaVetActionPerformed

    private void btnNutricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNutricaoActionPerformed
        AbreCurso abre = new AbreCurso(15);
        abre.id_curso = 15;
        abre.setVisible(true);
        nomeCurso = "Nutrição";
        dispose();
    }//GEN-LAST:event_btnNutricaoActionPerformed

    private void btnPedagogiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedagogiaActionPerformed
        AbreCurso abre = new AbreCurso(16);
        abre.id_curso = 16;
        abre.setVisible(true);
        nomeCurso = "Pedagogia";
        dispose();
    }//GEN-LAST:event_btnPedagogiaActionPerformed

    private void btnPsicologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsicologiaActionPerformed
        AbreCurso abre = new AbreCurso(17);
        abre.id_curso = 17;
        abre.setVisible(true);
        nomeCurso = "Psicologia";
        dispose();
    }//GEN-LAST:event_btnPsicologiaActionPerformed

    private void btnSistemasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemasInfoActionPerformed
        AbreCurso abre = new AbreCurso(18);
        abre.id_curso = 18;
        abre.setVisible(true);
        nomeCurso = "Sistemas de Informação";
        dispose();
    }//GEN-LAST:event_btnSistemasInfoActionPerformed

    private void btnTecnologiaAgroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecnologiaAgroActionPerformed
        AbreCurso abre = new AbreCurso(19);
        abre.id_curso = 19;
        abre.setVisible(true);
        nomeCurso = "Tecnologia em Agronegócio";
        dispose();
    }//GEN-LAST:event_btnTecnologiaAgroActionPerformed

    private void btnGastronomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastronomiaActionPerformed
        AbreCurso abre = new AbreCurso(20);
        abre.id_curso = 20;
        abre.setVisible(true);
        nomeCurso = "Gastronomia";
        dispose();
    }//GEN-LAST:event_btnGastronomiaActionPerformed

    private void btnHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaActionPerformed
        AbreCurso abre = new AbreCurso(21);
        abre.id_curso = 21;
        abre.setVisible(true);
        nomeCurso = "História";
        dispose();
    }//GEN-LAST:event_btnHistoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAjuda;
    private javax.swing.JMenu MConf;
    private javax.swing.JMenu MSair;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAgronomia;
    private javax.swing.JButton btnArqUrb;
    private javax.swing.JButton btnBiologia;
    private javax.swing.JButton btnCienciasContab;
    private javax.swing.JButton btnDireito;
    private javax.swing.JButton btnEducacaoFis;
    private javax.swing.JButton btnEnfermagem;
    private javax.swing.JButton btnEngenhariaCiv;
    private javax.swing.JButton btnFarmacia;
    private javax.swing.JButton btnFisioterapia;
    private javax.swing.JButton btnGastronomia;
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnJornalismo;
    private javax.swing.JButton btnLetras;
    private javax.swing.JButton btnMedicinaVet;
    private javax.swing.JButton btnNutricao;
    private javax.swing.JButton btnPedagogia;
    private javax.swing.JButton btnPsicologia;
    private javax.swing.JButton btnSistemasInfo;
    private javax.swing.JButton btnTecnologiaAgro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

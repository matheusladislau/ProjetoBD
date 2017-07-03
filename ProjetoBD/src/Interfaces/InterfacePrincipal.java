/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Classes.GerenciadorBD;
/**
 *
 * @author Matheus
 */
public class InterfacePrincipal extends javax.swing.JFrame {
    GerenciadorBD bd=new GerenciadorBD();
    /**
     * Creates new form InterfacePrincipal
     */
    public InterfacePrincipal() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_titulo = new javax.swing.JLabel();
        btn_cadastrarPessoa = new javax.swing.JButton();
        btn_cadastrarOutroTelefone = new javax.swing.JButton();
        btn_cadastrarLivro = new javax.swing.JButton();
        btn_RealizarEmprestimo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        mi_CPessoa = new javax.swing.JMenuItem();
        mi_COutroTelefone = new javax.swing.JMenuItem();
        mi_CLivro = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setSize(new java.awt.Dimension(500, 400));

        txt_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_blue.jpg"))); // NOI18N
        txt_titulo.setText("BIBLIOTECA ALGUMACOISA");
        txt_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_cadastrarPessoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cadastrarPessoa.setText("CadastrarPessoa");
        btn_cadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarPessoaActionPerformed(evt);
            }
        });

        btn_cadastrarOutroTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cadastrarOutroTelefone.setText("Cadastrar Outro Telefone");
        btn_cadastrarOutroTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarOutroTelefoneActionPerformed(evt);
            }
        });

        btn_cadastrarLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cadastrarLivro.setText("Cadastrar Livro");
        btn_cadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarLivroActionPerformed(evt);
            }
        });

        btn_RealizarEmprestimo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_RealizarEmprestimo.setText("Emprestar Livro");
        btn_RealizarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RealizarEmprestimoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Consultar Pessoa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Consultar Livro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        menuCadastrar.setText("Cadastrar");

        mi_CPessoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mi_CPessoa.setText("Pessoa");
        mi_CPessoa.setToolTipText("");
        mi_CPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_CPessoaActionPerformed(evt);
            }
        });
        menuCadastrar.add(mi_CPessoa);

        mi_COutroTelefone.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mi_COutroTelefone.setText("Outro Telefone");
        mi_COutroTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_COutroTelefoneActionPerformed(evt);
            }
        });
        menuCadastrar.add(mi_COutroTelefone);

        mi_CLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mi_CLivro.setText("Livro");
        mi_CLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_CLivroActionPerformed(evt);
            }
        });
        menuCadastrar.add(mi_CLivro);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Empréstimo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem1);

        menuBar.add(menuCadastrar);

        menuConsultar.setText("Consultar");
        menuBar.add(menuConsultar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_RealizarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cadastrarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cadastrarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cadastrarOutroTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cadastrarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_cadastrarOutroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cadastrarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(btn_RealizarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarOutroTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarOutroTelefoneActionPerformed
        new CadastrarOutroTelefone().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_cadastrarOutroTelefoneActionPerformed

    private void mi_CPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_CPessoaActionPerformed
        new CadastrarPessoa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mi_CPessoaActionPerformed

    private void btn_cadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarPessoaActionPerformed
        new CadastrarPessoa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_cadastrarPessoaActionPerformed

    private void btn_cadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarLivroActionPerformed
        new CadastrarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_cadastrarLivroActionPerformed

    private void mi_COutroTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_COutroTelefoneActionPerformed
        new CadastrarOutroTelefone().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mi_COutroTelefoneActionPerformed

    private void mi_CLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_CLivroActionPerformed
        new CadastrarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mi_CLivroActionPerformed

    private void btn_RealizarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RealizarEmprestimoActionPerformed
        new EmprestarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_RealizarEmprestimoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new EmprestarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ConsultarPessoa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ConsultarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_RealizarEmprestimo;
    private javax.swing.JButton btn_cadastrarLivro;
    private javax.swing.JButton btn_cadastrarOutroTelefone;
    private javax.swing.JButton btn_cadastrarPessoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenuItem mi_CLivro;
    private javax.swing.JMenuItem mi_COutroTelefone;
    private javax.swing.JMenuItem mi_CPessoa;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}

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
        mi_CadPessoa = new javax.swing.JMenuItem();
        mi_CadOutroTelefone = new javax.swing.JMenuItem();
        mi_CadLivro = new javax.swing.JMenuItem();
        mi_CadEmprestimo = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        mi_ConPessoa = new javax.swing.JMenuItem();
        mi_ConTelefone = new javax.swing.JMenuItem();
        mi_ConLivro = new javax.swing.JMenuItem();
        mi_ConEmprestimo = new javax.swing.JMenuItem();

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

        mi_CadPessoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mi_CadPessoa.setText("Pessoa");
        mi_CadPessoa.setToolTipText("");
        mi_CadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_CadPessoaActionPerformed(evt);
            }
        });
        menuCadastrar.add(mi_CadPessoa);

        mi_CadOutroTelefone.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mi_CadOutroTelefone.setText("Outro Telefone");
        mi_CadOutroTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_CadOutroTelefoneActionPerformed(evt);
            }
        });
        menuCadastrar.add(mi_CadOutroTelefone);

        mi_CadLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mi_CadLivro.setText("Livro");
        mi_CadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_CadLivroActionPerformed(evt);
            }
        });
        menuCadastrar.add(mi_CadLivro);

        mi_CadEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mi_CadEmprestimo.setText("Empréstimo");
        mi_CadEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_CadEmprestimoActionPerformed(evt);
            }
        });
        menuCadastrar.add(mi_CadEmprestimo);

        menuBar.add(menuCadastrar);

        menuConsultar.setText("Consultar");

        mi_ConPessoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        mi_ConPessoa.setText("Pessoa");
        mi_ConPessoa.setToolTipText("");
        mi_ConPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ConPessoaActionPerformed(evt);
            }
        });
        menuConsultar.add(mi_ConPessoa);

        mi_ConTelefone.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK));
        mi_ConTelefone.setText("Telefone");
        mi_ConTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ConTelefoneActionPerformed(evt);
            }
        });
        menuConsultar.add(mi_ConTelefone);

        mi_ConLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        mi_ConLivro.setText("Livro");
        mi_ConLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ConLivroActionPerformed(evt);
            }
        });
        menuConsultar.add(mi_ConLivro);

        mi_ConEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        mi_ConEmprestimo.setText("Empréstimo");
        mi_ConEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ConEmprestimoActionPerformed(evt);
            }
        });
        menuConsultar.add(mi_ConEmprestimo);

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

    private void mi_CadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_CadPessoaActionPerformed
        new CadastrarPessoa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mi_CadPessoaActionPerformed

    private void btn_cadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarPessoaActionPerformed
        new CadastrarPessoa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_cadastrarPessoaActionPerformed

    private void btn_cadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarLivroActionPerformed
        new CadastrarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_cadastrarLivroActionPerformed

    private void mi_CadOutroTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_CadOutroTelefoneActionPerformed
        new CadastrarOutroTelefone().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mi_CadOutroTelefoneActionPerformed

    private void mi_CadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_CadLivroActionPerformed
        new CadastrarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mi_CadLivroActionPerformed

    private void btn_RealizarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RealizarEmprestimoActionPerformed
        new EmprestarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_RealizarEmprestimoActionPerformed

    private void mi_CadEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_CadEmprestimoActionPerformed
        new EmprestarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mi_CadEmprestimoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ConsultarPessoa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ConsultarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mi_ConPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ConPessoaActionPerformed
        new ConsultarPessoa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mi_ConPessoaActionPerformed

    private void mi_ConTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ConTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_ConTelefoneActionPerformed

    private void mi_ConLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ConLivroActionPerformed
        new ConsultarLivro().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mi_ConLivroActionPerformed

    private void mi_ConEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ConEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_ConEmprestimoActionPerformed
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
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenuItem mi_CadEmprestimo;
    private javax.swing.JMenuItem mi_CadLivro;
    private javax.swing.JMenuItem mi_CadOutroTelefone;
    private javax.swing.JMenuItem mi_CadPessoa;
    private javax.swing.JMenuItem mi_ConEmprestimo;
    private javax.swing.JMenuItem mi_ConLivro;
    private javax.swing.JMenuItem mi_ConPessoa;
    private javax.swing.JMenuItem mi_ConTelefone;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}

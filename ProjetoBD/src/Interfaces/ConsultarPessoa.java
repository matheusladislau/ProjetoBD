/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Classes.GerenciadorBD;
import javax.swing.JOptionPane;
/**
 *
 * @author 20515
 */
public class ConsultarPessoa extends javax.swing.JFrame{
    GerenciadorBD bd=new GerenciadorBD();
    /**
     * Creates new form ConsultarPessoa
     */
    public ConsultarPessoa() {
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
        txt_id = new javax.swing.JLabel();
        txt_nome = new javax.swing.JLabel();
        txt_email = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JLabel();
        txt_hint = new javax.swing.JLabel();
        txt_hint2 = new javax.swing.JLabel();
        cmp_recebeId = new javax.swing.JTextField();
        cmp_recebeNome = new javax.swing.JTextField();
        cmp_recebeEmail = new javax.swing.JTextField();
        cmp_recebebairro = new javax.swing.JTextField();
        btn_consultarPorId = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_green.jpg"))); // NOI18N
        txt_titulo.setText("Consultar Pessoa");
        txt_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_id.setText("ID");

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nome.setText("Nome");

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_email.setText("Email");

        txt_bairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_bairro.setText("Bairro");

        txt_hint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_hint.setText("*É possível preencher zero, um ou mais campos para realizar a consulta.");

        txt_hint2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_hint2.setText("Neste caso, porém, não leva em conta o id.");

        cmp_recebeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmp_recebeEmailActionPerformed(evt);
            }
        });

        btn_consultarPorId.setText("Consultar por ID");
        btn_consultarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarPorIdActionPerformed(evt);
            }
        });

        btn_voltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_consultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_consultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_id)
                                .addGap(10, 10, 10)
                                .addComponent(cmp_recebeId, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_bairro, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmp_recebebairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmp_recebeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmp_recebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_consultarPorId)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_hint2)
                    .addComponent(txt_hint))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmp_recebeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id)
                    .addComponent(btn_consultarPorId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmp_recebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email)
                    .addComponent(cmp_recebeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmp_recebebairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_bairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(txt_hint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_hint2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        limpar();
    }//GEN-LAST:event_btn_voltarActionPerformed
    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        cmp_recebeId.setText("");
        String nome=cmp_recebeNome.getText();
        String email=cmp_recebeEmail.getText();
        String bairro=cmp_recebebairro.getText();
        JOptionPane.showMessageDialog(null,bd.selectPessoa(nome,email,bairro));
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void cmp_recebeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmp_recebeEmailActionPerformed
    }//GEN-LAST:event_cmp_recebeEmailActionPerformed

    private void btn_consultarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarPorIdActionPerformed
        JOptionPane.showMessageDialog(null,bd.selectPessoa(Integer.parseInt(cmp_recebeId.getText())));
    }//GEN-LAST:event_btn_consultarPorIdActionPerformed
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
            java.util.logging.Logger.getLogger(ConsultarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarPessoa().setVisible(true);
            }
        });
    }
    /**
    *Apaga os textos dentro da caixa de texto inseridos pelo usuário e esconde painel
    */
    public void limpar(){
        setVisible(false);
        cmp_recebeId.setText("");
        cmp_recebeNome.setText("");
        cmp_recebeEmail.setText("");
        cmp_recebebairro.setText("");
        new InterfacePrincipal().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_consultarPorId;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JTextField cmp_recebeEmail;
    private javax.swing.JTextField cmp_recebeId;
    private javax.swing.JTextField cmp_recebeNome;
    private javax.swing.JTextField cmp_recebebairro;
    private javax.swing.JLabel txt_bairro;
    private javax.swing.JLabel txt_email;
    private javax.swing.JLabel txt_hint;
    private javax.swing.JLabel txt_hint2;
    private javax.swing.JLabel txt_id;
    private javax.swing.JLabel txt_nome;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}

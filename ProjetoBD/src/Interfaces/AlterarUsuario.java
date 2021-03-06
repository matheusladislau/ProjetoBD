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
 * @author Matheus
 */
public class AlterarUsuario extends javax.swing.JFrame {
    GerenciadorBD bd=new GerenciadorBD();
    /**
     * Creates new form AlterarUsuario
     */
    public AlterarUsuario() {
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
        cmp_recebeId = new javax.swing.JTextField();
        btn_voltar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        bnt_alterarRua = new javax.swing.JButton();
        btn_alterarBairro = new javax.swing.JButton();
        bnt_alterarEmail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_green.jpg"))); // NOI18N
        txt_titulo.setText("Alterar Usuário");
        txt_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_id.setText("ID Pessoa");

        btn_voltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        bnt_alterarRua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnt_alterarRua.setText("Alterar Rua");
        bnt_alterarRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_alterarRuaActionPerformed(evt);
            }
        });

        btn_alterarBairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterarBairro.setText("Alterar Bairro");
        btn_alterarBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarBairroActionPerformed(evt);
            }
        });

        bnt_alterarEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnt_alterarEmail.setText("Alterar Email");
        bnt_alterarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_alterarEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_id)
                        .addGap(10, 10, 10)
                        .addComponent(cmp_recebeId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bnt_alterarRua, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_alterarBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt_alterarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmp_recebeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id)
                    .addComponent(btn_consultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnt_alterarRua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_alterarBairro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnt_alterarEmail)
                .addGap(18, 18, 18)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        limpar();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        JOptionPane.showMessageDialog(null,bd.selectPessoa(Integer.parseInt(cmp_recebeId.getText())));
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void bnt_alterarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_alterarEmailActionPerformed
        int idPessoa=Integer.parseInt(cmp_recebeId.getText());
        String email=JOptionPane.showInputDialog("Insira o novo email do usuário: ");
        if(bd.updateEmailPessoa(idPessoa,email)){
            JOptionPane.showMessageDialog(null,"Alteração realizada.");
            cmp_recebeId.setText("");
        }
        else
            JOptionPane.showMessageDialog(null,"Alteração não realizada.");
    }//GEN-LAST:event_bnt_alterarEmailActionPerformed

    private void bnt_alterarRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_alterarRuaActionPerformed
        int idPessoa=Integer.parseInt(cmp_recebeId.getText());
        String email=JOptionPane.showInputDialog("Insira o novo endereço do usuário: ");
        if(bd.updateEnderecoPessoa(idPessoa,email)){
            JOptionPane.showMessageDialog(null,"Alteração realizada.");
            cmp_recebeId.setText("");
        }
        else
            JOptionPane.showMessageDialog(null,"Alteração não realizada.");
    }//GEN-LAST:event_bnt_alterarRuaActionPerformed

    private void btn_alterarBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarBairroActionPerformed
         int idPessoa=Integer.parseInt(cmp_recebeId.getText());
        String bairro=JOptionPane.showInputDialog("Insira o novo bairro do usuário: ");
        if(bd.updateBairroPessoa(idPessoa,bairro)){
            JOptionPane.showMessageDialog(null,"Alteração realizada.");
            cmp_recebeId.setText("");
        }
        else
            JOptionPane.showMessageDialog(null,"Alteração não realizada.");
    }//GEN-LAST:event_btn_alterarBairroActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarUsuario().setVisible(true);
            }
        });
    }
    
    /**
    * Apaga os textos dentro da caixa de texto inseridos pelo usuário e esconde painel
    */
    public void limpar(){
        new InterfacePrincipal().setVisible(true);
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_alterarEmail;
    private javax.swing.JButton bnt_alterarRua;
    private javax.swing.JButton btn_alterarBairro;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JTextField cmp_recebeId;
    private javax.swing.JLabel txt_id;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}

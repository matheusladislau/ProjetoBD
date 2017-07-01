/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Classes.GerenciadorBD;
import Classes.Telefone;
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus
 */
public class CadastrarOutroTelefone extends javax.swing.JFrame {
    /**
     * Creates new form OutroTelefone
     */
    public CadastrarOutroTelefone() {
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

        txt_id = new javax.swing.JLabel();
        cmp_recebeId = new javax.swing.JTextField();
        btn_verificarPessoa = new javax.swing.JButton();
        btn_enviar = new javax.swing.JButton();
        cmp_recebeTelefone = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        txt_hintVerificarId = new javax.swing.JLabel();
        txt_hintVerificarIdResposta = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id.setText("ID Pessoa");

        cmp_recebeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmp_recebeIdActionPerformed(evt);
            }
        });

        btn_verificarPessoa.setText("Verificar");
        btn_verificarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificarPessoaActionPerformed(evt);
            }
        });

        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        cmp_recebeTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmp_recebeTelefoneActionPerformed(evt);
            }
        });

        txt_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_telefone.setText("Telefone");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_hintVerificarId.setBackground(new java.awt.Color(0, 0, 0));
        txt_hintVerificarId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_hintVerificarId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_hintVerificarId.setText("?");
        txt_hintVerificarId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_hintVerificarIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_hintVerificarIdMouseExited(evt);
            }
        });

        txt_hintVerificarIdResposta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txt_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_blue.jpg"))); // NOI18N
        txt_titulo.setText("Telefone");
        txt_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 446, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_telefone)
                            .addComponent(txt_id))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmp_recebeTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmp_recebeId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_verificarPessoa)
                        .addGap(18, 18, 18)
                        .addComponent(txt_hintVerificarId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_hintVerificarIdResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txt_id))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmp_recebeId, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(btn_verificarPessoa)
                        .addComponent(txt_hintVerificarId)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmp_recebeTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_hintVerificarIdResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmp_recebeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmp_recebeIdActionPerformed

    }//GEN-LAST:event_cmp_recebeIdActionPerformed

    private void btn_verificarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificarPessoaActionPerformed
        if(Integer.parseInt(cmp_recebeId.getText())>0){
            GerenciadorBD bd=new GerenciadorBD();
            int id=Integer.parseInt(cmp_recebeId.getText());
            JOptionPane.showMessageDialog(null,bd.selectNomePessoa(id));
        }else{
            JOptionPane.showMessageDialog(null,"Insira um número de ID para verificar.");
        }
    }//GEN-LAST:event_btn_verificarPessoaActionPerformed
    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        if(cmp_recebeId.getText()!=null){
            GerenciadorBD bd=new GerenciadorBD();
            int idTelefone=bd.MaxIdTelefone()+1;
            int idPessoa=Integer.parseInt(cmp_recebeId.getText());
            String telefone=cmp_recebeTelefone.getText();
            bd.insert(new Telefone(idTelefone,idPessoa,telefone));
            limpar();
        }else{
            JOptionPane.showMessageDialog(null,"Id Pessoa vazio.");
        }
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void cmp_recebeTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmp_recebeTelefoneActionPerformed

    }//GEN-LAST:event_cmp_recebeTelefoneActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_hintVerificarIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_hintVerificarIdMouseEntered
        txt_hintVerificarIdResposta.setText("Verifica o nome da pessoa referente a esta ID.");
    }//GEN-LAST:event_txt_hintVerificarIdMouseEntered

    private void txt_hintVerificarIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_hintVerificarIdMouseExited
        txt_hintVerificarIdResposta.setText("");
    }//GEN-LAST:event_txt_hintVerificarIdMouseExited
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
            java.util.logging.Logger.getLogger(CadastrarOutroTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarOutroTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarOutroTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarOutroTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarOutroTelefone().setVisible(true);
            }
        });
    }
    /**
    * Apaga os textos inseridos pelo usuários das caixas de texto e esconde este painels
    */
    public void limpar(){
        cmp_recebeId.setText("");
        cmp_recebeTelefone.setText("");
        setVisible(false);
        InterfacePrincipal interfPrincipal=new InterfacePrincipal();
        interfPrincipal.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_verificarPessoa;
    private javax.swing.JTextField cmp_recebeId;
    private javax.swing.JTextField cmp_recebeTelefone;
    private javax.swing.JLabel txt_hintVerificarId;
    private javax.swing.JLabel txt_hintVerificarIdResposta;
    private javax.swing.JLabel txt_id;
    private javax.swing.JLabel txt_telefone;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
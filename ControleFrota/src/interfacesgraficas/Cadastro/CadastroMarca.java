/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesgraficas.Cadastro;

import classededados.GeradorDeId;
import classededados.Marca;
import interfacesgraficas.Consulta.TelaConsultaMarca;
import interfacesgraficas.TelaPrincipal;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.ClasseDAO;

/**
 *
 * @author aluno
 */
public class CadastroMarca extends javax.swing.JFrame {

    String idAlteracao;
    String descricao;
    private boolean terminado;

    /**
     * Creates new form CadastroMarca
     */
    public CadastroMarca() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelAcao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelAcao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAcao.setText("Nova Marca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelAcao)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelAcao)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Campos Obrigatórios *");

        jLabel3.setText("Nome*");

        jButtonSalvar.setBackground(new java.awt.Color(0, 136, 204));
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButtonSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addComponent(jButtonSalvar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        descricao = jTextFieldDescricao.getText();
        if (!(jTextFieldDescricao.getText().equals(""))) {
            if ((jLabelAcao.getText()).equals("Nova Marca")) {
                int resposta = JOptionPane.showConfirmDialog(rootPane, "Confirmar Cadastro?");
                if (resposta == JOptionPane.YES_OPTION) {
                    try {
                        GeradorDeId idMarca = new GeradorDeId();
                        Marca obj = new Marca();

                        obj.setId(idMarca.getIdMarca());
                        obj.setDescricao(jTextFieldDescricao.getText());

                        ClasseDAO categoria = new ClasseDAO();
                        categoria.incluirMarca(obj);
                        JOptionPane.showMessageDialog(rootPane, "Cadastro efetuado com sucesso!");
                        idMarca.finalize();
                        jTextFieldDescricao.setText("");

                    } catch (Exception e) {
                    }
                } else if (resposta == JOptionPane.NO_OPTION) {
                    jTextFieldDescricao.setText(descricao);
                } else {
                    this.dispose();
                }
            } else {
                int resposta = JOptionPane.showConfirmDialog(rootPane, "Confirmar Alteração?");
                if (resposta == JOptionPane.YES_OPTION) {
                    try {
                        Marca obj = new Marca();
                        obj.setId(Integer.parseInt(idAlteracao));
                        obj.setDescricao(descricao);

                        ClasseDAO dao = new ClasseDAO();
                        dao.alterarMarca(obj, idAlteracao);
                        JOptionPane.showMessageDialog(rootPane, "Alteração efetuada com sucesso!");
                                             
                        terminado = true;
                        jTextFieldDescricao.setEnabled(false);
                    } catch (Exception e) {
                    }
                } else if (resposta == JOptionPane.NO_OPTION) {
                    jTextFieldDescricao.setText(descricao);
                } else {
                    this.dispose();
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Campos obrigatórios não preenchidos!");
        }


    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMarca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAcao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldDescricao;
    // End of variables declaration//GEN-END:variables
    public void alteracao(String acao, String id, String descricao) throws Exception {
        jLabelAcao.setText(acao);
        ArrayList<Marca> listaDeMarcas;
        ClasseDAO agenda = new ClasseDAO();
        listaDeMarcas = agenda.recuperarMarca();
        for (int pos = 0; pos < listaDeMarcas.size(); pos++) {
            Marca aux = listaDeMarcas.get(pos);

            if (id.equals(String.valueOf(aux.getId()))) {
                this.idAlteracao = String.valueOf(aux.getId());
                jTextFieldDescricao.setText(aux.getDescricao());
            }
        }

    }

    public boolean isTerminado() {
        return terminado;
    }

//    public void atualizarJTable() {
//        try {
//            ArrayList<Marca> listaDeMarcas;
//            ClasseDAO agenda = new ClasseDAO();
//            listaDeMarcas = agenda.recuperarMarca();
//            new TelaConsultaMarca().model = (DefaultTableModel) new TelaConsultaMarca().jTableMarca.getModel();
//
//            new TelaConsultaMarca().model.setNumRows(0);
//            for (int pos = 0; pos < listaDeMarcas.size(); pos++) {
//                String[] saida = new String[2];
//                Marca aux = listaDeMarcas.get(pos);
//                saida[0] = String.valueOf(aux.getId());
//                saida[1] = aux.getDescricao();
//                new TelaConsultaMarca().model.addRow(saida);
//            }
//        } catch (Exception erro) {
//            JOptionPane.showMessageDialog(this, erro.getMessage());
//        }
//    }

}

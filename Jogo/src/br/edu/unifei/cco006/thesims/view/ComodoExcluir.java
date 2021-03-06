/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.view;

import br.edu.unifei.cco006.thesims.dao.CasaDao;
import br.edu.unifei.cco006.thesims.dao.ComodoDao;
import br.edu.unifei.cco006.thesims.dao.FonteDados;
import br.edu.unifei.cco006.thesims.modelo.Casa;
import br.edu.unifei.cco006.thesims.modelo.Comodo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class ComodoExcluir extends javax.swing.JFrame {

    /**
     * Creates new form FamiliaAlterar
    */
    
    private final EntityManager em = FonteDados.createEntityManager();
    private final CasaDao cdao = new CasaDao(em);
    private Casa casa;
    private final ComodoDao comodoDao = new ComodoDao(em);
    private Comodo comodo;

    
    public ComodoExcluir() {
        initComponents();
        
        List<Integer> l = cdao.buscaCasa();
        for (int cod : l) {
            cbxCasa.addItem(""+cod);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCasa = new javax.swing.JLabel();
        cbxCasa = new javax.swing.JComboBox<>();
        btnBuscarComodo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblComodo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        cbxComodo = new javax.swing.JComboBox<>();
        txtTipo = new javax.swing.JTextField();
        btnBuscarCasa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCasa.setText("Casa:");

        btnBuscarComodo.setText("Buscar");
        btnBuscarComodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarComodoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblComodo.setText("Comodo:");

        lblTipo.setText("Tipo:");

        btnBuscarCasa.setText("Buscar");
        btnBuscarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCasa)
                        .addComponent(lblComodo))
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxCasa, 0, 151, Short.MAX_VALUE)
                    .addComponent(btnExcluir)
                    .addComponent(cbxComodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipo))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarComodo)
                    .addComponent(btnBuscarCasa))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCasa)
                    .addComponent(cbxCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCasa))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarComodo)
                    .addComponent(lblComodo)
                    .addComponent(cbxComodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnExcluir)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarComodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarComodoActionPerformed
        // TODO add your handling code here:
         
         comodo = comodoDao.findByKey(Integer.parseInt(cbxComodo.getSelectedItem().toString()));
         txtTipo.setText(comodo.getComodo().toString());
         btnExcluir.setEnabled(true);        
    }//GEN-LAST:event_btnBuscarComodoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
       
        casa.getComodo().remove(comodo);
        cdao.update(casa);
        
        comodoDao.delete(comodo);
        cbxCasa.setEnabled(true);
        
        
        btnBuscarCasa.setEnabled(true);
        btnExcluir.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Comodo excluido. ");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCasaActionPerformed
        // TODO add your handling code here:
        cbxComodo.removeAllItems();
        casa = cdao.findByKey(Integer.parseInt(
                cbxCasa.getSelectedItem().toString()));
        
        
        List<Comodo> lComodo = casa.getComodo();
        for (Comodo comodo1 : lComodo) {
            cbxComodo.addItem(""+comodo1.getCodigo());
        }
        cbxCasa.setEnabled(false);
        btnBuscarCasa.setEnabled(false);
        
        
        
    }//GEN-LAST:event_btnBuscarCasaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCasa;
    private javax.swing.JButton btnBuscarComodo;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cbxCasa;
    private javax.swing.JComboBox<String> cbxComodo;
    private javax.swing.JLabel lblCasa;
    private javax.swing.JLabel lblComodo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

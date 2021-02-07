/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.view;

import br.edu.unifei.cco006.thesims.dao.CasaDao;
import br.edu.unifei.cco006.thesims.dao.ComodoDao;
import br.edu.unifei.cco006.thesims.dao.FonteDados;
import br.edu.unifei.cco006.thesims.dao.ObjetoDao;
import br.edu.unifei.cco006.thesims.modelo.Casa;
import br.edu.unifei.cco006.thesims.modelo.Comodo;
import br.edu.unifei.cco006.thesims.modelo.ComodoEnum;
import br.edu.unifei.cco006.thesims.modelo.Objeto;
import br.edu.unifei.cco006.thesims.modelo.ObjetoEnum;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class ObjetoInserir extends javax.swing.JFrame {
    
    private final EntityManager em = FonteDados.createEntityManager();
    private final ObjetoDao odao = new ObjetoDao(em);
    private Objeto objeto;
    private final ComodoDao cdao = new ComodoDao(em);
    private Comodo comodo;
    private final CasaDao casaDao = new CasaDao(em);
    private Casa casa;
    
    
    /**
     * Creates new form ComodoInserir
     */
    public ObjetoInserir() {
        initComponents();
        
        List<Integer> l = casaDao.buscaCasa();
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

        jLabel2 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        cbxObjeto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbxCasa = new javax.swing.JComboBox<>();
        lblCor = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        lblComodo = new javax.swing.JLabel();
        cbxComodo = new javax.swing.JComboBox<>();
        btnBuscarComodo = new javax.swing.JButton();
        btnBuscarCasa = new javax.swing.JButton();
        txtComodo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTipo.setText("Objeto:");

        cbxObjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABAJUR", "QUADRO", "VIDEOGAME", "COMPUTADOR", "TELEFONE", "ALARME", "CHURRASQUEIRA", "VIOLAO", "CAVALETE", "APARELHOMUSCULACAO", "LIVRO", "BONECA", "BRINQUEDO" }));

        jLabel1.setText("Casa:");

        lblCor.setText("Cor:");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        lblComodo.setText("Comodo:");

        btnBuscarComodo.setText("Buscar");
        btnBuscarComodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarComodoActionPerformed(evt);
            }
        });

        btnBuscarCasa.setText("Buscar");
        btnBuscarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCasaActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComodo)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxComodo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarCasa)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarComodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 16, Short.MAX_VALUE))
                                    .addComponent(txtComodo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addGap(18, 18, 18)
                                .addComponent(cbxObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInserir)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCasa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComodo)
                    .addComponent(cbxComodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarComodo)
                    .addComponent(txtComodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cbxObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor)
                    .addComponent(jLabel3)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnInserir)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        objeto = new Objeto();
        if(cbxObjeto.getSelectedItem().toString().equals("ABAJUR")) {
            objeto.setObjeto(ObjetoEnum.ABAJUR);
        } else if(cbxObjeto.getSelectedItem().toString().equals("ALARME")) {
            objeto.setObjeto(ObjetoEnum.ALARME);
        } else if(cbxObjeto.getSelectedItem().toString().equals("APARELHOMUSCULACAO")) {
            objeto.setObjeto(ObjetoEnum.APARELHOMUSCULACAO);
        } else if(cbxObjeto.getSelectedItem().toString().equals("BONECA")) {
            objeto.setObjeto(ObjetoEnum.BONECA);
        } else if(cbxObjeto.getSelectedItem().toString().equals("BRINQUEDO")) {
            objeto.setObjeto(ObjetoEnum.BRINQUEDO);
        } else if(cbxObjeto.getSelectedItem().toString().equals("CAVALETE")) {
            objeto.setObjeto(ObjetoEnum.CAVALETE);
        } else if(cbxObjeto.getSelectedItem().toString().equals("CHURRASQUEIRA")) {
            objeto.setObjeto(ObjetoEnum.CHURRASQUEIRA);
        } else if(cbxObjeto.getSelectedItem().toString().equals("COMPUTADOR")) {
            objeto.setObjeto(ObjetoEnum.COMPUTADOR);
        } else if(cbxObjeto.getSelectedItem().toString().equals("LIVRO")) {
            objeto.setObjeto(ObjetoEnum.LIVRO);
        } else if(cbxObjeto.getSelectedItem().toString().equals("QUADRO")) {
            objeto.setObjeto(ObjetoEnum.QUADRO);
        } else if(cbxObjeto.getSelectedItem().toString().equals("TELEFONE")) {
            objeto.setObjeto(ObjetoEnum.TELEFONE);
        } else if(cbxObjeto.getSelectedItem().toString().equals("VIDEOGAME")) {
            objeto.setObjeto(ObjetoEnum.VIDEOGAME);
        } else if(cbxObjeto.getSelectedItem().toString().equals("VIOLAO")) {
            objeto.setObjeto(ObjetoEnum.VIOLAO);
        }     
        
        objeto.setCor(txtCor.getText());
        objeto.setPreco(Float.parseFloat(txtPreco.getText()));
        
        odao.create(objeto);
        comodo.getObjetos().add(objeto);
        cdao.update(comodo);
        casaDao.update(casa);
        
        JOptionPane.showMessageDialog(
                this, " Objeto criado.");
        
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnBuscarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCasaActionPerformed
        // TODO add your handling code here:
        casa = casaDao.findByKey(Integer.parseInt(cbxCasa.getSelectedItem().toString()));
        
        cbxComodo.removeAllItems();
        List<Comodo> lComodo = casa.getComodo();
        for (Comodo c : lComodo) {
            cbxComodo.addItem(""+c.getCodigo());
        }
        
    }//GEN-LAST:event_btnBuscarCasaActionPerformed

    private void btnBuscarComodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarComodoActionPerformed
        // TODO add your handling code here:
        comodo = cdao.findByKey(Integer.parseInt(cbxComodo.getSelectedItem().toString()));
        txtComodo.setEditable(false);
        txtComodo.setText(comodo.getComodo().toString());
        
    }//GEN-LAST:event_btnBuscarComodoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCasa;
    private javax.swing.JButton btnBuscarComodo;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> cbxCasa;
    private javax.swing.JComboBox<String> cbxComodo;
    private javax.swing.JComboBox<String> cbxObjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblComodo;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtComodo;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}

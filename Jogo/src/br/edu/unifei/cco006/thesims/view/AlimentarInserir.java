/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.view;

import br.edu.unifei.cco006.thesims.dao.AlimentarDao;
import br.edu.unifei.cco006.thesims.dao.FonteDados;
import br.edu.unifei.cco006.thesims.dao.PessoaDao;
import br.edu.unifei.cco006.thesims.modelo.Alimentar;
import br.edu.unifei.cco006.thesims.modelo.AlimentarEnum;
import br.edu.unifei.cco006.thesims.modelo.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class AlimentarInserir extends javax.swing.JFrame {

    private final EntityManager em = FonteDados.createEntityManager();
    private final AlimentarDao adao = new AlimentarDao(em);
    private Alimentar alimentar;
    private final PessoaDao pdao = new PessoaDao(em);
    private Pessoa pessoa;
    
    /**
     * Creates new form AlimentarInserir
     */
    public AlimentarInserir() {
        initComponents();
        
        List<Pessoa> lPessoa = pdao.findAll();
        for (Pessoa p : lPessoa) {
            cbxPessoa.addItem(""+p.getCodigo());
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

        lblPessoa = new javax.swing.JLabel();
        cbxPessoa = new javax.swing.JComboBox<>();
        btnBuscarPessoa = new javax.swing.JButton();
        txtPessoa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxAlimento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtCaloria = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPessoa.setText("Pessoa:");

        btnBuscarPessoa.setText("Buscar");
        btnBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPessoaActionPerformed(evt);
            }
        });

        jLabel1.setText("Alimento:");

        cbxAlimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGUA", "ALMOCO", "JANTAR", "CAFE", "LANCHE" }));

        jLabel2.setText("Calorias:");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(lblPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaloria, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 150, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btnInserir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPessoa)
                    .addComponent(cbxPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPessoa)
                    .addComponent(txtPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCaloria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnInserir)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPessoaActionPerformed
        // TODO add your handling code here:
        pessoa = pdao.findByKey(Integer.parseInt(cbxPessoa.getSelectedItem().toString()));
        txtPessoa.setEditable(false);
        txtPessoa.setText(pessoa.getNome());
    }//GEN-LAST:event_btnBuscarPessoaActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        
        alimentar = new Alimentar();
        
        alimentar.setCalorias(Integer.parseInt(txtCaloria.getText()));
        
        if(cbxAlimento.getSelectedItem().toString().equals("ALMOÇO")) {
            alimentar.setAlimento(AlimentarEnum.ALMOCO);
        } else if(cbxAlimento.getSelectedItem().toString().equals("AGUA")) {
            alimentar.setAlimento(AlimentarEnum.AGUA);
        } else if(cbxAlimento.getSelectedItem().toString().equals("CAFE")) {
            alimentar.setAlimento(AlimentarEnum.CAFE);
        } else if(cbxAlimento.getSelectedItem().toString().equals("JANTAR")) {
            alimentar.setAlimento(AlimentarEnum.JANTAR);
        } else if(cbxAlimento.getSelectedItem().toString().equals("LANCHE")) {
            alimentar.setAlimento(AlimentarEnum.LANCHE);
        }
        
        adao.create(alimentar);
        pessoa.getAcoes().add(alimentar);
        pdao.update(pessoa);
        
        txtCaloria.setText("");
        txtPessoa.setText("");
        
        JOptionPane.showMessageDialog(this, "Alimentado");
        
    }//GEN-LAST:event_btnInserirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPessoa;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> cbxAlimento;
    private javax.swing.JComboBox<String> cbxPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JTextField txtCaloria;
    private javax.swing.JTextField txtPessoa;
    // End of variables declaration//GEN-END:variables
}

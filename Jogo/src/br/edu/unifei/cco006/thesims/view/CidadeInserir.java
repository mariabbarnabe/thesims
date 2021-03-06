/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.view;

import br.edu.unifei.cco006.thesims.dao.CidadeDao;
import br.edu.unifei.cco006.thesims.dao.FonteDados;
import br.edu.unifei.cco006.thesims.modelo.Cidade;
import br.edu.unifei.cco006.thesims.modelo.Familia;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class CidadeInserir extends javax.swing.JFrame {

    private final EntityManager em = FonteDados.createEntityManager();
    private final CidadeDao cdao = new CidadeDao(em);
    private Cidade cidade;
    
    /**
     * Creates new form InsereCidade
     */
    public CidadeInserir() {
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

        tabOperacoes = new javax.swing.JTabbedPane();
        panInserir = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        lblHab = new javax.swing.JLabel();
        lblTam = new javax.swing.JLabel();
        txtHab = new javax.swing.JTextField();
        txtTam = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNome.setText("Nome");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        lblHab.setText("Habitantes:");

        lblTam.setText("Tamanho");

        javax.swing.GroupLayout panInserirLayout = new javax.swing.GroupLayout(panInserir);
        panInserir.setLayout(panInserirLayout);
        panInserirLayout.setHorizontalGroup(
            panInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInserirLayout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInserirLayout.createSequentialGroup()
                        .addGroup(panInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHab)
                            .addComponent(lblTam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInserir)
                            .addGroup(panInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHab, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(txtTam)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panInserirLayout.setVerticalGroup(
            panInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInserirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHab)
                    .addComponent(txtHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTam)
                    .addComponent(txtTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInserir)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        tabOperacoes.addTab("Inserir", panInserir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabOperacoes, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabOperacoes, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        cidade = new Cidade();
        cidade.setNome(txtNome.getText());
        cidade.setTotalHabitantes(Integer.parseInt(txtHab.getText()));
        cidade.setTamanho(Integer.parseInt(txtTam.getText()));
        cdao.create(cidade);
        JOptionPane.showMessageDialog(
                this, "Cidade "+ cidade.getNome() + " criada. \n Habitantes: "+ cidade.getTotalHabitantes() +
                        " \n Tamanho: " + cidade.getTamanho());
        txtNome.setText("");
        txtHab.setText("");
        txtTam.setText("");
        
    }//GEN-LAST:event_btnInserirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel lblHab;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTam;
    private javax.swing.JPanel panInserir;
    private javax.swing.JTabbedPane tabOperacoes;
    private javax.swing.JTextField txtHab;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTam;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.view;

import br.edu.unifei.cco006.thesims.dao.FonteDados;
import br.edu.unifei.cco006.thesims.dao.HabilidadeDao;
import br.edu.unifei.cco006.thesims.dao.PessoaDao;
import br.edu.unifei.cco006.thesims.modelo.Habilidade;
import br.edu.unifei.cco006.thesims.modelo.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class HabilidadeInserir extends javax.swing.JFrame {

    private final EntityManager em =  FonteDados.createEntityManager();
    private final HabilidadeDao hdao = new HabilidadeDao(em);
    private Habilidade habilidade;
    private final PessoaDao pdao = new PessoaDao(em);
    private Pessoa pessoa;
    /**
     * Creates new form NecessidadeInserir
     */
    public HabilidadeInserir() {
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
        lblMecanica = new javax.swing.JLabel();
        lblLogica = new javax.swing.JLabel();
        lblCarisma = new javax.swing.JLabel();
        lblFisico = new javax.swing.JLabel();
        lblCriatividade = new javax.swing.JLabel();
        txtLogica = new javax.swing.JTextField();
        txtMecanica = new javax.swing.JTextField();
        txtCarisma = new javax.swing.JTextField();
        txtCriatividade = new javax.swing.JTextField();
        txtFisico = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPessoa.setText("Pessoa:");

        btnBuscarPessoa.setText("Buscar");
        btnBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPessoaActionPerformed(evt);
            }
        });

        lblMecanica.setText("Mecânica:");

        lblLogica.setText("Lógica:");

        lblCarisma.setText("Carisma:");

        lblFisico.setText("Físico:");

        lblCriatividade.setText("Criatividade:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLogica)
                            .addComponent(lblMecanica)
                            .addComponent(lblCarisma)
                            .addComponent(lblFisico)
                            .addComponent(lblCriatividade))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtMecanica, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLogica, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCriatividade, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                        .addComponent(btnInserir)))))
                        .addGap(33, 33, 33)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPessoa)
                    .addComponent(cbxPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPessoa)
                    .addComponent(txtPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMecanica)
                    .addComponent(txtMecanica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogica)
                    .addComponent(txtLogica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarisma)
                    .addComponent(txtCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFisico)
                    .addComponent(txtFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCriatividade)
                    .addComponent(txtCriatividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
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
        habilidade = new Habilidade();
        
        habilidade.setCarisma(Integer.parseInt(txtCarisma.getText()));
        habilidade.setCriatividade(Integer.parseInt(txtCriatividade.getText()));
        habilidade.setFisico(Integer.parseInt(txtFisico.getText()));
        habilidade.setLogica(Integer.parseInt(txtLogica.getText()));
        habilidade.setMecanica(Integer.parseInt(txtMecanica.getText()));
        
        hdao.create(habilidade);
        pessoa.setHabilidade(habilidade);
        pdao.update(pessoa);
        
        JOptionPane.showMessageDialog(this, "Habilidade inserida.");
    }//GEN-LAST:event_btnInserirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPessoa;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> cbxPessoa;
    private javax.swing.JLabel lblCarisma;
    private javax.swing.JLabel lblCriatividade;
    private javax.swing.JLabel lblFisico;
    private javax.swing.JLabel lblLogica;
    private javax.swing.JLabel lblMecanica;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JTextField txtCarisma;
    private javax.swing.JTextField txtCriatividade;
    private javax.swing.JTextField txtFisico;
    private javax.swing.JTextField txtLogica;
    private javax.swing.JTextField txtMecanica;
    private javax.swing.JTextField txtPessoa;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.view;

import br.edu.unifei.cco006.thesims.dao.FonteDados;
import br.edu.unifei.cco006.thesims.dao.NecessidadeDao;
import br.edu.unifei.cco006.thesims.dao.PessoaDao;
import br.edu.unifei.cco006.thesims.modelo.Necessidade;
import br.edu.unifei.cco006.thesims.modelo.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class NecessidadeInserir extends javax.swing.JFrame {

    private final EntityManager em =  FonteDados.createEntityManager();
    private final NecessidadeDao ndao = new NecessidadeDao(em);
    private Necessidade necessidade;
    private final PessoaDao pdao = new PessoaDao(em);
    private Pessoa pessoa;
    /**
     * Creates new form NecessidadeInserir
     */
    public NecessidadeInserir() {
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
        lblFome = new javax.swing.JLabel();
        lblConforto = new javax.swing.JLabel();
        lblHigiene = new javax.swing.JLabel();
        lblBanheiro = new javax.swing.JLabel();
        lblEnergia = new javax.swing.JLabel();
        lblDiversao = new javax.swing.JLabel();
        lblSocial = new javax.swing.JLabel();
        lblAmbiente = new javax.swing.JLabel();
        txtConforto = new javax.swing.JTextField();
        txtFome = new javax.swing.JTextField();
        txtHigiene = new javax.swing.JTextField();
        txtEnergia = new javax.swing.JTextField();
        txtDiversao = new javax.swing.JTextField();
        txtBanheiro = new javax.swing.JTextField();
        txtSocial = new javax.swing.JTextField();
        txtAmbiente = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPessoa.setText("Pessoa:");

        btnBuscarPessoa.setText("Buscar");
        btnBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPessoaActionPerformed(evt);
            }
        });

        lblFome.setText("Fome:");

        lblConforto.setText("Conforto:");

        lblHigiene.setText("Higiene:");

        lblBanheiro.setText("Banheiro:");

        lblEnergia.setText("Energia:");

        lblDiversao.setText("Diversão:");

        lblSocial.setText("Social:");

        lblAmbiente.setText("Ambiente:");

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
                            .addComponent(lblConforto)
                            .addComponent(lblFome)
                            .addComponent(lblHigiene)
                            .addComponent(lblBanheiro)
                            .addComponent(lblEnergia)
                            .addComponent(lblDiversao)
                            .addComponent(lblSocial)
                            .addComponent(lblAmbiente))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtFome, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConforto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiversao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
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
                    .addComponent(lblFome)
                    .addComponent(txtFome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConforto)
                    .addComponent(txtConforto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHigiene)
                    .addComponent(txtHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBanheiro)
                    .addComponent(txtBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnergia)
                    .addComponent(txtEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiversao)
                    .addComponent(txtDiversao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSocial)
                    .addComponent(txtSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmbiente)
                    .addComponent(txtAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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
        necessidade = new Necessidade();
        
        necessidade.setAmbiente(Integer.parseInt(txtAmbiente.getText()));
        necessidade.setBanheiro(Integer.parseInt(txtBanheiro.getText()));
        necessidade.setConforto(Integer.parseInt(txtConforto.getText()));
        necessidade.setDiversao(Integer.parseInt(txtDiversao.getText()));
        necessidade.setEnergia(Integer.parseInt(txtEnergia.getText()));
        necessidade.setFome(Integer.parseInt(txtFome.getText()));
        necessidade.setHigiene(Integer.parseInt(txtHigiene.getText()));
        necessidade.setSocial(Integer.parseInt(txtSocial.getText()));
        
        ndao.create(necessidade);
        pessoa.setNecessidade(necessidade);
        pdao.update(pessoa);
        
        JOptionPane.showMessageDialog(this, "Necessidade inserida.");
    }//GEN-LAST:event_btnInserirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPessoa;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> cbxPessoa;
    private javax.swing.JLabel lblAmbiente;
    private javax.swing.JLabel lblBanheiro;
    private javax.swing.JLabel lblConforto;
    private javax.swing.JLabel lblDiversao;
    private javax.swing.JLabel lblEnergia;
    private javax.swing.JLabel lblFome;
    private javax.swing.JLabel lblHigiene;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JLabel lblSocial;
    private javax.swing.JTextField txtAmbiente;
    private javax.swing.JTextField txtBanheiro;
    private javax.swing.JTextField txtConforto;
    private javax.swing.JTextField txtDiversao;
    private javax.swing.JTextField txtEnergia;
    private javax.swing.JTextField txtFome;
    private javax.swing.JTextField txtHigiene;
    private javax.swing.JTextField txtPessoa;
    private javax.swing.JTextField txtSocial;
    // End of variables declaration//GEN-END:variables
}

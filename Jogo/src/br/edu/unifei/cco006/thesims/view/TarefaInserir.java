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
import br.edu.unifei.cco006.thesims.dao.PessoaDao;
import br.edu.unifei.cco006.thesims.dao.TarefaDao;
import br.edu.unifei.cco006.thesims.modelo.Casa;
import br.edu.unifei.cco006.thesims.modelo.Comodo;
import br.edu.unifei.cco006.thesims.modelo.Lazer;
import br.edu.unifei.cco006.thesims.modelo.LazerEnum;
import br.edu.unifei.cco006.thesims.modelo.Objeto;
import br.edu.unifei.cco006.thesims.modelo.Pessoa;
import br.edu.unifei.cco006.thesims.modelo.Tarefa;
import br.edu.unifei.cco006.thesims.modelo.TarefaEnum;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class TarefaInserir extends javax.swing.JFrame {

    private final EntityManager em = FonteDados.createEntityManager();
    private final ObjetoDao odao = new ObjetoDao(em);
    private Objeto objeto;
    private final TarefaDao tdao = new TarefaDao(em);
    private Tarefa tarefa;
    private final PessoaDao pdao = new PessoaDao(em);
    private Pessoa pessoa;
    private final CasaDao casaDao = new CasaDao(em);
    private Casa casa;
    private final ComodoDao cdao = new ComodoDao(em);
    private Comodo comodo;
    
    /**
     * Creates new form AlimentarInserir
     */
    public TarefaInserir() {
        initComponents();
        
        List<Pessoa> lPessoa = pdao.findAll();
        for (Pessoa p : lPessoa) {
            cbxPessoa.addItem(""+p.getCodigo());
        }
        
        List<Casa> lCasa = casaDao.findAll();
        for (Casa c : lCasa) {
            cbxCasa.addItem(""+c.getCodigo());
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
        lblTarefa = new javax.swing.JLabel();
        cbxTarefa = new javax.swing.JComboBox<>();
        lblComodo = new javax.swing.JLabel();
        txtComodo = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        lblCasa = new javax.swing.JLabel();
        cbxCasa = new javax.swing.JComboBox<>();
        btnBuscarCasa = new javax.swing.JButton();
        cbxComodo = new javax.swing.JComboBox<>();
        btnBuscarComodo = new javax.swing.JButton();
        lblObjeto = new javax.swing.JLabel();
        cbxObjeto = new javax.swing.JComboBox<>();
        btnBuscarObjeto = new javax.swing.JButton();
        txtObjeto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPessoa.setText("Pessoa:");

        btnBuscarPessoa.setText("Buscar");
        btnBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPessoaActionPerformed(evt);
            }
        });

        lblTarefa.setText("Tarefa:");

        cbxTarefa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAVAR", "PEGAR", "LIMPAR", "VARRER", "CONSERTAR" }));

        lblComodo.setText("Comodo:");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        lblCasa.setText("Casa:");

        btnBuscarCasa.setText("Buscar");
        btnBuscarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCasaActionPerformed(evt);
            }
        });

        btnBuscarComodo.setText("Buscar");
        btnBuscarComodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarComodoActionPerformed(evt);
            }
        });

        lblObjeto.setText("Objeto:");

        btnBuscarObjeto.setText("Buscar");
        btnBuscarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarObjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btnInserir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblObjeto)
                    .addComponent(lblTarefa)
                    .addComponent(lblPessoa)
                    .addComponent(lblCasa)
                    .addComponent(lblComodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxComodo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarComodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComodo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarCasa)))
                        .addGap(0, 153, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarObjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObjeto)))
                .addContainerGap())
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
                    .addComponent(lblTarefa)
                    .addComponent(cbxTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCasa)
                    .addComponent(cbxCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCasa))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComodo)
                    .addComponent(txtComodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxComodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarComodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObjeto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarObjeto)
                        .addComponent(txtObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnInserir)
                .addGap(58, 58, 58))
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
        
       tarefa = new Tarefa();
        
      
        if(cbxTarefa.getSelectedItem().toString().equals("CONSERTAR")) {
            tarefa.setAcao(TarefaEnum.CONSERTAR);
        } else  if(cbxTarefa.getSelectedItem().toString().equals("LAVAR")) {
            tarefa.setAcao(TarefaEnum.LAVAR);
        }else  if(cbxTarefa.getSelectedItem().toString().equals("LIMPAR")) {
            tarefa.setAcao(TarefaEnum.LIMPAR);
        }else  if(cbxTarefa.getSelectedItem().toString().equals("PEGAR")) {
            tarefa.setAcao(TarefaEnum.PEGAR);
        }else  if(cbxTarefa.getSelectedItem().toString().equals("VARRER")) {
            tarefa.setAcao(TarefaEnum.VARRER);
        }
          
        tarefa.setObjeto(objeto);
        tarefa.setComodo(comodo);
        
        tdao.create(tarefa);
        pessoa.getAcoes().add(tarefa);
        pdao.update(pessoa);
        
        txtComodo.setText("");
        txtPessoa.setText("");
        txtObjeto.setText("");
        
        JOptionPane.showMessageDialog(this, pessoa.getNome()+ " " + tarefa.getAcao().toString());
        
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnBuscarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCasaActionPerformed
        // TODO add your handling code here:
        casa = casaDao.findByKey(Integer.parseInt(cbxCasa.getSelectedItem().toString()));
        
        //cbxDestino.removeAllItems();
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
        
        cbxObjeto.removeAllItems();
        List<Objeto> lObjeto = comodo.getObjetos();
        for (Objeto o : lObjeto) {
            cbxObjeto.addItem(""+o.getCodigo());
        }
        
    }//GEN-LAST:event_btnBuscarComodoActionPerformed

    private void btnBuscarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarObjetoActionPerformed
        // TODO add your handling code here:
        objeto = odao.findByKey(Integer.parseInt(cbxObjeto.getSelectedItem().toString()));
        txtObjeto.setEditable(false);
        txtObjeto.setText(objeto.getObjeto().toString());
    }//GEN-LAST:event_btnBuscarObjetoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCasa;
    private javax.swing.JButton btnBuscarComodo;
    private javax.swing.JButton btnBuscarObjeto;
    private javax.swing.JButton btnBuscarPessoa;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> cbxCasa;
    private javax.swing.JComboBox<String> cbxComodo;
    private javax.swing.JComboBox<String> cbxObjeto;
    private javax.swing.JComboBox<String> cbxPessoa;
    private javax.swing.JComboBox<String> cbxTarefa;
    private javax.swing.JLabel lblCasa;
    private javax.swing.JLabel lblComodo;
    private javax.swing.JLabel lblObjeto;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JLabel lblTarefa;
    private javax.swing.JTextField txtComodo;
    private javax.swing.JTextField txtObjeto;
    private javax.swing.JTextField txtPessoa;
    // End of variables declaration//GEN-END:variables
}
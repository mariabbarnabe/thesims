/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author maria
 */

@Entity
public class Familia {
    @Id
    private String nome;
    private float dinheiro;
    @OneToMany
    private List<Pessoa> membros = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public List<Pessoa> getMembros() {
        return membros;
    }

    public void setMembros(List<Pessoa> membros) {
        this.membros = membros;
    }
    
    public void comprarCasa(Casa casa){
        if((dinheiro-casa.getPreco())> 0){
            dinheiro = dinheiro - casa.getPreco();
            casa.setFamilia(this);    
            System.out.println("Compra realizada.");
        }
        else System.out.println("Impossível realizar a compra.");
        
    }
    
    public void comprarMovel(Casa casa){
        for(int i=0; i< casa.getComodo().size(); i++){
            for(int j=0; j<casa.getComodo().get(i).getMobilia().size(); j++){
                if((dinheiro-casa.getComodo().get(i).getMobilia().get(j).getPreco())<0){
                    System.out.println("Impossivel realizar a compra.");
                    return;
                }
                dinheiro = dinheiro - casa.getComodo().get(i).getMobilia().get(j).getPreco();
                System.out.println("Compra realizada.");
            }
        }
    }
    
    public void comprarObjeto(Casa casa){
        for(int i=0; i< casa.getComodo().size(); i++){
            for(int j=0; j<casa.getComodo().get(i).getObjetos().size(); j++){
                if((dinheiro-casa.getComodo().get(i).getObjetos().get(j).getPreco())<0){
                    System.out.println("Impossivel realizar a compra.");
                    return;
                }
                dinheiro = dinheiro - casa.getComodo().get(i).getObjetos().get(j).getPreco();
                System.out.println("Compra realizada.");
            }
        }
    }
}

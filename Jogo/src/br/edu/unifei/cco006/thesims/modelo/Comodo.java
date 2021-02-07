/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author maria
 */
@Entity
public class Comodo implements Serializable {
    @Id
    @GeneratedValue
    private int codigo; //precisa criat get e set se o valor é gerado automaticamente?
    
    private int tamanho;
    @Enumerated(EnumType.STRING)
    private ComodoEnum comodo;
    @OneToMany
    private List<Mobilia> mobilia = new ArrayList<>();
    @OneToMany
    private List<Objeto> objetos = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objeto> objetos) {
        this.objetos = objetos;
    }
    
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public ComodoEnum getComodo() {
        return comodo;
    }

    public void setComodo(ComodoEnum comodo) {
        this.comodo = comodo;
    }

    public List<Mobilia> getMobilia() {
        return mobilia;
    }

    public void setMobilia(List<Mobilia> mobilia) {
        this.mobilia = mobilia;
    }
    
    
}

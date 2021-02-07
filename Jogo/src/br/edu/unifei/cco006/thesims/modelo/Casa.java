/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author maria
 */
@Entity
@DiscriminatorValue(value = "Casa")
public class Casa extends Construcao{
    private float preco;
    private int tamanho;
    private String corParede;
    private String corTelhado;
    
    @OneToOne
    private Familia familia;
    
    @OneToMany
    private List<Comodo> comodo = new ArrayList<>();

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCorParede() {
        return corParede;
    }

    public void setCorParede(String corParede) {
        this.corParede = corParede;
    }

    public String getCorTelhado() {
        return corTelhado;
    }

    public void setCorTelhado(String corTelhado) {
        this.corTelhado = corTelhado;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public List<Comodo> getComodo() {
        return comodo;
    }

    public void setComodo(List<Comodo> comodo) {
        this.comodo = comodo;
    }

}

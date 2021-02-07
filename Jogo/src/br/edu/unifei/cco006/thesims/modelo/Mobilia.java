/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author maria
 */
@Entity

public class Mobilia {
    @Id
    @GeneratedValue
    private int codigo;
    
    private float preco;
    private String cor;
    private String material;
    
    @Enumerated(EnumType.STRING)
    private MobiliaEnum mobilia;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public MobiliaEnum getMobilia() {
        return mobilia;
    }

    public void setMobilia(MobiliaEnum mobilia) {
        this.mobilia = mobilia;
    }
    
    
}

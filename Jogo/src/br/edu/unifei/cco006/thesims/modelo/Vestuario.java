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
public class Vestuario {
    @Id
    @GeneratedValue
    private int codigo;
    
    private String cor;
    @Enumerated(EnumType.STRING)
    private VestuarioEnum tipo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public VestuarioEnum getTipo() {
        return tipo;
    }

    public void setTipo(VestuarioEnum tipo) {
        this.tipo = tipo;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author maria
 */
@Entity
public class Evento {
    
    @Id
    @GeneratedValue
    private int codigo;
    
    @ManyToMany
    private List<Pessoa> pessoas = new ArrayList<>();
    @OneToOne
    private Lugar local;
    private LocalDateTime hora;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Lugar getLocal() {
        return local;
    }

    public void setLocal(Lugar local) {
        this.local = local;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        System.out.println("Descricao:"+descricao);
        System.out.println("Convidados:");
        for(int i=0; i<pessoas.size();i++)
        {
            System.out.println(pessoas.get(i).getNome());
        }
        System.out.println("Local:"+local.getLugar());
        System.out.println("Horario:"+hora);
        return " ";
    }
    
    
}

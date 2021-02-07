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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author maria
 */
@Entity
public class Cidade {
    @Id
    private String nome;
    private int tamanho;
    private int totalHabitantes;
    @OneToMany
    private List<Construcao> construcoes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(int totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }

    public List<Construcao> getConstrucoes() {
        return construcoes;
    }

    public void setConstrucoes(List<Construcao> construcoes) {
        this.construcoes = construcoes;
    }
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

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
public class Pessoa {
    @Id
    @GeneratedValue
    private int codigo;
    
    private String nome;
    private int idade;
    private String sexo;
    private String corCabelo;
    private String corPele;
    private String corOlho;
    
    @OneToOne
    private Pessoa conjuge;
    @ManyToMany
    private List<Pessoa> filhos = new ArrayList<>();
    @OneToMany
    private List<Vestuario> roupas = new ArrayList<>();
    @OneToOne
    private Necessidade necessidade;
    @OneToOne
    private Habilidade habilidade;
    @ManyToOne
    private Trabalho job;
    @OneToMany
    private List<Acao> acoes = new ArrayList<>();
    @OneToOne
    private Comodo posicao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getCorOlho() {
        return corOlho;
    }

    public void setCorOlho(String corOlho) {
        this.corOlho = corOlho;
    }

    public Pessoa getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public List<Pessoa> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<Pessoa> filhos) {
        this.filhos = filhos;
    }

    public List<Vestuario> getRoupas() {
        return roupas;
    }

    public void setRoupas(List<Vestuario> roupas) {
        this.roupas = roupas;
    }

    public Necessidade getNecessidade() {
        return necessidade;
    }

    public void setNecessidade(Necessidade necessidade) {
        this.necessidade = necessidade;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }

    public Trabalho getJob() {
        return job;
    }

    public void setJob(Trabalho job) {
        this.job = job;
    }

    public List<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(List<Acao> acoes) {
        this.acoes = acoes;
    }

    public Comodo getPosicao() {
        return posicao;
    }

    public void setPosicao(Comodo posicaco) {
        this.posicao = posicaco;
    }
    
    public void irAoBanheiro(){
        Movimento m = new Movimento();
        m.setPessoa(this);
        Comodo banheiro = new Comodo();
        banheiro.setComodo(ComodoEnum.BANHEIRO);
        m.setDestino(banheiro);
        necessidade.setBanheiro(10);
        
        System.out.println("->"+this.getNome() +" esta a ir ao banheiro.");
    }
    
    public void dormir(){
        Movimento m = new Movimento();
        m.setPessoa(this);
        Comodo quarto = new Comodo();
        quarto.setComodo(ComodoEnum.QUARTO);
        m.setDestino(quarto);
        necessidade.setEnergia(10);
        System.out.println("->"+this.getNome() +" esta a dormir.");
    }
    public void tomarBanho(){
        Movimento m = new Movimento();
        m.setPessoa(this);
        Comodo banheiro = new Comodo();
        banheiro.setComodo(ComodoEnum.BANHEIRO);
        m.setDestino(banheiro);
        necessidade.setHigiene(10);
        
        System.out.println("->"+this.getNome() +" esta a tomar banho.");
    }
}

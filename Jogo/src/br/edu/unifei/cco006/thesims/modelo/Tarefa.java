/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

/**
 *
 * @author maria
 */
@Entity
@DiscriminatorValue(value = "Tarefa")
public class Tarefa extends Acao{
    @OneToOne
    private Objeto objeto;
    @OneToOne
    private Comodo comodo;
    @Enumerated(EnumType.STRING)
    private TarefaEnum acao;


    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public Comodo getComodo() {
        return comodo;
    }

    public void setComodo(Comodo comodo) {
        this.comodo = comodo;
    }

    public TarefaEnum getAcao() {
        return acao;
    }

    public void setAcao(TarefaEnum acao) {
        this.acao = acao;
    }

    @Override
    public void atualizaNecessidade() {
        if(!verificaVitalidade()) return;
        
        switch(acao){
            case LAVAR: 
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()-2);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+3);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()-3);
                break;
            case PEGAR: 
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+1);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()-1);
                break;
            case LIMPAR: 
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()-2);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+1);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()-3);
                break;
            case VARRER: 
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()-2);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+1);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()-3);
                break;
            case CONSERTAR: 
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()-2);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+1);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()-3);
                break;
        }
        System.out.println(getPessoa().getNome());
        System.out.println("-----------Necessidades-----------");
        System.out.println("Fome:"+getPessoa().getNecessidade().getFome());
        System.out.println("Conforto:"+getPessoa().getNecessidade().getConforto());
        System.out.println("Higiene:"+getPessoa().getNecessidade().getHigiene());
        System.out.println("Banheiro:"+getPessoa().getNecessidade().getBanheiro());
        System.out.println("Energia:"+getPessoa().getNecessidade().getEnergia());
        System.out.println("Diversao:"+getPessoa().getNecessidade().getDiversao());
        System.out.println("Social:"+getPessoa().getNecessidade().getSocial());
        System.out.println("Ambiente:"+getPessoa().getNecessidade().getAmbiente());
        System.out.println("");
    }

    @Override
    public void atualizaHabilidade() {
        if(!verificaVitalidade()) return;
        
        switch(acao){
            case LAVAR:
                break;
            case PEGAR:
                break;
            case LIMPAR: 
                break;
            case VARRER:
                break;
            case CONSERTAR:
                getPessoa().getHabilidade().setMecanica(getPessoa().getHabilidade().getMecanica()+3);
                break;
        }
        System.out.println("-----------Habilidades-----------");
        System.out.println("Mecanica:"+getPessoa().getHabilidade().getMecanica());
        System.out.println("Logica:"+getPessoa().getHabilidade().getLogica());
        System.out.println("Carisma:"+getPessoa().getHabilidade().getCarisma());
        System.out.println("Fisico:"+getPessoa().getHabilidade().getFisico());
        System.out.println("Criatividade:"+getPessoa().getHabilidade().getCriatividade());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "->"+getPessoa().getNome()+" esta a "+acao;
    }
    
    
}

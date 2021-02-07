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
@DiscriminatorValue(value = "Relacionamento")
public class Relacionamento extends Acao{
    @OneToOne
    private Pessoa interlocutor;
    @OneToOne
    private Comodo comodo;
    @Enumerated(EnumType.STRING)
    private RelacionamentoEnum acao;

    public RelacionamentoEnum getAcao() {
        return acao;
    }

    public void setAcao(RelacionamentoEnum acao) {
        this.acao = acao;
    }
    

    public Pessoa getInterlocutor() {
        return interlocutor;
    }

    public void setInterlocutor(Pessoa interlocutor) {
        this.interlocutor = interlocutor;
    }

    public Comodo getComodo() {
        return comodo;
    }

    public void setComodo(Comodo comodo) {
        this.comodo = comodo;
    }

    @Override
    public void atualizaNecessidade() {
         if(!verificaVitalidade()) return;
        
        switch(acao){
            case AFETO: 
                getPessoa().getNecessidade().setSocial(getPessoa().getNecessidade().getSocial()+4);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+2);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()+1);
                break;
            case BRIGAR: 
                getPessoa().getNecessidade().setSocial(getPessoa().getNecessidade().getSocial()-4);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()-5);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()-3);
                break;
            case CONVERSAR: 
                getPessoa().getNecessidade().setSocial(getPessoa().getNecessidade().getSocial()+2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+1);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()+1);
                break;
            case DISCUTIR:
                getPessoa().getNecessidade().setSocial(getPessoa().getNecessidade().getSocial()-2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()-5);
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
            case AFETO: 
                getPessoa().getHabilidade().setCarisma(getPessoa().getHabilidade().getCarisma()+3);
                break;
            case BRIGAR: 
                getPessoa().getHabilidade().setCarisma(getPessoa().getHabilidade().getCarisma()-3);
                break;
            case CONVERSAR: 
                getPessoa().getHabilidade().setCarisma(getPessoa().getHabilidade().getCarisma()-2);
                break;
            case DISCUTIR:
                getPessoa().getHabilidade().setCarisma(getPessoa().getHabilidade().getCarisma()-2);
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
        return "->"+getPessoa().getNome()+" esta a "+acao+" com "+interlocutor.getNome();
    }
    
    
    
}

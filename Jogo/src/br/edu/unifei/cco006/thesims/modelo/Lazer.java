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
@DiscriminatorValue(value = "Lazer")
public class Lazer extends Acao {
    @OneToOne
    private Objeto objeto;
    @Enumerated(EnumType.STRING)
    private LazerEnum acao;


    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public LazerEnum getAcao() {
        return acao;
    }

    public void setAcao(LazerEnum acao) {
        this.acao = acao;
    }

    @Override
    public void atualizaNecessidade() {
        if(!verificaVitalidade()) return;
        
        switch(acao){
            case DANCAR: 
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()+3);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+2);
                break;
            case JOGAR:
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()+3);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+2);
                break;
            case LER:
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-1);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()+3);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()+2);
                break;
            case MALHAR:
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-3);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+2);
                break;
            case PINTAR: 
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()+3);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+2);
                break;
            case PULAR: 
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()+3);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+2);
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
            case DANCAR:
                getPessoa().getHabilidade().setCarisma(getPessoa().getHabilidade().getCarisma()+2);
                getPessoa().getHabilidade().setCriatividade(getPessoa().getHabilidade().getCriatividade()+1);
                getPessoa().getHabilidade().setFisico(getPessoa().getHabilidade().getFisico()+1);
                break;
            case JOGAR:
                getPessoa().getHabilidade().setCarisma(getPessoa().getHabilidade().getCarisma()+1);
                getPessoa().getHabilidade().setCriatividade(getPessoa().getHabilidade().getCriatividade()+3);
                getPessoa().getHabilidade().setFisico(getPessoa().getHabilidade().getFisico()-1);
                getPessoa().getHabilidade().setLogica(getPessoa().getHabilidade().getLogica()+2);
                break;
            case LER: 
                getPessoa().getHabilidade().setCriatividade(getPessoa().getHabilidade().getCriatividade()+3);
                getPessoa().getHabilidade().setFisico(getPessoa().getHabilidade().getFisico()-1);
                break;
            case MALHAR:
                getPessoa().getHabilidade().setCarisma(getPessoa().getHabilidade().getCarisma()-1);
                getPessoa().getHabilidade().setFisico(getPessoa().getHabilidade().getFisico()+3);
                getPessoa().getHabilidade().setLogica(getPessoa().getHabilidade().getLogica()-1);
                break;
            case PINTAR:
                getPessoa().getHabilidade().setCarisma(getPessoa().getHabilidade().getCarisma()-1);
                getPessoa().getHabilidade().setCriatividade(getPessoa().getHabilidade().getCriatividade()+3);
                break;
            case PULAR: 
                getPessoa().getHabilidade().setCarisma(getPessoa().getHabilidade().getCarisma()-1);
                getPessoa().getHabilidade().setCriatividade(getPessoa().getHabilidade().getCriatividade()+1);
                getPessoa().getHabilidade().setFisico(getPessoa().getHabilidade().getFisico()+1);
                getPessoa().getHabilidade().setLogica(getPessoa().getHabilidade().getLogica()-1);
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

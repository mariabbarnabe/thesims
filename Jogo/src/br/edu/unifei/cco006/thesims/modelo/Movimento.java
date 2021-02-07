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
@DiscriminatorValue(value = "Movimento")
public class Movimento extends Acao{
    @OneToOne
    private Comodo destino;
    @Enumerated(EnumType.STRING)
    private MovimentoEnum acao;


    public Comodo getDestino() {
        return destino;
    }

    public void setDestino(Comodo destino) {
        this.destino = destino;
        //getPessoa().setPosicao(destino); // atualiza a posicao em que a pessoa está
    }

    public MovimentoEnum getAcao() {
        return acao;
    }

    public void setAcao(MovimentoEnum acao) {
        this.acao = acao;
    }

    @Override
    public void atualizaNecessidade() {
        if(!verificaVitalidade()) return;
        
        switch(acao){
            case ANDAR: 
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-1);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+2);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()-1);
                break;
            case CORRER: 
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()-2);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+1);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()-3);
                break;
            case NADAR: 
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()-4);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-4);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()-4);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()-4);
                getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-4);
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-4);
                getPessoa().getNecessidade().setHigiene(getPessoa().getNecessidade().getHigiene()-4);
                getPessoa().getNecessidade().setSocial(getPessoa().getNecessidade().getSocial()-4);
                
                break;
            case DORMIR:
                getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()-2);
                getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                getPessoa().getNecessidade().setEnergia(10);
                getPessoa().getNecessidade().setDiversao(getPessoa().getNecessidade().getDiversao()+2);
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+1);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()+3);
                break;
                
            case SENTAR:
                getPessoa().getNecessidade().setAmbiente(getPessoa().getNecessidade().getAmbiente()+1);
                getPessoa().getNecessidade().setConforto(getPessoa().getNecessidade().getConforto()+3);
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
            case ANDAR:
                break;
            case CORRER: 
                getPessoa().getHabilidade().setFisico(getPessoa().getHabilidade().getFisico()+1);
                break;
            case NADAR: 
                getPessoa().getHabilidade().setFisico(getPessoa().getHabilidade().getFisico()+1);
                break;
            case DORMIR:
                break;
            case SENTAR:
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
        return "->"+getPessoa().getNome()+" esta a "+acao+ " para "+destino.getComodo();
    }
    
    
}

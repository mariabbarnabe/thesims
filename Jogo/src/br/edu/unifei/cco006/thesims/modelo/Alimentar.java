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

/**
 *
 * @author maria
 */
@Entity
@DiscriminatorValue(value = "Alimentar")
public class Alimentar extends Acao{
    private int calorias;
    @Enumerated(EnumType.STRING)
    private AlimentarEnum alimento;
    
    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public AlimentarEnum getAlimento() {
        return alimento;
    }

    public void setAlimento(AlimentarEnum alimento) {
        this.alimento = alimento;
    }

    @Override
    public void atualizaNecessidade() {
        if(!verificaVitalidade()) return;
         
        if(getPessoa().getPosicao().getComodo() != ComodoEnum.COZINHA)
        {
            System.out.println("Vá para a cozinha.");
            return;
        }    
        switch(alimento)
        {
            case AGUA: getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-2);
               break;
               
            case ALMOCO: getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()+4);
                         getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                break;
                
            case CAFE: getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()+1);
                       getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                       getPessoa().getNecessidade().setEnergia(getPessoa().getNecessidade().getEnergia()-2);
                break;
                
            case JANTAR: getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()+4);
                         getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
                break;
                
            case LANCHE: getPessoa().getNecessidade().setFome(getPessoa().getNecessidade().getFome()+2);
                         getPessoa().getNecessidade().setBanheiro(getPessoa().getNecessidade().getBanheiro()-1);
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
         
        if(getPessoa().getPosicao().getComodo() != ComodoEnum.COZINHA)
        {
            System.out.println("Vá para a cozinha.");
            return;
        }    
        switch(alimento)
        {
            case AGUA: break;
            case ALMOCO: getPessoa().getHabilidade().setFisico(getPessoa().getHabilidade().getFisico()+1);
                break;
            case CAFE: break;
            case JANTAR: getPessoa().getHabilidade().setFisico(getPessoa().getHabilidade().getFisico()+1);
                break;
            case LANCHE: break;

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
        return "->"+getPessoa().getNome()+" se alimenta de "+alimento;
    }
    
    
}

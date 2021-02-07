/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

/**
 *
 * @author maria
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoAcao", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "Acao") //tem qeu ter isso, já que a classe é abstrata?

public class Acao {
    @Id
    @GeneratedValue
    private int codigo;
    @OneToOne
    private Pessoa pessoa;  

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    public void atualizaNecessidade(){
        
    }
    public void atualizaHabilidade(){
        
    }
    public boolean verificaVitalidade(){
        if((getPessoa().getNecessidade().getAmbiente() == 0)&& (getPessoa().getNecessidade().getBanheiro()== 0)&&
                (getPessoa().getNecessidade().getConforto() == 0) && (getPessoa().getNecessidade().getDiversao() == 0) && 
                (getPessoa().getNecessidade().getEnergia() == 0) && (getPessoa().getNecessidade().getFome() == 0) &&
                (getPessoa().getNecessidade().getHigiene() == 0) && (getPessoa().getNecessidade().getSocial() == 0))
        {
            System.out.println(pessoa.getNome()+" morreu. RIP");
            return false;
        }
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author maria
 */
@Entity
public class Habilidade {
    
    @Id
    @GeneratedValue
    private int codigo;
    
    private int mecanica;
    private int logica;
    private int carisma;
    private int fisico;
    private int criatividade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public int getMecanica() {
        return mecanica;
    }

    public void setMecanica(int mecanica) {
       
        this.mecanica = mecanica;
        if(mecanica < 0)
        {
            this.mecanica = 0;
        }
        if(mecanica >10)
        {
            this.mecanica = 10;
        }
    }

    public int getLogica() {
        return logica;
    }

    public void setLogica(int logica) {
       this.logica = logica;
        if(logica < 0)
        {
            this.logica = 0;
        }
        if(logica >10)
        {
            this.logica = 10;
        }
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
        if(carisma < 0)
        {
            this.carisma = 0;
        }
        if(carisma >10)
        {
            this.carisma = 10;
        }
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
        if(fisico < 0)
        {
            this.fisico = 0;
        }
        if(fisico >10)
        {
            this.fisico = 10;
        }
    }

    public int getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(int criatividade) {
        this.criatividade = criatividade;
        if(criatividade < 0)
        {
            this.criatividade = 0;
        }
        if(criatividade >10)
        {
            this.criatividade = 10;
        }
    }

    @Override
    public String toString() {
        return "Habilidade:\n" + "mecanica=" + mecanica + "\nlogica=" + logica + "\ncarisma=" + carisma + "\nfisico=" + fisico + "\ncriatividade=" + criatividade;
    }
    
    
    
}

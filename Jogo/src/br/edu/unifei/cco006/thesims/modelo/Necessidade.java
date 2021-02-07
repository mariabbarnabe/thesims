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
public class Necessidade {
    
    @Id
    @GeneratedValue
    private int codigo;
    
    private int fome;
    private int conforto;
    private int higiene;
    private int banheiro;
    private int energia;
    private int diversao;
    private int social;
    private int ambiente;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public int getFome() {
        if(this.fome == 0)
        {
            System.out.println("Estou com fome!");
        }
        
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
        if(fome<0){
            this.fome = 0;
        }
        if(fome > 10){
            this.fome = 10;
        }
    }

    public int getConforto() {
        if(this.conforto == 0){
            System.out.println("Preciso de conforto!");
        }
        return conforto;
    }

    public void setConforto(int conforto) {
        this.conforto = conforto;
        if(conforto<0){
            this.conforto = 0;
        }
        if(conforto > 10){
            this.conforto = 10;
        }
    }

    public int getHigiene() {
        if(this.higiene == 0){
            System.out.println("Preciso tomar banho!");
        }
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
        if(higiene<0){
            this.higiene = 0;
        }
        if(higiene > 10){
            this.higiene = 10;
        }
    }

    public int getBanheiro() {       
        if(this.banheiro == 0)
        {
            System.out.println("Preciso ir ao banheiro!");
        }
        return banheiro;
    }

    public void setBanheiro(int banheiro) {
        this.banheiro = banheiro;
        if(banheiro<0){
            this.banheiro = 0;
        }
        if(banheiro > 10){
            this.banheiro = 10;
        }
    }

    public int getEnergia() {
        if(this.energia == 0){
            System.out.println("Preciso dormir!");
        }
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
        if(energia<0){
            this.energia = 0;
        }
        if(energia > 10){
            this.energia = 10;
        }
    }

    public int getDiversao() {
        if(this.diversao == 0)
        {
            System.out.println("Preciso me divertir!");
        }
        return diversao;
    }

    public void setDiversao(int diversao) {
        this.diversao = diversao;
        if(diversao<0){
            this.diversao = 0;
        }
        if(diversao > 10){
            this.diversao = 10;
        }
    }

    public int getSocial() {
        if(this.social == 0)
        {
            System.out.println("Estou muito sozinho!");
        }
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
        if(social<0){
            this.social = 0;
        }
        if(social > 10){
            this.social = 10;
        }
    }

    public int getAmbiente() {
        if(this.ambiente == 0){
            System.out.println("Preciso de um ambiente melhor!");
        }
        return ambiente;
    }

    public void setAmbiente(int ambiente) {
        this.ambiente = ambiente;
        if(ambiente<0){
            this.ambiente = 0;
        }
        if(ambiente > 10){
            this.ambiente = 10;
        }
           
    }

    @Override
    public String toString() {
        return "Necessidade:\n" + "fome=" + fome + "\nconforto=" + conforto + "\nhigiene=" + higiene + "\nbanheiro=" + banheiro + "\nenergia=" + energia + "\ndiversao=" + diversao + "\nsocial=" + social + "\nambiente=" + ambiente;
    }
    
    
    
}

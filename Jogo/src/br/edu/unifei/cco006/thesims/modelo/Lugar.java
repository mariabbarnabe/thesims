/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import java.time.LocalDateTime;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author maria
 */
@Entity
@DiscriminatorValue(value = "Lugar")

public class Lugar extends Construcao {
    private LocalDateTime open;
    private LocalDateTime close;
   
    @Enumerated(EnumType.STRING)
    private LugarEnum lugar;

    
    public LugarEnum getLugar() {
        return lugar;
    }

    public void setLugar(LugarEnum lugar) {
        this.lugar = lugar;
    }

    public LocalDateTime getOpen() {
        return open;
    }

    public void setOpen(LocalDateTime open) {
        this.open = open;
    }

    public LocalDateTime getClose() {
        return close;
    }

    public void setClose(LocalDateTime close) {
        this.close = close;
    }
  
}

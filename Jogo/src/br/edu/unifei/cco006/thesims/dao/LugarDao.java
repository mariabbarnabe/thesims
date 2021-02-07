/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import br.edu.unifei.cco006.thesims.modelo.Lugar;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class LugarDao extends AbstractDao<Lugar, Integer> {
    
    public LugarDao(EntityManager em) {
        super(em);
    }
    
}

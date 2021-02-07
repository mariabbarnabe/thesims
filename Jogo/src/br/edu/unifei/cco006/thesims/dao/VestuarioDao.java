/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import br.edu.unifei.cco006.thesims.modelo.Vestuario;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class VestuarioDao extends AbstractDao<Vestuario, Integer>{

    public VestuarioDao(EntityManager em) {
        super(em);
    }
    
    
    
}

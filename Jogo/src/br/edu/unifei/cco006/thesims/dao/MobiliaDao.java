/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import br.edu.unifei.cco006.thesims.modelo.Mobilia;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class MobiliaDao extends AbstractDao<Mobilia, Integer> {

    public MobiliaDao(EntityManager em) {
        super(em);
    }
    
}

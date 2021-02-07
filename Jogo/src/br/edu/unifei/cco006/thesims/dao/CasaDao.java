/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import br.edu.unifei.cco006.thesims.modelo.Casa;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class CasaDao extends AbstractDao<Casa, Integer> {
    
    public CasaDao(EntityManager em) {
        super(em);
    }
    
     public List<Integer> buscaCasa() {
        return em.createQuery(
                "select c.codigo from Casa c"
        ).getResultList();
    }
    
}

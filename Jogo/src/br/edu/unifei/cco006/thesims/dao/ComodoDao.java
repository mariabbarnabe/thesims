/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import br.edu.unifei.cco006.thesims.modelo.Comodo;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class ComodoDao extends AbstractDao<Comodo, Integer> {

    public ComodoDao(EntityManager em) {
        super(em);
    }
    
    public List<Integer> buscaComodo() {
        return em.createQuery(
                "select c.codigo from Comodo c"
        ).getResultList();
    }
}

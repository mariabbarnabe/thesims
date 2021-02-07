/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import br.edu.unifei.cco006.thesims.modelo.Cidade;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class CidadeDao extends AbstractDao<Cidade, String> {

    public CidadeDao(EntityManager em) {
        super(em);
    }
    
    public List<String> buscaCidade() {
        return em.createQuery(
                "select c.nome from Cidade c"
        ).getResultList();
    }
    
}

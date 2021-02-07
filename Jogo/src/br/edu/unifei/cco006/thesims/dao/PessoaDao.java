/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import br.edu.unifei.cco006.thesims.modelo.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class PessoaDao extends AbstractDao<Pessoa,Integer>{
    
    public PessoaDao(EntityManager em){
       super(em);
    }
    
     public List<Integer> buscaPessoa() {
        return em.createQuery(
                "select p.codigo from Pessoa p"
        ).getResultList();
    }
}

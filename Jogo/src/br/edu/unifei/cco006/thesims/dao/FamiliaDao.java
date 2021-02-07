/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import br.edu.unifei.cco006.thesims.modelo.Familia;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class FamiliaDao extends AbstractDao<Familia, String> {

    public FamiliaDao(EntityManager em) {
        super(em);
    }
    
    public List<String> buscaFamilia() {
        return em.createQuery(
                "select f.nome from Familia f"
        ).getResultList();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import br.edu.unifei.cco006.thesims.modelo.Habilidade;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class HabilidadeDao extends AbstractDao<Habilidade, Integer> {
    
    public HabilidadeDao(EntityManager em){
        super(em);
    }
}

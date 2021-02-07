/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author maria
 */
public class FonteDados {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JogoPU");
    
    public static EntityManager createEntityManager(){
        return emf.createEntityManager();
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }
    
    
}

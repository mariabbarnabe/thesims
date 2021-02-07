/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author maria
 */
public class AppGeraBase {
    public static void main(String[] args) {
                
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JogoPU");
        EntityManager em = emf.createEntityManager();
        em.close();
        emf.close();
        
    }
}

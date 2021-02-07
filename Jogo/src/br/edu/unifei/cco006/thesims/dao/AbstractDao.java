/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author maria
 */
public class AbstractDao<E,K> {
    final EntityManager em;

    private Class<E> clazz = (Class<E>) 
        ((ParameterizedType) 
        this.getClass().getGenericSuperclass()).
        getActualTypeArguments()[0];

    public AbstractDao(EntityManager em) {
        this.em = em;
    }

    public void create(E obj) {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
    }

    public void update(E obj) {
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
    }

    public void delete(E obj) {
        em.getTransaction().begin();
        em.remove(obj);
        em.getTransaction().commit();
    }
    
    public void deleteByKey (K key){
        E obj = findByKey(key);
        delete(obj);
    }    

    public E findByKey(K key) {
        return em.find(clazz, key);
    }

    public List<E> findAll(){
        return em.createQuery(
            "from " + clazz.getSimpleName()
            ).getResultList();
    }
    
    public long amount(){
        return (Long) em.createQuery(
            "select count(*) from " + 
            clazz.getSimpleName()
            ).getSingleResult();
    }
    
}

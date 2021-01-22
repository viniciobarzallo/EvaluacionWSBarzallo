/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.dao;

import ec.edu.ups.app.modelo.Compra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinny
 */
@Stateless
public class CompraDAO {
    
    @PersistenceContext
    private EntityManager em;
    
    public void insertarCompra(Compra compra){
        em.persist(compra);
    }
    
    public Compra readCompra(int idCompra){
        return em.find(Compra.class, idCompra);
        
    }
    
    
}

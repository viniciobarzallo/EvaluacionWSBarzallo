/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.dao;

import ec.edu.ups.app.modelo.DetalleCompra;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author vinny
 */
@Stateless
public class DetalleDAO {
    
    @PersistenceContext
    private EntityManager em;
    
    public void insertarCompra(DetalleCompra detalle) {
        em.persist(detalle);
    }
    
    public List<DetalleCompra> readDetalle(int idCompra){
        List<DetalleCompra> detalles = new ArrayList<>();
        
        String jpql="SELECT d FROM DetalleCompra d WHERE d.idcompra = " + idCompra;
        Query q = em.createQuery(jpql,DetalleCompra.class);
        
        detalles = q.getResultList();
        return detalles;
    }
    
}

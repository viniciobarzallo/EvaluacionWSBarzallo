/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.negocio;

import ec.edu.ups.app.dao.CompraDAO;
import ec.edu.ups.app.dao.DetalleDAO;
import ec.edu.ups.app.modelo.Compra;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author vinny
 */
@Stateless
public class GestionCompraON {
    
    @Inject
    private CompraDAO compradao;
    
    @Inject
    private DetalleDAO detalledao;
    
    public void insertarCompra(Compra compra) {
        compradao.insertarCompra(compra);
        
    }
    
    
}

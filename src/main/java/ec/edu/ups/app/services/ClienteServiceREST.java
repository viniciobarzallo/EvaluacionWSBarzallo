/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.services;

import ec.edu.ups.app.negocio.GestionCompraON;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author vinny
 */
@Path("/compras")
public class ClienteServiceREST {

    @Inject
    private GestionCompraON gon;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/ingresar")
    public Mensaje ingresar(ParametrosProducto producto) {

        Mensaje m = new Mensaje();
        try {
            
            
            m.setCode("OK");
            m.setMessage("Guardado OK");
        } catch (Exception e) {
            m.setCode("ERROR");
            m.setMessage(e.getMessage());
        }
        return m;
    }
}

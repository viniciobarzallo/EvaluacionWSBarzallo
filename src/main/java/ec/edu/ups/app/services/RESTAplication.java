/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.services;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author vinicio
 */
@OpenAPIDefinition(
        servers = {
            @Server(
                    description = "Servidor local",
                    url = "/Compra")
        }
)

@ApplicationPath("/ws")
public class RESTAplication extends Application {

}

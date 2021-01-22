/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author vinny
 */
@Entity
public class DetalleCompra implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @JoinColumn(name="id_DetalleCompra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddetalle;
    
    private double descripcion;
    private double valor;
    
    @ManyToOne
    @JoinColumn(name="id_Compra")
    private Compra compra;

    public int getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(int iddetalle) {
        this.iddetalle = iddetalle;
    }

    public double getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(double descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
    
    
            
    
}

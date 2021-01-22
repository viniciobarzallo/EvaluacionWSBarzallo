/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author vinny
 */
@Entity
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @JoinColumn(name = "id_compra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcompra;
   
    private double cantidad;
    private double valorTotal;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compra", fetch = FetchType.EAGER)
    private List<DetalleCompra> detalles;

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<DetalleCompra> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleCompra> detalles) {
        this.detalles = detalles;
    }
    
    
    
}

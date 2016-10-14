package model;
// Generated 12-oct-2016 18:44:49 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Stock generated by hbm2java
 */
public class Stock  implements java.io.Serializable {


     private StockId id;
     private String codigo;
     private String descripcion;
     private BigDecimal cantidad;
     private BigDecimal precioVenta;
     private BigDecimal precioMay;
     private BigDecimal precioDist;
     private String ecg;
     private String ubicacion;

    public Stock() {
    }

	
    public Stock(StockId id) {
        this.id = id;
    }
    public Stock(StockId id, String codigo, String descripcion, BigDecimal cantidad, BigDecimal precioVenta, BigDecimal precioMay, BigDecimal precioDist, String ecg, String ubicacion) {
       this.id = id;
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.cantidad = cantidad;
       this.precioVenta = precioVenta;
       this.precioMay = precioMay;
       this.precioDist = precioDist;
       this.ecg = ecg;
       this.ubicacion = ubicacion;
    }
   
    public StockId getId() {
        return this.id;
    }
    
    public void setId(StockId id) {
        this.id = id;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
    public BigDecimal getPrecioMay() {
        return this.precioMay;
    }
    
    public void setPrecioMay(BigDecimal precioMay) {
        this.precioMay = precioMay;
    }
    public BigDecimal getPrecioDist() {
        return this.precioDist;
    }
    
    public void setPrecioDist(BigDecimal precioDist) {
        this.precioDist = precioDist;
    }
    public String getEcg() {
        return this.ecg;
    }
    
    public void setEcg(String ecg) {
        this.ecg = ecg;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }




}



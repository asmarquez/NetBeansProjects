/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_console;

/**
 *
 * @author mami
 */
public class producto {

    //
    public String id;
    public String codigo;
    public String descripcion;
    public String cantidad;
    public String precio_venta;
    public String precio_mayoreo;
    public String precio_distribuidor;
    public String ecg;
    public String ubicacion;
    public String distribuidor;

    Exception MaxIndex = new Exception("Error Index mayor al maximo");

    public producto(String id, String codigo, String descripcion, String cantidad, String precio_venta, String precio_mayoreo, String precio_distribuidor, String ecg, String ubicacion, String distribuidor) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.precio_mayoreo = precio_mayoreo;
        this.precio_distribuidor = precio_distribuidor;
        this.ecg = ecg;
        this.ubicacion = ubicacion;
        this.distribuidor = distribuidor;
    }

    public producto() {
    }

    public producto(String id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getPrecio_mayoreo() {
        return precio_mayoreo;
    }

    public void setPrecio_mayoreo(String precio_mayoreo) {
        this.precio_mayoreo = precio_mayoreo;
    }

    public String getPrecio_distribuidor() {
        return precio_distribuidor;
    }

    public void setPrecio_distribuidor(String precio_distribuidor) {
        this.precio_distribuidor = precio_distribuidor;
    }

    public String getEcg() {
        return ecg;
    }

    public void setEcg(String ecg) {
        this.ecg = ecg;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getDataByIndex(int index) throws Exception {
        String rValue = null;

        switch (index) {

            case 1:
                rValue = id;
                break;

            case 2:
                rValue = codigo;
                break;
            case 3:
                rValue = descripcion;
                break;
            case 4:
                rValue = cantidad;
                break;
            case 5:
                rValue = precio_venta;
                break;
            case 6:
                rValue = precio_mayoreo;
                break;
            case 7:
                rValue = precio_distribuidor;
                break;
            case 8:
                rValue = ecg;
                break;
            case 9:
                rValue = ubicacion;
                break;
            case 10:
                rValue = distribuidor;
                break;
            default:
                System.out.println("Error Index mayor al maximo");
                throw MaxIndex;

            //break;
        }
        return rValue;
    }

    public void setDataByIndex(String Data, int index) throws Exception {

        switch (index) {

            case 1:
                this.id = Data;
                break;
            case 2:
                this.codigo = Data;
                break;
            case 3:
                this.descripcion = Data;
                break;
            case 4:
                this.cantidad = Data;
                break;
            case 5:
                this.precio_venta = Data;
                break;
            case 6:
                this.precio_mayoreo = Data;
                break;
            case 7:
                this.precio_distribuidor = Data;
                break;
            case 8:
                this.ecg = Data;
                break;
            case 9:
                this.ubicacion = Data;
                break;
            case 10:
                this.distribuidor = Data;
                break;
            default:
                System.out.println("Error Index mayor al maximo");
                throw MaxIndex;

        }

        //System.out.print(Data + "\t");
    }

}

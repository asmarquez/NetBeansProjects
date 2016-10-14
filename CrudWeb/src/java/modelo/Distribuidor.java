/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Juan
 */
public class Distribuidor implements Serializable {
    
    private String id = null;
    private String empresa = null;
    private String direccion = null;
    private String telf1 = null;
    private String telf2 = null;
    private String email = null;
    private String vendedor = null;
    private String telf1_vendedor = null;
    private String telf2_vendedor = null;
    private String email_vendedor = null;

    public Distribuidor() {
    }

    public String getId() {
        return id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelf1() {
        return telf1;
    }

    public String getTelf2() {
        return telf2;
    }

    public String getEmail() {
        return email;
    }

    public String getVendedor() {
        return vendedor;
    }

    public String getTelf1_vendedor() {
        return telf1_vendedor;
    }

    public String getTelf2_vendedor() {
        return telf2_vendedor;
    }

    public String getEmail_vendedor() {
        return email_vendedor;
    }

    
    
    public void setId(String id) {
        this.id = id;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelf1(String telf1) {
        this.telf1 = telf1;
    }

    public void setTelf2(String telf2) {
        this.telf2 = telf2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setTelf1_vendedor(String telf1_vendedor) {
        this.telf1_vendedor = telf1_vendedor;
    }

    public void setTelf2_vendedor(String telf2_vendedor) {
        this.telf2_vendedor = telf2_vendedor;
    }

    public void setEmail_vendedor(String email_vendedor) {
        this.email_vendedor = email_vendedor;
    }

    
    
    
    
}

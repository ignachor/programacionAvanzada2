/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maintienda;

/**
 *
 * @author Jose
 */
public class Administrador extends Persona{
    private int idAdmin;
    
    public Administrador(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Administrador(int idAdmin, String nombre, String direccion, String correoElectronico, int contra) {
        super(nombre, direccion, correoElectronico, contra);
        this.idAdmin = idAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }
    
    
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    public void ABM_USUARIO()
    {
        
    }
    
    public void BM_PEDIDOS()
    {
        
    }
    
    public void ABM_PRODUCTO()
    {
        
    }
    
    public void generarListado()
    {
        
    }
    
    public void visualizarPedidos()
    {

    }
    
}

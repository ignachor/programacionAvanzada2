/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maintienda;

import javax.persistence.EntityManager;

/**
 *
 * @author Jose
 */
public class AdministradorService {
    private AdministradorDAO administradorDAO;

    public AdministradorService(EntityManager entityManager) {
        this.administradorDAO = new AdministradorDAO(entityManager);
    }

    public boolean iniciarSesion(String username, int password) {
        Administrador admin = administradorDAO.buscarPorUsername(username);
        return admin != null && admin.getContra() == password;
    }
    
    public boolean verificarUsuario(String username, int password)
    {
       
    }
}

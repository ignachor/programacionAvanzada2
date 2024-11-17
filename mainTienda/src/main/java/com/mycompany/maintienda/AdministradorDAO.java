/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.maintienda;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;



/**
 *
 * @author Jose
 */
public class AdministradorDAO {
    private EntityManager entityManager;

    public AdministradorDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void guardar(Administrador administrador) {
        entityManager.getTransaction().begin();
        entityManager.persist(administrador);
        entityManager.getTransaction().commit();
    }

    public Administrador buscarPorId(Long id) {
        return entityManager.find(Administrador.class, id);
    }

    public Administrador buscarPorUsername(String username) {
        try {
            return entityManager.createQuery(
                "SELECT a FROM Administrador a WHERE a.username = :username", Administrador.class)
                .setParameter("username", username)
                .getSingleResult();
        } catch (NoResultException e) {
            return null; // No se encontró ningún administrador con ese username
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.futbolWeb.backend.persistence.facades;

import co.futbolWeb.backend.persistence.entities.SegumientoEncuentro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camila
 */
@Stateless
public class SegumientoEncuentroFacade extends AbstractFacade<SegumientoEncuentro> implements SegumientoEncuentroFacadeLocal {

    @PersistenceContext(unitName = "WebFutbolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SegumientoEncuentroFacade() {
        super(SegumientoEncuentro.class);
    }
    
}

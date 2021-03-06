/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.session;

import com.africomgroup.entities.QuoteRequestDetails;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jordy
 */
@Stateless
public class QuoteRequestDetailsFacade extends AbstractFacade<QuoteRequestDetails> {
    @PersistenceContext(unitName = "wciawebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QuoteRequestDetailsFacade() {
        super(QuoteRequestDetails.class);
    }
    
}

/**
 * 
 */
package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.TarjetaCredito;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class TarjetaCreditoFacade extends AbstractFacade<TarjetaCredito> {
	@PersistenceContext(unitName = "ChuchucaArevalo-Gabriel-Examen")
	private EntityManager em;
	
	public TarjetaCreditoFacade() {
		super(TarjetaCredito.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

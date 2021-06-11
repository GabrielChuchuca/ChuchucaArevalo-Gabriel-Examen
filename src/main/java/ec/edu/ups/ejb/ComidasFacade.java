/**
 * 
 */
package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Comidas;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class ComidasFacade extends AbstractFacade<Comidas>{
	@PersistenceContext(unitName = "ChuchucaArevalo-Gabriel-Examen")
	private EntityManager em;
	
	public ComidasFacade() {
		super(Comidas.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
}

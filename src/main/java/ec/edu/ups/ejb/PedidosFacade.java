/**
 * 
 */
package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Pedido;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class PedidosFacade extends AbstractFacade<Pedido> {
	@PersistenceContext(unitName = "ChuchucaArevalo-Gabriel-Examen")
	private EntityManager em;
	
	public PedidosFacade() {
		super(Pedido.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

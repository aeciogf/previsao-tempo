package previsao;

import org.hibernate.HibernateException;



public class TempoDAO extends PadraoDAO<Tempo> {
        
	public Tempo buscarPorId(long id) throws HibernateException, IndexOutOfBoundsException {
                return super.buscarPorIdClasse(id, Tempo.class);
        }
}


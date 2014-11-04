package previsao;

import javax.inject.Inject;

import org.hibernate.HibernateException;

import previsao.TempoDAO;
import previsao.Tempo;

public class ProcessadorTempo {

        @Inject
        private TempoDAO tempoDAO;

        public ProcessadorTempo() {
        }
        
        public boolean atualizar(Tempo tempo) throws HibernateException {
                return tempoDAO.atualizar(tempo);
        }
        
        public Tempo buscarPorId(long id) throws HibernateException, IndexOutOfBoundsException {
                return tempoDAO.buscarPorId(id);
        }
        
        public boolean inserir(Tempo tempo) throws HibernateException {
                return tempoDAO.inserir(tempo);
        }
        
        
        public boolean remover(Tempo tempo) throws HibernateException {
                return tempoDAO.remover(tempo);
        }
}



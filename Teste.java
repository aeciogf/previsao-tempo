package previsao;

import java.util.Date;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import previsao.Tempo;
import previsao.ProcessadorTempo;

@ApplicationScoped  
public class Teste {
        
        
      @Inject
      private ProcessadorTempo processadorTempo;
        
	public void executarTestes() {
      	Tempo tempo = criarRegistro();
                
           
      private Tempo criarRegistro() {
            Tempo tempo = new Tempo();
            tempo.setTemperatura(30);
            tempo.setUmidade(15);
            tempo.choveu(true);
            return tempo;
      }
        
      private void atualizarRegistro(Tempo tempo) {
            processadorTempo.atualizar(tempo);
      }
        
      private void inserirRegistro(Tempo tempo) {
                
            processadorTempo.inserir(tempo);
      }
        
      private void removerRegistro(Tempo tempo) {
            processadorTempo.remover(tempo);
      }
        
      private Tempo buscarRegistroPorId(int id) {
            return processadorTempo.buscarPorId(id);
      }
}


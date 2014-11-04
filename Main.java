package previsao;

import previsao.WeldContext;


public class Main {
	public static void main(String[] args) {
                
                
      	Teste teste = WeldContext.INSTANCE.getBean(Teste.class);
            teste.executarTestes();
      
	}
}


public class Fatorial {
	
	public int calcularFatorial(int n){
		int resultado = 1;
		for (i = 2; i <= n; i++){
			resultado = resultado * i;
		}
		return resultado;
	}

}
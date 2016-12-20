public class Fatorial {
	
	public static void manin(String [] args){
		System.out.println(calcularFatorial(5));	

	}

	public static int calcularFatorial(int n){
		int resultado = 1;
		for (i = 2; i <= n; i++){
			resultado = resultado * i;
		}
		return resultado;
	}

}
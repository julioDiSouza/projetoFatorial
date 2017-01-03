public class Fatorial {
	// Versao iterativa do calculo do fatorial
	public int calcularFatorial(int n) throws illegalArgumentException {
		if(n < 0)
			throw new illegalArgumentException("Não existe Fatorial para número negativo");
		int resultado = 1;
		for (i = 2; i <= n; i++){
			resultado = resultado * i;
		}
		return resultado;
	}

}
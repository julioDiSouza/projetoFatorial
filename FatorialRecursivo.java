public class FatorialRecursivo{
  // Adicao deste Comentario
  public static int calcularFatorialRecursivo(int n) throws illegalArgutentException {
    if(n == 0)		
      return 1;
    return n * calcularFatorialRecursivo(n-1);
  }

  public static void main(String[] args){
    System.out.println(calcularFatorialRecursivo(5));
  }
}
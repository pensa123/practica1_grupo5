public class Funciones {

    /**
     * @param args the command line arguments
     */
  public Funciones(){
  }
   public double CalcularDiscriminante(double a,double b,double c){
   		/*
   		se usa el modelo
   		D = b2 - 4ac.
   		*/
   		double total=(b*b)-4*(a*c);
   		return total;
   }

	public double valorAbsoluto(double valor){
      	if(valor<0) return valor * -1;
      	return valor;
    }
    
	public double potenciaAlCubo(double valor){
		return valor * valor * valor;
	}
	public double raizAlCubo(double valor){
		return Math.pow(valor, 1.0/3.0);
	}

	public double multiplicacion(double valor1, double valor2)
	{
		return valor1*valor2;
	}

	public double division(double valor1, double valor2)
	{
		//Función de división sin validar la división entre cero;
		return valor1/valor2;
	}
}

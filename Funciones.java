public class Funciones {

    /**
     * @param args the command line arguments
     */
  public Funciones(){
  }
   public String CalcularDiscriminante(double a,double b,double c){
   		/*
   		se usa el modelo
   		D = b2 - 4ac.
   		*/
   		double total=(b*b)-4*(a*c);
   		if(total>0){return "Tiene dos soluciones Reales";}
   		else if(total==0){return "Tiene dos soluciones Reales iguales";}
   		else{return "No tiene solucion real";}
   }

	public double valorAbsoluto(double valor){ 
		System.out.println("CÁLCULO DEL VALOR ABSOLUTO");
		double absoluto;
      	if(valor<0){
			System.out.println("El valor original es negativo");
			System.out.println("Entonces se multiplica el valor original por -1");
			absoluto = valor * -1;
			System.out.println("Y el valor absoluto es: " + absoluto);
			return absoluto;
		}
		absoluto = valor;
		System.out.println("El valor original es positvo");
		System.out.println("Entonces el valor absoluto es el mismo que el original");
		System.out.println("Y el valor absoluto es: " + absoluto);
      	return absoluto;
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
		//función considerando la división entre cero 
		if(valor2==0.0 || valor2==0)
		{
			System.out.println("No es posible la división entre cero ");
			return 0;
		}else 
		{
			return valor1/valor2;
		}
		

	}
}

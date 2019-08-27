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
      	if(valor<0){
			System.out.println("El valor original es negativo");
			return valor * -1;
		}
		System.out.println("El valor original es positvo");
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
		//función considerando la división entre cero 
		if(valor2==0.0 || valor2==0)
		{
			System.out.println("No es posible la división entre cero ");
			return 0;
		}else 
		{
			System.out.println("Esta dividiendo "+valor1+" entre "+valor2);
			//Cambio agregado a la rama bugfix
			return valor1/valor2;
		}
		

	}
}

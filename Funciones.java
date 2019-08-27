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

    
}

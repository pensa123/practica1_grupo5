public class ValidadorPrimo{
	public boolean esPrimo(int n){
		if(n <= 0){
			return false;
		}
		boolean todook = true;
		for(int a = 2; a < n / 2; a++){
			if(n % a == 0){
				todook = false;
				System.out.println(n + " es divisible dentro de " + a);
			}
		}
		return todook;
	}
}
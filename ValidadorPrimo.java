public class ValidadorPrimo{
	public boolean esPrimo(int n){
		for(int a = 2; a < n / 2; a++){
			if(n % a == 0){
				return false;
			}
		}
		return true;
	}
}
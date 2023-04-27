package fibonacci;

public class Teste {

	public static void main(String[] args) {
		Metodos m = new Metodos();
		int n = 10;
		
		for(int i = 0; i < n; i++) {
			System.out.print(m.fibo(i) + " ");
		}
	}

}

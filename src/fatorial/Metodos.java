package fatorial;

public class Metodos {

	public Metodos() {
		super();
	}
	
	public int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * fatorial(num -1);
	}
}

public class Fluxo2 {

	public static void main(String[] args) throws MinhaExcecaoChecked {
		System.out.println("Ini do main");
	//	try {
		metodo1();
		/*}catch (ArithmeticException | NullPointerException | MinhaExcecaoChecked e) {
			System.out.println("Exception: "+e.getMessage());
			e.printStackTrace();
		}catch (MinhaExcecaoUnchecked e) {
			System.out.println("Erro "+e.getMessage());
			e.printStackTrace();
		}*/
		System.out.println("Retornei ao main");
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecaoChecked {
		System.out.println("Ini do metodo1");
		metodo2();
		
		//ArithmeticException ex = new ArithmeticException("Teste de exception");
		throw  new MinhaExcecaoChecked("Teste da minha propria Exceção Checked.");
	//	System.out.println("Fim do metodo1");
		
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			//int j = i/0;
		}
		/*Mytext t = null;
		t.digitartexto();
		*/
		System.out.println("Fim do metodo2");

	}
//	
//	
//	public String testeTexto() {
//		System.out.println("Estou no text texto");
//		Mytext mytext = new Mytext();
//		mytext.digitartexto();
//		System.out.println("Devolta ao testeTexto() void ");
//		return "s";
}

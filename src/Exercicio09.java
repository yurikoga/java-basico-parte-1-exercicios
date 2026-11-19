public class Exercicio09 {
	public static void main(String[] args) {
		double valorDecimal = 9.8;
		int valorInteiro = (int) valorDecimal;

		// Ao converter explicitamente de double para int (narrowing casting),
		// a parte decimal (.8) é descartada/truncada sem arredondamento, resultando em 9.
		System.out.println("Valor original (double): " + valorDecimal);
		System.out.println("Valor convertido (int): " + valorInteiro);
	}
}
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**Muito simples - Exercício 06 - String + números
 Crie a classe Exercicio06. Declare dois int, 10 e 20. Mostre a diferença entre "Resultado: " + a + b e "Resultado: "
 + (a + b).*/
 public class Exercicio06 extends Frame {
	 Exercicio06(){
		 int numeroA=10, numeroB=20;

		 Label l1,l2,l3,l4,l5,l6;

		 l1=new Label("numeroA = "+numeroA);
		 l2=new Label("numeroB = "+numeroB);
		 l3=new Label("Resultado: + a + b");
		 l4=new Label("Resultado: "+numeroA+numeroB);
		 l5=new Label("Resultado: + (numeroA + numeroB)");
		 l6=new Label("Resultado: "+(numeroA+numeroB));

		 l1.setBounds(50,50,200,30);
		 l2.setBounds(50,100,200,30);
		 l3.setBounds(50,150,200,30);
		 l4.setBounds(50,200,200,30);
		 l5.setBounds(50,250,200,30);
		 l6.setBounds(50,300,200,30);

		 add(l1);
		 add(l2);
		 add(l3);
		 add(l4);
		 add(l5);
		 add(l6);

		 setSize(300,400);
		 setLayout(null);
		 setVisible(true);
		 addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e) {
				 dispose(); // Fecha e libera recursos da janela
				 System.exit(0);  // Encerra a aplicação
			 }
		 });
	 }

	public static void main(String[] args) {
		Exercicio06 tela=new Exercicio06();
	}
}

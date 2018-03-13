
public class DosEquis {
	public static void dosEquisQuiz() {
		char x = 'X';
		int i = 0;
		System.out.print(true ? x : 0);
		System.out.print(false ? i : x);
	}
	public static void dosEquisSolution() {
		char x = 'X';
		final int I = 0;
		System.out.print(true ? x : 0);
		System.out.print(false ? I : x);
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		DosEquis.dosEquisQuiz();
		System.out.println("\n");
		
		System.out.println("Solution");
		DosEquis.dosEquisSolution();
		System.out.println();
	}
}

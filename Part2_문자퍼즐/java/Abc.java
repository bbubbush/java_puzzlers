
public class Abc {
	public static String abcQuiz() {
		String letters = "ABC";
		char[] numbers = {'1', '2', '3'};
		return letters + " easy as " + numbers;
	}
	public static String abcSolution() {
		String letters = "ABC";
		char[] numbers = {'1', '2', '3'};
		return letters + " easy as " + String.valueOf(numbers);
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(Abc.abcQuiz());
		System.out.println();
		
		System.out.println("Solution");
		System.out.println(Abc.abcSolution());
		System.out.println();
	}
}


public class LastLaugh {
	public static void lastLaughQuiz() {
		System.out.print("H" + "a");
		System.out.print('H' + 'a');
	}
	public static void lastLaughSolution() {
		System.out.print("H" + "a");
		System.out.print("" + 'H' + 'a');
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		LastLaugh.lastLaughQuiz();
		System.out.println('\n');
		
		System.out.println("Solution");
		LastLaugh.lastLaughSolution();
		System.out.println();
	}
}

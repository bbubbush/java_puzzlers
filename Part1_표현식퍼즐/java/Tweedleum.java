
public class Tweedleum {
	public static short tweedleumQuiz() {
		short x = 0;
		int i = 123456;
		x += i;
		return x;
	}
	public static short tweedleumSolution() {
		short x = 0;
		int i = 123456;
//		x = x + i;	// compile error
		return x;
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(Tweedleum.tweedleumQuiz());
		System.out.println();
		
		System.out.println("Solution");
		System.out.println(Tweedleum.tweedleumSolution());
		System.out.println();
	}
}

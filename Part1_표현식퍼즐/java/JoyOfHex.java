
public class JoyOfHex {
	public static String joyOfHexQuiz() {
		return Long.toHexString(0x100000000L + 0xcafebabe);
	}
	
	public static String joyOfHexSolution() {
		return Long.toHexString(0x100000000L + 0xcafebabeL);
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(JoyOfHex.joyOfHexQuiz());
		System.out.println();
		
		System.out.println("Solution");
		System.out.println(JoyOfHex.joyOfHexSolution());
		System.out.println();
	}
}

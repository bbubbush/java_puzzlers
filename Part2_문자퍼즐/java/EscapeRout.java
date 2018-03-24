
public class EscapeRout {
	public static int escapeRoutQuiz() {
		// \u0022는 유니코드 이스케이프 시퀀스로 큰 따옴표(")를 나타낸다.
		return "a\u0022.length() + \u0022b".length();
	}
	public static int escapeRoutSolution() {
		return "a\".length() + \"b".length();
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(EscapeRout.escapeRoutQuiz());
		System.out.println();
		
		System.out.println("Solution");
		System.out.println(EscapeRout.escapeRoutSolution());
		System.out.println();
	}
}

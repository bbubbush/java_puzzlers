
public class Elementary {
	public static long elementaryQuiz() {
		return 12345 + 5432l;
	}
	
	public static long elementarySolution() {
		return 12345 + 5432L;
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(Elementary.elementaryQuiz());
		System.out.println();
		
		System.out.println("Solution");
		System.out.println(Elementary.elementarySolution());
		System.out.println();
	}
}

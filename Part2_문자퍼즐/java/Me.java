import java.util.regex.Pattern;

public class Me {
	public static String meQuiz() {
		return Me.class.getName().replaceAll(".", "/") + ".class";
	}
	
	public static String meSolution1() {
		return Me.class.getName().replaceAll("\\.", "/") + ".class";
	}
	
	public static String meSolution2() {
		return Me.class.getName().replaceAll(Pattern.quote("."), "/") + ".class";
	}
	
	
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(Me.meQuiz());
		System.out.println();
		
		System.out.println("Solution1");
		System.out.println(Me.meSolution1());
		System.out.println();
		
		System.out.println("Solution2");
		System.out.println(Me.meSolution2());
		System.out.println();
	}
}

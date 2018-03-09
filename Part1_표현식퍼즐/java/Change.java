import java.math.BigDecimal;

public class Change {
	public static double changeQuiz() {
		return 2.00 - 1.10;
	}
	
	public static int changeSolution1() {
		return 200 - 110;
	}
	
	public static BigDecimal changeSolution2() {
		return new BigDecimal("2.00").subtract(new BigDecimal("1.10"));
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println("$" + Change.changeQuiz());
		System.out.println();
		
		System.out.println("Solution1");
		System.out.println(Change.changeSolution1() + "cents");
		System.out.println();
		
		System.out.println("Solution2");
		System.out.println("$" + Change.changeSolution2());
		System.out.println();
	}
}

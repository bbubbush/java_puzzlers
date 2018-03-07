public class IsOdd {
	public static boolean isOddQuiz(int i) {
		return i % 2 == 1;
	}
	
	public static boolean isOddSolution1(int i) {
		return i % 2 != 0;
	}
	
	public static boolean isOddSolution2(int i) {
		return (i & 1) != 0;
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(IsOdd.isOddQuiz(3));
		System.out.println(IsOdd.isOddQuiz(-3));
		System.out.println();
		
		System.out.println("Solution1");
		System.out.println(IsOdd.isOddSolution1(3));
		System.out.println(IsOdd.isOddSolution1(-3));
		System.out.println();
		
		System.out.println("Solution2");
		System.out.println(IsOdd.isOddSolution2(3));
		System.out.println(IsOdd.isOddSolution2(-3));
		System.out.println();
	}
}

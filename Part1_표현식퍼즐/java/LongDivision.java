
public class LongDivision {
	public static long longDivisionQuiz() {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		return MICROS_PER_DAY / MILLIS_PER_DAY;
	}
	
	public static long longDivisionSolution() {
		final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
		return MICROS_PER_DAY / MILLIS_PER_DAY;
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(LongDivision.longDivisionQuiz());
		System.out.println();
		
		System.out.println("Solution");
		System.out.println(LongDivision.longDivisionSolution());
		System.out.println();

	}
}

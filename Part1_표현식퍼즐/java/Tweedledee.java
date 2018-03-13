
public class Tweedledee {
	public static String tewwdledeeQuiz() {
		Object x = "Buy";
		String i = "Effective Java!";
		
		x = x + i;
		x += i;
		return x.toString();
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(Tweedledee.tewwdledeeQuiz());
		System.out.println();
	}
}

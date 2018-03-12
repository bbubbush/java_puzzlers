import java.util.ArrayList;

public class CleverSwap {
	public static ArrayList<Integer> cleverSwapQuiz() {
		int x = 1984;	// (0x7c0)
		int y = 2001;	// (0x7d1)
		// �� ���� ������ ���� ���� ��ȯ�ϴ� ��� (���� ����ϸ� �� �ȴ�)
//		x = x ^ y;
//		y = y ^ x;
//		x = y ^ x;
//		System.out.println(x + ", " + y);
		
		x ^= y ^= x ^= y;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(x);
		al.add(y);
		return al;
	}
	public static ArrayList<Integer> cleverSwapSolution() {
		int x = 1984;	// (0x7c0)
		int y = 2001;	// (0x7d1)
		x ^= y ^= x ^= y;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(x);
		al.add(y);
		return al;
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(CleverSwap.cleverSwapQuiz());
		System.out.println();
		
		System.out.println("Solution");
		System.out.println(CleverSwap.cleverSwapSolution());
		System.out.println();
	}
}

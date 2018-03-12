
public class Multicast {
	public static int multicastQuiz() {
		return (int)(char)(byte)-1;
	}
	
	public static int multicastSolution() {
		int i = -1;		// �̷��� ��Ȯ�ϰ� Ȯ���� �� �ְ� ������ ������ �ϴ°� ����.
		byte b = (byte)i;
		char c = (char)b;
		return (int)c;
	}
	public static int multicastSolutionPS1() {
		byte b = -1;
		char c = (char)b;
		return c & 0xffff;	// ��ȣȮ���� �Ͼ�� ����
	}
	public static int multicastSolutionPS2() {
		byte b = -1;
		char c = (char)b;
		
		System.out.println("Do not sign extension >>> " + (int)c);
		System.out.println("Do sign extension >>> " + (short)c);
		return (short)c;	// ��ȣȮ���� �Ͼ
	}
	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println(Multicast.multicastQuiz());
		System.out.println();
		
		System.out.println("Solution");
		System.out.println(Multicast.multicastSolution());
		System.out.println();
		
		System.out.println("SolutionPS1");
		System.out.println(Multicast.multicastSolutionPS1());
		System.out.println();
		
		System.out.println("SolutionPS2");
		System.out.println(Multicast.multicastSolutionPS2());
		System.out.println();
	}
}

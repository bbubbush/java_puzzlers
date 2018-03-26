import java.io.UnsupportedEncodingException;

public class StringCheese {
	public static void stringCheeseQuiz() {
		byte[] bytes = new byte[256];
		for (int i = 0; i < 256; i++) {
			bytes[i] = (byte)i;
		}
		String str = new String(bytes);		// new String(byte[])�� ��� �迭�� ����Ʈ ĳ���� ������ ���ڵ��ؼ� String �ν��Ͻ��� �����ϱ� ������ ȯ�渶�� �ٸ��� ��Ÿ����.
		for (int i = 0, n = str.length(); i < n; i++) {
			System.out.println((int)str.charAt(i) + " ");
		}
	}
	
	public static void stringCheeseSolution() throws UnsupportedEncodingException {
		byte[] bytes = new byte[256];
		for (int i = 0; i < 256; i++) {
			bytes[i] = (byte)i;
		}
		String str = new String(bytes, "ISO-8859-1");	// UnsupportedEncodingException�� �߻��� �� �ֱ� ������ ����ó���� �� �ʿ��ϴ�.
		for (int i = 0, n = str.length(); i < n; i++) {
			System.out.println((int)str.charAt(i) + " ");
		}
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("Quiz");
		StringCheese.stringCheeseQuiz();
		System.out.println();
		
		System.out.println("Solution");
		StringCheese.stringCheeseSolution();
		System.out.println();
		
		System.out.println(java.nio.charset.Charset.defaultCharset());// �⺻ ĳ���ͼ��� �˷��ִ� �޼���
	}
}

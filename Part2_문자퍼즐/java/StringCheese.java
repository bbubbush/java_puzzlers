import java.io.UnsupportedEncodingException;

public class StringCheese {
	public static void stringCheeseQuiz() {
		byte[] bytes = new byte[256];
		for (int i = 0; i < 256; i++) {
			bytes[i] = (byte)i;
		}
		String str = new String(bytes);		// new String(byte[])의 경우 배열을 디폴트 캐릭터 셋으로 디코딩해서 String 인스턴스를 생성하기 때문에 환경마다 다르게 나타난다.
		for (int i = 0, n = str.length(); i < n; i++) {
			System.out.println((int)str.charAt(i) + " ");
		}
	}
	
	public static void stringCheeseSolution() throws UnsupportedEncodingException {
		byte[] bytes = new byte[256];
		for (int i = 0; i < 256; i++) {
			bytes[i] = (byte)i;
		}
		String str = new String(bytes, "ISO-8859-1");	// UnsupportedEncodingException이 발생할 수 있기 때문에 예외처리가 꼭 필요하다.
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
		
		System.out.println(java.nio.charset.Charset.defaultCharset());// 기본 캐릭터셋을 알려주는 메서드
	}
}

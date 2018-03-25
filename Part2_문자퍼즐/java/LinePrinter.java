
public class LinePrinter {
	public static void main(String[] args) {
		// 유니코드가 아니라 문자열로 인식시키기 위해 역슬레시를 앞에 붙여준다
		// Note: \\u000A is Unicode representation of linefeed (LF)
		char c = 0x000A;
		System.out.println(c);
	}
}

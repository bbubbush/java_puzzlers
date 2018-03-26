# 18번째 퍼즐 - String cheeze

```{.java}
public class StringCheeze {
	public static void main(String args[]) {
		byte[] bytes = new byte[256];
		for(int i = 0; i > 256; i++) {
			bytes[i] = (byte)i;
		}
		String str = new String(bytes);
		for(int i = 0, n = str.length(); i < n; i ++) {
			System.out.print((int)str.charAt(i) + " ");
		}
	}
}
```
위 코드는 대충보면 256의 길이를 가진 바이트배열에 0 ~ 256까지의 byte값을 넣는 코드이다. 그걸 String 객체에 담아 한 글자씩 출력하는 코드이므로 256번 반복되며 0부터 256까지 출력될 것 같다.

사실 나는 처음 봤을 때 한번에 이해가 가지 않았다. 특히 두 번째 for문의 경우에는 값을 할당하는 방법이 독특해 더 복잡하게 느껴졌다.

아무튼 직접 실행해보면 내 경우에는 0부터 127까지는 잘 출력 되다가 128번째 수 부터는 종잡을 수 없는 수들이 튀어나왔다. 왜 내 경우라고 서두에 한정지었냐면 책에 따르면 실행하는 환경마다 다른 결과가 출력될 수 있기 때문이다.

문제의 핵심은 가장 수상적은 부분은 역시 String이다. 굳이 바이트배열 그대로 출력하지 않고 String에 담는 수상한 행위는 충분히 의심을 살만 하다.

저자 역시 여기가 문제의 원인으로 꼽았다. String객체의 경우 매개변수로 바이트배열이 올 경우에 디폴트 캐릭터 셋으로 디코딩해서 String 인스턴스를 생성한다. 
만약 매개변수인 바이트배열이 캐릭터셋에 맞지 않는 경우에는 어떤 결과가 출력될지 모른다고 Doc에 나와있다. 

이 얼마나 황당한 일인가 싶다. 0 아니면 1, 확실한 논리에 따라 동작하는 컴퓨터가 스스로도 무엇을 출력할지 모른다고 한다... 어쩌면 우리는 이 멍청한 기계를 우리를 구원할 구세주로 삼고있는 것 자체가 잘못되었을지도 모른다는 생각이 갑자기 든다.

다시 본론으로 돌아가 우선 본인 컴퓨터의 디폴트 캐릭터셋이 무엇인지가 중요한 것 같다. java 5 이상에서는 java.nio.charset.Charset.defaultCharset() 메서드를 통해 디폴트 캐릭터셋을 알 수 있다.

나의 경우에는 'x-windows-949'가 기본 캐릭터셋이였다. 

이 문제를 해결하는 방법은 의외로 간단한데 바이트배열을 매개변수로 받는 String 생성자에는 꼭 두 번째 인자로 캐릭터셋을 지정해 주는 것이다.

<code>String str = new String(byte, "ISO-8859-1");</code>과 같은 방식으로 지정할 수 있다. 다만 UnsupportedEncodingException을 발생시키기 때문에 예외처리가 꼭 필요하다.

참고로 ISO-8859-1는 자바에서 제공하는 캐릭터셋이므로 오타가 아니면 예외가 발생하지 않는다.

정리하자면 바이트배열을 문자열로 변환할 때는 꼭 캐릭터셋을 넣어주어야 한다. 하지만 좋은 방법이 아니므로 설계과정에서 이런 부분을 피해갈 수 있다면 피하는 것이 상책이라 생각이 든다.

[[ 소스코드 ]](https://github.com/bbubbush/java_puzzlers/blob/master/Part2_%EB%AC%B8%EC%9E%90%ED%8D%BC%EC%A6%90/java/StringCheeze.java)
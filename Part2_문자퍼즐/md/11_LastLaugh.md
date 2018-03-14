# 11번째 퍼즐 - LastLaugh

```{.java}
public class LastLaugh {
	public static void main(String args[]) {
		System.out.print("H" + "a");
		System.out.print('H' + 'a');
	}
}
```
무엇이 출력될 것 같은가? 매우 직관적이며, 단순하고, 어렵지 않은 코드다. 
설마 "HaHa" 외의 다른 답을 생각한 사람이 있을까 싶다. 아직 직접 해보지 않았다면 해보는 것을 추천한다. 이런 문제는 눈으로 보는 것보다 직접 해보는 것이 장기기억에 큰 도움을 준다.

장기기억까지 운운할 정도로 이 코드는 매우 실용적이며 중요하다. 출력되는 답은 "Ha169"이다. 

첫 출력문은 문자열의 결합이다. 따라서 문자열이 더해진 "Ha"가 출력된다. 반면 두 번째 출력문은 문자의 결합이다. 
char 타입은 은연중에 우리가 문자라고 인식하게 된다. 하지만 본질은 정수 자료형이다. 
자바 컴파일러는 char 타입 끼리 + 연산자를 사용하면 char 타입을 int 타입으로 변환하고 '+' 연산자를 '문자열 결합 연산자'가 아니라 '일반 덧셈 연산자'로 사용하게 된다. 
이러한 부분을 '기본 자료형 확장 변환'이라고 하며 char 타입의 연산은 기본 자료형 확장 변환을 부르게 된다. 

따라서 'H'가 의미하는 72와 'a'가 의미하는 97이 더해져 169가 된다. 

이런 경우는 실제 코드를 작성하다 흔하게 겪는 부분이다. 입력된 단어가 모두 소문자인지 혹은 모두 대문자인지 구분하기 위해 <code>...if (str[i] >= 97 && c <= 122)...</code> 와 같은 코드를 해본 경험이 있을 것이다. 이 역시 char 타입의 본질이 정수형 타입임을 간접적으로 나타내는 경우다.

char 타입을 문자 그대로 사용하기 위해서는 ("" + 'H' + 'a') 이렇게 앞에 blank String을 붙여주면 된다.

하지만 이 방법 또한 JDK 1.5 이전 버전에서 문자열의 수정이 빈번하게 일어나는 코드라면 좋은 방법이 아니다.[참고](https://github.com/bbubbush/java_architecture/blob/master/src/com/github/bbubbush/part10/StringEx2.java)

이 퀴즈에서는 **'+'연산자는 피연산자로 문자열이 있을 때만 문자열 연결 연산을 수행한다는 점**이 핵심임을 짚으면서 마무리하겠다.

[[ 소스코드 ]](https://github.com/bbubbush/java_puzzlers/blob/master/Part2_%EB%AC%B8%EC%9E%90%ED%8D%BC%EC%A6%90/java/LastLaugh.java)
# 12번째 퍼즐 - Abc

```{.java}
public class Abc {
	public static void main(String args[]) {
		String letters = "ABC";
		char[] numbers = {'1', '2', '3'};
		System.out.println(letters + " easy as " + numbers);
	}
}
```
이번 퍼즐은 정확한 값을 예측하는 것은 불가능하지만 어떤 형태로 출력될지는 어느정도 감을 잡을 수 있었다. 
배열은 참조형 데이터 타입이므로 객체 자체를 호출할 경우 '[C@16ffff'와 같은 값을 출력하게 된다.

따라서 출력값은 "ABC easy as [C@ffffffff"의 형태를 띤다. 자바 코딩을 조금 하다 보면 쉽게 접하는 형태이다.

하지만 이 퍼즐을 통해 짚고 넘어가야 하는 부분은 hashCode와 toString 메서드다. '@'뒤에 따라 오는 16진법 숫자는 사실 객체의 해시코드이다.

또한 객체를 호출하게 되면 자동적으로 toString 메서드의 결과값을 리턴해주는데 Object 객체가 가지고 있는 toString의 형태는 "클래스이름@해시코드값"으로 구성되어있다.

우리가 출력한 값은 Object의 toString을 그대로 상속해 사용하는 것이다. String.valueOf 메서드를 활용하면 위와 같은 오류를 방지할 수 있지만 char 배열 타입의 특수한 경우에 국한된다.

앞으로 우리가 설계하는 객체는 모두 암묵적으로 Object를 상속받으므로 hashCode와 toString 메서드를 오버라이딩하여 해당 객체에 맞게 출력해주는 습관을 들여야한다.

이 부분은 effective java에서도 하나의 챕터로 다뤄질 정도로 중요하다. 이번 퀴즈는 char 배열 타입으로 시작했지만 결국은 hashCode와 toString에 대한 이야기를 담고있었다.

[[ 소스코드 ]](https://github.com/bbubbush/java_puzzlers/blob/master/Part2_%EB%AC%B8%EC%9E%90%ED%8D%BC%EC%A6%90/java/Abc.java)
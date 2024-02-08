# 데코레이터 패턴(Decorator Pattern)
***
## 설명
- 기존 기능에 영향을 주지 않고 Wrapper 객체를 이용해 모듈과 비슷한 방식으로 기존 객체에 기능을 추가할 수 있다.
- 런타임에 객체의 행위나 기능을 추가할 수 있게 해준다
- Component를 Decorator로 감쌈으로써 기능을 확장한다.
- Decorator는 자신이 감쌀 클래스와 같은 형식을 가진다.

## 단점
- 자잘한 객체가 매우 많이 추가될 수 있다.
- 데코레이터를 많이 사용하면 코드가 필요 이상으로 복잡해진다.

## 다이어그램
![decorator.png](..%2Fimages%2Fdecorator.png)
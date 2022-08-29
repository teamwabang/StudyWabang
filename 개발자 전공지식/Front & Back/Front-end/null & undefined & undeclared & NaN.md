# null & undefined & undeclared & NaN

## null ( 빈 값을 할당 )

- 의도적으로 변수에 null을 할당하여 값이 없다는 것을 나타낸 것
- null이 할당된 변수의 타입은 object이다 ( 객체 타입이고 비어있는 변수이다. )

```
const test = null;

console.log(test); // null
console.log(typeof test); // object
```

## undefined ( 아무 값도 할당되지 않았다 )

- 변수 선언 이후에 undefined로 초기화된 상태 ( 선언 → 초기화 → 할당 )
- 스코프에 변수가 선언 되었으나 아직 아무런 값도 할당되지 않은 상태

```jsx
let test;

console.log(test); // undefined
console.log(typeof test); // undefined
```

## undeclared ( 선언조차 되지 않았다 )

- undeclared의 타입은 undefined이다

```jsx
console.log(test); // Uncaught ReferenceError: test is not defined
									 // at <anonymous>:1:13
console.log(typeof test); // undefined
```

## NaN ( Not a Number )

- 컴퓨터로는 표현할 수 없는 숫자값

```
const test = 0 / 0;

console.log(test); // NaN
console.log(isNaN(test)); // true
```
# var VS let VS const

# 변수 선언 방식

## var (변수 재선언 가능)

```html
	var 바 = 1;
  console.log(바); // 1

  var 바 = 2;
  console.log(바); // 2
```

- `var`로 선언한 변수는 동일한 이름으로 여러 번 중복해서 선언이 가능함
- 기존에 선언해둔 변수의 존재를 잊고 값을 재할당하는 등의 실수가 발생할 수 있음
- 이를 보완하기 위해 ES6부터 `let`과 `const`가 추가됨.

```html
	console.log(바); 
  var 바 = 1;
  // 1
```

- Hoisting(함수 안에 있는 선언들을 모두 끌어올려서 해당 함수 유효 범위의 최상단에 선언하는 것)이 가능함

## let(변수 재선언 불가능, 변수 재할당 가능)

```html
	let 렛 = 1;
  console.log(렛); // 1

  let 렛 = 2;
  console.log(렛); // Uncaught SyntaxError: Identifier '렛' has already been declared

	렛 = 2;
	console.log(렛); // 2
```

- `var`와 다르게 `let`은 해당 변수가 이미 선언되었다는 에러 메세지가 출력됨
- `렛 = 2;` 와 같이 변수 선언 및 초기화 이후 반복해서 다른 값을 재할당 가능

## const(변수 재선언 불가능, 변수 재할당 불가능)

```html
	const 컨스트 = 1;
  console.log(컨스트); // 1

  const 컨스트 = 2;
  console.log(컨스트); // Uncaught SyntaxError: Identifier '컨스트' has already been declared

  컨스트 = 2;
  console.log(컨스트); // Uncaught TypeError: Assignment to constant variable.
```

- `let`과 `const`의 차이점은 `immutable`의 여부.
- `let`은 값을 재할당할 수 있지만 `const`는 에러 메세지가 출력됨

```html
	const list = [1, 2, 3, 4];

  list = 5;
  console.log(list); // Uncaught TypeError: Assignment to constant variable.

  list.push(5);
  console.log(list); // [1, 2, 3, 4, 5]
```

- 배열이나 객체의 값을 변경하는 것은 가능함.

# Hoisiting

### var : 호이스팅 발생

```html
	console.log(바); 
  var 바 = 1;
  // 1
```

### let, const : 호이스팅 발생 ( 다른 방식으로 작동)

```html
	console.log(렛);
  let 렛 = 1;
  // Uncaught ReferenceError: 렛 is not defined
```

- 변수 `렛`이 선언되기 전에 참조하니 에러 발생
- 호이스팅이 발생하지 않는 것이 아닌, 변수의 선언과 초기화 사이에 일시적으로 변수 값을 참조할 수 없는 구간인 TDZ(Temporal Dead Zone)에 빠졌기 때문에 보이는 현상임.
- 함수표현식을 사용하거나 `let` 또는 `const` 로 변수를 선언하는 경우, 자바스크립트 내부에서는 코드 실행 전 변수 선언만 해둘뿐 초기화는 코드 실행 과정에서 변수 선언문을 만났을 때 수행함. 그렇기 때문에 호이스팅이 발생하기는 하지만, 값을 참조할 수 없기 때문에 동작하지 않는 것처럼 보이는 것임.

# Scope

### Execute-Context를 통해 설명
# useMemo 와 useCallback

## Memoization

기존에 수행한 연산의 결과값을 어딘가 저장해두고 **동일한 입력이 들어오면 재활용**하는 기법

## useMemo

**메모이제이션 된 ‘값’을 반환한다.**

```jsx
const value = useMemo(() => {
	return function()
}, [deps])
```

`deps` 가 변하면 `function()`을 실행하고, 그 함수의 반환 값을 반환한다.

```jsx
import React, { useMemo, useState } from "react";

const plusFc = (number) => {
  console.log("3더하기");
  return number + 3;
};

const minusFc = (number) => {
  console.log("3빼기");
  return number - 3;
};

function App() {
  const [plus, setPlus] = useState(0);
  const [minus, setMinus] = useState(0);

  const plusResult = useMemo(() => {
    plusFc(plus);
  }, [plus]);

  const minusResult = minusFc(minus);
  return (
    <div>
      <h4>더하기</h4>
      <input
        type="number"
        value={plus}
        onChange={(e) => setPlus(parseInt(e.target.value))}
      />
      <div>{plusResult}</div>

      <h4>빼기</h4>
      <input
        type="number"
        value={minus}
        onChange={(e) => setMinus(parseInt(e.target.value))}
      />
      <div>{minusResult}</div>
    </div>
  );
}

export default App;
```

- 더하기 부분에 `useMemo` 처리를 하여 빼기 부분을 동작시켜도 ( **deps의 plus는 변하지 않는다** ) 더하기 부분은 리렌더링 되지않는다
- 더하기 부분을 동작하면 함수 전체가 실행되면서 빼기부분도 초기화되면서 함께 렌더링 된다.

## useCallback

**메모이제이션 된 ‘함수’를 반환한다.**

```jsx
useCallback(() => {
	return value;	
},[item]);
```

- 함수들은 컴포넌트가 리렌더링 될 때 마다 새로 만들어짐
- 한번 만든 함수를 필요할때만 새로 만들고 재사용 하기 위함
- 의존성 배열 안 item이 변경될 때만 함수를 새로 생성
- 인자로 전달한 콜백함수 안에 사용하는 상태 or prps가 있다면 꼭 deps 배열안에 포함시켜야한다
    - deps안에 값을 넣지않을 경우 함수 내에서 해당 값들을 참조할 때 가장 최신 값을 참조할 것이라고 보장할 수 없다.

```jsx
import React, { useCallback, useEffect, useState } from "react";

function App() {
  const [number, setNumber] = useState(0);

  const someFunction = useCallback(() => {
    console.log(`someFunc: number: ${number}`);
    return;
  }, [number]);

  useEffect(() => {
    console.log("useEffect");
  }, [someFunction]);

  return (
    <div>
      <input
        type="number"
        value={number}
        onChange={(e) => setNumber(e.target.value)}
      />
      <br />
      <button onClick={someFunction}>Call SomeFunction</button>
    </div>
  );
}

export default App;
```

<aside>
💡 **useMemo((...)=>fn, deps) === useCallback(fn, deps)**

</aside>

리액트 공식문서 → 두 식은 같다
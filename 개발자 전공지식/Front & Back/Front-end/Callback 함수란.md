# Callback

프로그래밍 언어에는 first class citizen(일급 시민, 일급 객체)라는 개념이 있다

### <일급 객체 문법>

```html
val = 1 (first class citizen)
```

```html
val = if(x) {
        y
    } (second class citizen)
```

```html
val = function(x) {
        return y
    } (first class citizen)
```

```html
function fn() {
        val = function(x) {
            y
        }
        return val;
    }
```

일급 시민이 되기 위한 조건 : 함수가 다른 함수의 return 값이 될 수 있다면 그 언어는 함수를 일급 시민으로 대우 해주고 있다

```html
val = function(x) {
        return y
    }
    fn(val)
```

- val은 다른 함수의 입력값으로 사용되고 있다
- 함수가 다른 함수의 입력값이 될 수 있다면 그 언어에서는 함수를 일급시민으로 대우 해주고 있다

```html
val = function(x) {
        return y
    }
    function fn(arg) {
        arg();
    }
    fn(val) : CALLBACK FUNCTION
```

- val이 fn에 입력값으로 들어가고 fn에서 arg라는 이름을 가지고 그 함수를 함수 내에서 호출한다.
- 은 바로 실행 되지는 않지만 다른 함수의 입력값으로 전달되어 다른함수(fn)에 의해서 나중에 호출
- val 자체가 callback function은 아니지만 다른 함수의 입력값으로 전달되어 호출이 된다면 이 맥락에서 val이 callback function이 된다

```html
const 멤버 = [
    {
      name: "엄지혜",
      gender: "female",
    },
    {
      name: "이민아",
      gender: "female",
    },
    {
      name: "정재홍",
      gender: "male",
    },
    {
      name: "한상민",
      gender: "male",
    },
  ];

  function callback(item) {
    return item.gender === "male";
  }

  const 남자 = 멤버.filter(callback);

  console.log(남자); //[{name: '정재홍', gender:'male'}, {name:'한상민', gender:'male'}]

//const 남자 = 멤버.filter((item) => {
//  return item.gender === "male";
//});
// (item) => {return item.gender === 'male'} -> Callback function
```

- filter 문법 : arr.filter(callback(element[, index[,array]]))[, thisArg] )
- callback : 각 요소를 시험할 함수, true를 반환하면 요소를 유지하고, false를 반환하면 버린다

```html
<body>
  <button id="btn">더하기</button>
  <span id="span">0</span>
  <script>
    const btn = document.getElementById("btn");
    const span = document.getElementById("span");
    let number = 0;

    const handleClick = () => {
      number++;
      span.innerText = number;
    };

    btn.addEventListener("click", handleClick);
  </script>
</body>
```
# Promise

Javascript에서 제공하는 비동기를 간편하게 처리할 수 있도록 도와주는 Object

1. 상태(State) : 프로세스 무거운 동작을 수행하고 있는 중인지, 완료되어 성공했는지, 실패 했는지에 대한 이해가 중요함
    - pending : promise가 만들어져서 우리가 지정한 동작을 수행 중일 때
    - fulfilled : 동작을 성공적으로 끝내는 것
    - rejected : 데이터를 찾을 수 없거나 네트워크에 문제가 생길 때
2. Producer(데이터를 제공하는) vs Consumer(제공된 데이터를 사용하는)

### Producer ( Promise 만들기 )

Promise가 만들어질 때는 우리가 전달한 executor함수가 자동적으로 실행 - Promise 안에 네트워크 통신을 하는 코드를 작성했을 경우, Promise가 만들어지는 그 순간 바로 네트워크 통신을 수행함.

```jsx
const promise = new Promise((resovle, reject) => {
  // 무거운 작업 (네트워크에서 데이터를 받아 오거나 파일에서 큰 데이터를 읽어오는 등)
  console.log("어떤 작업");
  setTimeout(() => {
    resovle("전달성공");
    reject(new Error("에러발생")); // Error : Javascript에서 제공하는 Object
  }, 3000);
});
```

### Consumers : then, catch, finally 이용 ( Promise 사용하기 )

```jsx
promise
  .then((value) => { // Promise에 then을 호출하면 then은 Promise를 리턴함
    console.log(value);
  })
  .catch((error) => { // 그래서 그 리턴된 Promise에 catch를 호출할 수 있다 (chaining)
    console.log(error);
  })
  .finally(() => {
    console.log("무조건 출력");
  });
```

### Promise chaining

```jsx
const fetchNumber = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve(10);   // 서버 통신
  }, 2000);
});

fetchNumber
  .then((num) => num * 3)
  .then((num) => num * 2)
  .then((num) => {
    return new Promise((resolve, reject) => {
      setTimeout(() => resolve(num - 10), 1500);// 다른 서버에 보내서 다른 숫자로 변환된 값을 받아 옴
    });
  })
  .then((num) => console.log(num));
```

### Error handling

```jsx
const getOne = () =>
  new Promise((resovle, reject) => {
    setTimeout(() => resovle("1"), 1000);
  });

const getTwo = (one) =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve(`${one} => 2`), 1000);
  });

const getThree = (two) =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve(`${two} => 3`), 1000);
  });

getOne()
  .then((one) => getTwo(one))
  .then((two) => getThree(two))
  .then((result) => console.log(result));
```

```jsx
const getOne = () =>
  new Promise((resovle, reject) => {
    setTimeout(() => resovle("1"), 1000);
  });

const getTwo = (one) =>
  new Promise((resolve, reject) => {
    setTimeout(() => reject(new Error(`${one} => 2`)), 1000);
  });

const getThree = (two) =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve(`${two} => 3`), 1000);
  });

getOne() //
  .then(getTwo)
  .catch((error) => {
    return "4";
  })
  .then(getThree)
  .then(console.log)
  .catch(console.log);
```
# @ReqeustBody, @RequestParam, @ModelAttribute

<br>

### @RequestBody

- 클라이언트가 전송하는 `Json(application/json) 형태의 HTTP body 내용을 Java 객체로 변환`시켜주는 역할을 한다.<br>
그렇기 때문에 **Body가 존재하지 않는 HTTP GET 메서드에 @ReqquestBody를 사용할 경우 에러가 발생**하게 된다.
- 바인딩이 아니라 변환을 시키는 것이기 때문에 **변수들의 setter 함수가 없어도 정상적으로 저장**된다.

```java
@Controller
public class TestController {	
	
	@PostMapping("test")
	public String name(@RequestBody String name) { }
}
```

`ex) /test?name=java`<br>
만약, name 값에 java를 입력했다고 가정한다면 java라는 값이 잘 전달되었지만<br>
**test?name=java**라는 String으로 전달되어 이런 데이터를 사용하기에 불편함이 있다.

<br>

### @RequestParam

- **1개의 HTTP 요청 파라미터를 받기 위해서 사용한다.** = 사용자가 전달하는 값을 **1:1로 매핑**해주는 어노테이션이다.
- **name** : 해당 파라미터의 이름을 설정해준다.

```java
@Controller
public class TestController {
	
	@GetMapping("test")
	public String test(@RequestParam("name") String name) { }
	
	@GetMapping("test")
	public String test(@RequestParam(name="name") String name) { }
}
```

`ex) /test?name="name에 담긴 value"`<br>
위 처럼 url이 전달될 때 name 파라미터(name에 담긴 value)를 받아오게 된다.

만약 RequestParam에 key값이 존재하지 않을 경우,

- **required** : 해당 파라미터가 필수 요소인지 지정해준다. (true가 default, false일 때 값이 없으면 null)
- **defalutValue** : 해당 파라미터가 비었을 때, default 값을 지정해준다.

```java
@Controller
public class TestController {
	
	@GetMapping("test")
	public String test(@RequestParam(name="name", required=false, defaultValue="") String name) { }
```

reuired = false 속성을 명시함으로써 key 값이 존재하지 않다고 하여 BadRequest가 발생하지 않게 된다.<br>
그리고, 존재하지 않다면 String 변수에 default로 "" 값이 들어가게 된다.

<br>

### @ModelAttribute

- 메서드 레벨, 메서드의 파라미터에 적용이 가능하다.
- 사용자가 요청 시 전달하는 값을 오브젝트 형태로 매핑해주는 어노테이션이다.

```java
@Getter
@Setter
public class TestModel {
	
	private String name;
	private int age;
}

@Controller
public class TestController {
	
	@GetMapping("test")
	public String test(@ModelAttribute TestModel testModel) {
		
		System.out.println("이름 : " + testModel.getName());
		System.out.println("나이 : " + testModel.getAge());
		return "test";
	}
}
```

@RequestParam과의 차이점은 1:1 매핑이냐, 객체 매핑이냐 정도 이다.<br>
@RequestParam을 사용하면 사용자의 요청이 늘어나거나 줄어들때 일일이 찾아 수정해줘야 한다.

#### @ModelAttribute를 사용하지 않는 경우

```java
@Controller
public class TestController {
	
	@GetMapping("test")
	public String test(@RequestParam Long id,
			   @RequestParam String name,
			   @RequestParam String email,
			   @RequestParam String phone,
			   Model model) {
		List<User> userList = userService.search(id, name, email, phone);
		model.addAttribute("userList", userList);
		return "test";
	}
}
```

#### @ModelAttribute를 사용하는 경우

```java
@Getter
@Setter
public class UserSearch {
	
	private Long id;
	private String name;
	private String email;
	private String phone;
}

@Controller
public class TestController {
	
	@GetMapping("test")
	public String test(@ModelAttribute UserSearch userSearch) {
		
		List<User> userList = userService.search(userSearch);
		model.addAttribute("userList", userList);
		return "test";
	}
}
```

<br><br><br>

---

<br><br><br>
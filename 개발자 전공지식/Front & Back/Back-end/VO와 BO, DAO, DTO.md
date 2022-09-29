# VO와 BO, DAO, DTO

<br>

## DAO(Data Access Object)
- 데이터 사용기능 담당 클래스
- DataBase 접근을 하기 위한 로직과 비지니스 로직을 분리하기 위해 사용한다.
- DB Connection 로직까지 설정되어있는 경우가 많다.
- DB를 사용해 데이터를 CRUD하는 기능을 전담한다.
- mybatis와 같은 프레임워크를 사용하면 커넥션풀을 제공하기 때문에 DAO를 별도로 만드는 경우는 드물다.
```
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDao {

    public void add(TestDto dto) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

        PreparedStatement preparedStatement = connection.prepareStatement("insert into users(id,name,password) value(?,?,?)");


        preparedStatement.setString(1, dto.getName());
        preparedStatement.setInt(2, dto.getValue());
        preparedStatement.setString(3, dto.getData());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        
        connection.close();

    }
}
```

<br>

## DTO(Data Transfer Object)
- 데이터 저장 담당 클래스
- Controller, Service, View 등 계층간 데이터 교환을 위해 사용되는 객체이다.
- 로직을 갖지 않는 순수한 데이터 객체이며 getter, setter 메소드만을 포함한다.
```
public class PersonDTO {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

<br>

## VO(Value Object)
- 데이터 저장 담당 클래스
- DTO와 혼용해서 쓰이지만, VO는 값(Value)을 위해 쓰이는 객체로 불변(read only)의 속성을 가진다.
- 보통 getter의 기능만을 포함한다.
```
class Money {
   private long amount;
   private Currency currency;

   public Money(long amount, Currency currency) {
      this.amount = amount;
      this.currency = currency;
   }

   public long getAmount() {
      return amount;
   }

   public Currency getCurrency() {
      return currency;
   }

   @Override
   public String toString() {
      return this.amount + this.currency.getDesc();
   }
}
```

<br>

## BO(Business Object)
- Business Object로 여러 DAO를 활용해 비즈니스 로직을 처리하는 클래스
- Service에 해당함
```
public class BoardService {

    private BoardDAO boardRepository;

    public void addBoard(Board board) {
        boardRepository.add(board);
    }

    public List<Board> searchBoard(String title) {
        return boardRepository.findByTitleContaining(title);
    }

}
```

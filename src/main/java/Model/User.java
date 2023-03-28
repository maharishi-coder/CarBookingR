package Model;

public class User extends Person {

    String name,age,gender;
    Integer id;
    static Integer count=0;

    public User(String name, String age, String gender) {
        super(name,age,gender);
        this.id=count++;

    }

}

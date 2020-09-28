package test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-24
 * Time: 13:09
 **/
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("work");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

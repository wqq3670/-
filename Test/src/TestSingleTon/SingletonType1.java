package TestSingleTon;

/**
 * Created with IntelliJ IDEA.
 * Description:饿汉模式(静态常量)
 * User: dell
 * Date: 2020-10-01
 * Time: 23:40
 **/
public class SingletonType1 {

}

class Singleton{
    //1.构造器私有化，不能被new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个人公有的静态方法，用来返回实例对象
    public static Singleton getInstance() {
        return instance;
    }


}

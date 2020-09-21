package ThreadTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-20
 * Time: 16:35
 **/
public class StacticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.HappyMarry();

        //new WeddingCompany(new You()).HappyMarry();
    }


}

//结婚的一个接口
interface Marry{
    void HappyMarry();
}

//真实角色 你去结婚
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("xx要结婚了，超开心");
    }
}

//代理角色 婚庆公司帮助你结婚
class WeddingCompany implements Marry {

    //代理谁==》 真是目标角色
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//这就是真实对象
        after();
    }


    private void before() {
        System.out.println("结婚前，布置现场");
    }
    private void after() {
        System.out.println("结婚后，处理尾款");
    }


}
  
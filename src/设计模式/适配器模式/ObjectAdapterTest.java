package 设计模式.适配器模式;

public class ObjectAdapterTest {
    //客户端代码
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试");
        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }
}

//对象适配器类
class ObjectAdapter implements Target {
    @Override
    public void request()
    {
        adaptee.specificRequest();
    }
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee)
    {
        this.adaptee = adaptee;
    }
}

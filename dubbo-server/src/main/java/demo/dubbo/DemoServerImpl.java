package demo.dubbo;

/**
 * Hello world!
 *
 */
public class DemoServerImpl implements DemoServer
{
    public String sayHello(String name) {
        return "hello " + name;
    }
}

package demo.dubbo_cleint;

import java.io.IOException;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.dubbo.DemoServer;

public class ChatAction {
    public void SayHello() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        context.start();
      
        DemoServer demoServer = (DemoServer) context.getBean("demoService");
        System.err.println("client:" + demoServer.sayHello("Morning" + "1:" + new Date()) + "3:" + new Date());
        System.out.println("按任意键退出");
        System.in.read();
    }
}

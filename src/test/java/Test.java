
import com.mashibing.aspect.bean.AddCustomAnnImpl;
import com.mashibing.aspect.bean.BeanAddCustomAnn;
import com.mashibing.aspect.bean.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        TestAopAnn testAopAnn = context.getBean("testAopAnn", TestAopAnn.class);
//        testAopAnn.test1();
//        System.out.println();
//        System.out.println();
//        testAopAnn.test2();
        AddCustomAnnImpl t = (AddCustomAnnImpl)context.getBean("beanAddCustomAnn");
//        t.testprint1("11111");
        System.out.println("---------------------");
        TestBean b = new TestBean();
        b.setPassword("password112");
        b.setUsername("useruser113");
        b.setAddress("address114");
        t.testprint1(b);
//        t.testprint2("22222");
//        t.testprint3("33333");

//        System.out.println("11111111111111111111111111111111111111111");
//
//        Child child = context.getBean("child", Child.class);
//        child.eat();
//        System.out.println("执行了");


/*        System.out.println("22222222");
        System.out.println(context.getBean("user"));
        System.out.println(context.getBean("&user"));
        System.out.println("33333333");*/
        //得到类的实例
//        Entity01 ent01 = (Entity01) context.getBean(Entity01.class);
//        System.out.println(ent01);
////        ClassPathXmlApplicationContext en=(ClassPathXmlApplicationContext)context;
//        en.close();


    }
}

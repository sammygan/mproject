import com.gans.service.PersonServer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
//@WebAppConfiguration("src/main/resources")
public class SpringAopTest {
    @Test
    public void inteceptorTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        PersonServer bean = (PersonServer)ctx.getBean("personServiceBean");
        bean.save("badMonkey",23);

//          personServer p = new personServerImpl();//通过new对象是不会触发aop的
//          p.save("11", "22");
    }
}

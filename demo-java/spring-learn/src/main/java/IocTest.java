import com.caofangqi.ioc.IocService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author FangQi Cao
 */
public class IocTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-ioc-test.xml");
        IocService iocService = context.getBean(IocService.class);
        System.out.println(iocService.sayHello());

    }
}

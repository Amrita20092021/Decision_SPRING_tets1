package KH_Sal_1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testspring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ap.contex.xml"


        );

        testBin testBin = context.getBean("testBin",testBin.class );

        System.out.println(testBin.getName());
        context.close();
    }
}

package v.ming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Oliverlee on 2017/3/28.
 */
@SpringBootApplication
public class VmAccountGenericApplication {

    public static void main(String[] args) throws InterruptedException, IOException {
        SpringApplication.run(VmAccountGenericApplication.class, args);


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application1.xml"});
        context.start();

//        System.in.read();
    }
}

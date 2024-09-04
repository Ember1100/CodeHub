package org.example;

import org.example.model.AA;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author huangqi
 * @Date 2024/9/3 23:38
 */

public class SpringApplicationTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplication.class);
        AA aa = (AA) applicationContext.getBean("AA");
        System.out.println(aa.getBb());

    }

}

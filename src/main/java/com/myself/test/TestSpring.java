package com.myself.test;

import com.myself.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    Category c;
    @Test
    public void test() {
        System.out.println(c.getName());
    }

/*不使用注解方式进行测试*/
/*    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"applicationContext.xml"});

        ProductService productService=(ProductService) context.getBean("s");
        productService.doSomeService();

        Product product=(Product) context.getBean("p");
        System.out.println(product);
    }*/
}
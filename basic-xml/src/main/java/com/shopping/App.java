package com.shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Customer cust = (Customer)context.getBean("customer");
        System.out.println( "Customer : "+cust);
    }
}





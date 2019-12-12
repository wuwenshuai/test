package com.carry.spring;

import com.carry.spring.pojo.Stu;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.carry.spring.pojo.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {


    public static void main(String[] args) {







        List<String> list = Arrays.asList("1","2");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(",\"goodType\":{\"$eq\":\"" + "PACKAGING" + "\"}");

        String productGroupQry = list.stream()//
                .collect(Collectors.joining("\",\"", "\"scanResult\":{\"$in\":[\"", "\"]}"));
        stringBuilder.append(productGroupQry);


        String formt = "\"$and\":[{\"$or\":[{%s},{\"goodType\": {\"$eq\": \"PACKING\"}}]}]";

        String format = String.format(formt, stringBuilder);
        System.out.println(format);

      /*  BeanFactory beanFactory
                = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        User user = (User) beanFactory.getBean("user");
        System.out.println(user);*/

    }

}

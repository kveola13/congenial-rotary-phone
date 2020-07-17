package com.kveola13.springmasterclass;

import com.kveola13.springmasterclass.sorting.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.kveola13.springmasterclass")
public class SpringMasterclassApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringMasterclassApplication.class)) {
            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
            BinarySearchImpl secondBinarySearch = applicationContext.getBean(BinarySearchImpl.class);
            System.out.println(binarySearch);
            System.out.println(secondBinarySearch);
            int result = binarySearch.binarySearch(new int[]{1, 2, 4, 6}, 3);
            System.out.println(result);
        }
    }
}

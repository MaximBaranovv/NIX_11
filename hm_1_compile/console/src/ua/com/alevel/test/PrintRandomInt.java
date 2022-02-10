package ua.com.alevel.test;

import org.apache.commons.discovery.Resource;
import org.apache.commons.math3.random.RandomDataGenerator;

public class PrintRandomInt {
    public void methodTwo() {
        RandomDataGenerator rand= new RandomDataGenerator();
        System.out.println(rand.nextInt(1, 31));
        System.out.println(Resource.class);


    }
}

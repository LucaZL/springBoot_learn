package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private TestProperties testProperties;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testProperties() throws Exception{
        System.out.println("nothing");
        Assert.assertEquals(testProperties.getName(), "StupidLuca");
        Assert.assertEquals(testProperties.getTitle(), "Nothing");
        Assert.assertEquals(testProperties.getDesc(), "StupidLuca is doing Nothing");
        Assert.assertEquals(testProperties.getRandomnumber(), 1);
    }

}

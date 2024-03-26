package com.mytests.spring.springbootconfigpropsinjectionbug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseConfigPropsConfiguration
{
    private final String greeting;

    @Autowired
    public UseConfigPropsConfiguration(ConfigPropsConfiguration config)
    {
        this.greeting = config.getDummy();
    }

    public void display() {
        System.out.println(greeting);
    }

    ;
}
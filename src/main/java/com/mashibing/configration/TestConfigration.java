package com.mashibing.configration;

import com.mashibing.factorybean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
//@Autowired
public class TestConfigration {

    @Bean
    public User getUser(){
        return new User();
    }
}

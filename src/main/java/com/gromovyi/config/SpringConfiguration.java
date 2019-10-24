package com.gromovyi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gromovyi.service.UserService;
import com.gromovyi.service.impl.UserServiceImpl;

@Configuration
public class SpringConfiguration {
    @Bean
  UserService getUserService(){
      return new UserServiceImpl();
    }
}

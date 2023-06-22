
package com.lakshman.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SpringSecurityAuthentication {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager()
    {
        User.UserBuilder users = User.withDefaultPasswordEncoder();

        UserDetails userOne = users
                .username("testUserOne")
                .password("passwordOne")
                .roles("USER")
                .build();

        UserDetails userTwo = users
                .username("testUserTwo")
                .password("passwordTwo")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(userOne,userTwo);
    }

}

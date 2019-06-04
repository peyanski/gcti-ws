package org.a3.gctibws.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    //Create users here
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");

    }

    // Secure the endpoints with HTTP Basic Authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/client/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/client").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/client/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/client/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/client/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/client2/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/client2").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/client2/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/client2/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/client2/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();

    }

}

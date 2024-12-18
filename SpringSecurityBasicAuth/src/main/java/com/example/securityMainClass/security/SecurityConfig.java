package com.example.securityMainClass.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration  // Marks this class as a Spring configuration
@EnableWebSecurity  // Enables Spring Security for the application
public class SecurityConfig {

    @Bean  // This method will create a Spring Bean for security configuration
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        // Disabling CSRF protection for REST APIs (stateless)
        httpSecurity.csrf(csrf -> csrf.disable())

        // Defining security rules for HTTP requests
        .authorizeHttpRequests(request -> {
            // Allow all GET requests without authentication
            request.requestMatchers(HttpMethod.GET).permitAll()
            // Require authentication for all other requests (POST, PUT, DELETE)
            .requestMatchers("/users/addOneUser").hasRole("student") // Only 'student' can add users
            .requestMatchers("/users/delete/**").hasRole("teacher") 
            .anyRequest().authenticated();
        })

        // Enabling Basic Authentication for the API
        .httpBasic(Customizer.withDefaults());

        // Building and returning the final security configuration
        return httpSecurity.build();
    }

    //password for the UserDetails need to be encode
    @Bean
    public PasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() throws Exception {

    	//here we are creating students userdetails and assign its role and password
    	UserDetails student=User.builder()
    			                .username("student")
    			                .password(passwordEncoder().encode("1234"))
    			                .roles("student")
    			                .build();

    	//here we are creating teacher userdetails and assign its role and password
    	UserDetails teacher=User.builder()
    			                .username("teacher")
    			                .password(passwordEncoder().encode("1234"))
    			                .roles("teacher")
    			                .build();
    	return new InMemoryUserDetailsManager(student, teacher);
    }
}


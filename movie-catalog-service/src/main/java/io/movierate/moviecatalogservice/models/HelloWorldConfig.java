package io.movierate.moviecatalogservice.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Java-based bean configuration
@Configuration
public class HelloWorldConfig {
    // Returns an object that should be registered as a bean in Spring applicationcontext
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}

/*
Above is equivalent to
    <beans>
        <bean id="helloWorld" class="io.movierate.HelloWorld" />
    </beans>
 */

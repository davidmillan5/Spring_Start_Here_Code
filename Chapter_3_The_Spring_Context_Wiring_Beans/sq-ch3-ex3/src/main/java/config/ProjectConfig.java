package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojos.Parrot;
import pojos.Person;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }


    @Bean
    public Person person(Parrot parrot){
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }



}

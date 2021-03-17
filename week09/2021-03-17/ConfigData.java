package demo.configurationclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import javax.xml.crypto.Data;

@Configuration
public class ConfigData {

    @Bean
    @Lazy
    public DataSource dataSource() {
        System.out.println("**********I have entered the dataSource() method");

        DataSource ds = new DataSource();
        ds.setConnectionString("jdbc:h2:localhost:3306/MySchema");
        ds.setPoolSize(8);
        return ds;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        System.out.println("**********I have entered the transactionManager() method");

        DataSource ds = dataSource();
        PlatformTransactionManager txMgr = new PlatformTransactionManager(ds);
        // ...
        return txMgr;
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() {
        System.out.println("**********I have entered the entityManagerFactory() function");

        DataSource ds = dataSource();
        EntityManagerFactory emf = new EntityManagerFactory(ds);
        // ...
        return emf;
    }
}

package configure;

import Property.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;


@Configuration
@PropertySource("classpath:PR.properties")
public class ConfigurationContext {

    @Autowired
    Environment environment;

//    @Bean
//    Entities entities() {
//        return new Entities(message, value);
//    }

    @Bean
    public Entity entity() {
        Entity entity = new Entity();
        entity.setMessage(environment.getProperty("property.message"));
        return entity;
    }


}

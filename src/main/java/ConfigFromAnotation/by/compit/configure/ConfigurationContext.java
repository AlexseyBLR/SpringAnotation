
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


@Configuration
public class ConfigurationContext {

    @Bean
    @Scope(value = "prototype")
    @Lazy(value = true)
    Entities entities(String message, int value) {
        return new Entities(message, value);
    }

    @Bean
    public Entity entity() {
        Entity entity = new Entity();
        entity.setMessage(Property.BeanProperty.MESSAGE);
        return entity;
    }




}

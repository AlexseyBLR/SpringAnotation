import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationContext.class);

        Entities entities = ctx.getBean(Entities.class, Property.BeanProperty.MESSAGE, Property.BeanProperty.VALUE);
        System.out.println(entities.getMessage() + " " + entities.getValue());

        Entity entity = ctx.getBean(Entity.class);
        System.out.println(entity.getMessage());


    }

}

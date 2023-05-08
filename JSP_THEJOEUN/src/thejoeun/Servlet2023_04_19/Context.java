package thejoeun.Servlet2023_04_19;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configurations
public class Context {
   @Bean
   public Greeter greeter() {
      Greeter g = new Greeter();
      g.setFormat("%s, 안녕하세용");
      return g;
   }
}
package open_hearts_springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.micrometer.common.lang.NonNull;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            @NonNull
            public void addCorsMappings(CorsRegistry registry) {
                String vercelUrl = "https://open-hearts-exhibit.vercel.app/";

                registry.addMapping("/**") // Apply to all endpoints
                        .allowedOrigins(vercelUrl, "http://localhost:3000") // Your frontend origin
                        .allowedMethods("*")
                        .allowedHeaders("*")
                        .allowCredentials(true); // if you're using cookies or auth headers
            }
        };
    }
}

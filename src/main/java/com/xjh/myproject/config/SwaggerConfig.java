package com.xjh.myproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 123
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {

    private static final Contact DEFAULT_CONTACT = new Contact("向嘉晖", "http://localhost:8888/xjh","2464674651@qq.com");

    @Bean
    public Docket docket(Environment environment){
        Profiles profiles = Profiles.of("dev");
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("向嘉晖")
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("向嘉晖的第一个Swagger接口文档")
                .description("扬帆起航")
                .contact(DEFAULT_CONTACT)
                .version("v1.0")
                .build();
    }

    @Bean
    public Docket docketA(Environment environment){
        Profiles profiles = Profiles.of("dev");
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfoA())
                .groupName("向嘉晖A")
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build();
    }

    private ApiInfo apiInfoA(){
        return new ApiInfoBuilder()
                .title("向嘉晖的第二个Swagger接口文档")
                .description("不及硅谷无以至千里")
                .contact(DEFAULT_CONTACT)
                .version("v1.1")
                .build();
    }
}

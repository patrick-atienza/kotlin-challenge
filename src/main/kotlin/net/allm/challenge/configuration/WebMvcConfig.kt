package net.allm.challenge.configuration

import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import javax.sql.DataSource

@Configuration
@EnableWebMvc
class WebMvcConfig {

    @Bean(name = ["dataSource"])
    fun dataSource(): DataSource {
        val dataSourceBuilder = DataSourceBuilder.create()
        dataSourceBuilder.driverClassName("org.h2.Driver")
        dataSourceBuilder.url("jdbc:h2:mem:challenge")
        dataSourceBuilder.username("sa")
        dataSourceBuilder.password("sa")
        return dataSourceBuilder.build()
    }

    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors.basePackage("net.allm.challenge.api.controller"))
            .apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build()
    }
}

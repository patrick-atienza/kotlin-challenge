package net.allm.challenge.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain
import javax.sql.DataSource


@Configuration
@EnableWebSecurity
class SecurityConfig(val dataSource: DataSource) {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {

        http.authorizeHttpRequests().requestMatchers("/h2-console**", "/swagger-ui**").permitAll().anyRequest()
            .authenticated().and()
            .httpBasic()
        http.csrf().disable()
        http.headers().frameOptions().sameOrigin()
        return http.build()
    }

    @Autowired
    fun configureGlobal(
        auth: AuthenticationManagerBuilder
    ) {
        val sqlUserName = "select email, pass, 1 from patients where email = ?"
        val sqlAuthorities = "select email, 'USER' from patients where email = ?"
        auth.jdbcAuthentication()
            .dataSource(dataSource).usersByUsernameQuery(sqlUserName).authoritiesByUsernameQuery(sqlAuthorities)
    }

}

package com.dias.my_spring_app.configuration;

import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Bean;

/**
 * 
 *
 * @Configuration:
 * - Marca esta classe como uma fonte de definições de beans
 * - É processada pelo Spring na inicialização da aplicação
 * - Substitui configurações antigas em XML
 *
 * Normalmente usada para:
 * - Configurar beans manualmente
 * - Integrar bibliotecas de terceiros
 * - Centralizar configurações técnicas (infra)
 */
@Configuration
public class HelloConfiguration {

    /**
     * @Bean:
     * - Indica que o método produz um Bean gerenciado pelo Spring
     * - O retorno do método será registrado no ApplicationContext
     * - O Spring controla o ciclo de vida (singleton por padrão)
     *
     * Quando usar:
     * - Classes que NÃO possuem @Component, @Service, etc
     * - Implementações concretas de interfaces
     * - Bibliotecas de terceiros
     *
     * Nome do bean:
     * - Por padrão, é o nome do método (myService)
     * - Pode ser customizado com @Bean(name = "myService")
     */
    // @Bean
    // public MyService myService() {
    //     return new MyServiceImpl();
    // }

}

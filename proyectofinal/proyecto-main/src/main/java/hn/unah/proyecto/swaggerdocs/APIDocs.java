package hn.unah.proyecto.swaggerdocs;





import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIDocs {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API Rest de Gestión de Préstamos y Clientes")
                .description("API REST diseñada para administrar de manera eficiente la información relacionada con clientes, préstamos y tablas de amortización. Proporciona endpoints para la gestión de clientes, incluyendo su información personal y direcciones asociadas, así como la creación, actualización y consulta de préstamos. Además, incluye funcionalidades para calcular y administrar tablas de amortización, facilitando el control de pagos, saldos pendientes y detalles de cuotas. Esta API está orientada a sistemas financieros o bancarios que requieran un manejo integral de operaciones crediticias.")
                .version("1.0.0")
                );
    }
}
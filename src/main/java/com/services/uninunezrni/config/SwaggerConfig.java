package com.services.uninunezrni.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "API RNI - Uninúñez",
                version = "1.0.0",
                description = "Documentación de módulos de la Plataforma Web RNI\n\n" +
                        "Contactos:\n" +
                        "- Anthony Mestra: amestrar21@gmail.com / amestrar21@curnvirtual.edu.co, [LinkedIn](https://www.linkedin.com/in/anthony-mestra-761a68364/)\n" +
                        "- Hailyn Pacheco: hpachecor21@curnvirtual.edu.co, [LinkedIn](https://www.linkedin.com/in/persona2/)\n" +
                        "- Danells Montes: dmontesl21@curnvirtual.edu.co, [LinkedIn](https://www.linkedin.com/in/persona3/)"
        ),
        servers = {
                @Server(
                        description = "DEV SERVER",
                        url = "http://localhost:8080"
                )
                // @Server(
                //     description = "PROD SERVER",
                //     url = "http://localhost:8080"
                // )
        }
)
public class SwaggerConfig {
}

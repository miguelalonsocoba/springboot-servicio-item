# Servicio Items

### Introducción

El microservicio de Items provee listado total de productos y recupera un producto y el precio de esta a partir de la cantidad que se elija.

### Caracteristicas
- Puerto de microservicio: 8002
- Cliente Rest implementados:
    - Feign. Actualmente utilizado.
    - RestTemplate.
- Servidor Eureka: http://localhost:8761/eureka


### Dependencias

- spring-boot-starter-web
- spring-boot-devtools
- lombok
- spring-cloud-starter-openfeign
- spring-cloud-starter-netflix-eureka-client
- spring-cloud-starter-netflix-hystrix
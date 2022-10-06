# cloud-parking
---------------

Desenvolvendo uma API Profissional e Disponibilizando na nuvem: API de controle de um estacionamento de veículos.

Foi utilizado Spring Boot, incluindo boas práticas de desenvolvimento de API's com Spring Security e PostgreSQL, também foram realizados testes e relatórios de cobertura de testes.

## Run database
```
docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 -d postgres:10-alpine
```

## Starting database
```
docker start parking-db
```

## Stoping database
```
docker stop parking-db
```

# Curso de arquitetura Hexagonal com Java

## WIREMOCK
https://wiremock.org/docs/download-and-installation/
https://repo1.maven.org/maven2/org/wiremock/wiremock-standalone/4.0.0-beta.15/wiremock-standalone-4.0.0-beta.15.jar

### Fazer o download do arquivo jar e executar com o comando:
>java -jar wiremock-standalone-4.0.0-beta.15.jar --port 8082
> ou para acesso externo rodando no Azure VM:
> java -jar wiremock-standalone-4.0.0-beta.15.jar --port 8082 --bind-address 0.0.0.0

### Copiar os arquivos JSON da pasta download para a pasta mappings que o wiremock criou
### Digitar Ctrl+C para interromper o serviço do wiremock e inicie ele novamente
### Fazer requisições pelo Postman nos endereços:
>http://localhost:8082/addresses/38400000
>http://localhost:8082/addresses/38400001
Obs.: Isso deve retornar o JSON contido nos arquivos

### Entrar na pasta:
>cd docker-local/
### Subir os serviços do mongodb e do kafka
>docker-compose up

### Verificar se os conteiner subiram e obter o ID do mongodb
>docker ps

### Entrar no mongodb 
>docker exec -it d904d22e7856 /bin/bash
>mongosh -u root -p
Obs.: O password: example
### Listar os bancos de dados
>show dbs
### Entrar no banco de dados
>use hexagonal
### Listar as coleções
>show collections
### Listar os documentos da coleção
>db.customers.find().pretty()
### Limpar a tela
>cls
### Sair do mongo e do conteiner
>exit

### Instalar o pluggin Kafkalytic
### Adicionar o cluster
>localhost:9092

### Rodar o projeto no Teminal
>java -jar build/libs/hexagonal-0.0.1-SNAPSHOT.jar

### Criar variável de ambiente no sistema operacional
export MONGODB_URI="mongodb+srv://<user>:<password>@<cluster_name>.<cluster_id>.mongodb.net/hexagonal?retryWrites=true&w=majority"
./gradlew bootRun
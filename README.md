# AgroCareTech


### Integrantes do Grupo:
- `Alef Gabriel Alves Silva (RM99487)`:Responsável pela integração de recursos de IA na aplicação e desenvolvimento da versão mobile.
- `Danilo Araujo Mendonça (RM99752)`: Responsável pelo desenvolvimento da lógica de banco de dados e aplicação com .NET.
- `Felipe Sieiro Paim dos Santos (RM98249)`: Responsável pelo desenvolvimento do backend em Java e implementação de práticas de DevOps.
- `Leonardo Ferreira Lizier (RM551509)`: Responsável pelo desenvolvimento da versão mobile da aplicação e QA.
- `Rodrigo Gonçalves Teixeira Filho (RM99838)`: Responsável pela implementação de algoritmos de IA e otimização do banco de dados.



## Instruções para Rodar a Aplicação:

1. Clone este repositório em sua máquina local.
2. Certifique-se de ter o JDK, Maven e o Spring instalados em sua máquina.
3. Navegue até o diretório do projeto.
4. Execute o arquivo AgroCareTechApplication.java com o `java run`
5. Acesse a Aplicação na porta  8080 do seu navegador

## Diagramas

### Diagrama de Classe
![Diagrama de Classe](/assets/UML.png)

### Diagrama de Entidade e Relacionamento
![Diagrama de Entidade e Relacionamento](/assets/DER.png)

## Vídeo de Apresentação

Assista ao vídeo de apresentação [aqui](https://exemplo.com/video).

## Endpoints da API

### Agropecuarista
- `GET /agropecuarista`: Retorna todas as agropecuarista.
- `GET /agropecuarista/{id}`: Retorna um agropecuarista específica com o ID fornecido.
- `POST /agropecuarista`: Cria umnovo cadastro para agropecuarista.
- `PUT /agropecuarista/{id}`: Atualiza o perfil do  agropecuarista existente com o ID fornecido.
- `DELETE /agropecuarista/{id}`: Exclui o perfil do agropecuarista existente com o ID fornecido.

### Serviços
- `GET /servico`: Retorna todos os serviços.
- `GET /servico/{id}`: Retorna um serviço específico com o ID fornecido.
- `POST /servico`: Cria um novo serviço.
- `PUT /servico/{id}`: Atualiza um serviço existente com o ID fornecido.
- `DELETE /servico/{id}`: Exclui um serviço existente com o ID fornecido.

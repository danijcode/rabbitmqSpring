# Prova de Conceito DLQ - RabbitMQ

## Descrição
Essa aplicação tem por objetivo demonstrar o funcionamento e viabilidade do cenário em que mensagens são reprocessadas a partir de filas auxiliares, caso ocorra algum erro de processamento no fluxo principal da aplicação.

* Comando para subir o container juntamente com a estrutura da POC `docker-compose up` dentro da pasta src\main\docker


* Representação Gráfica da operação: [Link do Diagrama no Excalidraw](https://excalidraw.com/#json=VbxTiLWZsFkh6G_HtFUFX,Ydjxhap-eSicfKVK99f__A)


![Alt text](Fluxo.png?raw=true "Imagem em anexo")

* Configuração no application.yml

![Alt text](Ampq%20Retry.png)


* Forçando erro de consumo para mensagem cair em DLQ (Em ambos os consumidores)

![Alt text](Forçando%20erro.png)

* Exemplo de payload para enviar na interface do RabbitMq: `{"message":"Mensagem a ser consumida pelo Client Spring!"}`
#### É interessante que a mensagem obdeça esse formato para o caso em que a seja necessario exibir a mensagem no codigo comentado:  ` System.out.println("Reprocessando mensagem:" + message.getMessage()) `



## Referências

[Documentação - Dead Letter Exchanges](https://www.rabbitmq.com/dlx.html)

[RabbitMQ Deadletter Exchanges and Queues setup through the management UI](https://www.youtube.com/watch?v=ovE8NKAwqTI&t=1005s)

[Spring AMQP e RabbitMQ: boas práticas no reprocessamento de mensagens](https://www.youtube.com/watch?v=GgIJWxk_-jM&t=1809s)

[Spring AMQP DOCS](https://docs.spring.io/spring-amqp/reference/html/)

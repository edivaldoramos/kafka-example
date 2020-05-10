##Kafka Demo

###Projeto de demonstração de um producer e um consumer Kafka

Como o projeto é utilizado apenas para fins didáticos, essa primeira versão conta com o producer e o consumer estão no mesmo projeto. 

###Instruções

Execute o comando ```docker-compose up``` no diretório raiz do projeto para inicializar o cluster do kafka.

Após os containers inicializados, basta executar a aplicacao e fazer a requisição para o unico endpoint passando a mensagem de teste.

Exemplo:

```http://localhost:8080/producer/messages?message=Bem vindo ao mundo Kafka```

Output: 

```
c.g.e.producer.MessageProducer: PRODUCER OUTPUT
c.g.e.producer.MessageProducer: Message to be sent: Bem vindo ao mundo Kafka
c.g.e.consumer.MessageConsumer: CONSUMER OUTPUT
c.g.e.consumer.MessageConsumer: key: 8bd34b44-69ed-45ff-b692-40e215880185
c.g.e.consumer.MessageConsumer: Headers: RecordHeaders(headers = [], isReadOnly = false)
c.g.e.consumer.MessageConsumer: Partion: 0
c.g.e.consumer.MessageConsumer: Message: Bem vindo ao mundo Kafka
```

###Próximos passos

Demonstrar uso de partições, group-id, offset.


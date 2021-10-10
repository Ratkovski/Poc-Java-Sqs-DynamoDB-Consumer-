package br.com.academy.ratkovski.demoConsumer.messaging;

import br.com.academy.ratkovski.demoConsumer.domain.Json;
import br.com.academy.ratkovski.demoConsumer.repository.DynamoDbRepository;
import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Log
@Component
@RequiredArgsConstructor
class ConsumidorDeJson {

    private final DynamoDbRepository repository;

    @SqsListener(value = "fila_dados", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    void publicar(final Json json) {
        repository.save(json);
        log.info(String.format("Post %s publicado", json));
    }

}

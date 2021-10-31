package br.com.academy.ratkovski.demoConsumer.messaging.impl;

import br.com.academy.ratkovski.demoConsumer.domain.Json;
import br.com.academy.ratkovski.demoConsumer.messaging.ConsumerSqs;
import br.com.academy.ratkovski.demoConsumer.messaging.ConsumidorJsonSqs;
import br.com.academy.ratkovski.demoConsumer.repository.DynamoDbRepository;
import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ConsumerSqs
@RequiredArgsConstructor
public class ConsumidorJsonSqsImp implements ConsumidorJsonSqs {

    private final DynamoDbRepository repository;

    @SqsListener(value = "fila_dados", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    @Override
    public void consumir(Json json) {
            repository.save(json);
            log.info(String.format("Post %s publicado", json));
        }

    }


package br.com.academy.ratkovski.demoConsumer.messaging;

import br.com.academy.ratkovski.demoConsumer.domain.Json;

@FunctionalInterface
public interface ConsumidorJsonSqs {
    public void consumir(Json json);

}

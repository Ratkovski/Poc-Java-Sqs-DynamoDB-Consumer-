package br.com.academy.ratkovski.demoConsumer.repository;

import br.com.academy.ratkovski.demoConsumer.domain.Json;
import br.com.academy.ratkovski.demoConsumer.mapper.JsonMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DynamoDbRepository {

    private final DynamoDBMapper dynamoDBMapper;

    public void save(final Json json) {
        final JsonEntity jsonEntity = JsonMapper.INSTANCE.mapFrom(json);
        dynamoDBMapper.save(jsonEntity);
    }

}

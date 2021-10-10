package br.com.academy.ratkovski.demoConsumer.mapper;

import br.com.academy.ratkovski.demoConsumer.domain.Json;
import br.com.academy.ratkovski.demoConsumer.repository.JsonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JsonMapper {

    JsonMapper INSTANCE = Mappers.getMapper(JsonMapper.class);

    @Mapping(target = "idD", ignore = true)
    JsonEntity mapFrom(final Json json);

}

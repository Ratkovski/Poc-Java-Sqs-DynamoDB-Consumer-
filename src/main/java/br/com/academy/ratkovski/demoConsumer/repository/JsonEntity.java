package br.com.academy.ratkovski.demoConsumer.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@DynamoDBTable(tableName = "posts")
public class JsonEntity implements Serializable {

    private static final long serialVersionUID = 3222890791151805982L;

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    @EqualsAndHashCode.Include
    private String idD;

    @DynamoDBAttribute
    private String id;

    @DynamoDBAttribute
    private String userId;

    @DynamoDBAttribute
    private String title;

    @DynamoDBAttribute
    private String body;

}

package br.com.academy.ratkovski.demoConsumer.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class Json implements Serializable {

    private static final long serialVersionUID = 7833604624484844109L;

    private String userId;
    private String id;
    private String title;
    private String body;

}

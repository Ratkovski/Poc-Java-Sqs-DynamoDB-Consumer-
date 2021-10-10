package br.com.academy.ratkovski.demoConsumer.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Json implements Serializable {

    private static final long serialVersionUID = 7833604624484844109L;

    private String userId;
    private String id;
    private String title;
    private String body;

}

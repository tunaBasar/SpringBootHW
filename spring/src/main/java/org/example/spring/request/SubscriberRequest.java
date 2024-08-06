package org.example.spring.request;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Date;

public record SubscriberRequest(
        String subscName,
        String subscSurname,
        String msisdn,
        Long tariffId

) {

}

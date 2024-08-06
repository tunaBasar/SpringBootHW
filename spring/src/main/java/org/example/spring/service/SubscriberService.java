package org.example.spring.service;

import org.example.spring.model.Subscriber;
import org.example.spring.repository.SubscriberRepository;
import org.example.spring.request.SubscriberRequest;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SubscriberService {
    private final SubscriberRepository subscriberRepository;
    private static final AtomicInteger idGenerator = new AtomicInteger(0);

    public SubscriberService(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    public Subscriber create(SubscriberRequest subscriberRequest){
        Subscriber subscriber = Subscriber.builder()
                .subscId(idGenerator.incrementAndGet())
                .tariffId(subscriberRequest.tariffId())
                .startDate(new Date())
                .subscName(subscriberRequest.subscName())
                .subscSurname(subscriberRequest.subscSurname())
                .msisdn(subscriberRequest.msisdn())
                .build();

        return subscriberRepository.save(subscriber);
    }
}

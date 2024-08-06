package org.example.spring.controller;

import org.example.spring.repository.SubscriberRepository;
import org.example.spring.model.Subscriber;

import org.example.spring.request.SubscriberRequest;
import org.example.spring.service.SubscriberService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubscriberController {

    private final SubscriberService subscriberService;

    public SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @PostMapping("/subscribers")
    public ResponseEntity<Subscriber> saveSubscriber(@RequestBody SubscriberRequest subscriberRequest) {
        System.out.println(subscriberRequest);
        return ResponseEntity.ok(subscriberService.create(subscriberRequest));

    }
}


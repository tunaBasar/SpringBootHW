package org.example.spring.repository;
import org.example.spring.model.Subscriber;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
}


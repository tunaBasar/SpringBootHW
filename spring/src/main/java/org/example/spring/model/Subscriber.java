package org.example.spring.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "SUBSCRIBER")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subscriber {
    @Id
    private Integer subscId;

    private String subscName;
    private String subscSurname;
    private String msisdn;
    private Long tariffId;
    private Date startDate;


}

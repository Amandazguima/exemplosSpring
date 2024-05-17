package exemplo.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String street;
    @Column
    private Integer number;
    @Column
    private String district;
    @Column
    private String city;
    @Column
    private String zipCode;

    @Column
    private Integer customerId;

    @OneToOne
    @JoinColumn(name = "customerId",insertable = false, updatable = false)
    @JsonIgnore
    private Customer customer;
}

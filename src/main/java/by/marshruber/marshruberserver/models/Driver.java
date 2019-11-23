package by.marshruber.marshruberserver.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "driver")
@ToString(callSuper = true, exclude = "routeId")
@NoArgsConstructor
@AllArgsConstructor
public class Driver{
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "name")
    private String name;

    @Getter
    @Setter
    @Column(name = "phone")
    private Long phone;

    @Getter
    @Setter
    @Column(name = "route_id")
    private Long routeId;

    @Getter
    @Setter
    @Column(name = "car_number")
    private String carNumber;
}

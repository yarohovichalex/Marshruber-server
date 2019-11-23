package by.marshruber.marshruberserver.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "rider")
@ToString(callSuper = true, exclude = "routeId")
@NoArgsConstructor
@AllArgsConstructor
public class Rider{
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
}

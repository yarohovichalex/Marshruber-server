package by.marshruber.marshruberserver.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "route")
@NoArgsConstructor
@AllArgsConstructor
public class Route{
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "name")
    private String name;
}

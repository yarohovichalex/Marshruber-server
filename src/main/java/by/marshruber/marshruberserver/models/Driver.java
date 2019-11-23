package by.marshruber.marshruberserver.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "driver")
@ToString(callSuper = true, exclude = "routeId")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Driver{
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "route_id")
    private Long routeId;

    @Column(name = "car_number")
    private String carNumber;
}

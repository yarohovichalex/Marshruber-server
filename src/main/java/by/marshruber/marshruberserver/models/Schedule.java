package by.marshruber.marshruberserver.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "shedule")
public class Schedule {
    private Long id;

    private Long idMiniBus;

    private Long idBusStop;

    private Time time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMiniBus() {
        return idMiniBus;
    }

    public void setIdMiniBus(Long idMiniBus) {
        this.idMiniBus = idMiniBus;
    }

    public Long getIdBusStop() {
        return idBusStop;
    }

    public void setIdBusStop(Long idBusStop) {
        this.idBusStop = idBusStop;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}

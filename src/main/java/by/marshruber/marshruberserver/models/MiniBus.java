package by.marshruber.marshruberserver.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "subscriptions")
public class MiniBus {

    Long id;

    String color;

    String IdentificationNumber;


}

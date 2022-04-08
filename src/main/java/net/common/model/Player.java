package net.common.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name= "net.common.model.Player")
public class Player {
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String LastName;
    private String FirstName;
    private char Gender;
    private Double Height;
    private Double Weight;
    private String ShirtNumber;
    private String Email;
    private char CountryCode;
    private Integer TeamId;
}

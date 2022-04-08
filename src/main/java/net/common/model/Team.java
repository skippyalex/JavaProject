package net.common.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="net.common.model.Team")
public class Team {
    @Id
    private Integer Id;
    private String Name;
    private String Abbr;
    private String Logo;
}

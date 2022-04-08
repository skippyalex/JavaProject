package net.common.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="net.common.model.PositionName")

public class PositionName {
    @Id
    private Integer Id;
    private String Name;
}

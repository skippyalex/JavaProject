package net.common.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="net.common.model.PositionOfPlayer")
public class PositionOfPlayer {
    @Id
    private Integer PositionId;
    @Id
    private Integer PlayerId;
}

package com.galvanize.ThanksGivingProject.RoomtoRoom.Model;

import javax.persistence.*;

@Entity(name = "ROOMS")
public class RoomToRoom {

    public RoomToRoom(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String roomName;

    @Column
    private String description;

    @Column
    private int exits[];


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getExits() {
        return exits;
    }

    public void setExits(int[] exits) {
        this.exits = exits;
    }

    public RoomToRoom(Long id, String roomName, String description, int exits[]){
        this.id = id;
        this.roomName = roomName;
        this.description = description;
        this.exits = exits;
    }




}

package com.example.HotelManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="type")
    private String type;
    @Column(name="roomNum")
    private long roomNum;

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public long getRoomNum() {
        return roomNum;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRoomNum(long roomNum) {
        this.roomNum = roomNum;
    }
}

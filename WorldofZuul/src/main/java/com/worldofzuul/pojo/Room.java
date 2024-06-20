package com.worldofzuul.pojo;

import java.util.HashMap;
import java.util.Set;

public class Room
{
    private String description;       //房间描述（名称）
    private HashMap<String, Room> exits;        // 房间包含的出口

    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }

    //设置出口
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    public String getShortDescription()
    {
        return description;
    }

    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}



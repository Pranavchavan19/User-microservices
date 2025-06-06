//package com.lcwd.user.service.entities;
//
//
//
//public class Hotel {
//    private String id;
//    private String name;
//    private String location;
//    private String about;
//}


package com.lcwd.user.service.entities;

public class Hotel {
    private String id;
    private String name;
    private String location;
    private String about;

    // No-args constructor
    public Hotel() {
    }

    // All-args constructor
    public Hotel(String id, String name, String location, String about) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.about = about;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}

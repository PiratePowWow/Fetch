package com.theironyard;

/**
 * Created by PiratePowWow on 3/3/16.
 */
public class Request {
    private int id;
    private int userId;
    private int driverId;
    private String request;
    private String status;

    public Request(int id, int userId, int driverId, String request, String status) {
        this.id = id;
        this.userId = userId;
        this.driverId = driverId;
        this.request = request;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

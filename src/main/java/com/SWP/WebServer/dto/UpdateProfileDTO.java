package com.SWP.WebServer.dto;

public class UpdateProfileDTO {
    private String puser_name;

    public UpdateProfileDTO() {
    }

    public UpdateProfileDTO(String puser_name) {
        this.puser_name = puser_name;
    }

    public String getPuser_name() {
        return puser_name;
    }

    public void setPuser_name(String puser_name) {
        this.puser_name = puser_name;
    }
}

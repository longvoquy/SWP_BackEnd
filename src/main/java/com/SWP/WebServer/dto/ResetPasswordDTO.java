package com.SWP.WebServer.dto;

public class ResetPasswordDTO {
    private String email;

    public ResetPasswordDTO() {
    }

    public ResetPasswordDTO(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
}

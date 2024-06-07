package com.SWP.WebServer.dto;

import java.util.Date;

public class UpdateInfoDTO {
    private String phone;
    private boolean gender;
    private Date dob;

    public UpdateInfoDTO() {
    }

    public UpdateInfoDTO(String phone, boolean gender, Date dob) {
        this.phone = phone;
        this.gender = gender;
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}

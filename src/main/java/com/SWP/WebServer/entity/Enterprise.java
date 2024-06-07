package com.SWP.WebServer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String sid;
    private String avatar_url;
    private String enterprise_name;
    private String email;
    private String password;
    private String phone;
    private String location;
    private String en_position;
    private String taxcode;
    private int is_verify_email;
    private Date created_at;
    private Date updated_at;
    private String role;

    public Enterprise(String enterprise_name, String email, String password, String avatar_url, String sid, int is_verify_email) {
        this.enterprise_name = enterprise_name;
        this.email = email;
        this.password = password;
        this.avatar_url = avatar_url;
        this.sid = sid;
        this.is_verify_email = is_verify_email;
        this.role = "enterprise";
        this.created_at = new Date();
        this.updated_at = new Date();
        this.phone= null;
    }

    public Enterprise() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public int getIs_verify_email() {
        return is_verify_email;
    }

    public void setIs_verify_email(int is_verify_email) {
        this.is_verify_email = is_verify_email;
    }

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public String getEn_position() {
        return en_position;
    }

    public void setEn_position(String en_position) {
        this.en_position = en_position;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterprise_name() {
        return enterprise_name;
    }

    public void setEnterprise_name(String enterprise_name) {
        this.enterprise_name = enterprise_name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
}

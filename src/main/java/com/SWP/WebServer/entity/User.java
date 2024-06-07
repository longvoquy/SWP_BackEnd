package com.SWP.WebServer.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "[User]")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sid;
    private String avatar_url;
    private String user_name;
    private String email;
    private String password;
    private String phone;
    private boolean Gender;
    private Date dob;
    private int is_verify_email;
    private Date created_at;
    private Date updated_at;
    private String role;

    public User(String user_name, String email, String password, String avatar_url, String sid, int is_verify_email) {
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.avatar_url = avatar_url;
        this.sid = sid;
        this.is_verify_email = is_verify_email;
        this.role = "user";
        this.created_at = new Date();
        this.updated_at = new Date();
        this.isGender();
        this.phone= null;
        this.dob= null;

    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
        Gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getIs_verify_email() {
        return is_verify_email;
    }

    public void setIs_verify_email(int is_verify_email) {
        this.is_verify_email = is_verify_email;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

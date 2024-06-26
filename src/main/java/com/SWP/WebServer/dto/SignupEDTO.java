package com.SWP.WebServer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignupEDTO {
    private String enterprise_name;
    private String email;
    private String password;
    private String location;
    private String en_position;
    private String taxCode;

}

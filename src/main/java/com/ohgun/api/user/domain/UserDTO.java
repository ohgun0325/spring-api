package com.ohgun.api.user.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {

    private String userId;
    private String survived;
    private String pclass;
    private String name;
    private String gender;
    private String age;
    private String sibSp;
    private String parch;
    private String ticket;
    private String fare;
    private String cabin;
    private String embarked;
}
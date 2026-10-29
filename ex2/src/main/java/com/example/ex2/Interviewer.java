package com.example.ex2;

import com.example.ex2.DTO.InterviewSessionDTO;

public class Interviewer {

    private String id;
    private String fullName;
    private String email;

    public Interviewer(String id, String fullName, String email){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}


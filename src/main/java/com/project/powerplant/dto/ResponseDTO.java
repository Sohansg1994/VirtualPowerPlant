package com.project.powerplant.dto;

import org.springframework.stereotype.Component;

@Component
public class ResponseDTO {

    private String massage;
    private Object content;

    public ResponseDTO(String massage, Object content) {
        this.massage = massage;
        this.content = content;
    }

    protected ResponseDTO(){}



    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}

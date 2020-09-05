package com.java7.eveseliba.dto;

import java.util.Date;
import java.util.List;

public class Response {

    private String result;

    private Date date;

    private String message;

    private String errorType;

    private List<? extends DtoHolder> holderList;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public List<? extends DtoHolder> getHolderList() {
        return holderList;
    }

    public void setHolderList(List<? extends DtoHolder> holderList) {
        this.holderList = holderList;
    }
}

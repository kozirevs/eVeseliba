package com.java7.eveseliba.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ReceiptDTO extends DtoHolder {

    @JsonProperty("receipt_pk")
    private Long receiptPk;

    @NotBlank(message = "please provide content")
    @JsonProperty("content")
    private String content;

    @JsonProperty("is_active")
    private Boolean isActive;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    @JsonProperty("date_from")
    private Date dateFrom;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    @JsonProperty("date_to")
    private Date dateTo;

    @JsonProperty("patient_user_pk")
    private Long patientUserPk;

    @JsonProperty("doctor_user_pk")
    private Long doctorUserPk;

    public Long getReceiptPk() {
        return receiptPk;
    }

    public void setReceiptPk(Long receiptPk) {
        this.receiptPk = receiptPk;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Long getPatientUserPk() {
        return patientUserPk;
    }

    public void setPatientUserPk(Long patientUserPk) {
        this.patientUserPk = patientUserPk;
    }

    public Long getDoctorUserPk() {
        return doctorUserPk;
    }

    public void setDoctorUserPk(Long doctorUserPk) {
        this.doctorUserPk = doctorUserPk;
    }

    @Override
    public String toString() {
        return "ReceiptDTO{" +
                "receiptPk=" + receiptPk +
                ", content='" + content + '\'' +
                ", isActive=" + isActive +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", patientUserPk=" + patientUserPk +
                ", doctorUserPk=" + doctorUserPk +
                '}';
    }
}

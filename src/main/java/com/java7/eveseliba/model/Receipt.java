package com.java7.eveseliba.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "receipt")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receipt_pk")
    private Long receiptPk;

    @Column(name = "content")
    private String content;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "date_from")
    private Date dateFrom;

    @Column(name = "date_to")
    private Date dateTo;

    @Column(name = "patient_user_pk")
    private Long patientUserPk;

    @Column(name = "doctor_user_pk")
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
}

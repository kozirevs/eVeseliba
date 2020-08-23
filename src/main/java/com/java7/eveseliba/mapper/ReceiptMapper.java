package com.java7.eveseliba.mapper;

import com.java7.eveseliba.dto.ReceiptDTO;
import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.model.HomeDoctor;
import com.java7.eveseliba.model.Receipt;
import com.java7.eveseliba.model.User;
import com.java7.eveseliba.model.eenum.UserType;
import org.springframework.stereotype.Component;

@Component
public class ReceiptMapper {

    public Receipt fromDTO(ReceiptDTO receiptDTO) {
        Receipt receipt = new Receipt();

        receipt.setActive(receiptDTO.getActive());
        receipt.setContent(receiptDTO.getContent());
        receipt.setDateFrom(receiptDTO.getDateFrom());
        receipt.setDateTo(receiptDTO.getDateTo());
        receipt.setReceiptPk(receiptDTO.getReceiptPk());
        receipt.setDoctorUserPk(receiptDTO.getDoctorUserPk());
        receipt.setPatientUserPk(receiptDTO.getPatientUserPk());

        return receipt;
    }

    public ReceiptDTO toDTO(Receipt receipt) {
        ReceiptDTO receiptDTO = new ReceiptDTO();

        receiptDTO.setActive(receipt.getActive());
        receiptDTO.setContent(receipt.getContent());
        receiptDTO.setDateFrom(receipt.getDateFrom());
        receiptDTO.setDateTo(receipt.getDateTo());
        receiptDTO.setReceiptPk(receipt.getReceiptPk());
        receiptDTO.setDoctorUserPk(receipt.getDoctorUserPk());
        receiptDTO.setPatientUserPk(receipt.getPatientUserPk());

        return receiptDTO;
    }

}

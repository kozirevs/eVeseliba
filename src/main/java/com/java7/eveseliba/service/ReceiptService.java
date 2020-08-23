package com.java7.eveseliba.service;

import com.java7.eveseliba.dto.ReceiptDTO;
import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.mapper.ReceiptMapper;
import com.java7.eveseliba.model.Receipt;
import com.java7.eveseliba.model.User;
import com.java7.eveseliba.repository.ReceiptRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReceiptService {

    private final ReceiptRepository receiptRepository;
    private final ReceiptMapper receiptMapper;

    public ReceiptService(ReceiptRepository receiptRepository, ReceiptMapper receiptMapper) {
        this.receiptRepository = receiptRepository;
        this.receiptMapper = receiptMapper;
    }

    public ReceiptDTO createReceipt(ReceiptDTO receiptDTO) {
        Receipt receipt = receiptMapper.fromDTO(receiptDTO);
        Receipt createdReceipt = receiptRepository.save(receipt);
        return receiptMapper.toDTO(createdReceipt);
    }

    public List<ReceiptDTO> getReceipts() {
        List<Receipt> receipts = receiptRepository.findAll();
        return receipts.stream().map(receiptMapper::toDTO).collect(Collectors.toList());
    }
}

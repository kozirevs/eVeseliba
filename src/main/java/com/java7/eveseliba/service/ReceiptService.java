package com.java7.eveseliba.service;

import com.java7.eveseliba.dto.ReceiptDTO;
import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.mapper.ReceiptMapper;
import com.java7.eveseliba.model.Receipt;
import com.java7.eveseliba.model.User;
import com.java7.eveseliba.repository.ReceiptRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    public ReceiptDTO getReceiptById(Long id) {
        Optional<Receipt> optionalReceipt = receiptRepository.findById(id);
        Receipt receipt = optionalReceipt.orElseGet(Receipt::new);
        return receiptMapper.toDTO(receipt);
    }

    public List<ReceiptDTO> search(ReceiptDTO receiptDTO) {
        Receipt receipt = receiptMapper.fromDTO(receiptDTO);
        Example<Receipt> receiptExample = Example.of(receipt);
        List<Receipt> receipts = receiptRepository.findAll(receiptExample);
        return receipts.stream().map(receiptMapper::toDTO).collect(Collectors.toList());
    }

    public void closeReceipt(Long id) {
        Receipt receipt = receiptRepository.getOne(id);
        receipt.setActive(false);
        receiptRepository.save(receipt);
    }

}

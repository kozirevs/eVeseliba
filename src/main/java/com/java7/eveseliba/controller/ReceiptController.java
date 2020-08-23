package com.java7.eveseliba.controller;

import com.java7.eveseliba.dto.ReceiptDTO;
import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.service.ReceiptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/rest.Receipt.svc")
public class ReceiptController {

    private final ReceiptService receiptService;

    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @PostMapping("/receipt")
    public ReceiptDTO createReceipt(@Valid @RequestBody ReceiptDTO receiptDTO) {
        return receiptService.createReceipt(receiptDTO);
    }

}

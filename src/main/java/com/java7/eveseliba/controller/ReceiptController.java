package com.java7.eveseliba.controller;

import com.java7.eveseliba.dto.ReceiptDTO;
import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.service.ReceiptService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @GetMapping("/receipt")
    public List<ReceiptDTO> getAllReceipts() {
        return receiptService.getReceipts();
    }

}

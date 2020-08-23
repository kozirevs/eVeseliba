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

    @GetMapping("/receipts")
    public List<ReceiptDTO> getAllReceipts() {
        return receiptService.getReceipts();
    }

    @GetMapping("/receipt/({id})")
    public ReceiptDTO getReceiptById(@PathVariable("id") Long id) {
        return receiptService.getReceiptById(id);
    }

    @PostMapping("/receipt/search")
    public List<ReceiptDTO> search(@RequestBody ReceiptDTO receiptDTO) {
        return receiptService.search(receiptDTO);
    }

    @PutMapping("/receipt/({id})/close")
    public void closeReceipt(@PathVariable("id") Long id) {
        receiptService.closeReceipt(id);
    }

}

package com.java7.eveseliba.service;

import com.java7.eveseliba.model.Log;
import com.java7.eveseliba.repository.LogRepository;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void saveLog(Log log) {
        logRepository.save(log);
    }
}

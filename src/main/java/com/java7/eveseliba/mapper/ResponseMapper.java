package com.java7.eveseliba.mapper;

import com.google.common.collect.ImmutableList;
import com.java7.eveseliba.dto.DtoHolder;
import com.java7.eveseliba.dto.Response;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ResponseMapper {

    public Response mapSuccess(List<? extends DtoHolder> dtoHolders) {
        Response response = new Response();
        response.setHolderList(dtoHolders);
        response.setDate(new Date());
        response.setResult("SUCCESS");
        return response;
    }

    public Response mapSuccess(DtoHolder dtoHolder) {
        Response response = new Response();
        response.setHolderList(ImmutableList.of(dtoHolder));
        response.setDate(new Date());
        response.setResult("SUCCESS");
        return response;
    }

    public Response mapFail(String message, String type) {
        Response response = new Response();
        response.setMessage(message);
        response.setDate(new Date());
        response.setResult("FAIL");
        response.setErrorType(type);
        return response;
    }
}

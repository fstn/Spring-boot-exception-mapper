package com.itesoft.t4html.service.exception;

import org.eclipse.jetty.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RestApiMessageExceptionMapper extends AbstractExceptionMapper       implements
    ExceptionMapper<Exception>
{

@Override
public Response toResponse(Exception e)
{
    RestApiMessage message = new RestApiMessage();
    message.setCode(RestApiMessageCode.INTERNAL_ERROR.getValue());
    message.setType(RestApiMessageLevel.ERROR.name());
    message.setMessage(e.getMessage());
    message.setDetail(e.getStackTrace().toString());
    message.setDone(RestApiMessageDone.FALSE.getValue());

    ResponseEntity re = new ResponseEntity(message,org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
    return this.errorResponse(HttpStatus.INTERNAL_SERVER_ERROR_500, re, e);
}
}
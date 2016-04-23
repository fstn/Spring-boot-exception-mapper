package com.itesoft.t4html.service.exception;

import org.springframework.http.ResponseEntity;

import javax.ws.rs.core.Response;
import java.io.PrintWriter;
import java.io.StringWriter;

public abstract class AbstractExceptionMapper
{
protected Response errorResponse(int status, ResponseEntity responseEntity, Throwable t)
{
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    t.printStackTrace(pw);

    return customizeResponse(status, responseEntity);
}

private Response customizeResponse(int status, ResponseEntity responseEntity)
{
    return Response.status(status).entity(responseEntity).build();
}
}
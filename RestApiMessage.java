package com.itesoft.t4html.service.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "Return")
@XmlAccessorType(XmlAccessType.FIELD)
public class RestApiMessage {

    @XmlElement(name = "CODE")
    protected int code;

    @XmlElement(name = "TYPE")
    protected String type;

    @XmlElement(name = "MESSAGE")
    protected String message;

    @XmlElement(name = "DETAIL")
    protected String detail;

    @XmlElement(name = "DONE")
    protected String done;

    public RestApiMessage() {

    }

    public RestApiMessage(int code, String level, String message, String detail) {
        super();
        this.code = code;
        this.type = type;
        this.message = message;
        this.detail = detail;
        this.done = done;
    }

    public RestApiMessage(int code, String type, String message, String detail, String done) {
        super();
        this.code = code;
        this.type = type;
        this.message = message;
        this.detail = detail;
        this.done = done;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "RestApiMessage{" +
                "code=" + code +
                ", type='" + type + '\'' +
                ", message='" + message + '\'' +
                ", detail='" + detail + '\'' +
                ", done='" + done + '\'' +
                '}';
    }

    /**
     * Utilisé dans les TU
     * @return
     */
    @Deprecated
    public String toXML(){

        return "<Return><TYPE>" + type + "</TYPE><MESSAGE>"+ message + "</MESSAGE><DONE>" + done + "</DONE></Return>";
    }
}

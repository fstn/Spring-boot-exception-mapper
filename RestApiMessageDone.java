package com.itesoft.t4html.service.exception;

/**
 * 
 * @author sza
 *
 */
public enum RestApiMessageDone {

  TRUE("1"), FALSE("0");

  private String code;

  private RestApiMessageDone(String code) {
    this.code = code;
  }

  public String getValue() {
    return code;
  }

}

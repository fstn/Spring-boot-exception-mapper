package com.itesoft.t4html.service.exception;

/**
 * 
 * @author sza
 *
 */
public enum RestApiMessageCode {

  EMPTY_REQUEST(1000), INCOMPLETE_OBJECT(1001), MALFORMED_OBJECT(1002), INTERNAL_ERROR(
      2000), BAD_REQUEST(400), INTERNAL_SERVER_ERROR(500), OK(200);

  private int code;

  private RestApiMessageCode(int level) {
    this.code = level;
  }

  public int getValue() {
    return code;
  }

}

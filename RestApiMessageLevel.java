package com.itesoft.t4html.service.exception;

/**
 * 
 * @author sza
 *
 */
public enum RestApiMessageLevel {
  ERROR("error"), INFO("information"), WARN("warning"), DETAIL("detail"), SUCCESS("S");

  private String level;

  private RestApiMessageLevel(String level) {
    this.level = level;
  }

  public String toString() {
    return level;
  }
}

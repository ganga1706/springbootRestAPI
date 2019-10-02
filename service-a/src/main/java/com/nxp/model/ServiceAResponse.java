package com.nxp.model;

import java.io.Serializable;

public class ServiceAResponse implements Serializable {
  private static final long serialVersionUID = -1428286642961837072L;

  private String requestId;
  private String responseCode;
  private String responseMessage;

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

}

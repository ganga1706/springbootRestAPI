package com.nxp.model;

import java.io.Serializable;

public class ServiceARequest implements Serializable {

  private static final long serialVersionUID = 2633962683262992865L;

  private String cardId;
  private String eventType;
  private String eventCode;

  public String getEventCode() {
	return eventCode;
}

public void setEventCode(String eventCode) {
	this.eventCode = eventCode;
}

public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

}

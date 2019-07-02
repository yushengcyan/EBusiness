package com.EBusiness.dao.bo;

import java.util.Date;

public class UserMessage {
    private Integer messageId;

    private String messagingUserAccount;

    private String messagedUserAccount;

    private Integer messageStatus;

    private Date messageSendTime;

    private String messageContent;

    private String messageExt;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessagingUserAccount() {
        return messagingUserAccount;
    }

    public void setMessagingUserAccount(String messagingUserAccount) {
        this.messagingUserAccount = messagingUserAccount;
    }

    public String getMessagedUserAccount() {
        return messagedUserAccount;
    }

    public void setMessagedUserAccount(String messagedUserAccount) {
        this.messagedUserAccount = messagedUserAccount;
    }

    public Integer getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Integer messageStatus) {
        this.messageStatus = messageStatus;
    }

    public Date getMessageSendTime() {
        return messageSendTime;
    }

    public void setMessageSendTime(Date messageSendTime) {
        this.messageSendTime = messageSendTime;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageExt() {
        return messageExt;
    }

    public void setMessageExt(String messageExt) {
        this.messageExt = messageExt;
    }
}
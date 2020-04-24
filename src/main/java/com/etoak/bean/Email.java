package com.etoak.bean;

import lombok.Data;

@Data
public class Email {
    // 右键主题
    private String subject;
    // 收件人
    private String receiver;
    // 邮件内容
    private String content;
}

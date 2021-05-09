package com.gymzzak.core.domain.privacy;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Embeddable
public class Email {
    
    @Column(name = "email_id")
    private String id;

    @Column(name = "email_domain")
    private String domain;

    protected Email() {}

    public Email(String id, String domain) {
        this.id = id;
        this.domain = domain;
    }

}

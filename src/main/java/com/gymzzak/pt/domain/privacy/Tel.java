package com.gymzzak.pt.domain.privacy;

import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class Tel {

    private String telFirst;
    private String telSecond;
    private String telThird;

    protected Tel() {}

    public Tel(String telFirst, String telSecond, String telThird) {
        this.telFirst = telFirst;
        this.telSecond = telSecond;
        this.telThird = telThird;
    }

}

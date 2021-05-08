package com.gymzzak.pt.domain.privacy;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Embeddable
public class Phone {

    @Column(name = "phone_first")
    private String first;

    @Column(name = "phone_second")
    private String second;

    @Column(name = "phone_third")
    private String third;

    protected Phone() {}

    public Phone(String first, String second, String third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

}

package com.gymzzak.pt.privacy.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Table(name = "GZ_PRIVACY")
@Entity
public class Privacy {

    @Id
    @GeneratedValue
    @Column(name = "privacy_key")
    private Long key;

    @Embedded
    private Address address;

    @Embedded
    private Phone phone;

    @Embedded
    private Tel tel;

    @Embedded
    private Email email;

    @Enumerated(EnumType.STRING)
    private JoinType joinType;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    private String userName;

    private String password;

    private String birthday;

    private String di;

    private String ci;

    private String gender;

    private String kakaoId;

}

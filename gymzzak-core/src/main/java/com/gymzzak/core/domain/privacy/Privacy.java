package com.gymzzak.core.domain.privacy;


import com.gymzzak.core.domain.base.BaseEntity;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Table(name = "GZ_PRIVACY")
@Entity
public class Privacy extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

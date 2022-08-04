package com.example.ISMS_Demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ISMSUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String fullName;

    @Column(nullable = false)
    private int bp_number;

    @Column(nullable = false)
    private String mobileNumber;

    @Column(nullable = false)
    private String profile_image_loc;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "designation_id")
    private Designation designation;

    @Column(nullable = false)
    private Integer roleId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "division_id")
    private Division divisionId;

    @Column(nullable = true)
    private Integer teamId;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false)
    private boolean active;
}

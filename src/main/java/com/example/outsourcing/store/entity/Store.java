package com.example.outsourcing.store.entity;

import com.example.outsourcing.common.entity.BaseEntity;
import com.example.outsourcing.menu.entity.Menu;
import com.example.outsourcing.user.entity.User;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "store")
public class Store extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @Column(nullable = false)
    private String storeName;
    @Column(nullable = false)
    private Integer minPrice;
    @Column(nullable = false)
    private String openTime;
    @Column(nullable = false)
    private String closeTime;
    @Enumerated(EnumType.STRING)
    private State state;
    /*@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Menu> menuList = new ArrayList<>();*/
}

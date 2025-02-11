package com.example.cooperative.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ListIndexJavaType;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "banque", schema = "cooperativedb")
public class Banque {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Getter
    @Column(name = "typebanque")
    private String typebanque;

    public String getTypebanque() {
        return typebanque;
    }

    public void setTypebanque(String typebanque) {
        this.typebanque = typebanque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}


package com.my.exam.demo.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "User_data")
@Data
public class User {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="name")
    private String name;

    // Entity는 만들어졌을 때 안에 들어있는 값이 없습니다
    // Entity를 호출하여 값을 저장하여 사용할 거기 때문에 따로 메소드를 만들어 사용하려고
    // 만들어두었습니다
    public void update_user(String id,String password, String email, String name){
        this.id = id;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public void delete_user(String id){
        this.id = id;
    }
}
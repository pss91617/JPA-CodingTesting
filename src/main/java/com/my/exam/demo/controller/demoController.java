package com.my.exam.demo.controller;


import com.my.exam.demo.dao.User;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @Autowired
    //CRUD를 사용하기 위해서 interface를 지정해둔 UserRepository를 가져와줍니다.
    UserRepository userRepository;

    @PostMapping("/Updateuser")

    public String createUser(@RequestBody JSONObject body){
        User user = new User();
        user.update_user((String) body.get("id"),(String) body.get("password"),(String) body.get("email"),(String) body.get("name"));

        userRepository.save(user);
        return "유저 생성됨" + body.get("id");
    }
    @PostMapping("/deleteUser")
    public String deleteUser(@RequestBody JSONObject body){
        User user = new User();
        user.update_user((String) body.get("id"),(String) body.get("password"),(String) body.get("email"),(String) body.get("name"));

        userRepository.save(user);
        return "유저 ban";
    }


}
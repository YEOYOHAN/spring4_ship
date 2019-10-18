package com.ship.web.controllers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ship.web.domains.UserDTO;
import com.ship.web.serviceimpls.UserServiceImpl;

@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody UserDTO user){
		logger.info("ajax가 보낸 아이디 와 비번 {} ", user.getuId()+", "+user.getuPw());
		HashMap<String, String> map = new HashMap<>();
		map.put("uId", user.getuId());
		map.put("uPw", user.getuPw());
		logger.info("map에 담김 아이디와비번 {}", map.get("uId")+" ,"+map.get("uPw"));
		return map;
	}
	@PostMapping("/login")
	public @ResponseBody Map<?,?> login(@RequestBody UserDTO user){
		logger.info("로그인에서 넘어온 값 {} ", user.getuId()+", "+user.getuPw());
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("uId", user.getuId());
		map2.put("uPw", user.getuPw());
		logger.info("로그인에서 받아온 값 {} ", map2.get("uId")+", "+map2.get("uPw"));
		return map2;
	}
}

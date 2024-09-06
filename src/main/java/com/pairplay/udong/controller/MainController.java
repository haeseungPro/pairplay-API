package com.pairplay.udong.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pairplay.udong.entity.MemberEntity;
import com.pairplay.udong.service.MemberService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/main")
	public String getMethodName() {
		
		Optional<MemberEntity> member = memberService.findMemeber(1L);
		
		System.out.println(member.get().getName());
		
		String memberId = member.get().getName();
		
		return "##유저 이름 가져오기 테스트## 유저 이름 : " +  memberId;
	}
	
}

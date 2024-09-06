package com.pairplay.udong.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pairplay.udong.entity.MemberEntity;
import com.pairplay.udong.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memRepository;
	
	public Optional<MemberEntity> findMemeber(Long id) {
		
		Optional<MemberEntity> member = memRepository.findById(id);
		
		return member;
		
		
	}
	
}

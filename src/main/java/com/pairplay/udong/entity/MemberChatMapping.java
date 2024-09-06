package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="t_member_chat_mapping")
@Data
public class MemberChatMapping extends WorkSpace {
	
	@Column(name="chat_id")
	private String chatId;
	
	@Column(name="member_id")
	private String memberId;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
}

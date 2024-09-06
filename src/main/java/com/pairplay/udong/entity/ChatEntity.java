package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="t_chat")
@Entity
@Data
public class ChatEntity extends WorkSpace{
	
	
	@Column(name= "chat_nm")
	private String chatNm;
	
	@Column(name="chat_bak")
	private String chatBak;
	
	@Column(name="host")
	private String host;
	
	@Column(name="field2")
	private String field2;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
}

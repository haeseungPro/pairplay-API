package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="t_phone_auth")
public class PhoneAuthEntity extends WorkSpace {
	
	@Column(name="auth_no")
	private String authNo;
	
	@Column(name="auth_yn")
	private String authYn;
	
	@Column(name="auth_time")
	private String authTime;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
}

package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="t_member")
@Entity
@Getter
@NoArgsConstructor
public class MemberEntity extends WorkSpace {
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone_no")
	private String phoneNo;
	
	@Column(name = "birth_date")
	private String birthDate;
	
	@Column(name = "ci")
	private String ci;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
	

}

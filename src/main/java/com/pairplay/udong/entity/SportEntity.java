package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="t_sport")
public class SportEntity extends WorkSpace {
	
	@Column(name="sport_nm")
	private String sportNm;
	
	@Column(name="sprot_code")
	private String sportCode;
	
	@Column(name="field2")
	private String field2;
	
	@Column(name="field3")
	private String field3;
	
	@Column(name="field4")
	private String field4;
	
	@Column(name="field5")
	private String field5;
	
	@Column(name="field6")
	private String field6;
	
	@Column(name="field7")
	private String field7;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;

}

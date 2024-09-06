package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="t_sport_board")
public class SportBoardEntity extends WorkSpace{
	
	@Column(name="member_id")
	private String memberId;
	
	@Column(name="catch_place_id")
	private String matchPlaceId;
	
	@Column(name="sport_id")
	private String sportId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="contents")
	private String contents;
	
	@Column(name="field")
	private String field;
	
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
	
	@Column(name="favor")
	private String favor;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
	

}

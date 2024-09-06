package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="t_member_sport_mapping")
@Entity
public class MemberSportMapping extends WorkSpace {
	
	@Column(name="member_id")
	private String memberId;
	
	@Column(name="sport_id")
	private String sportId;
	
	@Column(name="priority")
	private int priority;
	
	@Column(name="months")
	private int months;
	
	@Column(name="match_cnt")
	private int matchCnt;
	
	@Column(name="avg_point")
	private int avgPoint;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;

}

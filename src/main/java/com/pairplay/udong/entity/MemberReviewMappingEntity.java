package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="t_member_review_mapping")
public class MemberReviewMappingEntity extends WorkSpace {
	
	@Column(name="review_id")
	private String reviewId;
	
	@Column(name="member_id")
	private String memberId;
	
	@Column(name="manner_point")
	private String mannerPoint;
	
	@Column(name="skill_point")
	private String skillPoint;
	
	@Column(name="opnion")
	private String opnion;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
}

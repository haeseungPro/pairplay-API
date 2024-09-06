package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="t_review")
public class ReviewEntity extends WorkSpace {

	@Column(name="fid")
	private String fid;
	
	@Column(name="review_type")
	private String reviewType;
	
	@Column(name="grade")
	private String grade;
	
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

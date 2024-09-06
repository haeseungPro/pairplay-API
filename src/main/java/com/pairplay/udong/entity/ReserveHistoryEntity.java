package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="t_reserve_history")
public class ReserveHistoryEntity extends WorkSpace {
	
	@Column(name="member_id")
	private String memberId;
	
	@Column(name="type")
	private String type;
	
	@Column(name="fid")
	private String fid;
	
	@Column(name="field3")
	private String field3;
	
	@Column(name="field4")
	private String field4;
	
	@Column(name="status")
	private String status;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
}

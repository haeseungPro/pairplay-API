package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="t_board")
@Entity
@Data
public class BoardEntity extends WorkSpace {
	
	
	@Column(name="type")
	private String type;
	
	@Column(name="title")
	private String title;
	
	@Column(name="contents")
	private String contents;

	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
	
}

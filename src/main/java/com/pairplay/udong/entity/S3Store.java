package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="t_s3_store")
public class S3Store extends WorkSpace {
	
	@Column(name="pid")
	private String pid;
	
	@Column(name="type")
	private String type;
	
	@Column(name="url")
	private String url;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
}

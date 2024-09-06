package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="t_comment")
public class CommentEntity extends WorkSpace {

	@Column(name="fid")
	private String fid;
	
	@Column(name="board_code")
	private String boardCode;
	
	@Column(name="contents")
	private String contents;
	
	@Column(name="good")
	private String good;
	
	@Column(name="bad")
	private String bad;
	
	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
	
	
}

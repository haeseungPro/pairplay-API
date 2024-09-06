package com.pairplay.udong.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="t_match_place")
public class MatchplaceEntity extends WorkSpace {

	@Column(name="match_place_name")
	private String matchPlaceName;
	
	@Column(name="sport_code1")
	private String sportCode1;
	
	@Column(name="sport_code2")
	private String sportCode2;
	
	@Column(name="description")
	private String description;
	
	@Column(name="address_1")
	private String address1;
	
	@Column(name="address_2")
	private String address2;
	
	@Column(name="address_3")
	private String address3;

	@Column(name = "create_dt")
	private LocalDateTime createDt;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
	
	@Column(name = "update_by")
	private String updateBy;
	
}

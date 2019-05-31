package com.chavesummer.helper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "state")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateEntity {

	@Id
    @Column(name = "id_state", unique = true, nullable = false, precision = 10, scale = 0)
    private Integer idState;
	
	@Column(name = "uf", length = 2)
	private String uf;
}

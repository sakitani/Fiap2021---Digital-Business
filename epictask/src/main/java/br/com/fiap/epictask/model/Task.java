package br.com.fiap.epictask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="TASK")
@SequenceGenerator(name="task", sequenceName = "SQ_TASK", allocationSize = 1)
public class Task {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task")
	private long id;
	
	@NotBlank
	private String title;
	
	@Size(min = 10)
	private String description;
	
	@Min(10)
	private int points;	

}

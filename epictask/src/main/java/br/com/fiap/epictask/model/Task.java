package br.com.fiap.epictask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
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
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O título é obrigatório. Digite um título")
	private String title;
	
	@Size(min = 10, message = "A descrição deve ter pelo menos 15 caracteres")
	private String description;
	
	@Min(value = 10, message = "A pontuação mínima é 10")
	@Max(value = 500, message = "A pontuação máxima é 500")
	private int points;	

}

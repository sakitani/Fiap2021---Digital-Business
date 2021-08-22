package br.com.fiap.epictask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.epictask.model.Task;
import java.lang.String;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
	public List<Task> findByTitleAndDescription(String title);

}

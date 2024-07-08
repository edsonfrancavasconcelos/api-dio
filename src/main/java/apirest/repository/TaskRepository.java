package apirest.repository;

import apirest.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Métodos adicionais, se necessário
}

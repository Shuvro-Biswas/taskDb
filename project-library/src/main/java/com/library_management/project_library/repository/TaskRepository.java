package com.library_management.project_library.repository;
import com.library_management.project_library.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>{
}

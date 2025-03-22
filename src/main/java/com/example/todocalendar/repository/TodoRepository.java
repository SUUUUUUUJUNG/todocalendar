package com.example.todocalendar.repository;

import com.example.todocalendar.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByCompleted(boolean completed);
    List<Todo> findByDueDate(LocalDate dueDate);
}

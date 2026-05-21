package app.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import app.todo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Modifying
    @Query(value = "UPDATE todo SET completed = ?2 WHERE id = ?1", nativeQuery = true)
    void updateCompleted(Long id, boolean completed);

}

package app.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.todo.model.Todo;
import app.todo.repository.TodoRepository;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Todo create(Todo todo) {
        return repository.save(todo);
    }

    // READ ALL
    public List<Todo> findAll() {
        return repository.findAll();
    }

    // READ ONE
    public Todo findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found with id " + id));
    }

    // UPDATE
    public Todo update(Long id, Todo updated) {
        Todo existing = findById(id);

        existing.setText(updated.getText());
        existing.setCompleted(updated.isCompleted());

        return repository.save(existing);
    }

    // UPDATE COMPLETED ONLY (native query)
    @Transactional
    public void updateCompleted(Long id, boolean completed) {
        repository.updateCompleted(id, completed);
    }

    // DELETE
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Todo not found with id " + id);
        }
        repository.deleteById(id);
    }
}

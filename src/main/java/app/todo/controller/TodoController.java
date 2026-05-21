package app.todo.controller;

import app.todo.model.Todo;
import app.todo.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todos")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<Todo> create(@RequestBody Todo todo) {
        Todo created = service.create(todo);
        return ResponseEntity.ok(created);
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<Todo>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    // READ ONE
    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id) {
        Todo todo = service.findById(id);
        return ResponseEntity.ok(todo);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
        Todo updated = service.update(id, todo);
        return ResponseEntity.ok(updated);
    }

    // UPDATE COMPLETED ONLY
    @PatchMapping("/{id}/completed")
    public ResponseEntity<Void> updateCompleted(@PathVariable Long id, @RequestBody boolean completed) {
        service.updateCompleted(id, completed);
        return ResponseEntity.noContent().build();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

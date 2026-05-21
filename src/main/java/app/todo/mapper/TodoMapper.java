package app.todo.mapper;

import app.todo.dto.TodoRequest;
import app.todo.dto.TodoResponse;
import app.todo.model.Todo;

public class TodoMapper {

    public static Todo toEntity(TodoRequest dto) {
        Todo todo = new Todo();
        todo.setText(dto.text());
        todo.setCompleted(dto.completed());
        return todo;
    }

    public static TodoResponse toDto(Todo entity) {
        return new TodoResponse(
                entity.getId(),
                entity.getText(),
                entity.isCompleted()
        );
    }
}

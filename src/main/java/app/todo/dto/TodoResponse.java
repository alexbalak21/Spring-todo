package app.todo.dto;

public record TodoResponse (
        Long id,
        String text,
        boolean completed
) {}

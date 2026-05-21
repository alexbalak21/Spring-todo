package app.todo.dto;

public record TodoRequest(
        String text,
        boolean completed
) {}
    
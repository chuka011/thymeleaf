package net.chuka011.thymeleaf.model;

public record User(
        String name,
        String email,
        String role,
        String gender
) {
}

package api.forum.hub.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record CadastroTopicoRequest(
        @NotBlank(message = "title is required")
        String titulo,
        @NotBlank(message = "message is required")
        String mensagem,
        @NotBlank(message = "author is required")
        String autor,
        @NotBlank(message = "course is required")
        String curso
) {
}

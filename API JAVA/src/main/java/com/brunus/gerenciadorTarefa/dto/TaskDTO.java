package com.brunus.gerenciadorTarefa.dto;

import javax.annotation.processing.Generated;
import java.util.UUID;

public class TaskDTO {
    private Long id;
    private String titulo;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.leonardo.listatarefasapi.dto;

import com.leonardo.listatarefasapi.entities.Tarefa;

public class TarefaDTO {

    private Long id;
    private String description;
    private Boolean status;

    public TarefaDTO() {}

    public TarefaDTO(Long id, String description, Boolean status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public TarefaDTO(Tarefa entity) {
        id = entity.getId();
        description = entity.getDescription();
        status = entity.getStatus();
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getStatus() {
        return status;
    }
}

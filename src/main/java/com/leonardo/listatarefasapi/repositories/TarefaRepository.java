package com.leonardo.listatarefasapi.repositories;

import com.leonardo.listatarefasapi.entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}

package com.leonardo.listatarefasapi.servicies;

import com.leonardo.listatarefasapi.dto.TarefaDTO;
import com.leonardo.listatarefasapi.entities.Tarefa;
import com.leonardo.listatarefasapi.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    @Autowired
    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public TarefaDTO findById(Long id) {
        Tarefa tarefa = repository.findById(id).get();
        return new TarefaDTO(tarefa);
    }

    @Transactional(readOnly = true)
    public Page<TarefaDTO> findAll(Pageable pageable) {
        Page<Tarefa> result = repository.findAll(pageable);
        return result.map(TarefaDTO::new);
    }

    @Transactional
    public TarefaDTO insert(TarefaDTO dto) {
        Tarefa tarefa = new Tarefa();
        dtoToEntity(tarefa, dto);
        tarefa = repository.save(tarefa);
        return new TarefaDTO(tarefa);
    }

    @Transactional
    public TarefaDTO update(Long id, TarefaDTO dto) {
        Tarefa tarefa = repository.getReferenceById(id);
        dtoToEntity(tarefa, dto);
        tarefa = repository.save(tarefa);
        return new TarefaDTO(tarefa);
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private void dtoToEntity(Tarefa entity, TarefaDTO dto) {
        entity.setDescription(dto.getDescription());
        entity.setStatus(dto.getStatus());
    }
}

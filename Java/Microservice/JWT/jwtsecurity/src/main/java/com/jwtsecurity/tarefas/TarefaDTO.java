package com.jwtsecurity.tarefas;

import com.jwtsecurity.model.Tarefa;

class TarefaDTO {

    private Integer id;
    private String descricao;

    TarefaDTO(Tarefa entidade) {
        this.id = entidade.getId();
        this.descricao = entidade.getDescricao();
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}

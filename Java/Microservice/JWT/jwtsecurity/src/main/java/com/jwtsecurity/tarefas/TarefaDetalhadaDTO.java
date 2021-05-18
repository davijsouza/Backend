package com.jwtsecurity.tarefas;



import java.time.LocalDateTime;

import com.jwtsecurity.model.Tarefa;

class TarefaDetalhadaDTO {

    private String descricao;
    private LocalDateTime criadaEm;

    TarefaDetalhadaDTO(Tarefa entidade) {
        this.descricao = entidade.getDescricao();
        this.criadaEm = entidade.getCriadaEm();
    }

    public String getDescricao() {
        return descricao;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getCriadaEm() {
        return criadaEm;
    }

    void setCriadaEm(LocalDateTime criadaEm) {
        this.criadaEm = criadaEm;
    }
}

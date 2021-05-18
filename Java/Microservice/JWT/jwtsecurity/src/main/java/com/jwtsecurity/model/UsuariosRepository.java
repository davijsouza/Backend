package com.jwtsecurity.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuariosRepository extends CrudRepository<Usuario, Integer> {

    Optional<Usuario> findByLogin(String login);

}

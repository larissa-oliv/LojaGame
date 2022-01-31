package com.lojagame.lojagame.repository;

import com.lojagame.lojagame.Model.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByUsuario(String usuario);
}

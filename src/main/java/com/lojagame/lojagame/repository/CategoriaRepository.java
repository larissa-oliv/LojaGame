package com.lojagame.lojagame.repository;

import com.lojagame.lojagame.Model.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}

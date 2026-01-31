package com.nf.repository;

import com.nf.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface NotaRepository extends JpaRepository<Nota, Long> {


    Nota findByNota(String nota);


    List<Nota> findByUsuarioAndDataFaturamentoBetween(
            String usuario,
            LocalDate inicio,
            LocalDate fim
    );
}

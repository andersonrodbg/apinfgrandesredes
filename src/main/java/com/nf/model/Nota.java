package com.nf.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "notas")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nota;
    private String usuario;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataFaturamento;

    private int volumes;

    public Nota() {}

    public Long getId() { return id; }

    public String getNota() { return nota; }
    public void setNota(String nota) { this.nota = nota; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public LocalDate getDataFaturamento() { return dataFaturamento; }
    public void setDataFaturamento(LocalDate dataFaturamento) { this.dataFaturamento = dataFaturamento; }

    public int getVolumes() { return volumes; }
    public void setVolumes(int volumes) { this.volumes = volumes; }
}

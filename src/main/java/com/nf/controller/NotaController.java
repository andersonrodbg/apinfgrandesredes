package com.nf.controller;

import com.nf.model.Nota;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class NotaController {

    @PostMapping("/registrar")
    public Map<String, Object> registrar(@RequestBody Nota nota) {
        Map<String, Object> resp = new HashMap<>();
        resp.put("status", "ok");
        resp.put("notaRecebida", nota.getNota());
        resp.put("usuario", nota.getUsuario());
        resp.put("dataFaturamento", nota.getDataFaturamento());
        resp.put("volumes", nota.getVolumes());
        return resp;
    }

    @GetMapping("/teste")
    public String teste() {
        return "API funcionando 🚀";
    }
}

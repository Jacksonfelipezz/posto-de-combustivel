package com.jackson.posto_de_combustivel.controller;

import com.jackson.posto_de_combustivel.infrastructure.entities.TiposDeCombustivel;
import com.jackson.posto_de_combustivel.service.TiposDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tiposDeCombustivel")
public class TiposDeCombustivelController {

    public final TiposDeCombustivelService tiposDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody TiposDeCombustivel tiposDeCombustivel){
        tiposDeCombustivelService.criar(tiposDeCombustivel);
        return  ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<TiposDeCombustivel>> buscarTiposDeCombustivel(){
        return ResponseEntity.ok(tiposDeCombustivelService.buscarTiposDeCombustivel());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TiposDeCombustivel> buscarTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(tiposDeCombustivelService.buscarTiposCombustivelPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        tiposDeCombustivelService.deletarTipoDeCombustivel(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarTipoDeCombustivel(@RequestParam(name = "id") Integer id,
                                                             @RequestBody TiposDeCombustivel tiposDeCombustivel){
        tiposDeCombustivelService.alteraTipoDeCombustivel(id, tiposDeCombustivel);
        return  ResponseEntity.ok().build();
    }
}

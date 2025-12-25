package com.jackson.posto_de_combustivel.controller;

import com.jackson.posto_de_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.jackson.posto_de_combustivel.service.BombaDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bombasDeCombustivel")
public class BombasDeCombustivelController {

    public final BombaDeCombustivelService bombaDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.criar(bombasDeCombustivel);
        return  ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<BombasDeCombustivel>> buscarTiposBombasDeCombustivel(){
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombasDeCombustivel());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BombasDeCombustivel> buscarBombasDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombaCombustivelPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarBombasDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        bombaDeCombustivelService.deletarBombaCombustivel(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarBombaDeCombustivel(@RequestParam(name = "id") Integer id,
                                                             @RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.alteraBombaCombustivel(id, bombasDeCombustivel);
        return  ResponseEntity.ok().build();
    }
}

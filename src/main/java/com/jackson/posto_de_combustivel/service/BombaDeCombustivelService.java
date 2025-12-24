package com.jackson.posto_de_combustivel.service;

import com.jackson.posto_de_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.jackson.posto_de_combustivel.infrastructure.entities.TiposDeCombustivel;
import com.jackson.posto_de_combustivel.infrastructure.repository.BombaDeCombustivelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BombaDeCombustivelService {

    private  final BombaDeCombustivelRepository bombaDeCombustivelRepository;

    public void criar(BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }

    public BombasDeCombustivel buscarBombaCombustivelPorId(Integer id){
        return bombaDeCombustivelRepository.findById(id).orElseThrow(()->
                new NullPointerException("Bomba de combustível não encontrada pelo id" + id));
    }
    public List<BombasDeCombustivel> buscarBombasDeCombustivel(){return bombaDeCombustivelRepository.findAll();}


    @Transactional
    public void deletarBombaCombustivel(Integer id){
        bombaDeCombustivelRepository.deleteById(id);
    }

    public void alteraBombaCombustivel(Integer id, BombasDeCombustivel bombasDeCombustivel){
        BombasDeCombustivel bomba = buscarBombaCombustivelPorId(id);
        bombasDeCombustivel.setId(bomba.getId());
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }
}

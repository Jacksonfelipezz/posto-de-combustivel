package com.jackson.posto_de_combustivel.service;

import com.jackson.posto_de_combustivel.infrastructure.entities.TiposDeCombustivel;
import com.jackson.posto_de_combustivel.infrastructure.repository.TipoDeCombustivelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TiposDeCombustivelService {

    private final TipoDeCombustivelRepository tiposDeCombustivelRepository;

    public void criar(TiposDeCombustivel tiposDeCombustivel) {
        tiposDeCombustivelRepository.save(tiposDeCombustivel);
    }

    private TiposDeCombustivel buscarTiposCombustivelPorId(Integer id) {
        return tiposDeCombustivelRepository.findById(id).orElseThrow(() ->
                new NullPointerException("Tipo de combustível não encontrada pelo id" + id));
    }

    private List<TiposDeCombustivel> buscarTiposDeCombustivel(){return tiposDeCombustivelRepository.findAll();}

    @Transactional
    protected void deletarTipoDeCombustivel(Integer id) {
        tiposDeCombustivelRepository.deleteById(id);
    }

    private void alteraTipoDeCombustivel(Integer id, TiposDeCombustivel tiposDeCombustivel) {
        TiposDeCombustivel bomba = buscarTiposCombustivelPorId(id);
        tiposDeCombustivel.setId(bomba.getId());
        tiposDeCombustivelRepository.save(tiposDeCombustivel);
    }
}
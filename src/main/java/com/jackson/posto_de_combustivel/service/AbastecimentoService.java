package com.jackson.posto_de_combustivel.service;

import com.jackson.posto_de_combustivel.infrastructure.entities.Abastecimento;
import com.jackson.posto_de_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.jackson.posto_de_combustivel.infrastructure.repository.AbastecimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AbastecimentoService {

    private final AbastecimentoRepository abastecimentoRepository;
    private final BombaDeCombustivelService bombaDeCombustivelService;

    public void abasteceer(Integer idBomba, Long litros){
        BombasDeCombustivel bomba = bombaDeCombustivelService.buscarBombaCombustivelPorId(idBomba);
        BigDecimal valorTotal = bomba.getTiposDeCombustivel()
                .getPrecoPorLitro().multiply(BigDecimal.valueOf(litros));

        Abastecimento abastecimeto = Abastecimento.builder()
                .dataAbastecimento(LocalDate.now())
                .bombaDeCombustivel(bomba)
                .valorTotal(valorTotal)
                .quantidadedeLitros(litros)
                .build();
        abastecimentoRepository.save(abastecimeto);
    }

    public List<Abastecimento> buscarAbastecimentos(){
       return abastecimentoRepository.findAll();
    }
}

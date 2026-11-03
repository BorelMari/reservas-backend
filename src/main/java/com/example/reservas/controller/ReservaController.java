
package com.example.reservas.controller;

import com.example.reservas.model.Reserva;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReservaController {

    // Lista para armazenar as reservas
    List<Reserva> reservas = new ArrayList<>();


    // 1 - Cadastrar uma nova reserva
    @PostMapping("/reservas")
    public void cadastrarReserva(@RequestBody Reserva reserva) {
        reservas.add(reserva);
    }


    // 2 - Listar todas as reservas
    @GetMapping("/reservas")
    public List<Reserva> listarReservas() {
        return reservas;
    }


    // 3 - Buscar uma reserva pelo codigo
    @GetMapping("/reservas/{codigo}")
    public Reserva buscarReserva(@PathVariable int codigo) {

        for (Reserva reservaAtual : reservas) {

            if (reservaAtual.getCodigo() == codigo) {
                return reservaAtual;
            }

        }

        return null;
    }


    // 4 - Listar as reservas de uma determinada sala
    @GetMapping("/reservas/sala/{sala}")
    public List<Reserva> buscarReservasPorSala(@PathVariable String sala) {

        List<Reserva> reservasDaSala = new ArrayList<>();

        for (Reserva reservaAtual : reservas) {

            if (reservaAtual.getSala().equalsIgnoreCase(sala)) {
                reservasDaSala.add(reservaAtual);
            }

        }

        return reservasDaSala;
    }


    // 5 - Buscar a reserva com mais pessoas
    @GetMapping("/reservas/maior-quantidade")
    public Reserva reservaComMaisPessoas() {

        if (reservas.isEmpty()) {
            return null;
        }

        Reserva maiorReserva = reservas.get(0);

        for (Reserva reservaAtual : reservas) {

            if (reservaAtual.getQuantidadePessoas() >
                    maiorReserva.getQuantidadePessoas()) {

                maiorReserva = reservaAtual;
            }

        }

        return maiorReserva;
    }


    // 6 - Alterar os dados de uma reserva
    @PutMapping("/reservas/{codigo}")
    public void alterarReserva(@PathVariable int codigo,
                               @RequestBody Reserva novosDados) {

        for (Reserva reservaAtual : reservas) {

            if (reservaAtual.getCodigo() == codigo) {

                reservaAtual.setNomeResponsavel(
                        novosDados.getNomeResponsavel());

                reservaAtual.setSala(
                        novosDados.getSala());

                reservaAtual.setData(
                        novosDados.getData());

                reservaAtual.setHorario(
                        novosDados.getHorario());

                reservaAtual.setQuantidadePessoas(
                        novosDados.getQuantidadePessoas());

                return;
            }

        }
    }


    // 7 - Excluir uma reserva pelo codigo
    @DeleteMapping("/reservas/{codigo}")
    public void excluirReserva(@PathVariable int codigo) {

        for (Reserva reservaAtual : reservas) {

            if (reservaAtual.getCodigo() == codigo) {

                reservas.remove(reservaAtual);
                return;
            }

        }
    }

}

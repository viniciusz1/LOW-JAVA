package br.weg.sc.low.model.entities;

import java.util.Date;
import java.util.List;

public class Pauta {
    int idPauta;
    Date reunicaoComissao;
    String comissaoSelecionada;
    List<Proposta> propostas;
}

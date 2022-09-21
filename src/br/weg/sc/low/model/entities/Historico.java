package br.weg.sc.low.model.entities;

import java.util.Date;
import java.util.List;

public class Historico {
    int idHistorico;
    Solicitante pessoaResponsavel;
    Date dataAlteracao;
    List<Demanda> demandasHistorico;
}

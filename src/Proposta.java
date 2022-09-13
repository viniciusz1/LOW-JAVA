import java.util.Date;
import java.util.List;

public class Proposta extends Demanda {
    int idProposta;
    String escopoProposta, paybackProposta, parecerComissaoProposta, parecerDGProposta;
    Date periodoInicioProposta, periodoFimProposta;
    List<Recurso> recursoProposta;
    Solicitante responsavelProposta;
    byte anexosProposta;
}

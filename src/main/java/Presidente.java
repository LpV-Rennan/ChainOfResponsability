public class Presidente extends GestorDeOrcamento {
    Presidente(float limiteDeAprovacao, GestorDeOrcamento superior) {
        super(limiteDeAprovacao, superior);
    }

    @Override
    public String getAprovador() {
        return "Presidente"; 
    }
    
}

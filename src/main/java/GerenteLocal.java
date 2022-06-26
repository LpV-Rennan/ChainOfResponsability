public class GerenteLocal extends GestorDeOrcamento {
    GerenteLocal(float limiteDeAprovacao, GestorDeOrcamento superior) {
        super(limiteDeAprovacao, superior);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getAprovador() {
        return "Gerente Local"; 
    }    
}

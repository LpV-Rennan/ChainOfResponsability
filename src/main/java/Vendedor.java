public class Vendedor extends GestorDeOrcamento {
    Vendedor(float limiteDeAprovacao, GestorDeOrcamento superior) {
        super(limiteDeAprovacao, superior);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getAprovador() {
        return "vendedor"; 
    }    
}

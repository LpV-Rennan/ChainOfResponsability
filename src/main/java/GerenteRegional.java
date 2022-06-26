public class GerenteRegional extends GestorDeOrcamento {

    GerenteRegional(float limiteDeAprovacao, GestorDeOrcamento superior) {
        super(limiteDeAprovacao, superior);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getAprovador() {
        return "gerente regional";
    }

}

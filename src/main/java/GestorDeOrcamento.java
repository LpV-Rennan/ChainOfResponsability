public abstract class GestorDeOrcamento {
    private GestorDeOrcamento gestorSuperior;
    protected float limiteDeAprovacao;

    public GestorDeOrcamento getGestorSuperior() {return gestorSuperior;}
    public void setGestorSuperior(GestorDeOrcamento superior) {gestorSuperior = superior;}

    public float getLimiteDeAprovacao() {return limiteDeAprovacao;}
    public void setLimiteDeAprovacao(float limiteDeAprovacao) {limiteDeAprovacao = limiteDeAprovacao;}

    GestorDeOrcamento(float limiteDeAprovacao,GestorDeOrcamento superior){
        this.limiteDeAprovacao = limiteDeAprovacao;
        this.gestorSuperior = superior;
    }
    public abstract String getAprovador();

     public String aprovarOrcamento(Orcamento orcamento) {
        if (orcamento.getTotal()<= limiteDeAprovacao){
            orcamento.setAprovado(true);
            return getAprovador();
        }
        return getGestorSuperior().aprovarOrcamento(orcamento);
    }

}

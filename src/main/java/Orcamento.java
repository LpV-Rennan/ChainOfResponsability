public class Orcamento {
    private boolean aprovado;
    private float total;

    Orcamento(float total){
        this.total = total;
        this.aprovado = false;
    }

    public void setAprovado(boolean aprovado){this.aprovado = aprovado;}
    public void setTotal(float total){this.total = total;}

    public float getTotal(){return this.total;}
    public boolean getAprovado(){return this.aprovado;}
}

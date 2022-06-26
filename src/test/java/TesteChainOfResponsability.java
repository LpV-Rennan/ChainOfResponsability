
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteChainOfResponsability {
    Presidente presidente;
    GerenteRegional gerenteRegional;
    GerenteLocal gerenteLocal;
    Vendedor vendedor;

    @BeforeEach
    void setUp(){
        presidente = new Presidente(Float.POSITIVE_INFINITY,null);
        gerenteRegional = new GerenteRegional(500000f,presidente);
        gerenteLocal = new GerenteLocal(25000f,gerenteRegional);
        vendedor = new Vendedor(1000f,gerenteLocal);
    }

    @Test
    void deveAprovarComVendedor(){
        assertEquals("vendedor",vendedor.aprovarOrcamento(new Orcamento(1000f)));
    }
    @Test
    void deveAprovarComGerenteLocal(){
        assertEquals("Gerente Local",vendedor.aprovarOrcamento(new Orcamento(25000f)));
    }
    @Test
    void deveAprovarComGerenteRegional(){
        assertEquals("gerente regional",vendedor.aprovarOrcamento(new Orcamento(500000f)));
    }
    @Test
    void deveAprovarComPresidente(){
        assertEquals("Presidente",vendedor.aprovarOrcamento(new Orcamento(Float.POSITIVE_INFINITY)));
    }

}

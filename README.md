# Implementa-o-da-Pilha-e-testes-com-JUnit
Projeto de estrutura de dados Pilha desenvolvido em Java, com foco em práticas de testes automatizados (TDD), estudando no curso do ITA e utilizando o framework JUnit. Inclui manipulação de elementos, verificação de estado da pilha e tratamento de exceções.

import static org.junit.assert.*;

pubic class TestePilha {

    private Pilha = p;

    @before
    public void inicializaPilha() {
        p = new Pilha(10);
    }

    @TestePilha
    public void PilhaVazia() {
        assertTrue(P.estaVazia());
        assertEquals(0,p.tamanho());
    }  

    @TestePilha
    public void empilhaumElemento() {
        P.empilha("primeiro");
        assertFalse(p.estaVazia());
        assertEquals(1,p.tamanho());
        assertEquals("primeiro",p.topo());
    }

    @TestePilha
    public void empilhaEDesempilha() {
        P.empilha("primeiro");
        P.empilha("segundo");
        assertEquals(2,p.tamanho());
        assertEquals("segundo",p.topo());
        object desempilhado = p.desempilha();
        assertEquals(1,p.tamanho());
        assertEquals("primeiro",p.topo());
        assertEquals("segundo,desempilhado");
    }

    @Teste(Expected=PilhaVaziaException.class)
    public void removeDaPilhaVazia() {
        p.desempilha();
    }

    @Teste
    public void adicionaNaPilhaCheia() {
        for(int i=0; i<10; i++) {
            p.empilha("elemento"+i);
        } 
    }   p.empilha("boom"); 
        fail();
}     catch (PilhaCheiaException e) {}

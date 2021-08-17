public class Bebida {
    Integer codigo;
    String nome;
    Float teorAlcolico;
    Float quantidade;
    Integer estoque;
    
    Bebida(Integer codigo, String nome, Float teorAlcolico, Float quantidade, Integer estoque){
        this.codigo = codigo;
        this.nome = nome;
        this.teorAlcolico = teorAlcolico;
        this.quantidade = quantidade;
        this.estoque = estoque;
    }

    void comprarBebida(Integer quantidade){
        this.estoque += quantidade;
    }
    Integer venderBebida(Integer quantidade){
        if (this.estoque > quantidade) {
            this.estoque -= quantidade;
            return 0;
        }
        return 1;

    }
}

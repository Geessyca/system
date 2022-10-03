package SistemaGrafica;
public class Servicos {
	private int Quantidade;
	private int QuantidadeVenda;
	private String Venda;
    private String NumeroRegistro;
    private String Descricao;
    private String Tipo ;
    private double Preco;
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    public int getQuantidadeVenda() {
        return QuantidadeVenda;
    }

    public void setQuantidadeVenda(int QuantidadeVenda) {
        this.QuantidadeVenda = QuantidadeVenda;
    }
    
    public String getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(String NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }
        
    
    public String getVenda() {
        return Venda;
    }
    public void setVenda(String Venda) {
        this.Venda = Venda;
    }
    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    public String todosDados() {

        String dado = "Tipo: "+getTipo() + "   ID: " + getNumeroRegistro()+ "   Descricao: " + getDescricao()+ "   Preço: " + getPreco() + "   Quantidade Disponivel: " + getQuantidade();
		return dado;
	}
    public String todosDadosVenda() {
    	double valorF = (getQuantidadeVenda()*getPreco());
        String dado = "Tipo: "+getTipo() + "   ID: " + getNumeroRegistro()+ "   Descricao: " + getDescricao()+"   Valor da Venda: " + valorF + "   Quantidade Vendida: " + getQuantidadeVenda();
		return dado;
	}
}

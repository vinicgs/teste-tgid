package entities;

public class Venda {

    private Usuario usuario;
    private ItemVenda[] itens;
    private double valorTotal;
    
    public Venda(Usuario usuario, ItemVenda[] itens, double valorTotal) {
        this.usuario = usuario;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public ItemVenda[] getItens() {
        return itens;
    }
    public void setItens(ItemVenda[] itens) {
        this.itens = itens;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    @Override
    public String toString() {
        return "Venda {\nusuario: " + usuario + ",\nitens=" + itens + ",\nvalorTotal=" + valorTotal + "}";
    }


}

package entities;

import java.util.List;

public class Venda {

    private Usuario usuario;
    private List<ItemVenda> itens;
    private double valorTotal;

    public Venda(Usuario usuario, List<ItemVenda> itens2, double valorTotal) {
        this.usuario = usuario;
        this.itens = itens2;
        this.valorTotal = valorTotal;
    }

    public Venda(Usuario usuario2, List<ItemVenda> itens2, int valorTotal2) {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
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

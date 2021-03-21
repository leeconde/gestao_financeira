package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Lancamento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private char tipo;

  private String descricao;

  private String observacao;

  private double valorTotal;

  @Temporal(value = TemporalType.DATE)
  private Date data;

  private boolean parcelada;

  private int quantidadeParcelas;

  private double valorParcela;

  private boolean pago;

  public Lancamento() {
  }

  public Lancamento(String descricao, String observacao, double valorTotal, Date data, char tipo) {
    this.descricao = descricao;
    this.observacao = observacao;
    this.valorTotal = valorTotal;
    this.data = data;
    this.tipo = tipo;
  }

  public Lancamento(String descricao, String observacao, double valorTotal, Date data,
      boolean isParcelada, int quantidadePacelas, double valorParcela, char tipo) {
    this.descricao = descricao;
    this.observacao = observacao;
    this.valorTotal = valorTotal;
    this.data = data;
    this.parcelada = isParcelada;
    this.quantidadeParcelas = quantidadePacelas;
    this.valorParcela = valorParcela;
    this.tipo = tipo;
  }

  public char getTipo() {
    return tipo;
  }

  public void setTipo(char tipo) {
    this.tipo = tipo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public int getQuantidadeParcelas() {
    return quantidadeParcelas;
  }

  public void setQuantidadeParcelas(int quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  public double getValorParcela() {
    return valorParcela;
  }

  public void setValorParcela(double valorParcela) {
    this.valorParcela = valorParcela;
  }

  public boolean isParcelada() {
    return parcelada;
  }

  public void setParcelada(boolean parcelada) {
    this.parcelada = parcelada;
  }

  public boolean isPago() {
    return pago;
  }

  public void setPago(boolean pago) {
    this.pago = pago;
  }
}
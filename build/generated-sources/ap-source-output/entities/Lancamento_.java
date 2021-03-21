package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lancamento.class)
public abstract class Lancamento_ {

	public static volatile SingularAttribute<Lancamento, Double> valorParcela;
	public static volatile SingularAttribute<Lancamento, Character> tipo;
	public static volatile SingularAttribute<Lancamento, String> observacao;
	public static volatile SingularAttribute<Lancamento, Date> data;
	public static volatile SingularAttribute<Lancamento, Boolean> isPago;
	public static volatile SingularAttribute<Lancamento, Double> valorTotal;
	public static volatile SingularAttribute<Lancamento, Integer> id;
	public static volatile SingularAttribute<Lancamento, Boolean> isParcelada;
	public static volatile SingularAttribute<Lancamento, Integer> quantidadeParcelas;
	public static volatile SingularAttribute<Lancamento, String> descricao;

	public static final String VALOR_PARCELA = "valorParcela";
	public static final String TIPO = "tipo";
	public static final String OBSERVACAO = "observacao";
	public static final String DATA = "data";
	public static final String IS_PAGO = "isPago";
	public static final String VALOR_TOTAL = "valorTotal";
	public static final String ID = "id";
	public static final String IS_PARCELADA = "isParcelada";
	public static final String QUANTIDADE_PARCELAS = "quantidadeParcelas";
	public static final String DESCRICAO = "descricao";

}


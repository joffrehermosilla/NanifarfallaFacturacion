package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFactura_ctienepedido is a Querydsl query type for Factura_ctienepedido
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFactura_ctienepedido extends EntityPathBase<Factura_ctienepedido> {

    private static final long serialVersionUID = -757893572L;

    public static final QFactura_ctienepedido factura_ctienepedido = new QFactura_ctienepedido("factura_ctienepedido");

    public final StringPath claveApi = createString("claveApi");

    public final CollectionPath<Cliente_tiene_pedido, QCliente_tiene_pedido> cliente_tiene_pedido = this.<Cliente_tiene_pedido, QCliente_tiene_pedido>createCollection("cliente_tiene_pedido", Cliente_tiene_pedido.class, QCliente_tiene_pedido.class, PathInits.DIRECT2);

    public final NumberPath<Integer> codigo_factura_cliente_tiene_pedido = createNumber("codigo_factura_cliente_tiene_pedido", Integer.class);

    public final StringPath nombre_factura_cliente_tiene_pedido = createString("nombre_factura_cliente_tiene_pedido");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QFactura_ctienepedido(String variable) {
        super(Factura_ctienepedido.class, forVariable(variable));
    }

    public QFactura_ctienepedido(Path<? extends Factura_ctienepedido> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFactura_ctienepedido(PathMetadata metadata) {
        super(Factura_ctienepedido.class, metadata);
    }

}


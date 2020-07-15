package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEstado_clientetienepedido is a Querydsl query type for Estado_clientetienepedido
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEstado_clientetienepedido extends EntityPathBase<Estado_clientetienepedido> {

    private static final long serialVersionUID = 207172671L;

    public static final QEstado_clientetienepedido estado_clientetienepedido = new QEstado_clientetienepedido("estado_clientetienepedido");

    public final StringPath claveApi = createString("claveApi");

    public final CollectionPath<Cliente_tiene_pedido, QCliente_tiene_pedido> cliente_tiene_pedido = this.<Cliente_tiene_pedido, QCliente_tiene_pedido>createCollection("cliente_tiene_pedido", Cliente_tiene_pedido.class, QCliente_tiene_pedido.class, PathInits.DIRECT2);

    public final NumberPath<Integer> codigo_estado_cliente_tiene_pedido = createNumber("codigo_estado_cliente_tiene_pedido", Integer.class);

    public final StringPath foto_ruta = createString("foto_ruta");

    public final StringPath nombre_estado_cliente_tiene_pedido = createString("nombre_estado_cliente_tiene_pedido");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QEstado_clientetienepedido(String variable) {
        super(Estado_clientetienepedido.class, forVariable(variable));
    }

    public QEstado_clientetienepedido(Path<? extends Estado_clientetienepedido> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstado_clientetienepedido(PathMetadata metadata) {
        super(Estado_clientetienepedido.class, metadata);
    }

}


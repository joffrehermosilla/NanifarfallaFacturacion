package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVendedor is a Querydsl query type for Vendedor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVendedor extends EntityPathBase<Vendedor> {

    private static final long serialVersionUID = -240115789L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVendedor vendedor = new QVendedor("vendedor");

    public final QArea area;

    public final StringPath claveApi = createString("claveApi");

    public final CollectionPath<Cliente_tiene_pedido, QCliente_tiene_pedido> cliente_tiene_pedido = this.<Cliente_tiene_pedido, QCliente_tiene_pedido>createCollection("cliente_tiene_pedido", Cliente_tiene_pedido.class, QCliente_tiene_pedido.class, PathInits.DIRECT2);

    public final NumberPath<Integer> codigo_vendedor = createNumber("codigo_vendedor", Integer.class);

    public final StringPath codigo_venta_vendedor = createString("codigo_venta_vendedor");

    public final QUsuario usuario;

    public QVendedor(String variable) {
        this(Vendedor.class, forVariable(variable), INITS);
    }

    public QVendedor(Path<? extends Vendedor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVendedor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVendedor(PathMetadata metadata, PathInits inits) {
        this(Vendedor.class, metadata, inits);
    }

    public QVendedor(Class<? extends Vendedor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.area = inits.isInitialized("area") ? new QArea(forProperty("area")) : null;
        this.usuario = inits.isInitialized("usuario") ? new QUsuario(forProperty("usuario"), inits.get("usuario")) : null;
    }

}


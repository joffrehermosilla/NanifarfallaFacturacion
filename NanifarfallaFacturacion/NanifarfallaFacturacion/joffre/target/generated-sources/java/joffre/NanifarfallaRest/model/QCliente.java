package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCliente is a Querydsl query type for Cliente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCliente extends EntityPathBase<Cliente> {

    private static final long serialVersionUID = 1890852270L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCliente cliente = new QCliente("cliente");

    public final StringPath claveApi = createString("claveApi");

    public final CollectionPath<Cliente_tiene_pedido, QCliente_tiene_pedido> cliente_tiene_pedido = this.<Cliente_tiene_pedido, QCliente_tiene_pedido>createCollection("cliente_tiene_pedido", Cliente_tiene_pedido.class, QCliente_tiene_pedido.class, PathInits.DIRECT2);

    public final NumberPath<Integer> codigo_cliente = createNumber("codigo_cliente", Integer.class);

    public final StringPath dni_cliente = createString("dni_cliente");

    public final DateTimePath<java.util.Date> fecha_empadronamiento_cliente = createDateTime("fecha_empadronamiento_cliente", java.util.Date.class);

    public final StringPath foto_ruta = createString("foto_ruta");

    public final NumberPath<Double> latitud_cliente = createNumber("latitud_cliente", Double.class);

    public final NumberPath<Double> longitud_cliente = createNumber("longitud_cliente", Double.class);

    public final QEstadoCliente mEstado_cliente;

    public final QRegimenCliente mRegimen_cliente;

    public final QUsuario mUsuario;

    public final StringPath ruc_cliente = createString("ruc_cliente");

    public final StringPath type_cliente = createString("type_cliente");

    public QCliente(String variable) {
        this(Cliente.class, forVariable(variable), INITS);
    }

    public QCliente(Path<? extends Cliente> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCliente(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCliente(PathMetadata metadata, PathInits inits) {
        this(Cliente.class, metadata, inits);
    }

    public QCliente(Class<? extends Cliente> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mEstado_cliente = inits.isInitialized("mEstado_cliente") ? new QEstadoCliente(forProperty("mEstado_cliente")) : null;
        this.mRegimen_cliente = inits.isInitialized("mRegimen_cliente") ? new QRegimenCliente(forProperty("mRegimen_cliente")) : null;
        this.mUsuario = inits.isInitialized("mUsuario") ? new QUsuario(forProperty("mUsuario"), inits.get("mUsuario")) : null;
    }

}


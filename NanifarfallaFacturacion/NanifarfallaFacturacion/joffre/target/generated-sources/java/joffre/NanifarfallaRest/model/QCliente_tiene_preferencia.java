package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCliente_tiene_preferencia is a Querydsl query type for Cliente_tiene_preferencia
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCliente_tiene_preferencia extends EntityPathBase<Cliente_tiene_preferencia> {

    private static final long serialVersionUID = 849030425L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCliente_tiene_preferencia cliente_tiene_preferencia = new QCliente_tiene_preferencia("cliente_tiene_preferencia");

    public final NumberPath<Double> cantidad_puntos = createNumber("cantidad_puntos", Double.class);

    public final StringPath claveApi = createString("claveApi");

    public final QCliente cliente;

    public final NumberPath<Integer> codigo_preferecia_sku = createNumber("codigo_preferecia_sku", Integer.class);

    public final DateTimePath<java.util.Date> fecha_voto_preferencia = createDateTime("fecha_voto_preferencia", java.util.Date.class);

    public final QProducto producto;

    public QCliente_tiene_preferencia(String variable) {
        this(Cliente_tiene_preferencia.class, forVariable(variable), INITS);
    }

    public QCliente_tiene_preferencia(Path<? extends Cliente_tiene_preferencia> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCliente_tiene_preferencia(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCliente_tiene_preferencia(PathMetadata metadata, PathInits inits) {
        this(Cliente_tiene_preferencia.class, metadata, inits);
    }

    public QCliente_tiene_preferencia(Class<? extends Cliente_tiene_preferencia> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QCliente(forProperty("cliente"), inits.get("cliente")) : null;
        this.producto = inits.isInitialized("producto") ? new QProducto(forProperty("producto"), inits.get("producto")) : null;
    }

}


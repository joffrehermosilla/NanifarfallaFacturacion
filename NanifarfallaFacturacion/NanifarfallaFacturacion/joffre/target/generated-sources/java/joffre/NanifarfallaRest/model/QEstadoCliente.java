package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEstadoCliente is a Querydsl query type for EstadoCliente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEstadoCliente extends EntityPathBase<EstadoCliente> {

    private static final long serialVersionUID = -1340955032L;

    public static final QEstadoCliente estadoCliente = new QEstadoCliente("estadoCliente");

    public final StringPath claveApi = createString("claveApi");

    public final CollectionPath<Cliente, QCliente> cliente = this.<Cliente, QCliente>createCollection("cliente", Cliente.class, QCliente.class, PathInits.DIRECT2);

    public final NumberPath<Integer> codigo_estadocliente = createNumber("codigo_estadocliente", Integer.class);

    public final StringPath nombre_estadocliente = createString("nombre_estadocliente");

    public QEstadoCliente(String variable) {
        super(EstadoCliente.class, forVariable(variable));
    }

    public QEstadoCliente(Path<? extends EstadoCliente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstadoCliente(PathMetadata metadata) {
        super(EstadoCliente.class, metadata);
    }

}


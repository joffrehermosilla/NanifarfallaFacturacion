package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEstadoContrato is a Querydsl query type for EstadoContrato
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEstadoContrato extends EntityPathBase<EstadoContrato> {

    private static final long serialVersionUID = -95289234L;

    public static final QEstadoContrato estadoContrato = new QEstadoContrato("estadoContrato");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_estadoContrato = createNumber("codigo_estadoContrato", Integer.class);

    public final StringPath descripcion = createString("descripcion");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QEstadoContrato(String variable) {
        super(EstadoContrato.class, forVariable(variable));
    }

    public QEstadoContrato(Path<? extends EstadoContrato> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstadoContrato(PathMetadata metadata) {
        super(EstadoContrato.class, metadata);
    }

}


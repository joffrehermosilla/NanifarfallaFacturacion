package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTipoAlerta is a Querydsl query type for TipoAlerta
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTipoAlerta extends EntityPathBase<TipoAlerta> {

    private static final long serialVersionUID = -2025159003L;

    public static final QTipoAlerta tipoAlerta = new QTipoAlerta("tipoAlerta");

    public final NumberPath<Integer> codigo_tipoalerta = createNumber("codigo_tipoalerta", Integer.class);

    public final StringPath nombre_tipoalerta = createString("nombre_tipoalerta");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QTipoAlerta(String variable) {
        super(TipoAlerta.class, forVariable(variable));
    }

    public QTipoAlerta(Path<? extends TipoAlerta> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoAlerta(PathMetadata metadata) {
        super(TipoAlerta.class, metadata);
    }

}


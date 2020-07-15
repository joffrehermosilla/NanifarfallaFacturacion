package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEstadoInsumo is a Querydsl query type for EstadoInsumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEstadoInsumo extends EntityPathBase<EstadoInsumo> {

    private static final long serialVersionUID = -1808984069L;

    public static final QEstadoInsumo estadoInsumo = new QEstadoInsumo("estadoInsumo");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_estadoinsumo = createNumber("codigo_estadoinsumo", Integer.class);

    public final CollectionPath<Insumo, QInsumo> insumo = this.<Insumo, QInsumo>createCollection("insumo", Insumo.class, QInsumo.class, PathInits.DIRECT2);

    public final StringPath nombre_estado_insumo = createString("nombre_estado_insumo");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QEstadoInsumo(String variable) {
        super(EstadoInsumo.class, forVariable(variable));
    }

    public QEstadoInsumo(Path<? extends EstadoInsumo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstadoInsumo(PathMetadata metadata) {
        super(EstadoInsumo.class, metadata);
    }

}


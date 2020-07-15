package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QZona is a Querydsl query type for Zona
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QZona extends EntityPathBase<Zona> {

    private static final long serialVersionUID = 907724916L;

    public static final QZona zona = new QZona("zona");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_zona = createNumber("codigo_zona", Integer.class);

    public final StringPath nombre_zona = createString("nombre_zona");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public final CollectionPath<Zona_tieneDistrito, QZona_tieneDistrito> zonatienedistrito = this.<Zona_tieneDistrito, QZona_tieneDistrito>createCollection("zonatienedistrito", Zona_tieneDistrito.class, QZona_tieneDistrito.class, PathInits.DIRECT2);

    public QZona(String variable) {
        super(Zona.class, forVariable(variable));
    }

    public QZona(Path<? extends Zona> path) {
        super(path.getType(), path.getMetadata());
    }

    public QZona(PathMetadata metadata) {
        super(Zona.class, metadata);
    }

}


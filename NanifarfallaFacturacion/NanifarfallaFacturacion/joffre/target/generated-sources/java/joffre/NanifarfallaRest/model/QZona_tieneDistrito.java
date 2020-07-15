package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QZona_tieneDistrito is a Querydsl query type for Zona_tieneDistrito
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QZona_tieneDistrito extends EntityPathBase<Zona_tieneDistrito> {

    private static final long serialVersionUID = -110162828L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QZona_tieneDistrito zona_tieneDistrito = new QZona_tieneDistrito("zona_tieneDistrito");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_zona_tiene_distrito = createNumber("codigo_zona_tiene_distrito", Integer.class);

    public final QDistrito distrito;

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public final QZona zona;

    public QZona_tieneDistrito(String variable) {
        this(Zona_tieneDistrito.class, forVariable(variable), INITS);
    }

    public QZona_tieneDistrito(Path<? extends Zona_tieneDistrito> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QZona_tieneDistrito(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QZona_tieneDistrito(PathMetadata metadata, PathInits inits) {
        this(Zona_tieneDistrito.class, metadata, inits);
    }

    public QZona_tieneDistrito(Class<? extends Zona_tieneDistrito> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.distrito = inits.isInitialized("distrito") ? new QDistrito(forProperty("distrito"), inits.get("distrito")) : null;
        this.zona = inits.isInitialized("zona") ? new QZona(forProperty("zona")) : null;
    }

}


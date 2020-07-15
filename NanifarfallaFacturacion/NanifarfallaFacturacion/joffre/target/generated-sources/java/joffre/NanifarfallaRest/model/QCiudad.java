package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCiudad is a Querydsl query type for Ciudad
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCiudad extends EntityPathBase<Ciudad> {

    private static final long serialVersionUID = -218513884L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCiudad ciudad = new QCiudad("ciudad");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_ciudad = createNumber("codigo_ciudad", Integer.class);

    public final CollectionPath<Distrito, QDistrito> distrito = this.<Distrito, QDistrito>createCollection("distrito", Distrito.class, QDistrito.class, PathInits.DIRECT2);

    public final StringPath nombre_ciudad = createString("nombre_ciudad");

    public final QProvincia provincia;

    public QCiudad(String variable) {
        this(Ciudad.class, forVariable(variable), INITS);
    }

    public QCiudad(Path<? extends Ciudad> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCiudad(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCiudad(PathMetadata metadata, PathInits inits) {
        this(Ciudad.class, metadata, inits);
    }

    public QCiudad(Class<? extends Ciudad> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.provincia = inits.isInitialized("provincia") ? new QProvincia(forProperty("provincia"), inits.get("provincia")) : null;
    }

}


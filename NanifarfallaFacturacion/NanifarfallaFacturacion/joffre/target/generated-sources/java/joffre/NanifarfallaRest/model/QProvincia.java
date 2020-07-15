package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProvincia is a Querydsl query type for Provincia
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProvincia extends EntityPathBase<Provincia> {

    private static final long serialVersionUID = 1694676577L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProvincia provincia = new QProvincia("provincia");

    public final CollectionPath<Ciudad, QCiudad> ciudad = this.<Ciudad, QCiudad>createCollection("ciudad", Ciudad.class, QCiudad.class, PathInits.DIRECT2);

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_provincia = createNumber("codigo_provincia", Integer.class);

    public final StringPath nombre_provincia = createString("nombre_provincia");

    public final QPais pais;

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QProvincia(String variable) {
        this(Provincia.class, forVariable(variable), INITS);
    }

    public QProvincia(Path<? extends Provincia> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProvincia(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProvincia(PathMetadata metadata, PathInits inits) {
        this(Provincia.class, metadata, inits);
    }

    public QProvincia(Class<? extends Provincia> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pais = inits.isInitialized("pais") ? new QPais(forProperty("pais")) : null;
    }

}


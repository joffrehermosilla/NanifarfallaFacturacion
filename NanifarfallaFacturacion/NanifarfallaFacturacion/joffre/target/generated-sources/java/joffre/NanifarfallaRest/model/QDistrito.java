package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDistrito is a Querydsl query type for Distrito
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDistrito extends EntityPathBase<Distrito> {

    private static final long serialVersionUID = -2132568988L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDistrito distrito = new QDistrito("distrito");

    public final QCiudad ciudad;

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_distrito = createNumber("codigo_distrito", Integer.class);

    public final StringPath nombre_distrito = createString("nombre_distrito");

    public final CollectionPath<Usuario, QUsuario> usuario = this.<Usuario, QUsuario>createCollection("usuario", Usuario.class, QUsuario.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public final CollectionPath<Zona_tieneDistrito, QZona_tieneDistrito> zonatienedistrito = this.<Zona_tieneDistrito, QZona_tieneDistrito>createCollection("zonatienedistrito", Zona_tieneDistrito.class, QZona_tieneDistrito.class, PathInits.DIRECT2);

    public QDistrito(String variable) {
        this(Distrito.class, forVariable(variable), INITS);
    }

    public QDistrito(Path<? extends Distrito> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDistrito(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDistrito(PathMetadata metadata, PathInits inits) {
        this(Distrito.class, metadata, inits);
    }

    public QDistrito(Class<? extends Distrito> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ciudad = inits.isInitialized("ciudad") ? new QCiudad(forProperty("ciudad"), inits.get("ciudad")) : null;
    }

}


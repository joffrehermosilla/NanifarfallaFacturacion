package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDiasEspeciales is a Querydsl query type for DiasEspeciales
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDiasEspeciales extends EntityPathBase<DiasEspeciales> {

    private static final long serialVersionUID = -2020148987L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDiasEspeciales diasEspeciales = new QDiasEspeciales("diasEspeciales");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_diasespeciales = createNumber("codigo_diasespeciales", Integer.class);

    public final StringPath detalles_diasespeciales = createString("detalles_diasespeciales");

    public final DateTimePath<java.util.Date> fecha_diasespeciales = createDateTime("fecha_diasespeciales", java.util.Date.class);

    public final QPais pais;

    public QDiasEspeciales(String variable) {
        this(DiasEspeciales.class, forVariable(variable), INITS);
    }

    public QDiasEspeciales(Path<? extends DiasEspeciales> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDiasEspeciales(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDiasEspeciales(PathMetadata metadata, PathInits inits) {
        this(DiasEspeciales.class, metadata, inits);
    }

    public QDiasEspeciales(Class<? extends DiasEspeciales> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pais = inits.isInitialized("pais") ? new QPais(forProperty("pais")) : null;
    }

}


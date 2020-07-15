package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaZona is a Querydsl query type for AuditoriaZona
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaZona extends EntityPathBase<AuditoriaZona> {

    private static final long serialVersionUID = 994387545L;

    public static final QAuditoriaZona auditoriaZona = new QAuditoriaZona("auditoriaZona");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audizona = createNumber("codigo_audizona", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_zona_new = createString("nombre_zona_new");

    public final StringPath nombre_zona_old = createString("nombre_zona_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaZona(String variable) {
        super(AuditoriaZona.class, forVariable(variable));
    }

    public QAuditoriaZona(Path<? extends AuditoriaZona> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaZona(PathMetadata metadata) {
        super(AuditoriaZona.class, metadata);
    }

}


package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaColores is a Querydsl query type for AuditoriaColores
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaColores extends EntityPathBase<AuditoriaColores> {

    private static final long serialVersionUID = -1824120064L;

    public static final QAuditoriaColores auditoriaColores = new QAuditoriaColores("auditoriaColores");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audi_colores = createNumber("codigo_audi_colores", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_color_new = createString("nombre_color_new");

    public final StringPath nombre_color_old = createString("nombre_color_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaColores(String variable) {
        super(AuditoriaColores.class, forVariable(variable));
    }

    public QAuditoriaColores(Path<? extends AuditoriaColores> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaColores(PathMetadata metadata) {
        super(AuditoriaColores.class, metadata);
    }

}


package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaEstadoCatalogo is a Querydsl query type for AuditoriaEstadoCatalogo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaEstadoCatalogo extends EntityPathBase<AuditoriaEstadoCatalogo> {

    private static final long serialVersionUID = 2098697325L;

    public static final QAuditoriaEstadoCatalogo auditoriaEstadoCatalogo = new QAuditoriaEstadoCatalogo("auditoriaEstadoCatalogo");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audi_estado_catalogo = createNumber("codigo_audi_estado_catalogo", Integer.class);

    public final StringPath descripcion_new = createString("descripcion_new");

    public final StringPath descripcion_old = createString("descripcion_old");

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaEstadoCatalogo(String variable) {
        super(AuditoriaEstadoCatalogo.class, forVariable(variable));
    }

    public QAuditoriaEstadoCatalogo(Path<? extends AuditoriaEstadoCatalogo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaEstadoCatalogo(PathMetadata metadata) {
        super(AuditoriaEstadoCatalogo.class, metadata);
    }

}


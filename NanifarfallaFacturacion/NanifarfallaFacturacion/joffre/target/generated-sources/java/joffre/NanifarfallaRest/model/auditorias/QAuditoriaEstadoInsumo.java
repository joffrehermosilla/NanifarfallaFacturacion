package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaEstadoInsumo is a Querydsl query type for AuditoriaEstadoInsumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaEstadoInsumo extends EntityPathBase<AuditoriaEstadoInsumo> {

    private static final long serialVersionUID = 1289863392L;

    public static final QAuditoriaEstadoInsumo auditoriaEstadoInsumo = new QAuditoriaEstadoInsumo("auditoriaEstadoInsumo");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audiestadoinsumo = createNumber("codigo_audiestadoinsumo", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_estado_insumo_new = createString("nombre_estado_insumo_new");

    public final StringPath nombre_estado_insumo_old = createString("nombre_estado_insumo_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaEstadoInsumo(String variable) {
        super(AuditoriaEstadoInsumo.class, forVariable(variable));
    }

    public QAuditoriaEstadoInsumo(Path<? extends AuditoriaEstadoInsumo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaEstadoInsumo(PathMetadata metadata) {
        super(AuditoriaEstadoInsumo.class, metadata);
    }

}


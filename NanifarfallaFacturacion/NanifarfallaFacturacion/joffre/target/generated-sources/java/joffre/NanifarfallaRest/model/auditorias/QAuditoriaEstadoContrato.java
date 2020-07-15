package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaEstadoContrato is a Querydsl query type for AuditoriaEstadoContrato
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaEstadoContrato extends EntityPathBase<AuditoriaEstadoContrato> {

    private static final long serialVersionUID = 1484784659L;

    public static final QAuditoriaEstadoContrato auditoriaEstadoContrato = new QAuditoriaEstadoContrato("auditoriaEstadoContrato");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audi_estado_contrato = createNumber("codigo_audi_estado_contrato", Integer.class);

    public final StringPath descripcion_new = createString("descripcion_new");

    public final StringPath descripcion_old = createString("descripcion_old");

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaEstadoContrato(String variable) {
        super(AuditoriaEstadoContrato.class, forVariable(variable));
    }

    public QAuditoriaEstadoContrato(Path<? extends AuditoriaEstadoContrato> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaEstadoContrato(PathMetadata metadata) {
        super(AuditoriaEstadoContrato.class, metadata);
    }

}


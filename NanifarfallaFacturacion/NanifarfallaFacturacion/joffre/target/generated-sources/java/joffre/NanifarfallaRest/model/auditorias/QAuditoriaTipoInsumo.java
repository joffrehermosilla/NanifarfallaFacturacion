package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaTipoInsumo is a Querydsl query type for AuditoriaTipoInsumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaTipoInsumo extends EntityPathBase<AuditoriaTipoInsumo> {

    private static final long serialVersionUID = -2009628562L;

    public static final QAuditoriaTipoInsumo auditoriaTipoInsumo = new QAuditoriaTipoInsumo("auditoriaTipoInsumo");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_auditipoinsumo = createNumber("codigo_auditipoinsumo", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_tipo_insumo_new = createString("nombre_tipo_insumo_new");

    public final StringPath nombre_tipo_insumo_old = createString("nombre_tipo_insumo_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaTipoInsumo(String variable) {
        super(AuditoriaTipoInsumo.class, forVariable(variable));
    }

    public QAuditoriaTipoInsumo(Path<? extends AuditoriaTipoInsumo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaTipoInsumo(PathMetadata metadata) {
        super(AuditoriaTipoInsumo.class, metadata);
    }

}


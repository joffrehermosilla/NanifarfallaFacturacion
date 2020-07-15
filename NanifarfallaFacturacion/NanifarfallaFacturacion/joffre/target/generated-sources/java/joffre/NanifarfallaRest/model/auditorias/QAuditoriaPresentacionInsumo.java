package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaPresentacionInsumo is a Querydsl query type for AuditoriaPresentacionInsumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaPresentacionInsumo extends EntityPathBase<AuditoriaPresentacionInsumo> {

    private static final long serialVersionUID = 637281221L;

    public static final QAuditoriaPresentacionInsumo auditoriaPresentacionInsumo = new QAuditoriaPresentacionInsumo("auditoriaPresentacionInsumo");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audipresentacioninsumo = createNumber("codigo_audipresentacioninsumo", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_presentacion_insumo_new = createString("nombre_presentacion_insumo_new");

    public final StringPath nombre_presentacion_insumo_old = createString("nombre_presentacion_insumo_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaPresentacionInsumo(String variable) {
        super(AuditoriaPresentacionInsumo.class, forVariable(variable));
    }

    public QAuditoriaPresentacionInsumo(Path<? extends AuditoriaPresentacionInsumo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaPresentacionInsumo(PathMetadata metadata) {
        super(AuditoriaPresentacionInsumo.class, metadata);
    }

}


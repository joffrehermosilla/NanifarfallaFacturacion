package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaTipoImpuesto is a Querydsl query type for AuditoriaTipoImpuesto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaTipoImpuesto extends EntityPathBase<AuditoriaTipoImpuesto> {

    private static final long serialVersionUID = 508613207L;

    public static final QAuditoriaTipoImpuesto auditoriaTipoImpuesto = new QAuditoriaTipoImpuesto("auditoriaTipoImpuesto");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audi_tipo_impuesto = createNumber("codigo_audi_tipo_impuesto", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_tipo_impuesto_new = createString("nombre_tipo_impuesto_new");

    public final StringPath nombre_tipo_impuesto_old = createString("nombre_tipo_impuesto_old");

    public final NumberPath<Double> porcentaje_tipo_impuesto_new = createNumber("porcentaje_tipo_impuesto_new", Double.class);

    public final NumberPath<Double> porcentaje_tipo_impuesto_old = createNumber("porcentaje_tipo_impuesto_old", Double.class);

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaTipoImpuesto(String variable) {
        super(AuditoriaTipoImpuesto.class, forVariable(variable));
    }

    public QAuditoriaTipoImpuesto(Path<? extends AuditoriaTipoImpuesto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaTipoImpuesto(PathMetadata metadata) {
        super(AuditoriaTipoImpuesto.class, metadata);
    }

}


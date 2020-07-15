package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaTipoAlerta is a Querydsl query type for AuditoriaTipoAlerta
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaTipoAlerta extends EntityPathBase<AuditoriaTipoAlerta> {

    private static final long serialVersionUID = 2054038730L;

    public static final QAuditoriaTipoAlerta auditoriaTipoAlerta = new QAuditoriaTipoAlerta("auditoriaTipoAlerta");

    public final NumberPath<Integer> codigo_audi_tipoalerta = createNumber("codigo_audi_tipoalerta", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_tipoalerta_new = createString("nombre_tipoalerta_new");

    public final StringPath nombre_tipoalerta_old = createString("nombre_tipoalerta_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaTipoAlerta(String variable) {
        super(AuditoriaTipoAlerta.class, forVariable(variable));
    }

    public QAuditoriaTipoAlerta(Path<? extends AuditoriaTipoAlerta> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaTipoAlerta(PathMetadata metadata) {
        super(AuditoriaTipoAlerta.class, metadata);
    }

}


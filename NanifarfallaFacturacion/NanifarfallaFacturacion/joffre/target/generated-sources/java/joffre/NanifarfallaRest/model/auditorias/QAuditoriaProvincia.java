package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaProvincia is a Querydsl query type for AuditoriaProvincia
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaProvincia extends EntityPathBase<AuditoriaProvincia> {

    private static final long serialVersionUID = 1133526940L;

    public static final QAuditoriaProvincia auditoriaProvincia = new QAuditoriaProvincia("auditoriaProvincia");

    public final NumberPath<Integer> codigo_audi_provincia = createNumber("codigo_audi_provincia", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final NumberPath<Integer> fkcodigo_pais_new = createNumber("fkcodigo_pais_new", Integer.class);

    public final NumberPath<Integer> fkcodigo_pais_old = createNumber("fkcodigo_pais_old", Integer.class);

    public final StringPath nombre_provincia_new = createString("nombre_provincia_new");

    public final StringPath nombre_provincia_old = createString("nombre_provincia_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaProvincia(String variable) {
        super(AuditoriaProvincia.class, forVariable(variable));
    }

    public QAuditoriaProvincia(Path<? extends AuditoriaProvincia> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaProvincia(PathMetadata metadata) {
        super(AuditoriaProvincia.class, metadata);
    }

}


package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaPais is a Querydsl query type for AuditoriaPais
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaPais extends EntityPathBase<AuditoriaPais> {

    private static final long serialVersionUID = 994076044L;

    public static final QAuditoriaPais auditoriaPais = new QAuditoriaPais("auditoriaPais");

    public final NumberPath<Integer> codigo_audi_pais = createNumber("codigo_audi_pais", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_pais_new = createString("nombre_pais_new");

    public final StringPath nombre_pais_old = createString("nombre_pais_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaPais(String variable) {
        super(AuditoriaPais.class, forVariable(variable));
    }

    public QAuditoriaPais(Path<? extends AuditoriaPais> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaPais(PathMetadata metadata) {
        super(AuditoriaPais.class, metadata);
    }

}


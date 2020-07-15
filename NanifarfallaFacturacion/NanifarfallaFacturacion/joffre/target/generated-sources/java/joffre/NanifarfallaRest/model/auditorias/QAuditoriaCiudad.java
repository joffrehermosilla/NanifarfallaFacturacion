package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaCiudad is a Querydsl query type for AuditoriaCiudad
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaCiudad extends EntityPathBase<AuditoriaCiudad> {

    private static final long serialVersionUID = 1459893961L;

    public static final QAuditoriaCiudad auditoriaCiudad = new QAuditoriaCiudad("auditoriaCiudad");

    public final NumberPath<Integer> codigo_audi_ciudad = createNumber("codigo_audi_ciudad", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final NumberPath<Integer> fkcodigo_provincia_new = createNumber("fkcodigo_provincia_new", Integer.class);

    public final NumberPath<Integer> fkcodigo_provincia_old = createNumber("fkcodigo_provincia_old", Integer.class);

    public final StringPath nombre_ciudad_new = createString("nombre_ciudad_new");

    public final StringPath nombre_ciudad_old = createString("nombre_ciudad_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaCiudad(String variable) {
        super(AuditoriaCiudad.class, forVariable(variable));
    }

    public QAuditoriaCiudad(Path<? extends AuditoriaCiudad> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaCiudad(PathMetadata metadata) {
        super(AuditoriaCiudad.class, metadata);
    }

}


package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaTipoUsuario is a Querydsl query type for AuditoriaTipoUsuario
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaTipoUsuario extends EntityPathBase<AuditoriaTipoUsuario> {

    private static final long serialVersionUID = 35568009L;

    public static final QAuditoriaTipoUsuario auditoriaTipoUsuario = new QAuditoriaTipoUsuario("auditoriaTipoUsuario");

    public final NumberPath<Integer> codigo_audi_tipousuario = createNumber("codigo_audi_tipousuario", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_tipousuario_new = createString("nombre_tipousuario_new");

    public final StringPath nombre_tipousuario_old = createString("nombre_tipousuario_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaTipoUsuario(String variable) {
        super(AuditoriaTipoUsuario.class, forVariable(variable));
    }

    public QAuditoriaTipoUsuario(Path<? extends AuditoriaTipoUsuario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaTipoUsuario(PathMetadata metadata) {
        super(AuditoriaTipoUsuario.class, metadata);
    }

}


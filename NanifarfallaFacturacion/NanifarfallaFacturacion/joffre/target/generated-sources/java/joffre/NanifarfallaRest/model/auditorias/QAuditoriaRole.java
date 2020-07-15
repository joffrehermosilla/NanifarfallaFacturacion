package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaRole is a Querydsl query type for AuditoriaRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaRole extends EntityPathBase<AuditoriaRole> {

    private static final long serialVersionUID = 994149159L;

    public static final QAuditoriaRole auditoriaRole = new QAuditoriaRole("auditoriaRole");

    public final NumberPath<Integer> codigo_audi_role = createNumber("codigo_audi_role", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_role_new = createString("nombre_role_new");

    public final StringPath nombre_role_old = createString("nombre_role_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaRole(String variable) {
        super(AuditoriaRole.class, forVariable(variable));
    }

    public QAuditoriaRole(Path<? extends AuditoriaRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaRole(PathMetadata metadata) {
        super(AuditoriaRole.class, metadata);
    }

}


package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaPrivilege is a Querydsl query type for AuditoriaPrivilege
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaPrivilege extends EntityPathBase<AuditoriaPrivilege> {

    private static final long serialVersionUID = 103414432L;

    public static final QAuditoriaPrivilege auditoriaPrivilege = new QAuditoriaPrivilege("auditoriaPrivilege");

    public final NumberPath<Integer> codigo_audi_privilege = createNumber("codigo_audi_privilege", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_privilege_new = createString("nombre_privilege_new");

    public final StringPath nombre_privilege_old = createString("nombre_privilege_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaPrivilege(String variable) {
        super(AuditoriaPrivilege.class, forVariable(variable));
    }

    public QAuditoriaPrivilege(Path<? extends AuditoriaPrivilege> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaPrivilege(PathMetadata metadata) {
        super(AuditoriaPrivilege.class, metadata);
    }

}


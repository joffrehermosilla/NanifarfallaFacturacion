package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaEstadoUsuario is a Querydsl query type for AuditoriaEstadoUsuario
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaEstadoUsuario extends EntityPathBase<AuditoriaEstadoUsuario> {

    private static final long serialVersionUID = -759396521L;

    public static final QAuditoriaEstadoUsuario auditoriaEstadoUsuario = new QAuditoriaEstadoUsuario("auditoriaEstadoUsuario");

    public final NumberPath<Integer> codigo_audi_estadousuario = createNumber("codigo_audi_estadousuario", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_estadousuario_new = createString("nombre_estadousuario_new");

    public final StringPath nombre_estadousuario_old = createString("nombre_estadousuario_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaEstadoUsuario(String variable) {
        super(AuditoriaEstadoUsuario.class, forVariable(variable));
    }

    public QAuditoriaEstadoUsuario(Path<? extends AuditoriaEstadoUsuario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaEstadoUsuario(PathMetadata metadata) {
        super(AuditoriaEstadoUsuario.class, metadata);
    }

}


package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaEstadoCliente is a Querydsl query type for AuditoriaEstadoCliente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaEstadoCliente extends EntityPathBase<AuditoriaEstadoCliente> {

    private static final long serialVersionUID = 234035747L;

    public static final QAuditoriaEstadoCliente auditoriaEstadoCliente = new QAuditoriaEstadoCliente("auditoriaEstadoCliente");

    public final NumberPath<Integer> codigo_audiestadocliente = createNumber("codigo_audiestadocliente", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_estadocliente_new = createString("nombre_estadocliente_new");

    public final StringPath nombre_estadocliente_old = createString("nombre_estadocliente_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaEstadoCliente(String variable) {
        super(AuditoriaEstadoCliente.class, forVariable(variable));
    }

    public QAuditoriaEstadoCliente(Path<? extends AuditoriaEstadoCliente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaEstadoCliente(PathMetadata metadata) {
        super(AuditoriaEstadoCliente.class, metadata);
    }

}


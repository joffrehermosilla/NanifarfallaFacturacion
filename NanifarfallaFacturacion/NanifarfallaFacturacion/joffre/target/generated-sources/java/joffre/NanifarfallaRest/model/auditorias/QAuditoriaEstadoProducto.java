package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaEstadoProducto is a Querydsl query type for AuditoriaEstadoProducto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaEstadoProducto extends EntityPathBase<AuditoriaEstadoProducto> {

    private static final long serialVersionUID = 1047970391L;

    public static final QAuditoriaEstadoProducto auditoriaEstadoProducto = new QAuditoriaEstadoProducto("auditoriaEstadoProducto");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audi_estadoproducto = createNumber("codigo_audi_estadoproducto", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_estado_producto_new = createString("nombre_estado_producto_new");

    public final StringPath nombre_estado_producto_old = createString("nombre_estado_producto_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaEstadoProducto(String variable) {
        super(AuditoriaEstadoProducto.class, forVariable(variable));
    }

    public QAuditoriaEstadoProducto(Path<? extends AuditoriaEstadoProducto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaEstadoProducto(PathMetadata metadata) {
        super(AuditoriaEstadoProducto.class, metadata);
    }

}


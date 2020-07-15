package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaElaboracionProducto is a Querydsl query type for AuditoriaElaboracionProducto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaElaboracionProducto extends EntityPathBase<AuditoriaElaboracionProducto> {

    private static final long serialVersionUID = 1079293002L;

    public static final QAuditoriaElaboracionProducto auditoriaElaboracionProducto = new QAuditoriaElaboracionProducto("auditoriaElaboracionProducto");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audielaboracionproducto = createNumber("codigo_audielaboracionproducto", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath modelo_producto_new = createString("modelo_producto_new");

    public final StringPath modelo_producto_old = createString("modelo_producto_old");

    public final StringPath temporada_producto_new = createString("temporada_producto_new");

    public final StringPath temporada_producto_old = createString("temporada_producto_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaElaboracionProducto(String variable) {
        super(AuditoriaElaboracionProducto.class, forVariable(variable));
    }

    public QAuditoriaElaboracionProducto(Path<? extends AuditoriaElaboracionProducto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaElaboracionProducto(PathMetadata metadata) {
        super(AuditoriaElaboracionProducto.class, metadata);
    }

}


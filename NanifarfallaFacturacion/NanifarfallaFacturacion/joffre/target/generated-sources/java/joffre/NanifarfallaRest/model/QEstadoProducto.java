package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEstadoProducto is a Querydsl query type for EstadoProducto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEstadoProducto extends EntityPathBase<EstadoProducto> {

    private static final long serialVersionUID = -532103502L;

    public static final QEstadoProducto estadoProducto = new QEstadoProducto("estadoProducto");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_estadoproducto = createNumber("codigo_estadoproducto", Integer.class);

    public final StringPath nombre_estado_producto = createString("nombre_estado_producto");

    public final CollectionPath<Producto, QProducto> productos = this.<Producto, QProducto>createCollection("productos", Producto.class, QProducto.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QEstadoProducto(String variable) {
        super(EstadoProducto.class, forVariable(variable));
    }

    public QEstadoProducto(Path<? extends EstadoProducto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstadoProducto(PathMetadata metadata) {
        super(EstadoProducto.class, metadata);
    }

}


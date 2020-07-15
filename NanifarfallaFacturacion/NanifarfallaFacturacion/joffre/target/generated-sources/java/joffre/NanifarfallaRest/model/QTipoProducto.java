package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTipoProducto is a Querydsl query type for TipoProducto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTipoProducto extends EntityPathBase<TipoProducto> {

    private static final long serialVersionUID = 1118186880L;

    public static final QTipoProducto tipoProducto = new QTipoProducto("tipoProducto");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_tipoproducto = createNumber("codigo_tipoproducto", Integer.class);

    public final StringPath foto_ruta = createString("foto_ruta");

    public final StringPath nombre_tipoproducto = createString("nombre_tipoproducto");

    public final NumberPath<Double> precio_costo = createNumber("precio_costo", Double.class);

    public final CollectionPath<Producto, QProducto> productos = this.<Producto, QProducto>createCollection("productos", Producto.class, QProducto.class, PathInits.DIRECT2);

    public final NumberPath<Double> tiempo_produccion = createNumber("tiempo_produccion", Double.class);

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QTipoProducto(String variable) {
        super(TipoProducto.class, forVariable(variable));
    }

    public QTipoProducto(Path<? extends TipoProducto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoProducto(PathMetadata metadata) {
        super(TipoProducto.class, metadata);
    }

}


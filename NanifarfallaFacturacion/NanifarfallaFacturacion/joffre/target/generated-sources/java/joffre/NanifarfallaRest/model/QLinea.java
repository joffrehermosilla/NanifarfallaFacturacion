package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLinea is a Querydsl query type for Linea
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLinea extends EntityPathBase<Linea> {

    private static final long serialVersionUID = -1938406495L;

    public static final QLinea linea = new QLinea("linea");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_linea = createNumber("codigo_linea", Integer.class);

    public final StringPath foto_ruta = createString("foto_ruta");

    public final StringPath nombre_linea = createString("nombre_linea");

    public final CollectionPath<Producto, QProducto> productos = this.<Producto, QProducto>createCollection("productos", Producto.class, QProducto.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QLinea(String variable) {
        super(Linea.class, forVariable(variable));
    }

    public QLinea(Path<? extends Linea> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLinea(PathMetadata metadata) {
        super(Linea.class, metadata);
    }

}


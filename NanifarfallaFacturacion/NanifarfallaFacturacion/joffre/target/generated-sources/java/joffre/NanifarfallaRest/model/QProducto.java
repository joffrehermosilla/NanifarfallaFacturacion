package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProducto is a Querydsl query type for Producto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProducto extends EntityPathBase<Producto> {

    private static final long serialVersionUID = 869675052L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProducto producto = new QProducto("producto");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_producto = createNumber("codigo_producto", Integer.class);

    public final StringPath colores_producto = createString("colores_producto");

    public final StringPath foto_ruta = createString("foto_ruta");

    public final DateTimePath<java.util.Date> ingreso_almacen_producto = createDateTime("ingreso_almacen_producto", java.util.Date.class);

    public final QEstadoProducto mEstadoproducto;

    public final QLinea mLinea;

    public final QTipoProducto mTipoproducto;

    public final StringPath preparacion_producto = createString("preparacion_producto");

    public final CollectionPath<ProductoxPedido, QProductoxPedido> productoxpedido = this.<ProductoxPedido, QProductoxPedido>createCollection("productoxpedido", ProductoxPedido.class, QProductoxPedido.class, PathInits.DIRECT2);

    public final NumberPath<Double> pvf_producto = createNumber("pvf_producto", Double.class);

    public final NumberPath<Double> pvv_producto = createNumber("pvv_producto", Double.class);

    public final StringPath qr_producto = createString("qr_producto");

    public final CollectionPath<RecetaProductotieneInsumo, QRecetaProductotieneInsumo> recetasproductosinsumos = this.<RecetaProductotieneInsumo, QRecetaProductotieneInsumo>createCollection("recetasproductosinsumos", RecetaProductotieneInsumo.class, QRecetaProductotieneInsumo.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> salida_almacen_producto = createDateTime("salida_almacen_producto", java.util.Date.class);

    public final StringPath stock_producto = createString("stock_producto");

    public QProducto(String variable) {
        this(Producto.class, forVariable(variable), INITS);
    }

    public QProducto(Path<? extends Producto> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProducto(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProducto(PathMetadata metadata, PathInits inits) {
        this(Producto.class, metadata, inits);
    }

    public QProducto(Class<? extends Producto> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mEstadoproducto = inits.isInitialized("mEstadoproducto") ? new QEstadoProducto(forProperty("mEstadoproducto")) : null;
        this.mLinea = inits.isInitialized("mLinea") ? new QLinea(forProperty("mLinea")) : null;
        this.mTipoproducto = inits.isInitialized("mTipoproducto") ? new QTipoProducto(forProperty("mTipoproducto")) : null;
    }

}


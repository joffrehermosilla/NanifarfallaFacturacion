package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInsumo is a Querydsl query type for Insumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInsumo extends EntityPathBase<Insumo> {

    private static final long serialVersionUID = -42164235L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInsumo insumo = new QInsumo("insumo");

    public final NumberPath<Double> cantidad_uni_insumo_almacen = createNumber("cantidad_uni_insumo_almacen", Double.class);

    public final StringPath claveApi = createString("claveApi");

    public final StringPath codigo_barras = createString("codigo_barras");

    public final NumberPath<Integer> codigo_insumo = createNumber("codigo_insumo", Integer.class);

    public final StringPath codigo_marca = createString("codigo_marca");

    public final StringPath codigo_qr = createString("codigo_qr");

    public final StringPath descripcion_insumo = createString("descripcion_insumo");

    public final DateTimePath<java.util.Date> fecha_ingreso = createDateTime("fecha_ingreso", java.util.Date.class);

    public final DateTimePath<java.util.Date> fecha_salida = createDateTime("fecha_salida", java.util.Date.class);

    public final DateTimePath<java.util.Date> fecha_vencimiento = createDateTime("fecha_vencimiento", java.util.Date.class);

    public final StringPath foto_ruta = createString("foto_ruta");

    public final StringPath lote_marca_insumo = createString("lote_marca_insumo");

    public final StringPath marca_insumo = createString("marca_insumo");

    public final QEstadoInsumo mEstadoinsumo;

    public final QLoteInsumo mLoteinsumo;

    public final QPresentacionInsumo mPresentacion_insumo;

    public final QTipoInsumo mTipoinsumo;

    public final StringPath nombre_insumo = createString("nombre_insumo");

    public final NumberPath<Double> precio_uni_promocion = createNumber("precio_uni_promocion", Double.class);

    public final NumberPath<Double> precio_unitario = createNumber("precio_unitario", Double.class);

    public final CollectionPath<RecetaProductotieneInsumo, QRecetaProductotieneInsumo> recetasproductoinsumos = this.<RecetaProductotieneInsumo, QRecetaProductotieneInsumo>createCollection("recetasproductoinsumos", RecetaProductotieneInsumo.class, QRecetaProductotieneInsumo.class, PathInits.DIRECT2);

    public final NumberPath<Integer> stock_actual = createNumber("stock_actual", Integer.class);

    public final NumberPath<Double> temperatura_ambiente = createNumber("temperatura_ambiente", Double.class);

    public final StringPath unidad_medida = createString("unidad_medida");

    public QInsumo(String variable) {
        this(Insumo.class, forVariable(variable), INITS);
    }

    public QInsumo(Path<? extends Insumo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInsumo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInsumo(PathMetadata metadata, PathInits inits) {
        this(Insumo.class, metadata, inits);
    }

    public QInsumo(Class<? extends Insumo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mEstadoinsumo = inits.isInitialized("mEstadoinsumo") ? new QEstadoInsumo(forProperty("mEstadoinsumo")) : null;
        this.mLoteinsumo = inits.isInitialized("mLoteinsumo") ? new QLoteInsumo(forProperty("mLoteinsumo")) : null;
        this.mPresentacion_insumo = inits.isInitialized("mPresentacion_insumo") ? new QPresentacionInsumo(forProperty("mPresentacion_insumo")) : null;
        this.mTipoinsumo = inits.isInitialized("mTipoinsumo") ? new QTipoInsumo(forProperty("mTipoinsumo")) : null;
    }

}


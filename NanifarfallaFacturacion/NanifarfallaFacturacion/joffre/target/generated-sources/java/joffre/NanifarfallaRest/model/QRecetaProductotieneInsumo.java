package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecetaProductotieneInsumo is a Querydsl query type for RecetaProductotieneInsumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRecetaProductotieneInsumo extends EntityPathBase<RecetaProductotieneInsumo> {

    private static final long serialVersionUID = 1007007298L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecetaProductotieneInsumo recetaProductotieneInsumo = new QRecetaProductotieneInsumo("recetaProductotieneInsumo");

    public final NumberPath<Double> cantidad_usada = createNumber("cantidad_usada", Double.class);

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_rece_produ_ti_insumo = createNumber("codigo_rece_produ_ti_insumo", Integer.class);

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Double> dimension_altura = createNumber("dimension_altura", Double.class);

    public final NumberPath<Double> dimension_anchura = createNumber("dimension_anchura", Double.class);

    public final NumberPath<Double> dimension_espesor = createNumber("dimension_espesor", Double.class);

    public final NumberPath<Double> dimension_profundidad = createNumber("dimension_profundidad", Double.class);

    public final DateTimePath<java.util.Date> fecha_creacion = createDateTime("fecha_creacion", java.util.Date.class);

    public final QElaboracionProducto mElaboracionproducto;

    public final QInsumo mInsumo;

    public final QProducto mProducto;

    public final NumberPath<Double> peso = createNumber("peso", Double.class);

    public final NumberPath<Double> porcentaje_en_producto = createNumber("porcentaje_en_producto", Double.class);

    public QRecetaProductotieneInsumo(String variable) {
        this(RecetaProductotieneInsumo.class, forVariable(variable), INITS);
    }

    public QRecetaProductotieneInsumo(Path<? extends RecetaProductotieneInsumo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecetaProductotieneInsumo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecetaProductotieneInsumo(PathMetadata metadata, PathInits inits) {
        this(RecetaProductotieneInsumo.class, metadata, inits);
    }

    public QRecetaProductotieneInsumo(Class<? extends RecetaProductotieneInsumo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mElaboracionproducto = inits.isInitialized("mElaboracionproducto") ? new QElaboracionProducto(forProperty("mElaboracionproducto")) : null;
        this.mInsumo = inits.isInitialized("mInsumo") ? new QInsumo(forProperty("mInsumo"), inits.get("mInsumo")) : null;
        this.mProducto = inits.isInitialized("mProducto") ? new QProducto(forProperty("mProducto"), inits.get("mProducto")) : null;
    }

}


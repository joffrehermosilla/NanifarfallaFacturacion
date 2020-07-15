package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QElaboracionProducto is a Querydsl query type for ElaboracionProducto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QElaboracionProducto extends EntityPathBase<ElaboracionProducto> {

    private static final long serialVersionUID = -1180092209L;

    public static final QElaboracionProducto elaboracionProducto = new QElaboracionProducto("elaboracionProducto");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_elaboracionproducto = createNumber("codigo_elaboracionproducto", Integer.class);

    public final StringPath modelo_producto = createString("modelo_producto");

    public final CollectionPath<RecetaProductotieneInsumo, QRecetaProductotieneInsumo> recetasproductotieneinsumo = this.<RecetaProductotieneInsumo, QRecetaProductotieneInsumo>createCollection("recetasproductotieneinsumo", RecetaProductotieneInsumo.class, QRecetaProductotieneInsumo.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> temporada_producto = createDateTime("temporada_producto", java.util.Date.class);

    public QElaboracionProducto(String variable) {
        super(ElaboracionProducto.class, forVariable(variable));
    }

    public QElaboracionProducto(Path<? extends ElaboracionProducto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QElaboracionProducto(PathMetadata metadata) {
        super(ElaboracionProducto.class, metadata);
    }

}


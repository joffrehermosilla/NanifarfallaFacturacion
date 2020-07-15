package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductoxPedido is a Querydsl query type for ProductoxPedido
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProductoxPedido extends EntityPathBase<ProductoxPedido> {

    private static final long serialVersionUID = 1555386417L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductoxPedido productoxPedido = new QProductoxPedido("productoxPedido");

    public final NumberPath<Integer> cantidad_producto = createNumber("cantidad_producto", Integer.class);

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_producto_por_pedido = createNumber("codigo_producto_por_pedido", Integer.class);

    public final NumberPath<Double> descuento_promocion = createNumber("descuento_promocion", Double.class);

    public final QCliente_tiene_pedido mClientetienepedido;

    public final QProducto mProducto;

    public final NumberPath<Double> valor_con_igv = createNumber("valor_con_igv", Double.class);

    public final NumberPath<Double> valor_neto = createNumber("valor_neto", Double.class);

    public QProductoxPedido(String variable) {
        this(ProductoxPedido.class, forVariable(variable), INITS);
    }

    public QProductoxPedido(Path<? extends ProductoxPedido> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductoxPedido(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductoxPedido(PathMetadata metadata, PathInits inits) {
        this(ProductoxPedido.class, metadata, inits);
    }

    public QProductoxPedido(Class<? extends ProductoxPedido> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mClientetienepedido = inits.isInitialized("mClientetienepedido") ? new QCliente_tiene_pedido(forProperty("mClientetienepedido"), inits.get("mClientetienepedido")) : null;
        this.mProducto = inits.isInitialized("mProducto") ? new QProducto(forProperty("mProducto"), inits.get("mProducto")) : null;
    }

}


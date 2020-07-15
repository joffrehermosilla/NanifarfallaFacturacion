package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPromocionVenta is a Querydsl query type for PromocionVenta
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPromocionVenta extends EntityPathBase<PromocionVenta> {

    private static final long serialVersionUID = -1974885852L;

    public static final QPromocionVenta promocionVenta = new QPromocionVenta("promocionVenta");

    public final NumberPath<Integer> cantidad_sku_pedido = createNumber("cantidad_sku_pedido", Integer.class);

    public final StringPath claveApi = createString("claveApi");

    public final CollectionPath<Cliente_tiene_pedido, QCliente_tiene_pedido> cliente_tiene_pedido = this.<Cliente_tiene_pedido, QCliente_tiene_pedido>createCollection("cliente_tiene_pedido", Cliente_tiene_pedido.class, QCliente_tiene_pedido.class, PathInits.DIRECT2);

    public final NumberPath<Integer> codigo_promocion_venta = createNumber("codigo_promocion_venta", Integer.class);

    public final StringPath descripcion_promocion = createString("descripcion_promocion");

    public final NumberPath<Double> descuento_sku_pedido = createNumber("descuento_sku_pedido", Double.class);

    public final DateTimePath<java.util.Date> fecha_expiracion_promocion = createDateTime("fecha_expiracion_promocion", java.util.Date.class);

    public final DateTimePath<java.util.Date> fecha_inicio_promocion = createDateTime("fecha_inicio_promocion", java.util.Date.class);

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QPromocionVenta(String variable) {
        super(PromocionVenta.class, forVariable(variable));
    }

    public QPromocionVenta(Path<? extends PromocionVenta> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPromocionVenta(PathMetadata metadata) {
        super(PromocionVenta.class, metadata);
    }

}


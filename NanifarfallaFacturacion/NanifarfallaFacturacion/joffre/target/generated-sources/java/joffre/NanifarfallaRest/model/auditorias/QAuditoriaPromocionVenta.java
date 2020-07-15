package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaPromocionVenta is a Querydsl query type for AuditoriaPromocionVenta
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaPromocionVenta extends EntityPathBase<AuditoriaPromocionVenta> {

    private static final long serialVersionUID = -394811959L;

    public static final QAuditoriaPromocionVenta auditoriaPromocionVenta = new QAuditoriaPromocionVenta("auditoriaPromocionVenta");

    public final NumberPath<Integer> cantidad_sku_pedido_new = createNumber("cantidad_sku_pedido_new", Integer.class);

    public final NumberPath<Integer> cantidad_sku_pedido_old = createNumber("cantidad_sku_pedido_old", Integer.class);

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audi_promocion_venta = createNumber("codigo_audi_promocion_venta", Integer.class);

    public final StringPath descripcion_promocion_new = createString("descripcion_promocion_new");

    public final StringPath descripcion_promocion_old = createString("descripcion_promocion_old");

    public final NumberPath<Double> descuento_sku_pedido_new = createNumber("descuento_sku_pedido_new", Double.class);

    public final NumberPath<Double> descuento_sku_pedido_old = createNumber("descuento_sku_pedido_old", Double.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final DateTimePath<java.util.Date> fecha_expiracion_promocion_new = createDateTime("fecha_expiracion_promocion_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> fecha_expiracion_promocion_old = createDateTime("fecha_expiracion_promocion_old", java.util.Date.class);

    public final DateTimePath<java.util.Date> fecha_inicio_promocion_new = createDateTime("fecha_inicio_promocion_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> fecha_inicio_promocion_old = createDateTime("fecha_inicio_promocion_old", java.util.Date.class);

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaPromocionVenta(String variable) {
        super(AuditoriaPromocionVenta.class, forVariable(variable));
    }

    public QAuditoriaPromocionVenta(Path<? extends AuditoriaPromocionVenta> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaPromocionVenta(PathMetadata metadata) {
        super(AuditoriaPromocionVenta.class, metadata);
    }

}


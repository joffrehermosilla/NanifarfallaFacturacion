package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCliente_tiene_pedido is a Querydsl query type for Cliente_tiene_pedido
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCliente_tiene_pedido extends EntityPathBase<Cliente_tiene_pedido> {

    private static final long serialVersionUID = -2116889810L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCliente_tiene_pedido cliente_tiene_pedido = new QCliente_tiene_pedido("cliente_tiene_pedido");

    public final NumberPath<Integer> cantidad_producto = createNumber("cantidad_producto", Integer.class);

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_pedido_web = createNumber("codigo_pedido_web", Integer.class);

    public final NumberPath<Double> descuento_web_pedido = createNumber("descuento_web_pedido", Double.class);

    public final DateTimePath<java.util.Date> fecha_entrega = createDateTime("fecha_entrega", java.util.Date.class);

    public final DateTimePath<java.util.Date> fecha_pedido = createDateTime("fecha_pedido", java.util.Date.class);

    public final QCliente mCliente;

    public final QEstado_clientetienepedido mEstado_cliente_tiene_pedido;

    public final QFactura_ctienepedido mFactura_cliente_tiene_pedido;

    public final QIgvVenta mIgv_venta;

    public final NumberPath<Double> monto_por_descuentos = createNumber("monto_por_descuentos", Double.class);

    public final QPromocionVenta mPromocion_venta;

    public final QUsuario mUsuario;

    public final QVendedor mVendedor;

    public final NumberPath<Double> precio_uni_desc_igv = createNumber("precio_uni_desc_igv", Double.class);

    public final NumberPath<Double> precio_uni_desc_sin_igv = createNumber("precio_uni_desc_sin_igv", Double.class);

    public final CollectionPath<ProductoxPedido, QProductoxPedido> productoxpedido = this.<ProductoxPedido, QProductoxPedido>createCollection("productoxpedido", ProductoxPedido.class, QProductoxPedido.class, PathInits.DIRECT2);

    public QCliente_tiene_pedido(String variable) {
        this(Cliente_tiene_pedido.class, forVariable(variable), INITS);
    }

    public QCliente_tiene_pedido(Path<? extends Cliente_tiene_pedido> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCliente_tiene_pedido(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCliente_tiene_pedido(PathMetadata metadata, PathInits inits) {
        this(Cliente_tiene_pedido.class, metadata, inits);
    }

    public QCliente_tiene_pedido(Class<? extends Cliente_tiene_pedido> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mCliente = inits.isInitialized("mCliente") ? new QCliente(forProperty("mCliente"), inits.get("mCliente")) : null;
        this.mEstado_cliente_tiene_pedido = inits.isInitialized("mEstado_cliente_tiene_pedido") ? new QEstado_clientetienepedido(forProperty("mEstado_cliente_tiene_pedido")) : null;
        this.mFactura_cliente_tiene_pedido = inits.isInitialized("mFactura_cliente_tiene_pedido") ? new QFactura_ctienepedido(forProperty("mFactura_cliente_tiene_pedido")) : null;
        this.mIgv_venta = inits.isInitialized("mIgv_venta") ? new QIgvVenta(forProperty("mIgv_venta"), inits.get("mIgv_venta")) : null;
        this.mPromocion_venta = inits.isInitialized("mPromocion_venta") ? new QPromocionVenta(forProperty("mPromocion_venta")) : null;
        this.mUsuario = inits.isInitialized("mUsuario") ? new QUsuario(forProperty("mUsuario"), inits.get("mUsuario")) : null;
        this.mVendedor = inits.isInitialized("mVendedor") ? new QVendedor(forProperty("mVendedor"), inits.get("mVendedor")) : null;
    }

}


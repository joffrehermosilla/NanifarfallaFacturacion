package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaFacturaClienteTienePedido is a Querydsl query type for AuditoriaFacturaClienteTienePedido
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaFacturaClienteTienePedido extends EntityPathBase<AuditoriaFacturaClienteTienePedido> {

    private static final long serialVersionUID = 1300609433L;

    public static final QAuditoriaFacturaClienteTienePedido auditoriaFacturaClienteTienePedido = new QAuditoriaFacturaClienteTienePedido("auditoriaFacturaClienteTienePedido");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audi_factura_cliente_tiene_pedido = createNumber("codigo_audi_factura_cliente_tiene_pedido", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_factura_cliente_tiene_pedido_new = createString("nombre_factura_cliente_tiene_pedido_new");

    public final StringPath nombre_factura_cliente_tiene_pedido_old = createString("nombre_factura_cliente_tiene_pedido_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaFacturaClienteTienePedido(String variable) {
        super(AuditoriaFacturaClienteTienePedido.class, forVariable(variable));
    }

    public QAuditoriaFacturaClienteTienePedido(Path<? extends AuditoriaFacturaClienteTienePedido> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaFacturaClienteTienePedido(PathMetadata metadata) {
        super(AuditoriaFacturaClienteTienePedido.class, metadata);
    }

}


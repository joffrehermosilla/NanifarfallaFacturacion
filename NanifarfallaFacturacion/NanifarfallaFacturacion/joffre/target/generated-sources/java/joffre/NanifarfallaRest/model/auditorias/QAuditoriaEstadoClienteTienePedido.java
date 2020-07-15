package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaEstadoClienteTienePedido is a Querydsl query type for AuditoriaEstadoClienteTienePedido
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaEstadoClienteTienePedido extends EntityPathBase<AuditoriaEstadoClienteTienePedido> {

    private static final long serialVersionUID = -2142976439L;

    public static final QAuditoriaEstadoClienteTienePedido auditoriaEstadoClienteTienePedido = new QAuditoriaEstadoClienteTienePedido("auditoriaEstadoClienteTienePedido");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audi_e_cli_tiene_pedido = createNumber("codigo_audi_e_cli_tiene_pedido", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_estado_cliente_tiene_pedido_new = createString("nombre_estado_cliente_tiene_pedido_new");

    public final StringPath nombre_estado_cliente_tiene_pedido_old = createString("nombre_estado_cliente_tiene_pedido_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaEstadoClienteTienePedido(String variable) {
        super(AuditoriaEstadoClienteTienePedido.class, forVariable(variable));
    }

    public QAuditoriaEstadoClienteTienePedido(Path<? extends AuditoriaEstadoClienteTienePedido> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaEstadoClienteTienePedido(PathMetadata metadata) {
        super(AuditoriaEstadoClienteTienePedido.class, metadata);
    }

}


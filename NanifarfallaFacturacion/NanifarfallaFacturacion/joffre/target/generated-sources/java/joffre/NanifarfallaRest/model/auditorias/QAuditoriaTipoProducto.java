package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaTipoProducto is a Querydsl query type for AuditoriaTipoProducto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaTipoProducto extends EntityPathBase<AuditoriaTipoProducto> {

    private static final long serialVersionUID = -77932955L;

    public static final QAuditoriaTipoProducto auditoriaTipoProducto = new QAuditoriaTipoProducto("auditoriaTipoProducto");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_auditipoproducto = createNumber("codigo_auditipoproducto", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath foto_ruta_new = createString("foto_ruta_new");

    public final StringPath foto_ruta_old = createString("foto_ruta_old");

    public final StringPath nombre_tipoproducto_new = createString("nombre_tipoproducto_new");

    public final StringPath nombre_tipoproducto_old = createString("nombre_tipoproducto_old");

    public final NumberPath<Double> precio_costo_new = createNumber("precio_costo_new", Double.class);

    public final NumberPath<Double> precio_costo_old = createNumber("precio_costo_old", Double.class);

    public final NumberPath<Double> tiempo_produccion_new = createNumber("tiempo_produccion_new", Double.class);

    public final NumberPath<Double> tiempo_produccion_old = createNumber("tiempo_produccion_old", Double.class);

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaTipoProducto(String variable) {
        super(AuditoriaTipoProducto.class, forVariable(variable));
    }

    public QAuditoriaTipoProducto(Path<? extends AuditoriaTipoProducto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaTipoProducto(PathMetadata metadata) {
        super(AuditoriaTipoProducto.class, metadata);
    }

}


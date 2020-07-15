package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTipoImpuesto is a Querydsl query type for TipoImpuesto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTipoImpuesto extends EntityPathBase<TipoImpuesto> {

    private static final long serialVersionUID = 1704733042L;

    public static final QTipoImpuesto tipoImpuesto = new QTipoImpuesto("tipoImpuesto");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_tipo_impuesto = createNumber("codigo_tipo_impuesto", Integer.class);

    public final CollectionPath<IgvVenta, QIgvVenta> igvventas = this.<IgvVenta, QIgvVenta>createCollection("igvventas", IgvVenta.class, QIgvVenta.class, PathInits.DIRECT2);

    public final StringPath nombre_tipo_impuesto = createString("nombre_tipo_impuesto");

    public final NumberPath<Double> porcentaje_tipo_impuesto = createNumber("porcentaje_tipo_impuesto", Double.class);

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QTipoImpuesto(String variable) {
        super(TipoImpuesto.class, forVariable(variable));
    }

    public QTipoImpuesto(Path<? extends TipoImpuesto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoImpuesto(PathMetadata metadata) {
        super(TipoImpuesto.class, metadata);
    }

}


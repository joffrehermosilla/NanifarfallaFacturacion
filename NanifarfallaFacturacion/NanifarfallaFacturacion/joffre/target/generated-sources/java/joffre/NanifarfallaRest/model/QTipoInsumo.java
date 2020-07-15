package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTipoInsumo is a Querydsl query type for TipoInsumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTipoInsumo extends EntityPathBase<TipoInsumo> {

    private static final long serialVersionUID = -1793858999L;

    public static final QTipoInsumo tipoInsumo = new QTipoInsumo("tipoInsumo");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_tipoinsumo = createNumber("codigo_tipoinsumo", Integer.class);

    public final CollectionPath<Insumo, QInsumo> insumo = this.<Insumo, QInsumo>createCollection("insumo", Insumo.class, QInsumo.class, PathInits.DIRECT2);

    public final StringPath nombre_tipo_insumo = createString("nombre_tipo_insumo");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QTipoInsumo(String variable) {
        super(TipoInsumo.class, forVariable(variable));
    }

    public QTipoInsumo(Path<? extends TipoInsumo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoInsumo(PathMetadata metadata) {
        super(TipoInsumo.class, metadata);
    }

}


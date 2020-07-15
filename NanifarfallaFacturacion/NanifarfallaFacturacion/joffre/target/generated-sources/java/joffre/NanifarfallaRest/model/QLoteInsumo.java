package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLoteInsumo is a Querydsl query type for LoteInsumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLoteInsumo extends EntityPathBase<LoteInsumo> {

    private static final long serialVersionUID = -85371319L;

    public static final QLoteInsumo loteInsumo = new QLoteInsumo("loteInsumo");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_loteinsumo = createNumber("codigo_loteinsumo", Integer.class);

    public final CollectionPath<Insumo, QInsumo> insumo = this.<Insumo, QInsumo>createCollection("insumo", Insumo.class, QInsumo.class, PathInits.DIRECT2);

    public final StringPath nombre_lote_insumo = createString("nombre_lote_insumo");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QLoteInsumo(String variable) {
        super(LoteInsumo.class, forVariable(variable));
    }

    public QLoteInsumo(Path<? extends LoteInsumo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLoteInsumo(PathMetadata metadata) {
        super(LoteInsumo.class, metadata);
    }

}


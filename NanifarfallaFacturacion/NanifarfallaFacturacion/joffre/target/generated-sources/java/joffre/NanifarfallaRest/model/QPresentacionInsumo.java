package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPresentacionInsumo is a Querydsl query type for PresentacionInsumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPresentacionInsumo extends EntityPathBase<PresentacionInsumo> {

    private static final long serialVersionUID = 1534229152L;

    public static final QPresentacionInsumo presentacionInsumo = new QPresentacionInsumo("presentacionInsumo");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_presentacioninsumo = createNumber("codigo_presentacioninsumo", Integer.class);

    public final CollectionPath<Insumo, QInsumo> insumo = this.<Insumo, QInsumo>createCollection("insumo", Insumo.class, QInsumo.class, PathInits.DIRECT2);

    public final StringPath nombre_presentacion_insumo = createString("nombre_presentacion_insumo");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QPresentacionInsumo(String variable) {
        super(PresentacionInsumo.class, forVariable(variable));
    }

    public QPresentacionInsumo(Path<? extends PresentacionInsumo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPresentacionInsumo(PathMetadata metadata) {
        super(PresentacionInsumo.class, metadata);
    }

}


package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArea is a Querydsl query type for Area
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArea extends EntityPathBase<Area> {

    private static final long serialVersionUID = 906982745L;

    public static final QArea area = new QArea("area");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_area = createNumber("codigo_area", Integer.class);

    public final StringPath nombre_area = createString("nombre_area");

    public final CollectionPath<Vendedor, QVendedor> vendedor = this.<Vendedor, QVendedor>createCollection("vendedor", Vendedor.class, QVendedor.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QArea(String variable) {
        super(Area.class, forVariable(variable));
    }

    public QArea(Path<? extends Area> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArea(PathMetadata metadata) {
        super(Area.class, metadata);
    }

}


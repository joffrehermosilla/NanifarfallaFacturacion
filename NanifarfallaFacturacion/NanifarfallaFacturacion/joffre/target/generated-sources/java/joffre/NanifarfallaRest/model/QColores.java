package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QColores is a Querydsl query type for Colores
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QColores extends EntityPathBase<Colores> {

    private static final long serialVersionUID = 1979811589L;

    public static final QColores colores = new QColores("colores");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_colores = createNumber("codigo_colores", Integer.class);

    public final StringPath nombre_color = createString("nombre_color");

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QColores(String variable) {
        super(Colores.class, forVariable(variable));
    }

    public QColores(Path<? extends Colores> path) {
        super(path.getType(), path.getMetadata());
    }

    public QColores(PathMetadata metadata) {
        super(Colores.class, metadata);
    }

}


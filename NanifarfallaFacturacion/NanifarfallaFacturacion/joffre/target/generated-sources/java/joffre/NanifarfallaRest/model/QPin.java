package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPin is a Querydsl query type for Pin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPin extends EntityPathBase<Pin> {

    private static final long serialVersionUID = -802012343L;

    public static final QPin pin = new QPin("pin");

    public final NumberPath<Integer> codigo_pin = createNumber("codigo_pin", Integer.class);

    public final StringPath idUsuario = createString("idUsuario");

    public final StringPath value = createString("value");

    public QPin(String variable) {
        super(Pin.class, forVariable(variable));
    }

    public QPin(Path<? extends Pin> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPin(PathMetadata metadata) {
        super(Pin.class, metadata);
    }

}


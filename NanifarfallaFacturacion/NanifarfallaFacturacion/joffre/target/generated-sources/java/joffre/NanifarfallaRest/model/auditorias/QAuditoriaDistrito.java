package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaDistrito is a Querydsl query type for AuditoriaDistrito
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaDistrito extends EntityPathBase<AuditoriaDistrito> {

    private static final long serialVersionUID = 204634057L;

    public static final QAuditoriaDistrito auditoriaDistrito = new QAuditoriaDistrito("auditoriaDistrito");

    public final NumberPath<Integer> codigo_audi_distrito = createNumber("codigo_audi_distrito", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final NumberPath<Integer> fkcodigo_ciudad_new = createNumber("fkcodigo_ciudad_new", Integer.class);

    public final NumberPath<Integer> fkcodigo_ciudad_old = createNumber("fkcodigo_ciudad_old", Integer.class);

    public final StringPath nombre_distrito_new = createString("nombre_distrito_new");

    public final StringPath nombre_distrito_old = createString("nombre_distrito_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaDistrito(String variable) {
        super(AuditoriaDistrito.class, forVariable(variable));
    }

    public QAuditoriaDistrito(Path<? extends AuditoriaDistrito> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaDistrito(PathMetadata metadata) {
        super(AuditoriaDistrito.class, metadata);
    }

}


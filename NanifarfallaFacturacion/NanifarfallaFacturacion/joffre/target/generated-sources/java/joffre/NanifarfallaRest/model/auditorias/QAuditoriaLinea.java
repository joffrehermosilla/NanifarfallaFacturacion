package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaLinea is a Querydsl query type for AuditoriaLinea
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaLinea extends EntityPathBase<AuditoriaLinea> {

    private static final long serialVersionUID = 748135004L;

    public static final QAuditoriaLinea auditoriaLinea = new QAuditoriaLinea("auditoriaLinea");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audi_linea = createNumber("codigo_audi_linea", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath foto_linea_new = createString("foto_linea_new");

    public final StringPath foto_linea_old = createString("foto_linea_old");

    public final StringPath nombre_linea_new = createString("nombre_linea_new");

    public final StringPath nombre_linea_old = createString("nombre_linea_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaLinea(String variable) {
        super(AuditoriaLinea.class, forVariable(variable));
    }

    public QAuditoriaLinea(Path<? extends AuditoriaLinea> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaLinea(PathMetadata metadata) {
        super(AuditoriaLinea.class, metadata);
    }

}


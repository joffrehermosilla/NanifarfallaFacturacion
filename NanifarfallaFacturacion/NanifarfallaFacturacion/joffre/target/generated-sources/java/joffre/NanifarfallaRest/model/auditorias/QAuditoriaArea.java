package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaArea is a Querydsl query type for AuditoriaArea
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaArea extends EntityPathBase<AuditoriaArea> {

    private static final long serialVersionUID = 993645374L;

    public static final QAuditoriaArea auditoriaArea = new QAuditoriaArea("auditoriaArea");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audiarea = createNumber("codigo_audiarea", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_area_new = createString("nombre_area_new");

    public final StringPath nombre_area_old = createString("nombre_area_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaArea(String variable) {
        super(AuditoriaArea.class, forVariable(variable));
    }

    public QAuditoriaArea(Path<? extends AuditoriaArea> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaArea(PathMetadata metadata) {
        super(AuditoriaArea.class, metadata);
    }

}


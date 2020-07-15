package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaLoteInsumo is a Querydsl query type for AuditoriaLoteInsumo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaLoteInsumo extends EntityPathBase<AuditoriaLoteInsumo> {

    private static final long serialVersionUID = -301140882L;

    public static final QAuditoriaLoteInsumo auditoriaLoteInsumo = new QAuditoriaLoteInsumo("auditoriaLoteInsumo");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audiloteinsumo = createNumber("codigo_audiloteinsumo", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_lote_insumo_new = createString("nombre_lote_insumo_new");

    public final StringPath nombre_lote_insumo_old = createString("nombre_lote_insumo_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaLoteInsumo(String variable) {
        super(AuditoriaLoteInsumo.class, forVariable(variable));
    }

    public QAuditoriaLoteInsumo(Path<? extends AuditoriaLoteInsumo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaLoteInsumo(PathMetadata metadata) {
        super(AuditoriaLoteInsumo.class, metadata);
    }

}


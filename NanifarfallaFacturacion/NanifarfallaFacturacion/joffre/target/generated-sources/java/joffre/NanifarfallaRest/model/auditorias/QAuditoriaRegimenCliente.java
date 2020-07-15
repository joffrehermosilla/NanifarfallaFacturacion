package joffre.NanifarfallaRest.model.auditorias;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditoriaRegimenCliente is a Querydsl query type for AuditoriaRegimenCliente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditoriaRegimenCliente extends EntityPathBase<AuditoriaRegimenCliente> {

    private static final long serialVersionUID = 735553738L;

    public static final QAuditoriaRegimenCliente auditoriaRegimenCliente = new QAuditoriaRegimenCliente("auditoriaRegimenCliente");

    public final StringPath claveApi_new = createString("claveApi_new");

    public final StringPath claveApi_old = createString("claveApi_old");

    public final NumberPath<Integer> codigo_audiregimencliente = createNumber("codigo_audiregimencliente", Integer.class);

    public final DateTimePath<java.util.Date> fecha_cambio = createDateTime("fecha_cambio", java.util.Date.class);

    public final StringPath nombre_regimencliente_new = createString("nombre_regimencliente_new");

    public final StringPath nombre_regimencliente_old = createString("nombre_regimencliente_old");

    public final StringPath usuario = createString("usuario");

    public final DateTimePath<java.util.Date> version_new = createDateTime("version_new", java.util.Date.class);

    public final DateTimePath<java.util.Date> version_old = createDateTime("version_old", java.util.Date.class);

    public QAuditoriaRegimenCliente(String variable) {
        super(AuditoriaRegimenCliente.class, forVariable(variable));
    }

    public QAuditoriaRegimenCliente(Path<? extends AuditoriaRegimenCliente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditoriaRegimenCliente(PathMetadata metadata) {
        super(AuditoriaRegimenCliente.class, metadata);
    }

}


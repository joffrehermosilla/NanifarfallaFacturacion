package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRegimenCliente is a Querydsl query type for RegimenCliente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRegimenCliente extends EntityPathBase<RegimenCliente> {

    private static final long serialVersionUID = -844520155L;

    public static final QRegimenCliente regimenCliente = new QRegimenCliente("regimenCliente");

    public final StringPath claveApi = createString("claveApi");

    public final CollectionPath<Cliente, QCliente> cliente = this.<Cliente, QCliente>createCollection("cliente", Cliente.class, QCliente.class, PathInits.DIRECT2);

    public final NumberPath<Integer> codigo_regimencliente = createNumber("codigo_regimencliente", Integer.class);

    public final StringPath nombre_regimencliente = createString("nombre_regimencliente");

    public QRegimenCliente(String variable) {
        super(RegimenCliente.class, forVariable(variable));
    }

    public QRegimenCliente(Path<? extends RegimenCliente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegimenCliente(PathMetadata metadata) {
        super(RegimenCliente.class, metadata);
    }

}


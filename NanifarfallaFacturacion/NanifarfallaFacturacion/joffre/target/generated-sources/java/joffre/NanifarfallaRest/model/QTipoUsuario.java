package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTipoUsuario is a Querydsl query type for TipoUsuario
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTipoUsuario extends EntityPathBase<TipoUsuario> {

    private static final long serialVersionUID = -1865510130L;

    public static final QTipoUsuario tipoUsuario = new QTipoUsuario("tipoUsuario");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_tipousuario = createNumber("codigo_tipousuario", Integer.class);

    public final StringPath nombre_tipousuario = createString("nombre_tipousuario");

    public final CollectionPath<Usuario, QUsuario> usuario = this.<Usuario, QUsuario>createCollection("usuario", Usuario.class, QUsuario.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> version = createDateTime("version", java.util.Date.class);

    public QTipoUsuario(String variable) {
        super(TipoUsuario.class, forVariable(variable));
    }

    public QTipoUsuario(Path<? extends TipoUsuario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoUsuario(PathMetadata metadata) {
        super(TipoUsuario.class, metadata);
    }

}


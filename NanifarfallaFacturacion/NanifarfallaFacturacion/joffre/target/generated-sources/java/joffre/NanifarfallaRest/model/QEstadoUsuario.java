package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEstadoUsuario is a Querydsl query type for EstadoUsuario
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEstadoUsuario extends EntityPathBase<EstadoUsuario> {

    private static final long serialVersionUID = 1960579996L;

    public static final QEstadoUsuario estadoUsuario = new QEstadoUsuario("estadoUsuario");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_estadousuario = createNumber("codigo_estadousuario", Integer.class);

    public final StringPath nombre_estadousuario = createString("nombre_estadousuario");

    public final CollectionPath<Usuario, QUsuario> usuario = this.<Usuario, QUsuario>createCollection("usuario", Usuario.class, QUsuario.class, PathInits.DIRECT2);

    public QEstadoUsuario(String variable) {
        super(EstadoUsuario.class, forVariable(variable));
    }

    public QEstadoUsuario(Path<? extends EstadoUsuario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstadoUsuario(PathMetadata metadata) {
        super(EstadoUsuario.class, metadata);
    }

}


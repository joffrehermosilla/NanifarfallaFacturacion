package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsuario is a Querydsl query type for Usuario
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUsuario extends EntityPathBase<Usuario> {

    private static final long serialVersionUID = 897420002L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUsuario usuario = new QUsuario("usuario");

    public final StringPath apellido_usuario = createString("apellido_usuario");

    public final StringPath claveApi = createString("claveApi");

    public final CollectionPath<Cliente, QCliente> cliente = this.<Cliente, QCliente>createCollection("cliente", Cliente.class, QCliente.class, PathInits.DIRECT2);

    public final CollectionPath<Cliente_tiene_pedido, QCliente_tiene_pedido> cliente_tiene_pedido = this.<Cliente_tiene_pedido, QCliente_tiene_pedido>createCollection("cliente_tiene_pedido", Cliente_tiene_pedido.class, QCliente_tiene_pedido.class, PathInits.DIRECT2);

    public final NumberPath<Integer> codigo_usuario = createNumber("codigo_usuario", Integer.class);

    public final StringPath direccion_usuario = createString("direccion_usuario");

    public final QDistrito distrito;

    public final QEstadoUsuario estadousuario;

    public final DateTimePath<java.util.Date> fecha_nacimiento = createDateTime("fecha_nacimiento", java.util.Date.class);

    public final StringPath nombre_logeo_usuario = createString("nombre_logeo_usuario");

    public final StringPath nombre_usuario = createString("nombre_usuario");

    public final StringPath password_usuario = createString("password_usuario");

    public final StringPath ruta_foto_usuario = createString("ruta_foto_usuario");

    public final QTipoUsuario tipousuario;

    public final CollectionPath<Vendedor, QVendedor> vendedor = this.<Vendedor, QVendedor>createCollection("vendedor", Vendedor.class, QVendedor.class, PathInits.DIRECT2);

    public QUsuario(String variable) {
        this(Usuario.class, forVariable(variable), INITS);
    }

    public QUsuario(Path<? extends Usuario> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUsuario(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUsuario(PathMetadata metadata, PathInits inits) {
        this(Usuario.class, metadata, inits);
    }

    public QUsuario(Class<? extends Usuario> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.distrito = inits.isInitialized("distrito") ? new QDistrito(forProperty("distrito"), inits.get("distrito")) : null;
        this.estadousuario = inits.isInitialized("estadousuario") ? new QEstadoUsuario(forProperty("estadousuario")) : null;
        this.tipousuario = inits.isInitialized("tipousuario") ? new QTipoUsuario(forProperty("tipousuario")) : null;
    }

}


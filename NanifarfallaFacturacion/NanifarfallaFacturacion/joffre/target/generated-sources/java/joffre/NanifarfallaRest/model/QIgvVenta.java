package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIgvVenta is a Querydsl query type for IgvVenta
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIgvVenta extends EntityPathBase<IgvVenta> {

    private static final long serialVersionUID = 569307360L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIgvVenta igvVenta = new QIgvVenta("igvVenta");

    public final StringPath claveApi = createString("claveApi");

    public final CollectionPath<Cliente_tiene_pedido, QCliente_tiene_pedido> clientetienepedido = this.<Cliente_tiene_pedido, QCliente_tiene_pedido>createCollection("clientetienepedido", Cliente_tiene_pedido.class, QCliente_tiene_pedido.class, PathInits.DIRECT2);

    public final NumberPath<Integer> codigo_igv_venta = createNumber("codigo_igv_venta", Integer.class);

    public final QTipoImpuesto mTipoimpuesto;

    public final NumberPath<Double> porcentaje_igv = createNumber("porcentaje_igv", Double.class);

    public QIgvVenta(String variable) {
        this(IgvVenta.class, forVariable(variable), INITS);
    }

    public QIgvVenta(Path<? extends IgvVenta> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIgvVenta(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIgvVenta(PathMetadata metadata, PathInits inits) {
        this(IgvVenta.class, metadata, inits);
    }

    public QIgvVenta(Class<? extends IgvVenta> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mTipoimpuesto = inits.isInitialized("mTipoimpuesto") ? new QTipoImpuesto(forProperty("mTipoimpuesto")) : null;
    }

}


package joffre.NanifarfallaRest.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPais is a Querydsl query type for Pais
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPais extends EntityPathBase<Pais> {

    private static final long serialVersionUID = 907413415L;

    public static final QPais pais = new QPais("pais");

    public final StringPath claveApi = createString("claveApi");

    public final NumberPath<Integer> codigo_pais = createNumber("codigo_pais", Integer.class);

    public final CollectionPath<DiasEspeciales, QDiasEspeciales> diasespeciales = this.<DiasEspeciales, QDiasEspeciales>createCollection("diasespeciales", DiasEspeciales.class, QDiasEspeciales.class, PathInits.DIRECT2);

    public final StringPath nombre_pais = createString("nombre_pais");

    public final CollectionPath<Provincia, QProvincia> provincias = this.<Provincia, QProvincia>createCollection("provincias", Provincia.class, QProvincia.class, PathInits.DIRECT2);

    public QPais(String variable) {
        super(Pais.class, forVariable(variable));
    }

    public QPais(Path<? extends Pais> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPais(PathMetadata metadata) {
        super(Pais.class, metadata);
    }

}


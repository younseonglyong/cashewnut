package cashewnut.membership.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import cashewnut.economy.user.membership.entity.Membership;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMembership is a Querydsl query type for Membership
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMembership extends EntityPathBase<Membership> {

    private static final long serialVersionUID = 352845999L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMembership membership = new QMembership("membership");

    public final QJpaBaseEntity _super = new QJpaBaseEntity(this);

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QTeam team;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public final StringPath userName = createString("userName");

    public QMembership(String variable) {
        this(Membership.class, forVariable(variable), INITS);
    }

    public QMembership(Path<? extends Membership> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMembership(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMembership(PathMetadata metadata, PathInits inits) {
        this(Membership.class, metadata, inits);
    }

    public QMembership(Class<? extends Membership> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.team = inits.isInitialized("team") ? new QTeam(forProperty("team")) : null;
    }

}

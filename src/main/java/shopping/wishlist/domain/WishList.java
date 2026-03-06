package shopping.wishlist.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import shopping.infra.orm.AuditInformation;
import shopping.infra.orm.BooleanYnConverter;

@Getter
@Entity
@Table(name = "product")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WishList extends AuditInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "bigint")
    private Long id;

    @NotNull
    @Comment("회원 고유 ID")
    @Column(name = "user_id", nullable = false, columnDefinition = "bigint")
    private Long userId;

    @NotNull
    @Comment("상품 고유 ID")
    @Column(name = "product_id", nullable = false, columnDefinition = "bigint")
    private Long productId;

    @NotNull
    @Comment("사용여부")
    @Convert(converter = BooleanYnConverter.class)
    @Column(name = "use_yn", nullable = false, columnDefinition = "char(1)")
    private Boolean isUse;
}

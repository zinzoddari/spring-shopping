package shopping.wishlist.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WishListService {



    @Transactional(readOnly = true)
    public void getWishList(final Long userId) {

    }
}

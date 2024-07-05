package com.mysite.shop.repository;

import com.mysite.shop.dto.ItemSearchDto;
import com.mysite.shop.dto.MainItemDto;
import com.mysite.shop.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {
    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}

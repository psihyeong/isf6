package com.isf6.backend.api.Response;

import com.isf6.backend.domain.entity.Img;
import com.isf6.backend.domain.entity.Product;
import com.isf6.backend.domain.entity.ProductStatus;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Getter
public class ProductResponseDto {

    private Long id;
    private String title;
    private int price;
    private String description;
    private String reservation;
    private List<Img> imgList;
    private ProductStatus status;
    private int wishSize;
    private int liveReqSize;
    private boolean wishCheck;
    private boolean liveReqCheck;

    public ProductResponseDto(Product entity, boolean wishCheck, boolean liveReqCheck) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.price = entity.getPrice();
        this.description = entity.getDescription();
        this.reservation = entity.getReservation();
        this.imgList = entity.getImgList();
        this.status = entity.getStatus();
        this.wishSize = entity.getWishes().size();
        this.liveReqSize = entity.getLiveRequests().size();
        this.wishCheck = wishCheck;
        this.liveReqCheck = liveReqCheck;
    }
}

package com.wmachaca.airbnbclone.listing.repository;

import com.wmachaca.airbnbclone.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
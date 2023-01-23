package com.nandaadisaputra.koin.core.domain.usecase

import com.nandaadisaputra.koin.core.domain.model.Tourism
import com.nandaadisaputra.koin.core.domain.repository.ITourismRepository

class TourismInteraction(private val tourismRepository: ITourismRepository): TourismUseCase {

    override fun getAllTourism() = tourismRepository.getAllTourism()

    override fun getFavoriteTourism() = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) = tourismRepository.setFavoriteTourism(tourism, state)
}
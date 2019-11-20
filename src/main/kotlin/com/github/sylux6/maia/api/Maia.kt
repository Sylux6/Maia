package com.github.sylux6.maia.api

import com.github.kittinunf.fuel.core.FuelManager

/**
 * Class to make api requests
 */
class Maia() {

    init {
        FuelManager.instance.basePath = MaiaInfo.BASE_URL
//        FuelManager.instance.baseHeaders = mapOf("Authorization" to option)
    }

    /**
     * @since 1.0.0
     *
     * Get information about a beatmap by id
     */
    fun getBeatmapById() {
    }
}
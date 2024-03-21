package io.chthonic.rickmortychars.data.rickmorty.rest

import io.chthonic.rickmortychars.data.rickmorty.rest.models.CharacterResults
import retrofit2.http.GET
import retrofit2.http.Query

interface RickMortyRestApi {
    @GET("character")
    suspend fun getCharacters(@Query("page") page: Int = 1): CharacterResults
}
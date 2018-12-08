package id.ac.mercubuana.joko_ss.mealcatalog.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class InitRetrofit {
    private val BASE_URL="https://www.themealdb.com/api/json/v1/1/"

    private fun init(): Retrofit = Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun instance(): ApiServices = init().create(ApiServices::class.java)
}
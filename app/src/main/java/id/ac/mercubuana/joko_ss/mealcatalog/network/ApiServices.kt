package id.ac.mercubuana.joko_ss.mealcatalog.network

import id.ac.mercubuana.joko_ss.mealcatalog.network.response.ResponseMeals
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    //dapatkan list makanan berdasarkan daerah
    @GET("filter.php")
    fun requestHomeMeals(
        @Query("a") area: String
    ) : Call<ResponseMeals>
}
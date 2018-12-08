package id.ac.mercubuana.joko_ss.mealcatalog.network.response


import com.google.gson.annotations.SerializedName


data class ResponseMeals(

	@field:SerializedName("meals")
	val meals: List<MealsItem?>? = null
)
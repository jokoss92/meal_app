package id.ac.mercubuana.joko_ss.mealcatalog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import id.ac.mercubuana.joko_ss.mealcatalog.network.InitRetrofit
import id.ac.mercubuana.joko_ss.mealcatalog.network.response.MealsItem
import id.ac.mercubuana.joko_ss.mealcatalog.network.response.ResponseMeals
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestDataHome()
        //initListOfMeal()
    }

    private fun initListOfMeal(dataMeals: List<MealsItem?>?) {


        dataMeals?.let {
            //buat adapter
            val adapter = MealAdapter(this, it)
            //set adapter
            rv_meal_list.adapter = adapter
            rv_meal_list.layoutManager = LinearLayoutManager(this)
        }
    }

    private fun requestDataHome(){
        //panggil retrofit
        InitRetrofit().instance().requestHomeMeals("Canadian")
            .enqueue(object : Callback<ResponseMeals>{
                override fun onFailure(call: Call<ResponseMeals>, t: Throwable) {
                    //state ketika gagal request
                    t.printStackTrace()
                }

                override fun onResponse(call: Call<ResponseMeals>, response: Response<ResponseMeals>) {
                    if(response.isSuccessful){
                        //Log.d("Response Meals", response.body().toString())
                        val dataMeals = response.body()?.meals
                        initListOfMeal(dataMeals)
                    }
                }

            })
    }
}

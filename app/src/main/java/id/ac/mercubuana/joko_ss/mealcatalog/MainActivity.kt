package id.ac.mercubuana.joko_ss.mealcatalog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListOfMeal()
    }

    private fun initListOfMeal(){
        //buat adapter
        val adapter = MealAdapter(this)
        //set adapter
        rv_meal_list.adapter = adapter
        rv_meal_list.layoutManager = LinearLayoutManager(this)
    }
}

package id.ac.mercubuana.joko_ss.mealcatalog

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import id.ac.mercubuana.joko_ss.mealcatalog.network.response.MealsItem
import kotlinx.android.synthetic.main.meal_item.view.*


class MealAdapter (
    val context: Context,
    val meals: List<MealsItem?>
): RecyclerView.Adapter<MealAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int) : MealAdapter.ViewHolder{
      val view = LayoutInflater.from(context)
          .inflate(R.layout.meal_item, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return meals.size

    }
    override fun onBindViewHolder(holder: MealAdapter.ViewHolder, position: Int) {
        val meal = meals[position]
        holder.itemView.tv_item_name.text=meal?.strMeal

        Picasso.get().load(meal?.strMealThumb).into(holder.itemView.iv_item_image)

    }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }


}
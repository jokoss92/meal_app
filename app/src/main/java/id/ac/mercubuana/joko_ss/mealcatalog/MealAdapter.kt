package id.ac.mercubuana.joko_ss.mealcatalog

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class MealAdapter (val context: Context): RecyclerView.Adapter<MealAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int) : MealAdapter.ViewHolder{
      val view = LayoutInflater.from(context)
          .inflate(R.layout.meal_item, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return 5

    }
    override fun onBindViewHolder(p0: MealAdapter.ViewHolder, p1: Int) {

    }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }


}
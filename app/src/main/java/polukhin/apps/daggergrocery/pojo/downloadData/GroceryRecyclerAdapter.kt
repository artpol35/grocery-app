package polukhin.apps.daggergrocery.pojo.downloadData

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import polukhin.apps.daggergrocery.R

class GroceryRecyclerAdapter() :
    RecyclerView.Adapter<GroceryRecyclerAdapter.ViewHolder>() {

    private var dataSet: List<Product> = ArrayList<Product>()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewName: TextView = view.findViewById(R.id.textViewProductName)
        val textViewValue: TextView = view.findViewById(R.id.textViewProductValue)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recycler_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.textViewName.text = dataSet[position].name
        viewHolder.textViewValue.text = dataSet[position].value.toString()
    }

    override fun getItemCount() = dataSet.size

    fun setData(data: List<Product>) {
        dataSet = data
    }
}

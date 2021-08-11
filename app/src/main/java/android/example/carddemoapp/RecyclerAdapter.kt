package android.example.carddemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder> (){

    private var titles = arrayOf("Napa Extra(500mg)", "Napa Extra(500mg)","Napa Extra(500mg)","Napa Extra(500mg)","Napa Extra(500mg)","Napa Extra(500mg)","Napa Extra(500mg)","Napa Extra(500mg)")
    private var details = arrayOf("Taking before/after meal", "Taking before/after meal","Taking before/after meal","Taking before/after meal","Taking before/after meal","Taking before/after meal","Taking before/after meal","Taking before/after meal")
    private var timing = arrayOf("1 + 0 + 1", "1 + 0 + 1","1 + 0 + 1","1 + 0 + 1","1 + 0 + 1","1 + 0 + 1","1 + 0 + 1","1 + 0 + 1","1 + 0 + 1")
    private var description = arrayOf("Status: Dicontinued","Status: Dicontinued","Status: Dicontinued","Status: Dicontinued","Status: Dicontinued","Status: Dicontinued","Status: Dicontinued","Status: Dicontinued")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
       return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
       holder.itemTitle.text=titles[position]
        holder.itemDetail.text=details[position]
        holder.itemTiming.text = timing[position]
        holder.itemDescription.text = description[position]
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemTitle: TextView
        var itemDetail: TextView
        var itemTiming: TextView
        var itemDescription: TextView

        init {
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemTiming = itemView.findViewById(R.id.item_timing)
            itemDescription = itemView.findViewById(R.id.item_description)


            itemView.setOnClickListener{
                val position: Int=adapterPosition
                Toast.makeText(itemView.context,"You clicked on ${titles[position]}",Toast.LENGTH_LONG).show()
            }
        }
    }
}
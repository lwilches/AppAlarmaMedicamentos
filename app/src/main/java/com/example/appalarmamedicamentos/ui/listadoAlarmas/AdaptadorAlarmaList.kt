package com.example.appalarmamedicamentos.ui.listadoAlarmas
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.appalarmamedicamentos.data.listadoalarmas.ItemAlarma
import com.example.appalarmamedicamentos.R
import androidx.recyclerview.widget.RecyclerView
import com.example.appalarmamedicamentos.ui.listadoMedicamentos.AdapaterMedicamentosList

class AdaptadorAlarmaList(private val itemList: List<ItemAlarma>):
    RecyclerView.Adapter<AdaptadorAlarmaList.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapaterMedicamentosList.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_alarma, parent, false)
        return AdapaterMedicamentosList.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapaterMedicamentosList.ViewHolder, position: Int) {
        val item = itemList[position]
        holder.tvName.text = item.name
        holder.tvDescription.text = item.description
        //holder.imageView.setImageResource(item.imageResource)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvDescription: TextView = itemView.findViewById(R.id.tvDescription)
        val imageView: ImageView = itemView.findViewById(R.id.tvAlarmaId)
    }

}
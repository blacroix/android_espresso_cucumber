package fr.blacroix.android.espresso_cucumber

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class BookAdapter(val context: Context, val inflater: LayoutInflater, val books: List<String>, val clickListener: OnItemClickListener) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder? {
        return ViewHolder(inflater.inflate(R.layout.book_view, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(books[position])
    }

    override fun getItemCount(): Int {
        return books.size
    }

    inner class ViewHolder : RecyclerView.ViewHolder {

        val nameText: TextView

        constructor(v: View) : super(v) {
            this.nameText = v.findViewById(R.id.nameText) as TextView
            v.setOnClickListener {
                clickListener.onClick(nameText.text.toString())
            }
        }

        fun bind(name: String) {
            nameText.text = name
        }
    }

    interface OnItemClickListener {
        fun onClick(name: String)
    }

}

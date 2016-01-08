package fr.blacroix.android.espresso_cucumber

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_books.*
import java.util.*

class BooksActivity : AppCompatActivity(), BookAdapter.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        bookRecycler.setHasFixedSize(true)
        bookRecycler.layoutManager = LinearLayoutManager(this)

        val books = ArrayList<String>()
        for (i in 0..100) {
            books.add("book number $i");
        }

        bookRecycler.adapter = BookAdapter(this, LayoutInflater.from(this), books, this)
    }

    override fun onClick(name: String) {
        val intent = Intent(this, BookActivity::class.java)
        intent.putExtra("bookName", name)
        startActivity(intent)
    }

}

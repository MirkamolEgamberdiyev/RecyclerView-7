package com.mirkamol.recyclerview7.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mirkamol.recyclerview7.R
import com.mirkamol.recyclerview7.adapter.CustomAdapter
import com.mirkamol.recyclerview7.model.Member

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        initViews()
        val members = prepareMemberList()
        refreshAdapter(members)

    }

    private fun initViews() {
        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(members)
        recyclerView.adapter = adapter
    }

    private fun prepareMemberList(): List<Member> {
        val members = ArrayList<Member>()

        for (i in 0..50) {
            members.add(Member("Egamberdiyev Mirkamol", "+998974697907"))
            members.add(Member("Saliyev Muhammadyusuf", "+998995202951"))
        }
        return members
    }

}
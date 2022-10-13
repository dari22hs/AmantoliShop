package com.example.amantoliv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.example.amantoliv2.Adapter.CardAdapter

class MyOrdersHistory : AppCompatActivity() {

    lateinit var expandableLayout: LinearLayout
    lateinit var expandBtn: Button
    lateinit var cardView: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_orders_history)

        //expandBtn.findViewById<Button>(R.id.expandBtn)
        //expandableLayout.findViewById<LinearLayout>(R.id.expandableLayout)
        //cardView.findViewById<CardView>(R.id.cardViewOrders)

        expandBtn.setOnClickListener {
            if (expandableLayout.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(cardView, AutoTransition())
                expandableLayout.visibility = View.VISIBLE
                expandBtn.text = "COLLAPSE"
            } else {
                TransitionManager.beginDelayedTransition(cardView, AutoTransition())
                expandableLayout.visibility = View.GONE
                expandBtn.text = "EXPAND"
            }
        }
    }
}
package ru.soliddestination.foodtracker

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.soliddestination.foodtracker.commons.inflate

import kotlinx.android.synthetic.main.fragment_main.*

/**
 * Created by Melnikov Semyon on 09.05.18.
 * Higher School ITIS KFU
 */
class MainFragment : Fragment() {

    interface onStartDayEventListener {
        fun startDay()
    }

    private val startDayButton by lazy {
        button_start_day
    }

    private lateinit var startDayEventListener: onStartDayEventListener

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        try {
            startDayEventListener = context as onStartDayEventListener
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString() + " must implement onStartDayEventListener")
        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = container?.inflate(R.layout.fragment_main)
        startDayButton.setOnClickListener {
            startDayEventListener.startDay()
        }
        return view
    }
}
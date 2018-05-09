package ru.soliddestination.foodtracker

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.soliddestination.foodtracker.commons.inflate

/**
 * Created by Melnikov Semyon on 09.05.18.
 * Higher School ITIS KFU
 */
class DayFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_day)
    }
}
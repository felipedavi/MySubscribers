package io.github.felipedavi.mysubscribers.ui.subscriber

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.felipedavi.mysubscribers.R

class SubscriberFragment : Fragment() {
    private lateinit var mViewModel: SubscriberViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, s: Bundle?): View? {
        return inflater.inflate(R.layout.subscriber_fragment, container, false)
    }

}
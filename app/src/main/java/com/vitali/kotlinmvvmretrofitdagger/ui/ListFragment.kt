package com.vitali.kotlinmvvmretrofitdagger.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.vitali.kotlinmvvmretrofitdagger.R
import com.vitali.kotlinmvvmretrofitdagger.base.BaseFragment
import com.vitali.kotlinmvvmretrofitdagger.base.ViewModelFactory
import javax.inject.Inject

/**
 * A simple [BaseFragment] subclass.
 * to handle interaction events.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ListFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var viewModel: ListViewModel

    override fun layoutRes(): Int {
        return R.layout.fragment_list
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(activity!!, viewModelFactory).get(ListViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewModel.start()

    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment ListFragment.
         */
        @JvmStatic
        fun newInstance() = ListFragment()
    }
}

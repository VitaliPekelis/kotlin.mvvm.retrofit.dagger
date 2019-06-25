package com.vitali.kotlinmvvmretrofitdagger.ui

import com.vitali.kotlinmvvmretrofitdagger.R
import com.vitali.kotlinmvvmretrofitdagger.base.BaseFragment

/**
 * A simple [BaseFragment] subclass.
 * to handle interaction events.
 * Use the [DetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class DetailsFragment : BaseFragment() {

    override fun layoutRes(): Int {
        return R.layout.fragment_details
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment ListFragment.
         */
        @JvmStatic
        fun newInstance() = DetailsFragment()
    }
}

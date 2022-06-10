package com.example.tusks.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tusks.R
import com.example.tusks.databinding.FragmentMainBinding
import com.example.tusks.tuskone.TuskOneFragment

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startTusksFragment()
    }

    private fun startTusksFragment() {
        binding?.run {
            btnTuskOne.setOnClickListener {
                parentFragmentManager.beginTransaction()
                    .replace(
                        R.id.container,
                        TuskOneFragment.newInstance(),
                        TuskOneFragment.FRAGMENT_ONE
                    )
                    .addToBackStack("First")
                    .commit()
            }
        }
    }

    companion object {
        fun newInstance() = MainFragment()

        const val MAIN_FRAGMENT = "Main Fragment"
    }
}
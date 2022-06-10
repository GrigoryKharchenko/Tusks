package com.example.tusks.tuskone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tusks.databinding.FragmentTuskOneBinding

class TuskOneFragment : Fragment() {

    private var binding: FragmentTuskOneBinding? = null
    var count = 0.0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTuskOneBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.run {
            toolBar.setNavigationOnClickListener {
                parentFragmentManager.popBackStack()
            }
            btnPlus.setOnClickListener {
                tvCounter.text = count++.toString()
            }
            btnMinus.setOnClickListener {
                tvCounter.text = count--.toString()
            }
        }
    }

    companion object {
        fun newInstance() = TuskOneFragment()

        const val FRAGMENT_ONE = "Fragment one"
    }
}
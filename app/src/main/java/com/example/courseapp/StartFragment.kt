package com.example.courseapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.courseapp.databinding.FragmentStartBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding
    private lateinit var bottomNavigationView : BottomNavigationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onResume() {
        super.onResume()
        bottomNavigationView.visibility = View.GONE
    }

    override fun onStop() {
        super.onStop()
        bottomNavigationView.visibility = View.VISIBLE
    }
}
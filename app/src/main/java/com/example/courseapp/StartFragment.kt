package com.example.courseapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.courseapp.databinding.FragmentStartBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding
    private lateinit var bottomNavigationView : BottomNavigationView
    private lateinit var topNavView : View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStartBinding.inflate(layoutInflater,container,false)
        initviews()
        return binding.root
    }

    private fun initviews() {
        topNavView = requireActivity().findViewById(R.id.top_bar)
        bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.btn_bar)
        binding.GetStartedBtn.setOnClickListener{
            findNavController().navigate(R.id.nav_to_login)
        }
    }

    override fun onResume() {
        super.onResume()
        topNavView.visibility = View.GONE
        bottomNavigationView.visibility = View.GONE
    }

    override fun onStop() {
        super.onStop()
        topNavView.visibility = View.VISIBLE
        bottomNavigationView.visibility = View.VISIBLE
    }
}
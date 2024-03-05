package com.example.courseapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.courseapp.R
import com.example.courseapp.databinding.FragmentSignupBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class SignupFragment : Fragment() {

    private lateinit var binding: FragmentSignupBinding
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var topNavView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignupBinding.inflate(layoutInflater,container,false)
        initview()
        return binding.root
    }

    private fun initview() {
        topNavView = requireActivity().findViewById(R.id.top_bar)
        bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.btn_bar)
        binding.signupBtn.setOnClickListener {
            findNavController().navigate(R.id.nav_to_home)
        }
        binding.loginText.setOnClickListener {
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
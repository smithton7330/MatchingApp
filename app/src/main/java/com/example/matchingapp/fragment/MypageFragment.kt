package com.example.matchingapp.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.example.matchingapp.R
import com.example.matchingapp.config.ApplicationClass
import com.example.matchingapp.databinding.FragmentMypageBinding
import com.example.matchingapp.dto.User
import com.example.matchingapp.ui.viewmodel.MypageViewModel

class MypageFragment : Fragment() {
    private lateinit var binding: FragmentMypageBinding
    private val model: MypageViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_mypage, container, false)

        binding.apply {
            viewModel = model
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nameEdt.visibility = View.GONE
        binding.nameSaveBtn.visibility = View.GONE
//        var user = ApplicationClass.sharedPreferencesUtil.getUser()
        binding.nameEdtBtn.setOnClickListener {
            binding.nameTv.visibility = View.GONE
            binding.nameEdt.visibility = View.VISIBLE
            binding.nameSaveBtn.visibility = View.VISIBLE
            binding.nameEdtBtn.visibility = View.GONE
        }

        binding.nameSaveBtn.setOnClickListener {
            binding.nameTv.visibility = View.VISIBLE
            binding.nameEdt.visibility = View.GONE
            binding.nameSaveBtn.visibility = View.GONE
            binding.nameEdtBtn.visibility = View.VISIBLE

            binding.viewModel?.nameChange()
            Log.i("클릭됨","")
        }
    }

}
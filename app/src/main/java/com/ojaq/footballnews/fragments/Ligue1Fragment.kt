package com.ojaq.footballnews.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ojaq.footballnews.NewsViewModel
import com.ojaq.footballnews.R
import com.ojaq.footballnews.adapter.NewsAdapter
import com.ojaq.footballnews.databinding.FragmentLaLigaBinding
import com.ojaq.footballnews.databinding.FragmentLigue1Binding

class Ligue1Fragment : Fragment() {
    private var _binding : FragmentLigue1Binding? = null
    private val binding get() = _binding as FragmentLigue1Binding

    private var _viewModel: NewsViewModel? = null
    private val viewModel get() = _viewModel as NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLigue1Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loadingView.root.visibility = View.VISIBLE
        _viewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        viewModel.getLigueNews()
        viewModel.ligueNews.observe(viewLifecycleOwner) {
            val data = it.articles
            binding.rvLigue.apply {
                val mAdapter = NewsAdapter()
                mAdapter.setData(data)
                adapter = mAdapter
                layoutManager = LinearLayoutManager(context)
            }
            binding.loadingView.root.visibility = View.GONE
        }
    }
}
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

class LaLigaFragment : Fragment() {
    private var _binding : FragmentLaLigaBinding? = null
    private val binding get() = _binding as FragmentLaLigaBinding

    private var _viewModel: NewsViewModel? = null
    private val viewModel get() = _viewModel as NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLaLigaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loadingView.root.visibility = View.VISIBLE
        _viewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        viewModel.getLaLigaNews()
        viewModel.laligaNews.observe(viewLifecycleOwner) {
            val data = it.articles
            binding.rvLaliga.apply {
                val mAdapter = NewsAdapter()
                mAdapter.setData(data)
                adapter = mAdapter
                layoutManager = LinearLayoutManager(context)
            }
            binding.loadingView.root.visibility = View.GONE
        }
    }
}
package com.ojaq.footballnews

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.google.android.material.tabs.TabLayoutMediator
import com.ojaq.footballnews.adapter.SectionPagerAdapter
import com.ojaq.footballnews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setSupportActionBar(binding.toolbar)
        setContentView(binding.root)

        //set adapter ViewPager2 using SectionPagerAdapter
        binding.vpContainer.adapter = SectionPagerAdapter(this)
        //array to set the title on TabLayout
        val listFragment = arrayOf("Premier League", "La Liga", "Serie A", "Bundesliga", "Ligue 1")

        //set TabLayout and ViewPager2 so it can bind each other
        TabLayoutMediator(binding.tabLayout, binding.vpContainer) { tab, position ->
            tab.text = listFragment[position]
        }.attach()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        val searchView = menu?.findItem(R.id.option_search)?.actionView as SearchView
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        searchView.apply {
            setSearchableInfo(searchManager.getSearchableInfo(componentName))
        }
        return true
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId){
//            R.id.option_search -> onSearchRequested()
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}
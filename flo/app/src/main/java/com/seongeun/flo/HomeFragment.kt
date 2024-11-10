package com.seongeun.flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.google.gson.Gson
import com.seongeun.flo.databinding.FragmentHomeBinding

class HomeFragment : Fragment(), CommunicationInterface {
    lateinit var binding: FragmentHomeBinding
    private var albumDatas = ArrayList<Album>()
    private lateinit var songDB: SongDatabase

    override fun sendData(album: Album) {
        if (activity is MainActivity) {
            val activity = activity as MainActivity
            activity.updateMainPlayerCl(album)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)


        //데이터 리스트 생성 더미 데이터
        albumDatas.apply {
            add(Album("Butter", "방탄소년단 (BTS)", R.drawable.img_album_exp))
            add(Album("Lilac", "아이유 (IU)", R.drawable.img_album_exp2))
            add(Album("Next Level", "에스파 (AESPA)", R.drawable.img_album_exp3))
            add(Album("Boy with Luv", "방탄소년단 (BTS)", R.drawable.img_album_exp4))
            add(Album("BBoom BBoom", "모모랜드 (MOMOLAND)", R.drawable.img_album_exp5))
            add(Album("Weekend", "태연 (Tae Yeon)", R.drawable.img_album_exp6))

        }

        val albumRVAdapter = AlbumRVAdapter(albumDatas)
        binding.homeTodayMusicAlbumRv.adapter = albumRVAdapter
        binding.homeTodayMusicAlbumRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

//        albumRVAdapter.setItemClickListener(object : AlbumRVAdapter.OnItemClickListener {
//            override fun onItemClick(album : Album) {
//                (context as MainActivity).supportFragmentManager.beginTransaction()
//                    .replace(R.id.main_frm, AlbumFragment())
//                    .commitAllowingStateLoss()
//            }
//        })

        albumRVAdapter.setItemClickListener(object : AlbumRVAdapter.OnItemClickListener {
            override fun onItemClick(album : Album) {
                changeAlbumFragment(album)
            }
            override fun onPlayAlbum(album: Album) {
                sendData(album)
            }
        })


        val bannerAdapter = BannerVPAdapter(this)
        bannerAdapter.addFragment(BannerFragment(R.drawable.img_home_viewpager_exp))
        bannerAdapter.addFragment(BannerFragment(R.drawable.img_home_viewpager_exp))
        bannerAdapter.addFragment(BannerFragment(R.drawable.img_home_viewpager_exp2))
        bannerAdapter.addFragment(BannerFragment(R.drawable.img_home_viewpager_exp))
        bannerAdapter.addFragment(BannerFragment(R.drawable.img_home_viewpager_exp2))
        binding.homeBannerVp.adapter = bannerAdapter
        binding.homeBannerVp.orientation = ViewPager2.ORIENTATION_HORIZONTAL //좌우로 스크롤

        val pannelAdapter = PannelVPAdapter(this)
        pannelAdapter.addFragment(PannelFragment(R.drawable.img_album_exp))
        pannelAdapter.addFragment(PannelFragment(R.drawable.img_album_exp2))
        pannelAdapter.addFragment(PannelFragment(R.drawable.img_album_exp3))
        pannelAdapter.addFragment(PannelFragment(R.drawable.img_album_exp4))
        binding.homePannelBackgroundVp.adapter = pannelAdapter
        binding.homePannelBackgroundVp.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // Indicator에 viewPager 설정
        binding.homePannelIndicator.setViewPager(binding.homePannelBackgroundVp)


        return binding.root
    }

    private fun changeAlbumFragment(album: Album) {
        (context as MainActivity).supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, AlbumFragment().apply {
                arguments = Bundle().apply {
                    val gson = Gson()
                    val albumJson = gson.toJson(album)
                    putString("album", albumJson)
                }
            })
            .commitAllowingStateLoss()
    }

}
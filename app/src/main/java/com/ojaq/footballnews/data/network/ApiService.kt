package com.ojaq.footballnews.data.network

import com.ojaq.footballnews.data.BallResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("everything")
    fun getLaligaNews(
        @Query("q") query: String = "La Liga",
        @Query("language") language: String = "en",
        @Query("sortBy") sortBy: String = "popularity",
        @Query("pageSize") pageSize: Int = 30,
        @Query("customQuery1") customQuery1: String? = "Real Madrid",
        @Query("customQuery2") customQuery2: String? = "Barcelona",
        @Query("customQuery3") customQuery3: String? = "Atletico Madrid",
        @Query("customQuery4") customQuery4: String? = "Sevilla",
        @Query("customQuery5") customQuery5: String? = "Valencia",
        @Query("customQuery6") customQuery6: String? = "Villareal",
        @Query("customQuery7") customQuery7: String? = "Real Sociedad",
        @Query("customQuery8") customQuery8: String? = "Real Betis",
        @Query("customQuery9") customQuery9: String? = "Osasuna",
        @Query("customQuery10") customQuery10: String? = "Mallorca",
        @Query("customQuery11") customQuery11: String? = "Girona",
        @Query("customQuery12") customQuery12: String? = "Granada",
        @Query("customQuery13") customQuery13: String? = "Athletic Bilbao",
        @Query("customQuery14") customQuery14: String? = "Alaves",
        @Query("customQuery15") customQuery15: String? = "Almeria",
        @Query("customQuery16") customQuery16: String? = "Cadiz",
        @Query("customQuery17") customQuery17: String? = "Celta Vigo",
        @Query("customQuery18") customQuery18: String? = "Getafe",
        @Query("customQuery19") customQuery19: String? = "Las Palmas",
        @Query("customQuery20") customQuery20: String? = "Rayo Vallecano",
    ): Call<BallResponse>

    @GET("everything")
    fun getPremierNews(
        @Query("q") query: String = "PremierLeague",
        @Query("language") language: String = "en",
        @Query("sortBy") sortBy: String = "popularity",
        @Query("pageSize") pageSize: Int = 30,
        @Query("customQuery1") customQuery1: String? = "Liverpool",
        @Query("customQuery2") customQuery2: String? = "Manchester City",
        @Query("customQuery3") customQuery3: String? = "Manchester United",
        @Query("customQuery4") customQuery4: String? = "Chelsea",
        @Query("customQuery5") customQuery5: String? = "Arsenal",
        @Query("customQuery6") customQuery6: String? = "Tottenham",
        @Query("customQuery7") customQuery7: String? = "Aston Villa",
        @Query("customQuery8") customQuery8: String? = "Brighton",
        @Query("customQuery9") customQuery9: String? = "Newcastle",
        @Query("customQuery10") customQuery10: String? = "Brentford",
        @Query("customQuery11") customQuery11: String? = "Crystal Palace",
        @Query("customQuery12") customQuery12: String? = "Burnley",
        @Query("customQuery13") customQuery13: String? = "Bournemouth",
        @Query("customQuery14") customQuery14: String? = "Everton",
        @Query("customQuery15") customQuery15: String? = "Fulham",
        @Query("customQuery16") customQuery16: String? = "Luton Town",
        @Query("customQuery17") customQuery17: String? = "Nottingham Forest",
        @Query("customQuery18") customQuery18: String? = "Sheffield United",
        @Query("customQuery19") customQuery19: String? = "West Ham",
        @Query("customQuery20") customQuery20: String? = "Wolves",
    ): Call<BallResponse>

    @GET("everything")
    fun getSerieANews(
        @Query("q") query: String = "Serie A",
        @Query("language") language: String = "en",
        @Query("sortBy") sortBy: String = "popularity",
        @Query("pageSize") pageSize: Int = 30,
        @Query("customQuery1") customQuery1: String? = "Atalanta",
        @Query("customQuery2") customQuery2: String? = "Bologna",
        @Query("customQuery3") customQuery3: String? = "Cagliari",
        @Query("customQuery4") customQuery4: String? = "Empoli",
        @Query("customQuery5") customQuery5: String? = "Fiorentina",
        @Query("customQuery6") customQuery6: String? = "Frosinone",
        @Query("customQuery7") customQuery7: String? = "Genoa",
        @Query("customQuery8") customQuery8: String? = "Verona",
        @Query("customQuery9") customQuery9: String? = "Inter Milan",
        @Query("customQuery10") customQuery10: String? = "Juventus",
        @Query("customQuery11") customQuery11: String? = "Lazio",
        @Query("customQuery12") customQuery12: String? = "Lecce",
        @Query("customQuery13") customQuery13: String? = "AC Milan",
        @Query("customQuery14") customQuery14: String? = "Monza",
        @Query("customQuery15") customQuery15: String? = "Roma",
        @Query("customQuery16") customQuery16: String? = "Salernitana",
        @Query("customQuery17") customQuery17: String? = "Sassuolo",
        @Query("customQuery18") customQuery18: String? = "Torina",
        @Query("customQuery19") customQuery19: String? = "Udinese",
        @Query("customQuery20") customQuery20: String? = "Napolli",
    ): Call<BallResponse>

    @GET("everything")
    fun getBundesNews(
        @Query("q") query: String = "Bundesliga",
        @Query("language") language: String = "en",
        @Query("sortBy") sortBy: String = "popularity",
        @Query("pageSize") pageSize: Int = 30,
        @Query("customQuery1") customQuery1: String? = "Augsburg",
        @Query("customQuery2") customQuery2: String? = "Bayer Leverkusen",
        @Query("customQuery3") customQuery3: String? = "Bayern Munich",
        @Query("customQuery4") customQuery4: String? = "Vfl Bochum",
        @Query("customQuery5") customQuery5: String? = "Borussia Dortmund",
        @Query("customQuery6") customQuery6: String? = "Borussia Monchengladbach",
        @Query("customQuery7") customQuery7: String? = "Darmstadt98",
        @Query("customQuery8") customQuery8: String? = "Eintracht Frankfurt",
        @Query("customQuery9") customQuery9: String? = "SC Freiburg",
        @Query("customQuery10") customQuery10: String? = "FC Heidenheim",
        @Query("customQuery11") customQuery11: String? = "FC Koln",
        @Query("customQuery12") customQuery12: String? = "TSG Hoffenheim",
        @Query("customQuery13") customQuery13: String? = "RB Leipzig",
        @Query("customQuery14") customQuery14: String? = "Mainz 05",
        @Query("customQuery15") customQuery15: String? = "VfB Stuttgart",
        @Query("customQuery16") customQuery16: String? = "Union Berlin",
        @Query("customQuery17") customQuery17: String? = "Werder Bremen",
        @Query("customQuery18") customQuery18: String? = "VfL Wolfsburg",
    ): Call<BallResponse>

    @GET("everything")
    fun getLigueNews(
        @Query("q") query: String = "Ligue1",
        @Query("language") language: String = "en",
        @Query("sortBy") sortBy: String = "popularity",
        @Query("pageSize") pageSize: Int = 30,
        @Query("customQuery1") customQuery1: String? = "Brest",
        @Query("customQuery2") customQuery2: String? = "Clermont",
        @Query("customQuery3") customQuery3: String? = "Le Havre",
        @Query("customQuery4") customQuery4: String? = "Lille",
        @Query("customQuery5") customQuery5: String? = "Lorient",
        @Query("customQuery6") customQuery6: String? = "Lyon",
        @Query("customQuery7") customQuery7: String? = "Marseille",
        @Query("customQuery8") customQuery8: String? = "Metz",
        @Query("customQuery9") customQuery9: String? = "AS Monaco",
        @Query("customQuery10") customQuery10: String? = "Montpellier",
        @Query("customQuery11") customQuery11: String? = "Nantes",
        @Query("customQuery12") customQuery12: String? = "OGC Nice",
        @Query("customQuery13") customQuery13: String? = "Paris Saint Germain",
        @Query("customQuery14") customQuery14: String? = "Reims",
        @Query("customQuery15") customQuery15: String? = "Rennes",
        @Query("customQuery16") customQuery16: String? = "Strasbourg",
        @Query("customQuery17") customQuery17: String? = "Toulouse",
        @Query("customQuery18") customQuery18: String? = "Lens",
    ): Call<BallResponse>

    @GET("everything")
    fun searchNews(
        @Query("q") query: String,
        @Query("language") language: String = "en",
        @Query("pageSize") pageSize: Int = 50
    ): Call<BallResponse>
}
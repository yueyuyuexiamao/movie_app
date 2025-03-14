package com.player.movie.api;

public class Api {
    //public static final String HOST = "http://10.28.253.144:8090/";
    public static final String HOST = "http:// :8090/";
    public static final String HOSTIMG = "http:// /";

    public static final String GETUSERDATA = "users/{uid}";
    public static final String GETCATEGORYLIST = "movies/getCategoryList";
    public static final String GETKEYWORD = "movieNetwork/getKeyWord";
    public static final String GETALLCATEGORYBYCLASSIFY =  "movies/getAllCategoryByClassify";
    public static final String GETALLCATEGORYLISTBYPAGENAME =  "movieCategory/getAllCategoryListByPageName";
    public static final String GETSEARCHRESULT =  "movies/search"; //search
    public static final String LOGIN =  "users/login"; //login
    public static final String REGISTER =  "users/"; //register
    public static final String GETSTAR =  "movieStars/getStar";
    public static final String GETMOVIEURL =  "/service/movie/getMovieUrl";
    public static final String GETYOURLIKES = "/service/movie/getYourLikes";
    public static final String GETRECOMMEND = "movies/getRecommend";
    public static final String UPDATEUSER = "/service/movie-getway/updateUser";
    public static final String UPDATEPASSWORD = "/service/movie-getway/updatePassword";

}

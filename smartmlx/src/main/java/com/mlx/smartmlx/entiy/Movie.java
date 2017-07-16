package com.mlx.smartmlx.entiy;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.entiy
 * 创建者：MLX
 * 创建时间：2017/2/10 2:04
 * 用途：
 */

public class Movie
{
    /**
     * control : {"expires":120}
     * status : 0
     * data : {"Dates":[{"slug":"2017-02-10","text":"今天 2月10日"},{"slug":"2017-02-11","text":"明天 2月11日"},{"slug":"2017-02-12","text":"后天 2月12日"}],"currentMovie":{"nm":"决战食神","img":"http://p0.meituan.net/165.220/movie/7da359aec37708c194080d203ea7f490342855.jpeg","sc":0,"ver":"2D/3D","isShowing":true,"preferential":0,"id":346106},"cinemaDetailModel":{"sellmin":0,"sell":true,"nm":"soho天空影城","ct":"长治","preferential":0,"imax":0,"snum":5,"s":6,"s1":6,"s2":6,"s3":6,"featureTags":[{"desc":"限网上选座后取票","type":1,"tag":"取票机"},{"desc":"1.3m以下儿童全场免票，每个成年人仅限带一名儿童","type":7,"tag":"儿童优惠"},{"desc":"免押金","type":4,"tag":"3D眼镜"},{"desc":"影院提供免费WIFI__","type":9,"tag":"WiFi"}],"area":"城区","park":"","bus":"","callboard":"","brd":"其它","dis":"","tel":["0355-6666600"],"suw":"","dri":"","note":"","dealtp":0,"deals":"","lat":36.203648,"lng":113.11971,"price":0,"addr":"城区八一广场天空之城","id":17071},"movies":[{"nm":"决战食神","img":"http://p0.meituan.net/165.220/movie/7da359aec37708c194080d203ea7f490342855.jpeg","sc":0,"ver":"2D/3D","isShowing":true,"preferential":0,"id":346106},{"nm":"极限特工：终极回归","img":"http://p0.meituan.net/165.220/movie/222f2fbb546a33cdcbd976e95305091b252892.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕/全景声","isShowing":true,"preferential":0,"id":334590},{"nm":"功夫瑜伽","img":"http://p1.meituan.net/165.220/movie/d273af80e581b4c60abcbb57a95ad2b72956123.jpg","sc":8.5,"ver":"2D/3D/中国巨幕","isShowing":true,"preferential":0,"id":248933},{"nm":"乘风破浪","img":"http://p0.meituan.net/165.220/movie/c6cadc16e53ee7a0f79a9455a147449d50210.jpeg","sc":8.8,"ver":"2D/中国巨幕/全景声","isShowing":true,"preferential":0,"id":1170255},{"nm":"熊出没·奇幻空间","img":"http://p1.meituan.net/165.220/movie/cfcdb50d181a2111a2b79a0639db0f19764116.png","sc":9.2,"ver":"2D/3D","isShowing":true,"preferential":0,"id":1189089},{"nm":"游戏规则","img":"http://p1.meituan.net/165.220/movie/d2ef7024b8f444ce154bf79ccf72b070162568.jpg","sc":0,"ver":"2D/3D/中国巨幕","isShowing":true,"preferential":0,"id":345658},{"nm":"西游伏妖篇","img":"http://p0.meituan.net/165.220/movie/cd2791a174bfc7c1bc630fbb281c30e0308728.jpg","sc":7.8,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","isShowing":true,"preferential":0,"id":248904},{"nm":"了不起的菲丽西","img":"http://p1.meituan.net/165.220/movie/f885e601ccd912011725a8d7488633b7812258.jpg","sc":9.2,"ver":"2D/3D","isShowing":true,"preferential":0,"id":1042603},{"nm":"大闹天竺","img":"http://p1.meituan.net/165.220/movie/015de6bbaa2ecc299254b24e4f96939d489607.jpg","sc":7.5,"ver":"2D/中国巨幕/全景声","isShowing":true,"preferential":0,"id":248935},{"nm":"东北往事之破马张飞","img":"http://p0.meituan.net/165.220/movie/d9d800469e30249c9319dc7c4fa0211651185.jpeg","sc":7.2,"ver":"2D","isShowing":true,"preferential":0,"id":344032},{"nm":"萤火奇兵","img":"http://p1.meituan.net/165.220/movie/d12de031fa8ed2f684510aa5efec821e433682.jpg","sc":8.6,"ver":"2D","isShowing":true,"preferential":0,"id":346477}],"DateShow":{"2017-02-10":[{"tm":"10:20","sell":true,"showId":38228,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>96234<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>86401<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"11:58","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"12:10","sell":true,"showId":38229,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>56235<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>86803<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"13:48","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"13:00","sell":true,"showId":269007,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>29236<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>64706<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"14:38","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"14:00","sell":true,"showId":38230,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>24237<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>78807<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"15:38","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"15:50","sell":true,"showId":38231,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>18239<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>60804<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"17:28","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"17:40","sell":true,"showId":38232,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>08234<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>55806<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"19:18","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"19:30","sell":true,"showId":38233,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>44233<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>24803<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"21:08","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"20:35","sell":true,"showId":269008,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>08230<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>24701<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:13","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"21:20","sell":true,"showId":38234,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>05234<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>38406<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:58","dt":"2017-02-10","showDate":"2017-02-10","embed":0}],"2017-02-11":[{"tm":"10:20","sell":true,"showId":110835,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>35381<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>59405<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"11:58","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"12:10","sell":true,"showId":110836,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>47389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>27808<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"13:48","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"13:00","sell":true,"showId":124213,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>79380<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>09706<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"14:38","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"14:00","sell":true,"showId":110837,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>90389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>59808<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"15:38","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"15:50","sell":true,"showId":110838,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>11385<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>74806<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"17:28","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"17:40","sell":true,"showId":110839,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>53380<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>45802<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"19:18","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"19:30","sell":true,"showId":110840,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>90381<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>82801<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"21:08","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"20:35","sell":true,"showId":124214,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>37389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>42702<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:13","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"21:20","sell":true,"showId":110841,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>70386<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>65401<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:58","dt":"2017-02-11","showDate":"2017-02-11","embed":0}],"2017-02-12":[{"tm":"10:20","sell":true,"showId":52342,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>89389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>38404<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"11:58","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"12:10","sell":true,"showId":52343,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>90388<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>88806<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"13:48","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"13:00","sell":true,"showId":60142,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>36383<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>22704<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"14:38","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"14:00","sell":true,"showId":52344,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>95383<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>00804<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"15:38","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"15:50","sell":true,"showId":52345,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>40388<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>68803<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"17:28","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"17:40","sell":true,"showId":52346,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>35389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>77801<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"19:18","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"19:30","sell":true,"showId":52347,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>87389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>99805<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"21:08","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"20:35","sell":true,"showId":60143,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>19384<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>46702<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:13","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"21:20","sell":true,"showId":52348,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>15388<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>67402<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:58","dt":"2017-02-12","showDate":"2017-02-12","embed":0}]},"cssLink":"//p0.meituan.net/movie/9ca4e6e45293ba96292f00ed964a24a22696.css"}
     */

    @SerializedName("control")
    private ControlBean control;
    @SerializedName("status")
    private int status;
    @SerializedName("data")
    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        /**
         * expires : 120
         */

        @SerializedName("expires")
        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        /**
         * Dates : [{"slug":"2017-02-10","text":"今天 2月10日"},{"slug":"2017-02-11","text":"明天 2月11日"},{"slug":"2017-02-12","text":"后天 2月12日"}]
         * currentMovie : {"nm":"决战食神","img":"http://p0.meituan.net/165.220/movie/7da359aec37708c194080d203ea7f490342855.jpeg","sc":0,"ver":"2D/3D","isShowing":true,"preferential":0,"id":346106}
         * cinemaDetailModel : {"sellmin":0,"sell":true,"nm":"soho天空影城","ct":"长治","preferential":0,"imax":0,"snum":5,"s":6,"s1":6,"s2":6,"s3":6,"featureTags":[{"desc":"限网上选座后取票","type":1,"tag":"取票机"},{"desc":"1.3m以下儿童全场免票，每个成年人仅限带一名儿童","type":7,"tag":"儿童优惠"},{"desc":"免押金","type":4,"tag":"3D眼镜"},{"desc":"影院提供免费WIFI__","type":9,"tag":"WiFi"}],"area":"城区","park":"","bus":"","callboard":"","brd":"其它","dis":"","tel":["0355-6666600"],"suw":"","dri":"","note":"","dealtp":0,"deals":"","lat":36.203648,"lng":113.11971,"price":0,"addr":"城区八一广场天空之城","id":17071}
         * movies : [{"nm":"决战食神","img":"http://p0.meituan.net/165.220/movie/7da359aec37708c194080d203ea7f490342855.jpeg","sc":0,"ver":"2D/3D","isShowing":true,"preferential":0,"id":346106},{"nm":"极限特工：终极回归","img":"http://p0.meituan.net/165.220/movie/222f2fbb546a33cdcbd976e95305091b252892.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕/全景声","isShowing":true,"preferential":0,"id":334590},{"nm":"功夫瑜伽","img":"http://p1.meituan.net/165.220/movie/d273af80e581b4c60abcbb57a95ad2b72956123.jpg","sc":8.5,"ver":"2D/3D/中国巨幕","isShowing":true,"preferential":0,"id":248933},{"nm":"乘风破浪","img":"http://p0.meituan.net/165.220/movie/c6cadc16e53ee7a0f79a9455a147449d50210.jpeg","sc":8.8,"ver":"2D/中国巨幕/全景声","isShowing":true,"preferential":0,"id":1170255},{"nm":"熊出没·奇幻空间","img":"http://p1.meituan.net/165.220/movie/cfcdb50d181a2111a2b79a0639db0f19764116.png","sc":9.2,"ver":"2D/3D","isShowing":true,"preferential":0,"id":1189089},{"nm":"游戏规则","img":"http://p1.meituan.net/165.220/movie/d2ef7024b8f444ce154bf79ccf72b070162568.jpg","sc":0,"ver":"2D/3D/中国巨幕","isShowing":true,"preferential":0,"id":345658},{"nm":"西游伏妖篇","img":"http://p0.meituan.net/165.220/movie/cd2791a174bfc7c1bc630fbb281c30e0308728.jpg","sc":7.8,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","isShowing":true,"preferential":0,"id":248904},{"nm":"了不起的菲丽西","img":"http://p1.meituan.net/165.220/movie/f885e601ccd912011725a8d7488633b7812258.jpg","sc":9.2,"ver":"2D/3D","isShowing":true,"preferential":0,"id":1042603},{"nm":"大闹天竺","img":"http://p1.meituan.net/165.220/movie/015de6bbaa2ecc299254b24e4f96939d489607.jpg","sc":7.5,"ver":"2D/中国巨幕/全景声","isShowing":true,"preferential":0,"id":248935},{"nm":"东北往事之破马张飞","img":"http://p0.meituan.net/165.220/movie/d9d800469e30249c9319dc7c4fa0211651185.jpeg","sc":7.2,"ver":"2D","isShowing":true,"preferential":0,"id":344032},{"nm":"萤火奇兵","img":"http://p1.meituan.net/165.220/movie/d12de031fa8ed2f684510aa5efec821e433682.jpg","sc":8.6,"ver":"2D","isShowing":true,"preferential":0,"id":346477}]
         * DateShow : {"2017-02-10":[{"tm":"10:20","sell":true,"showId":38228,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>96234<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>86401<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"11:58","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"12:10","sell":true,"showId":38229,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>56235<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>86803<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"13:48","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"13:00","sell":true,"showId":269007,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>29236<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>64706<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"14:38","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"14:00","sell":true,"showId":38230,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>24237<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>78807<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"15:38","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"15:50","sell":true,"showId":38231,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>18239<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>60804<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"17:28","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"17:40","sell":true,"showId":38232,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>08234<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>55806<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"19:18","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"19:30","sell":true,"showId":38233,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>44233<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>24803<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"21:08","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"20:35","sell":true,"showId":269008,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>08230<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>24701<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:13","dt":"2017-02-10","showDate":"2017-02-10","embed":0},{"tm":"21:20","sell":true,"showId":38234,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>05234<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>38406<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:58","dt":"2017-02-10","showDate":"2017-02-10","embed":0}],"2017-02-11":[{"tm":"10:20","sell":true,"showId":110835,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>35381<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>59405<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"11:58","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"12:10","sell":true,"showId":110836,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>47389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>27808<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"13:48","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"13:00","sell":true,"showId":124213,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>79380<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>09706<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"14:38","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"14:00","sell":true,"showId":110837,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>90389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>59808<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"15:38","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"15:50","sell":true,"showId":110838,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>11385<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>74806<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"17:28","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"17:40","sell":true,"showId":110839,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>53380<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>45802<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"19:18","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"19:30","sell":true,"showId":110840,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>90381<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>82801<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"21:08","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"20:35","sell":true,"showId":124214,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>37389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>42702<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:13","dt":"2017-02-11","showDate":"2017-02-11","embed":0},{"tm":"21:20","sell":true,"showId":110841,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>70386<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>65401<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:58","dt":"2017-02-11","showDate":"2017-02-11","embed":0}],"2017-02-12":[{"tm":"10:20","sell":true,"showId":52342,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>89389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>38404<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"11:58","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"12:10","sell":true,"showId":52343,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>90388<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>88806<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"13:48","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"13:00","sell":true,"showId":60142,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>36383<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>22704<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"14:38","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"14:00","sell":true,"showId":52344,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>95383<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>00804<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"15:38","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"15:50","sell":true,"showId":52345,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>40388<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>68803<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"17:28","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"17:40","sell":true,"showId":52346,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>35389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>77801<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"19:18","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"19:30","sell":true,"showId":52347,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>87389<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>99805<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"21:08","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"20:35","sell":true,"showId":60143,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"6号厅","sellPrStr":"<span class=\"m3 true2\"><i>19384<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>46702<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:13","dt":"2017-02-12","showDate":"2017-02-12","embed":0},{"tm":"21:20","sell":true,"showId":52348,"grayDesc":"","seatStatus":1,"isMorrow":false,"th":"5号厅","sellPrStr":"<span class=\"m3 true2\"><i>15388<\/i><\/span>","prStr":"<span class=\"m3 true2\"><i>67402<\/i><\/span>","tp":"2D","lang":"国语","preferential":0,"end":"22:58","dt":"2017-02-12","showDate":"2017-02-12","embed":0}]}
         * cssLink : //p0.meituan.net/movie/9ca4e6e45293ba96292f00ed964a24a22696.css
         */

        @SerializedName("currentMovie")
        private CurrentMovieBean currentMovie;
        @SerializedName("cinemaDetailModel")
        private CinemaDetailModelBean cinemaDetailModel;
        @SerializedName("DateShow")
        private DateShowBean DateShow;
        @SerializedName("cssLink")
        private String cssLink;
        @SerializedName("Dates")
        private List<DatesBean> Dates;
        @SerializedName("movies")
        private List<MoviesBean> movies;

        public CurrentMovieBean getCurrentMovie() {
            return currentMovie;
        }

        public void setCurrentMovie(CurrentMovieBean currentMovie) {
            this.currentMovie = currentMovie;
        }

        public CinemaDetailModelBean getCinemaDetailModel() {
            return cinemaDetailModel;
        }

        public void setCinemaDetailModel(CinemaDetailModelBean cinemaDetailModel) {
            this.cinemaDetailModel = cinemaDetailModel;
        }

        public DateShowBean getDateShow() {
            return DateShow;
        }

        public void setDateShow(DateShowBean DateShow) {
            this.DateShow = DateShow;
        }

        public String getCssLink() {
            return cssLink;
        }

        public void setCssLink(String cssLink) {
            this.cssLink = cssLink;
        }

        public List<DatesBean> getDates() {
            return Dates;
        }

        public void setDates(List<DatesBean> Dates) {
            this.Dates = Dates;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class CurrentMovieBean {
            /**
             * nm : 决战食神
             * img : http://p0.meituan.net/165.220/movie/7da359aec37708c194080d203ea7f490342855.jpeg
             * sc : 0.0
             * ver : 2D/3D
             * isShowing : true
             * preferential : 0
             * id : 346106
             */

            @SerializedName("nm")
            private String nm;
            @SerializedName("img")
            private String img;
            @SerializedName("sc")
            private double sc;
            @SerializedName("ver")
            private String ver;
            @SerializedName("isShowing")
            private boolean isShowing;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("id")
            private int id;

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public boolean isIsShowing() {
                return isShowing;
            }

            public void setIsShowing(boolean isShowing) {
                this.isShowing = isShowing;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class CinemaDetailModelBean {
            /**
             * sellmin : 0
             * sell : true
             * nm : soho天空影城
             * ct : 长治
             * preferential : 0
             * imax : 0
             * snum : 5
             * s : 6.0
             * s1 : 6.0
             * s2 : 6.0
             * s3 : 6.0
             * featureTags : [{"desc":"限网上选座后取票","type":1,"tag":"取票机"},{"desc":"1.3m以下儿童全场免票，每个成年人仅限带一名儿童","type":7,"tag":"儿童优惠"},{"desc":"免押金","type":4,"tag":"3D眼镜"},{"desc":"影院提供免费WIFI__","type":9,"tag":"WiFi"}]
             * area : 城区
             * park :
             * bus :
             * callboard :
             * brd : 其它
             * dis :
             * tel : ["0355-6666600"]
             * suw :
             * dri :
             * note :
             * dealtp : 0
             * deals :
             * lat : 36.203648
             * lng : 113.11971
             * price : 0.0
             * addr : 城区八一广场天空之城
             * id : 17071
             */

            @SerializedName("sellmin")
            private int sellmin;
            @SerializedName("sell")
            private boolean sell;
            @SerializedName("nm")
            private String nm;
            @SerializedName("ct")
            private String ct;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("imax")
            private int imax;
            @SerializedName("snum")
            private int snum;
            @SerializedName("s")
            private double s;
            @SerializedName("s1")
            private double s1;
            @SerializedName("s2")
            private double s2;
            @SerializedName("s3")
            private double s3;
            @SerializedName("area")
            private String area;
            @SerializedName("park")
            private String park;
            @SerializedName("bus")
            private String bus;
            @SerializedName("callboard")
            private String callboard;
            @SerializedName("brd")
            private String brd;
            @SerializedName("dis")
            private String dis;
            @SerializedName("suw")
            private String suw;
            @SerializedName("dri")
            private String dri;
            @SerializedName("note")
            private String note;
            @SerializedName("dealtp")
            private int dealtp;
            @SerializedName("deals")
            private String deals;
            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;
            @SerializedName("price")
            private double price;
            @SerializedName("addr")
            private String addr;
            @SerializedName("id")
            private int id;
            @SerializedName("featureTags")
            private List<FeatureTagsBean> featureTags;
            @SerializedName("tel")
            private List<String> tel;

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public double getS() {
                return s;
            }

            public void setS(double s) {
                this.s = s;
            }

            public double getS1() {
                return s1;
            }

            public void setS1(double s1) {
                this.s1 = s1;
            }

            public double getS2() {
                return s2;
            }

            public void setS2(double s2) {
                this.s2 = s2;
            }

            public double getS3() {
                return s3;
            }

            public void setS3(double s3) {
                this.s3 = s3;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getPark() {
                return park;
            }

            public void setPark(String park) {
                this.park = park;
            }

            public String getBus() {
                return bus;
            }

            public void setBus(String bus) {
                this.bus = bus;
            }

            public String getCallboard() {
                return callboard;
            }

            public void setCallboard(String callboard) {
                this.callboard = callboard;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public String getSuw() {
                return suw;
            }

            public void setSuw(String suw) {
                this.suw = suw;
            }

            public String getDri() {
                return dri;
            }

            public void setDri(String dri) {
                this.dri = dri;
            }

            public String getNote() {
                return note;
            }

            public void setNote(String note) {
                this.note = note;
            }

            public int getDealtp() {
                return dealtp;
            }

            public void setDealtp(int dealtp) {
                this.dealtp = dealtp;
            }

            public String getDeals() {
                return deals;
            }

            public void setDeals(String deals) {
                this.deals = deals;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public List<FeatureTagsBean> getFeatureTags() {
                return featureTags;
            }

            public void setFeatureTags(List<FeatureTagsBean> featureTags) {
                this.featureTags = featureTags;
            }

            public List<String> getTel() {
                return tel;
            }

            public void setTel(List<String> tel) {
                this.tel = tel;
            }

            public static class FeatureTagsBean {
                /**
                 * desc : 限网上选座后取票
                 * type : 1
                 * tag : 取票机
                 */

                @SerializedName("desc")
                private String desc;
                @SerializedName("type")
                private int type;
                @SerializedName("tag")
                private String tag;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTag() {
                    return tag;
                }

                public void setTag(String tag) {
                    this.tag = tag;
                }
            }
        }

        public static class DateShowBean {
            @SerializedName("2017-02-10")
            private List<_$20170210Bean> $20170210;
            @SerializedName("2017-02-11")
            private List<_$20170211Bean> $20170211;
            @SerializedName("2017-02-12")
            private List<_$20170212Bean> $20170212;

            public List<_$20170210Bean> get$20170210() {
                return $20170210;
            }

            public void set$20170210(List<_$20170210Bean> $20170210) {
                this.$20170210 = $20170210;
            }

            public List<_$20170211Bean> get$20170211() {
                return $20170211;
            }

            public void set$20170211(List<_$20170211Bean> $20170211) {
                this.$20170211 = $20170211;
            }

            public List<_$20170212Bean> get$20170212() {
                return $20170212;
            }

            public void set$20170212(List<_$20170212Bean> $20170212) {
                this.$20170212 = $20170212;
            }

            public static class _$20170210Bean {
                /**
                 * tm : 10:20
                 * sell : true
                 * showId : 38228
                 * grayDesc :
                 * seatStatus : 1
                 * isMorrow : false
                 * th : 5号厅
                 * sellPrStr : <span class="m3 true2"><i>96234</i></span>
                 * prStr : <span class="m3 true2"><i>86401</i></span>
                 * tp : 2D
                 * lang : 国语
                 * preferential : 0
                 * end : 11:58
                 * dt : 2017-02-10
                 * showDate : 2017-02-10
                 * embed : 0
                 */

                @SerializedName("tm")
                private String tm;
                @SerializedName("sell")
                private boolean sell;
                @SerializedName("showId")
                private int showId;
                @SerializedName("grayDesc")
                private String grayDesc;
                @SerializedName("seatStatus")
                private int seatStatus;
                @SerializedName("isMorrow")
                private boolean isMorrow;
                @SerializedName("th")
                private String th;
                @SerializedName("sellPrStr")
                private String sellPrStr;
                @SerializedName("prStr")
                private String prStr;
                @SerializedName("tp")
                private String tp;
                @SerializedName("lang")
                private String lang;
                @SerializedName("preferential")
                private int preferential;
                @SerializedName("end")
                private String end;
                @SerializedName("dt")
                private String dt;
                @SerializedName("showDate")
                private String showDate;
                @SerializedName("embed")
                private int embed;

                public String getTm() {
                    return tm;
                }

                public void setTm(String tm) {
                    this.tm = tm;
                }

                public boolean isSell() {
                    return sell;
                }

                public void setSell(boolean sell) {
                    this.sell = sell;
                }

                public int getShowId() {
                    return showId;
                }

                public void setShowId(int showId) {
                    this.showId = showId;
                }

                public String getGrayDesc() {
                    return grayDesc;
                }

                public void setGrayDesc(String grayDesc) {
                    this.grayDesc = grayDesc;
                }

                public int getSeatStatus() {
                    return seatStatus;
                }

                public void setSeatStatus(int seatStatus) {
                    this.seatStatus = seatStatus;
                }

                public boolean isIsMorrow() {
                    return isMorrow;
                }

                public void setIsMorrow(boolean isMorrow) {
                    this.isMorrow = isMorrow;
                }

                public String getTh() {
                    return th;
                }

                public void setTh(String th) {
                    this.th = th;
                }

                public String getSellPrStr() {
                    return sellPrStr;
                }

                public void setSellPrStr(String sellPrStr) {
                    this.sellPrStr = sellPrStr;
                }

                public String getPrStr() {
                    return prStr;
                }

                public void setPrStr(String prStr) {
                    this.prStr = prStr;
                }

                public String getTp() {
                    return tp;
                }

                public void setTp(String tp) {
                    this.tp = tp;
                }

                public String getLang() {
                    return lang;
                }

                public void setLang(String lang) {
                    this.lang = lang;
                }

                public int getPreferential() {
                    return preferential;
                }

                public void setPreferential(int preferential) {
                    this.preferential = preferential;
                }

                public String getEnd() {
                    return end;
                }

                public void setEnd(String end) {
                    this.end = end;
                }

                public String getDt() {
                    return dt;
                }

                public void setDt(String dt) {
                    this.dt = dt;
                }

                public String getShowDate() {
                    return showDate;
                }

                public void setShowDate(String showDate) {
                    this.showDate = showDate;
                }

                public int getEmbed() {
                    return embed;
                }

                public void setEmbed(int embed) {
                    this.embed = embed;
                }
            }

            public static class _$20170211Bean {
                /**
                 * tm : 10:20
                 * sell : true
                 * showId : 110835
                 * grayDesc :
                 * seatStatus : 1
                 * isMorrow : false
                 * th : 5号厅
                 * sellPrStr : <span class="m3 true2"><i>35381</i></span>
                 * prStr : <span class="m3 true2"><i>59405</i></span>
                 * tp : 2D
                 * lang : 国语
                 * preferential : 0
                 * end : 11:58
                 * dt : 2017-02-11
                 * showDate : 2017-02-11
                 * embed : 0
                 */

                @SerializedName("tm")
                private String tm;
                @SerializedName("sell")
                private boolean sell;
                @SerializedName("showId")
                private int showId;
                @SerializedName("grayDesc")
                private String grayDesc;
                @SerializedName("seatStatus")
                private int seatStatus;
                @SerializedName("isMorrow")
                private boolean isMorrow;
                @SerializedName("th")
                private String th;
                @SerializedName("sellPrStr")
                private String sellPrStr;
                @SerializedName("prStr")
                private String prStr;
                @SerializedName("tp")
                private String tp;
                @SerializedName("lang")
                private String lang;
                @SerializedName("preferential")
                private int preferential;
                @SerializedName("end")
                private String end;
                @SerializedName("dt")
                private String dt;
                @SerializedName("showDate")
                private String showDate;
                @SerializedName("embed")
                private int embed;

                public String getTm() {
                    return tm;
                }

                public void setTm(String tm) {
                    this.tm = tm;
                }

                public boolean isSell() {
                    return sell;
                }

                public void setSell(boolean sell) {
                    this.sell = sell;
                }

                public int getShowId() {
                    return showId;
                }

                public void setShowId(int showId) {
                    this.showId = showId;
                }

                public String getGrayDesc() {
                    return grayDesc;
                }

                public void setGrayDesc(String grayDesc) {
                    this.grayDesc = grayDesc;
                }

                public int getSeatStatus() {
                    return seatStatus;
                }

                public void setSeatStatus(int seatStatus) {
                    this.seatStatus = seatStatus;
                }

                public boolean isIsMorrow() {
                    return isMorrow;
                }

                public void setIsMorrow(boolean isMorrow) {
                    this.isMorrow = isMorrow;
                }

                public String getTh() {
                    return th;
                }

                public void setTh(String th) {
                    this.th = th;
                }

                public String getSellPrStr() {
                    return sellPrStr;
                }

                public void setSellPrStr(String sellPrStr) {
                    this.sellPrStr = sellPrStr;
                }

                public String getPrStr() {
                    return prStr;
                }

                public void setPrStr(String prStr) {
                    this.prStr = prStr;
                }

                public String getTp() {
                    return tp;
                }

                public void setTp(String tp) {
                    this.tp = tp;
                }

                public String getLang() {
                    return lang;
                }

                public void setLang(String lang) {
                    this.lang = lang;
                }

                public int getPreferential() {
                    return preferential;
                }

                public void setPreferential(int preferential) {
                    this.preferential = preferential;
                }

                public String getEnd() {
                    return end;
                }

                public void setEnd(String end) {
                    this.end = end;
                }

                public String getDt() {
                    return dt;
                }

                public void setDt(String dt) {
                    this.dt = dt;
                }

                public String getShowDate() {
                    return showDate;
                }

                public void setShowDate(String showDate) {
                    this.showDate = showDate;
                }

                public int getEmbed() {
                    return embed;
                }

                public void setEmbed(int embed) {
                    this.embed = embed;
                }
            }

            public static class _$20170212Bean {
                /**
                 * tm : 10:20
                 * sell : true
                 * showId : 52342
                 * grayDesc :
                 * seatStatus : 1
                 * isMorrow : false
                 * th : 5号厅
                 * sellPrStr : <span class="m3 true2"><i>89389</i></span>
                 * prStr : <span class="m3 true2"><i>38404</i></span>
                 * tp : 2D
                 * lang : 国语
                 * preferential : 0
                 * end : 11:58
                 * dt : 2017-02-12
                 * showDate : 2017-02-12
                 * embed : 0
                 */

                @SerializedName("tm")
                private String tm;
                @SerializedName("sell")
                private boolean sell;
                @SerializedName("showId")
                private int showId;
                @SerializedName("grayDesc")
                private String grayDesc;
                @SerializedName("seatStatus")
                private int seatStatus;
                @SerializedName("isMorrow")
                private boolean isMorrow;
                @SerializedName("th")
                private String th;
                @SerializedName("sellPrStr")
                private String sellPrStr;
                @SerializedName("prStr")
                private String prStr;
                @SerializedName("tp")
                private String tp;
                @SerializedName("lang")
                private String lang;
                @SerializedName("preferential")
                private int preferential;
                @SerializedName("end")
                private String end;
                @SerializedName("dt")
                private String dt;
                @SerializedName("showDate")
                private String showDate;
                @SerializedName("embed")
                private int embed;

                public String getTm() {
                    return tm;
                }

                public void setTm(String tm) {
                    this.tm = tm;
                }

                public boolean isSell() {
                    return sell;
                }

                public void setSell(boolean sell) {
                    this.sell = sell;
                }

                public int getShowId() {
                    return showId;
                }

                public void setShowId(int showId) {
                    this.showId = showId;
                }

                public String getGrayDesc() {
                    return grayDesc;
                }

                public void setGrayDesc(String grayDesc) {
                    this.grayDesc = grayDesc;
                }

                public int getSeatStatus() {
                    return seatStatus;
                }

                public void setSeatStatus(int seatStatus) {
                    this.seatStatus = seatStatus;
                }

                public boolean isIsMorrow() {
                    return isMorrow;
                }

                public void setIsMorrow(boolean isMorrow) {
                    this.isMorrow = isMorrow;
                }

                public String getTh() {
                    return th;
                }

                public void setTh(String th) {
                    this.th = th;
                }

                public String getSellPrStr() {
                    return sellPrStr;
                }

                public void setSellPrStr(String sellPrStr) {
                    this.sellPrStr = sellPrStr;
                }

                public String getPrStr() {
                    return prStr;
                }

                public void setPrStr(String prStr) {
                    this.prStr = prStr;
                }

                public String getTp() {
                    return tp;
                }

                public void setTp(String tp) {
                    this.tp = tp;
                }

                public String getLang() {
                    return lang;
                }

                public void setLang(String lang) {
                    this.lang = lang;
                }

                public int getPreferential() {
                    return preferential;
                }

                public void setPreferential(int preferential) {
                    this.preferential = preferential;
                }

                public String getEnd() {
                    return end;
                }

                public void setEnd(String end) {
                    this.end = end;
                }

                public String getDt() {
                    return dt;
                }

                public void setDt(String dt) {
                    this.dt = dt;
                }

                public String getShowDate() {
                    return showDate;
                }

                public void setShowDate(String showDate) {
                    this.showDate = showDate;
                }

                public int getEmbed() {
                    return embed;
                }

                public void setEmbed(int embed) {
                    this.embed = embed;
                }
            }
        }

        public static class DatesBean {
            /**
             * slug : 2017-02-10
             * text : 今天 2月10日
             */

            @SerializedName("slug")
            private String slug;
            @SerializedName("text")
            private String text;

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }

        public static class MoviesBean {
            /**
             * nm : 决战食神
             * img : http://p0.meituan.net/165.220/movie/7da359aec37708c194080d203ea7f490342855.jpeg
             * sc : 0.0
             * ver : 2D/3D
             * isShowing : true
             * preferential : 0
             * id : 346106
             */

            @SerializedName("nm")
            private String nm;
            @SerializedName("img")
            private String img;
            @SerializedName("sc")
            private double sc;
            @SerializedName("ver")
            private String ver;
            @SerializedName("isShowing")
            private boolean isShowing;
            @SerializedName("preferential")
            private int preferential;
            @SerializedName("id")
            private int id;

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public boolean isIsShowing() {
                return isShowing;
            }

            public void setIsShowing(boolean isShowing) {
                this.isShowing = isShowing;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}

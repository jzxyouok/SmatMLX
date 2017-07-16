package com.mlx.smartmlx.entiy;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.entiy
 * 创建者：MLX
 * 创建时间：2017/3/19 21:15
 * 用途：微信精选的api
 */

public class WeChatEntity {
    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"newslist":[{"title":"闲置旧U盘的妙用！新技能get√！！！","picUrl":"http://mmbiz.qpic.cn/mmbiz/ARZUFYCnAWu4pvk48z0MI5y6NlgztstEgXqiaV2P9vtweyB2Vibp0RvY0XvzrEZqZ4yvffUqIXRYb2fLn2UEDEEA/0","description":"360安全卫士","ctime":"2017-03-10","url":"http://mp.weixin.qq.com/s?__biz=MjM5MTA2ODg0MA==&mid=200650033&idx=1&sn=78b9c09021e97592e376497a0e33dad4#rd"},{"title":"首发|你理想中书房的样子","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/5bz7GtcZh6xvsXRSxhL1qXHTVEVdJ11fmMQwrtG13SW0QIdVAf0bZeyRsickJ5icbS56AT2EaXTzSA07ib5GDkIyg/0?wx_fmt=jpeg","description":"壹期壹会","ctime":"2017-03-10","url":"http://mp.weixin.qq.com/s/32AVG3kGvZLmqNh3RXsEZg"},{"title":"看完这部国产片，顿时觉得《五十度灰》太小儿科","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/3N8gA4Fjgv7bLjgJrHAeOOpVfOxEiajlp9zhiacTF1XibIxLEIiacq6ibOwMZo6aDO1KLOng0EseHPJAjmliaQgvlEAA/0?wx_fmt=jpeg","description":"电影铺子","ctime":"2017-03-09","url":"http://mp.weixin.qq.com/s/FBV3wIAueuoFWz9JAXKlXA"},{"title":"关了灯真的一个样吗？","picUrl":"http://mmbiz.qpic.cn/mmbiz_png/zynprs47B4RomkwhjRVJvB6sB6icrgB84zI4MhN7z4K6icr2wMIvrboRpECA7jdvv5WFJC9uPic88zaLUGqzIZ8BQ/0?wx_fmt=png","description":"我要WhatYouNeed","ctime":"2017-03-09","url":"http://mp.weixin.qq.com/s/oGQSJlt3foTkcVzBduKxIw"},{"title":"一个泳池里有多少尿？大概是100个瓶装水\u2026\u2026还要多一点","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/icZklJrRfHgAmic4fPJYBhfmxM4ngpdTQaMsEicoRaaAUuSuaGqYehn2G5T7Vz9pcMXcXSHkLT9WLas397JjPS1uw/0?wx_fmt=jpeg","description":"果壳网","ctime":"2017-03-09","url":"http://mp.weixin.qq.com/s/pUp_kr5XjJzBk50MqSjx3Q"},{"title":"我越是想要，越是装作若无其事 | 害怕受伤会让你失去什么","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/5ROs96OaibIm6RStzbxmb4t3c7C63gZSD6oQmYpibvZ1cM3m8ic1stUhkfE4yZfvuswLzDU4iavZMbQbqWUaKuPabw/0?wx_fmt=jpeg","description":"新世相","ctime":"2017-03-09","url":"http://mp.weixin.qq.com/s/yqJJksIBYkZbYPi2buc9zw"},{"title":"愿天下少女，都被用心宠爱！","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/fJQfMRLCskaxs6O3LDchgPeticqRyRtibwFdkD3CUEuShbICSa63HdR60Pt9lZibu7SSeHJxqEmtAzC8H6G9EmK3w/0?wx_fmt=jpeg","description":"招商银行","ctime":"2017-03-08","url":"http://mp.weixin.qq.com/s/d4OkTzlJ06ub5ZUlFEOodQ"},{"title":"睡不到喜欢的男人，因为你没做到这点","picUrl":"http://mmbiz.qpic.cn/mmbiz_png/yNIhiaAHZVboib4bFkOhBEOHibOWBFjmVT7B3WAWibD5oJpHRR0k8licj4okzPLFtw2OHu6TDTvgate1QxDPxjpAXHA/0?wx_fmt=png","description":"故姐","ctime":"2017-03-07","url":"http://mp.weixin.qq.com/s/j6t1ED-kS0MzZgPB-Ed5Ng"},{"title":"我最不想嫁的，是我爸那种男人","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/cnLxyJPKUPmp4lKlntjhGib4JCvU7CicrukNCuAYYucl8hiafJx5mBj2q0co4QBR43nDY1JWqwecHj9lCPEfXiccTg/0","description":"咪蒙","ctime":"2017-03-07","url":"http://mp.weixin.qq.com/s/Dm2W-HCM9VfadvfYLMNaxw"},{"title":"戴上这款浓浓SM风情的口罩，终于可以放肆呻吟了~","picUrl":"http://mmbiz.qpic.cn/mmbiz_png/tyf887u3VAEGY5VkEMJu0vex57Wagbafaics47Knd2ImpJbsSAswUEw1zuO7lSPDDEM4b8xJSYriaWIaxZ7ar4xg/0?wx_fmt=png","description":"最黑科技","ctime":"2017-03-07","url":"http://mp.weixin.qq.com/s/InSuN89SSnVtG0Uglyq6jg"}],"code":200,"msg":"success"}
     */

    @SerializedName("showapi_res_code")
    private int showapiResCode;
    @SerializedName("showapi_res_error")
    private String showapiResError;
    @SerializedName("showapi_res_body")
    private ShowapiResBodyBean showapiResBody;

    public int getShowapiResCode() {
        return showapiResCode;
    }

    public void setShowapiResCode(int showapiResCode) {
        this.showapiResCode = showapiResCode;
    }

    public String getShowapiResError() {
        return showapiResError;
    }

    public void setShowapiResError(String showapiResError) {
        this.showapiResError = showapiResError;
    }

    public ShowapiResBodyBean getShowapiResBody() {
        return showapiResBody;
    }

    public void setShowapiResBody(ShowapiResBodyBean showapiResBody) {
        this.showapiResBody = showapiResBody;
    }

    public static class ShowapiResBodyBean {
        /**
         * newslist : [{"title":"闲置旧U盘的妙用！新技能get√！！！","picUrl":"http://mmbiz.qpic.cn/mmbiz/ARZUFYCnAWu4pvk48z0MI5y6NlgztstEgXqiaV2P9vtweyB2Vibp0RvY0XvzrEZqZ4yvffUqIXRYb2fLn2UEDEEA/0","description":"360安全卫士","ctime":"2017-03-10","url":"http://mp.weixin.qq.com/s?__biz=MjM5MTA2ODg0MA==&mid=200650033&idx=1&sn=78b9c09021e97592e376497a0e33dad4#rd"},{"title":"首发|你理想中书房的样子","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/5bz7GtcZh6xvsXRSxhL1qXHTVEVdJ11fmMQwrtG13SW0QIdVAf0bZeyRsickJ5icbS56AT2EaXTzSA07ib5GDkIyg/0?wx_fmt=jpeg","description":"壹期壹会","ctime":"2017-03-10","url":"http://mp.weixin.qq.com/s/32AVG3kGvZLmqNh3RXsEZg"},{"title":"看完这部国产片，顿时觉得《五十度灰》太小儿科","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/3N8gA4Fjgv7bLjgJrHAeOOpVfOxEiajlp9zhiacTF1XibIxLEIiacq6ibOwMZo6aDO1KLOng0EseHPJAjmliaQgvlEAA/0?wx_fmt=jpeg","description":"电影铺子","ctime":"2017-03-09","url":"http://mp.weixin.qq.com/s/FBV3wIAueuoFWz9JAXKlXA"},{"title":"关了灯真的一个样吗？","picUrl":"http://mmbiz.qpic.cn/mmbiz_png/zynprs47B4RomkwhjRVJvB6sB6icrgB84zI4MhN7z4K6icr2wMIvrboRpECA7jdvv5WFJC9uPic88zaLUGqzIZ8BQ/0?wx_fmt=png","description":"我要WhatYouNeed","ctime":"2017-03-09","url":"http://mp.weixin.qq.com/s/oGQSJlt3foTkcVzBduKxIw"},{"title":"一个泳池里有多少尿？大概是100个瓶装水\u2026\u2026还要多一点","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/icZklJrRfHgAmic4fPJYBhfmxM4ngpdTQaMsEicoRaaAUuSuaGqYehn2G5T7Vz9pcMXcXSHkLT9WLas397JjPS1uw/0?wx_fmt=jpeg","description":"果壳网","ctime":"2017-03-09","url":"http://mp.weixin.qq.com/s/pUp_kr5XjJzBk50MqSjx3Q"},{"title":"我越是想要，越是装作若无其事 | 害怕受伤会让你失去什么","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/5ROs96OaibIm6RStzbxmb4t3c7C63gZSD6oQmYpibvZ1cM3m8ic1stUhkfE4yZfvuswLzDU4iavZMbQbqWUaKuPabw/0?wx_fmt=jpeg","description":"新世相","ctime":"2017-03-09","url":"http://mp.weixin.qq.com/s/yqJJksIBYkZbYPi2buc9zw"},{"title":"愿天下少女，都被用心宠爱！","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/fJQfMRLCskaxs6O3LDchgPeticqRyRtibwFdkD3CUEuShbICSa63HdR60Pt9lZibu7SSeHJxqEmtAzC8H6G9EmK3w/0?wx_fmt=jpeg","description":"招商银行","ctime":"2017-03-08","url":"http://mp.weixin.qq.com/s/d4OkTzlJ06ub5ZUlFEOodQ"},{"title":"睡不到喜欢的男人，因为你没做到这点","picUrl":"http://mmbiz.qpic.cn/mmbiz_png/yNIhiaAHZVboib4bFkOhBEOHibOWBFjmVT7B3WAWibD5oJpHRR0k8licj4okzPLFtw2OHu6TDTvgate1QxDPxjpAXHA/0?wx_fmt=png","description":"故姐","ctime":"2017-03-07","url":"http://mp.weixin.qq.com/s/j6t1ED-kS0MzZgPB-Ed5Ng"},{"title":"我最不想嫁的，是我爸那种男人","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/cnLxyJPKUPmp4lKlntjhGib4JCvU7CicrukNCuAYYucl8hiafJx5mBj2q0co4QBR43nDY1JWqwecHj9lCPEfXiccTg/0","description":"咪蒙","ctime":"2017-03-07","url":"http://mp.weixin.qq.com/s/Dm2W-HCM9VfadvfYLMNaxw"},{"title":"戴上这款浓浓SM风情的口罩，终于可以放肆呻吟了~","picUrl":"http://mmbiz.qpic.cn/mmbiz_png/tyf887u3VAEGY5VkEMJu0vex57Wagbafaics47Knd2ImpJbsSAswUEw1zuO7lSPDDEM4b8xJSYriaWIaxZ7ar4xg/0?wx_fmt=png","description":"最黑科技","ctime":"2017-03-07","url":"http://mp.weixin.qq.com/s/InSuN89SSnVtG0Uglyq6jg"}]
         * code : 200
         * msg : success
         */

        @SerializedName("code")
        private int code;
        @SerializedName("msg")
        private String msg;
        @SerializedName("newslist")
        private List<NewslistBean> newslist;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public List<NewslistBean> getNewslist() {
            return newslist;
        }

        public void setNewslist(List<NewslistBean> newslist) {
            this.newslist = newslist;
        }

        public static class NewslistBean {
            /**
             * title : 闲置旧U盘的妙用！新技能get√！！！
             * picUrl : http://mmbiz.qpic.cn/mmbiz/ARZUFYCnAWu4pvk48z0MI5y6NlgztstEgXqiaV2P9vtweyB2Vibp0RvY0XvzrEZqZ4yvffUqIXRYb2fLn2UEDEEA/0
             * description : 360安全卫士
             * ctime : 2017-03-10
             * url : http://mp.weixin.qq.com/s?__biz=MjM5MTA2ODg0MA==&mid=200650033&idx=1&sn=78b9c09021e97592e376497a0e33dad4#rd
             */

            @SerializedName("title")
            private String title;
            @SerializedName("picUrl")
            private String picUrl;
            @SerializedName("description")
            private String description;
            @SerializedName("ctime")
            private String ctime;
            @SerializedName("url")
            private String url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}

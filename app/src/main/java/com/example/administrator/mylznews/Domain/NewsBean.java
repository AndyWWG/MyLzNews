package com.example.administrator.mylznews.Domain;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/6/10 0010.
 */
public class NewsBean {


    /**
     * Banner : null
     * List : [{"ArticleType":10,"Data":{"GlobalID":3135916,"Title":"三峡枢纽结束生态补水提前转入防汛调度","Summary":"三峡水库提前结束生态补水进程，转入防汛调度。","SubTitle":"三峡枢纽提前转入防汛调度","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461495463689_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461495465658.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461495463689_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918835},"LikeCount":494},{"ArticleType":10,"Data":{"GlobalID":3135825,"Title":"河北省委常委张越涉严重违纪被免去领导职务","Summary":"张越涉嫌严重违纪，中央已决定免去其领导职务。","SubTitle":"河北省委常委张越违纪被免职","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461493978475_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461493896650.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461493978475_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918819},"LikeCount":220},{"ArticleType":10,"Data":{"GlobalID":3135149,"Title":"官员月月公款购香烟 自称一根烟一下子拉近距离","Summary":"小小一包香烟，沾上了公款，就不是小问题。","SubTitle":"官员月月公款购香烟为拉近距离","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461479582375_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461479134792.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461479582375_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918788},"LikeCount":292},{"ArticleType":10,"Data":{"GlobalID":3135255,"Title":"河南：警方鸣枪威慑\u201c医闹\u201d人员 死亡幼儿母亲吓跪","Summary":"河南省临颍县人民医院门前发生一起\u201c医闹\u201d事件。","SubTitle":"河南警方鸣枪威慑\u201c医闹\u201d人员","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461480178517_15001.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461480181610.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461480178517_15001.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918725},"LikeCount":214},{"ArticleType":7,"Data":{"GlobalID":3130728,"Title":"靖江火灾系安全生产责任事故","Summary":"初步查明，事故是由于经营单位违规动火作业导致的。","MyType":"小图","Photo":"http://static.jstv.com/img/2016/4/22/20164221461312475995_14508_s.jpg","PhotoWidth":180,"PhotoHeight":125,"SpecialID":18655,"Href":"http://news.jstv.com/wap/special/jingjiangqihuo/index.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/22/20164221461312475995_14508_s.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918710},"LikeCount":0},{"ArticleType":1,"Data":{"GlobalID":3135217,"MyType":"1大2小3张图","Title":"靖江消防员牺牲 致敬那些殉职战士","Photo":"http://static.jstv.com/img/2016/4/24/20164241461479383555_14505.jpg","PhotoWidth":180,"PhotoHeight":140,"Photo_s1":"http://static.jstv.com/img/2016/4/24/20164241461479394848_14505.jpg","Photo_s2":"http://static.jstv.com/img/2016/4/24/20164241461479398998_14505.jpg","Href":"http://news.jstv.com/wap/photo/20160424/1461479406965.html","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461479383555_14505.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918702},"LikeCount":465},{"ArticleType":10,"Data":{"GlobalID":3135824,"Title":"媒体评：\u201c穿牛仔裤毁灭未来\u201d是夸大其词","Summary":"关心一种商品生产中的污染，应呼吁前端监管尽责。","SubTitle":"媒评：穿牛仔裤毁未来夸大其词","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461493725742_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461493584628.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461493725742_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918698},"LikeCount":368},{"ArticleType":10,"Data":{"GlobalID":3135561,"Title":"川师杀人案警方要死者哥哥写致歉 令记者\"滚远\"","Summary":"死者哥哥因发布死者招嫖被警方要求写致歉书。","SubTitle":"川师杀人案警方要死者哥写致歉","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461484015355_15001.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461484035875.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461484015355_15001.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918694},"LikeCount":344},{"ArticleType":10,"Data":{"GlobalID":3134799,"Title":"河南一副县长借债供养情妇 称仕途迷茫转战情场","Summary":"他不想着如何把工作做好，而是想着如何当更大的官。","SubTitle":"官员借债养情妇 自称仕途迷茫","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461458693793_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461458698538.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461458693793_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918250},"LikeCount":165},{"ArticleType":10,"Data":{"GlobalID":3134853,"Title":"山西最紧张时刻:万亿煤炭巨债缠身 60%在银行","Summary":"据估计，债务60%在银行，40%是债券之类的。","SubTitle":"山西最紧张时刻:万亿巨债缠身","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461469041432_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461469044380.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461469041432_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918229},"LikeCount":190}]
     * HeadPics : []
     */

    private MyDataBean Data;
    /**
     * Data : {"Banner":null,"List":[{"ArticleType":10,"Data":{"GlobalID":3135916,"Title":"三峡枢纽结束生态补水提前转入防汛调度","Summary":"三峡水库提前结束生态补水进程，转入防汛调度。","SubTitle":"三峡枢纽提前转入防汛调度","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461495463689_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461495465658.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461495463689_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918835},"LikeCount":494},{"ArticleType":10,"Data":{"GlobalID":3135825,"Title":"河北省委常委张越涉严重违纪被免去领导职务","Summary":"张越涉嫌严重违纪，中央已决定免去其领导职务。","SubTitle":"河北省委常委张越违纪被免职","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461493978475_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461493896650.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461493978475_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918819},"LikeCount":220},{"ArticleType":10,"Data":{"GlobalID":3135149,"Title":"官员月月公款购香烟 自称一根烟一下子拉近距离","Summary":"小小一包香烟，沾上了公款，就不是小问题。","SubTitle":"官员月月公款购香烟为拉近距离","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461479582375_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461479134792.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461479582375_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918788},"LikeCount":292},{"ArticleType":10,"Data":{"GlobalID":3135255,"Title":"河南：警方鸣枪威慑\u201c医闹\u201d人员 死亡幼儿母亲吓跪","Summary":"河南省临颍县人民医院门前发生一起\u201c医闹\u201d事件。","SubTitle":"河南警方鸣枪威慑\u201c医闹\u201d人员","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461480178517_15001.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461480181610.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461480178517_15001.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918725},"LikeCount":214},{"ArticleType":7,"Data":{"GlobalID":3130728,"Title":"靖江火灾系安全生产责任事故","Summary":"初步查明，事故是由于经营单位违规动火作业导致的。","MyType":"小图","Photo":"http://static.jstv.com/img/2016/4/22/20164221461312475995_14508_s.jpg","PhotoWidth":180,"PhotoHeight":125,"SpecialID":18655,"Href":"http://news.jstv.com/wap/special/jingjiangqihuo/index.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/22/20164221461312475995_14508_s.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918710},"LikeCount":0},{"ArticleType":1,"Data":{"GlobalID":3135217,"MyType":"1大2小3张图","Title":"靖江消防员牺牲 致敬那些殉职战士","Photo":"http://static.jstv.com/img/2016/4/24/20164241461479383555_14505.jpg","PhotoWidth":180,"PhotoHeight":140,"Photo_s1":"http://static.jstv.com/img/2016/4/24/20164241461479394848_14505.jpg","Photo_s2":"http://static.jstv.com/img/2016/4/24/20164241461479398998_14505.jpg","Href":"http://news.jstv.com/wap/photo/20160424/1461479406965.html","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461479383555_14505.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918702},"LikeCount":465},{"ArticleType":10,"Data":{"GlobalID":3135824,"Title":"媒体评：\u201c穿牛仔裤毁灭未来\u201d是夸大其词","Summary":"关心一种商品生产中的污染，应呼吁前端监管尽责。","SubTitle":"媒评：穿牛仔裤毁未来夸大其词","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461493725742_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461493584628.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461493725742_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918698},"LikeCount":368},{"ArticleType":10,"Data":{"GlobalID":3135561,"Title":"川师杀人案警方要死者哥哥写致歉 令记者\"滚远\"","Summary":"死者哥哥因发布死者招嫖被警方要求写致歉书。","SubTitle":"川师杀人案警方要死者哥写致歉","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461484015355_15001.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461484035875.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461484015355_15001.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918694},"LikeCount":344},{"ArticleType":10,"Data":{"GlobalID":3134799,"Title":"河南一副县长借债供养情妇 称仕途迷茫转战情场","Summary":"他不想着如何把工作做好，而是想着如何当更大的官。","SubTitle":"官员借债养情妇 自称仕途迷茫","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461458693793_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461458698538.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461458693793_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918250},"LikeCount":165},{"ArticleType":10,"Data":{"GlobalID":3134853,"Title":"山西最紧张时刻:万亿煤炭巨债缠身 60%在银行","Summary":"据估计，债务60%在银行，40%是债券之类的。","SubTitle":"山西最紧张时刻:万亿巨债缠身","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461469041432_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461469044380.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461469041432_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918229},"LikeCount":190}],"HeadPics":[]}
     * ResultCode : 0
     * Message : 获取成功
     */

    private int ResultCode;
    private String Message;

    public MyDataBean getData() {
        return Data;
    }

    public void setData(MyDataBean Data) {
        this.Data = Data;
    }

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int ResultCode) {
        this.ResultCode = ResultCode;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public static class MyDataBean {
        private Object Banner;
        /**
         * ArticleType : 10
         * Data : {"GlobalID":3135916,"Title":"三峡枢纽结束生态补水提前转入防汛调度","Summary":"三峡水库提前结束生态补水进程，转入防汛调度。","SubTitle":"三峡枢纽提前转入防汛调度","MyType":"小图+标题+描述","Photo":"http://static.jstv.com/img/2016/4/24/20164241461495463689_15000.jpg","PhotoWidth":180,"PhotoHeight":125,"Footer":"","HaveVideo":"","HaveVote":"","Href":"http://news.jstv.com/a/20160424/1461495465658.shtml","OtherPhoto":"http://static.jstv.com/img/2016/4/24/20164241461495463689_15000.jpg","OtherPhotoWidth":0,"OtherPhotoHeight":0,"OrderIndex":23918835}
         * LikeCount : 494
         */

        private java.util.List<ListBean> List;
        private java.util.List<?> HeadPics;


        public Object getBanner() {
            return Banner;
        }

        public void setBanner(Object Banner) {
            this.Banner = Banner;
        }

        public List<ListBean> getList() {
            return List;
        }

        public void setList(List<ListBean> List) {
            this.List = List;
        }

        public List<?> getHeadPics() {
            return HeadPics;
        }

        public void setHeadPics(List<?> HeadPics) {
            this.HeadPics = HeadPics;
        }

        public static class ListBean {
            private int ArticleType;
            /**
             * GlobalID : 3135916
             * Title : 三峡枢纽结束生态补水提前转入防汛调度
             * Summary : 三峡水库提前结束生态补水进程，转入防汛调度。
             * SubTitle : 三峡枢纽提前转入防汛调度
             * MyType : 小图+标题+描述
             * Photo : http://static.jstv.com/img/2016/4/24/20164241461495463689_15000.jpg
             * PhotoWidth : 180
             * PhotoHeight : 125
             * Footer :
             * HaveVideo :
             * HaveVote :
             * Href : http://news.jstv.com/a/20160424/1461495465658.shtml
             * OtherPhoto : http://static.jstv.com/img/2016/4/24/20164241461495463689_15000.jpg
             * OtherPhotoWidth : 0
             * OtherPhotoHeight : 0
             * OrderIndex : 23918835
             */

            private DataBean Data;
            private int LikeCount;

            public static NewsBean objectFromData(String str) {

                return new Gson().fromJson(str, NewsBean.class);
            }

            public int getArticleType() {
                return ArticleType;
            }

            public void setArticleType(int ArticleType) {
                this.ArticleType = ArticleType;
            }

            public DataBean getData() {
                return Data;
            }

            public void setData(DataBean Data) {
                this.Data = Data;
            }

            public int getLikeCount() {
                return LikeCount;
            }

            public void setLikeCount(int LikeCount) {
                this.LikeCount = LikeCount;
            }

            public static class DataBean {
                private int GlobalID;
                private String Title;
                private String Summary;
                private String SubTitle;
                private String MyType;
                private String Photo;
                private int PhotoWidth;
                private int PhotoHeight;
                private String Footer;
                private String HaveVideo;
                private String HaveVote;
                private String Href;
                private String OtherPhoto;
                private int OtherPhotoWidth;
                private int OtherPhotoHeight;
                private int OrderIndex;

                public int getGlobalID() {
                    return GlobalID;
                }

                public void setGlobalID(int GlobalID) {
                    this.GlobalID = GlobalID;
                }

                public String getTitle() {
                    return Title;
                }

                public void setTitle(String Title) {
                    this.Title = Title;
                }

                public String getSummary() {
                    return Summary;
                }

                public void setSummary(String Summary) {
                    this.Summary = Summary;
                }

                public String getSubTitle() {
                    return SubTitle;
                }

                public void setSubTitle(String SubTitle) {
                    this.SubTitle = SubTitle;
                }

                public String getMyType() {
                    return MyType;
                }

                public void setMyType(String MyType) {
                    this.MyType = MyType;
                }

                public String getPhoto() {
                    return Photo;
                }

                public void setPhoto(String Photo) {
                    this.Photo = Photo;
                }

                public int getPhotoWidth() {
                    return PhotoWidth;
                }

                public void setPhotoWidth(int PhotoWidth) {
                    this.PhotoWidth = PhotoWidth;
                }

                public int getPhotoHeight() {
                    return PhotoHeight;
                }

                public void setPhotoHeight(int PhotoHeight) {
                    this.PhotoHeight = PhotoHeight;
                }

                public String getFooter() {
                    return Footer;
                }

                public void setFooter(String Footer) {
                    this.Footer = Footer;
                }

                public String getHaveVideo() {
                    return HaveVideo;
                }

                public void setHaveVideo(String HaveVideo) {
                    this.HaveVideo = HaveVideo;
                }

                public String getHaveVote() {
                    return HaveVote;
                }

                public void setHaveVote(String HaveVote) {
                    this.HaveVote = HaveVote;
                }

                public String getHref() {
                    return Href;
                }

                public void setHref(String Href) {
                    this.Href = Href;
                }

                public String getOtherPhoto() {
                    return OtherPhoto;
                }

                public void setOtherPhoto(String OtherPhoto) {
                    this.OtherPhoto = OtherPhoto;
                }

                public int getOtherPhotoWidth() {
                    return OtherPhotoWidth;
                }

                public void setOtherPhotoWidth(int OtherPhotoWidth) {
                    this.OtherPhotoWidth = OtherPhotoWidth;
                }

                public int getOtherPhotoHeight() {
                    return OtherPhotoHeight;
                }

                public void setOtherPhotoHeight(int OtherPhotoHeight) {
                    this.OtherPhotoHeight = OtherPhotoHeight;
                }

                public int getOrderIndex() {
                    return OrderIndex;
                }

                public void setOrderIndex(int OrderIndex) {
                    this.OrderIndex = OrderIndex;
                }
            }
        }
    }
}
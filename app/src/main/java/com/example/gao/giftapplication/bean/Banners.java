package com.example.gao.giftapplication.bean;

import java.util.List;

/**
 * Created by gao on 2016/12/27.
 */

public class Banners {


    /**
     * code : 200
     * data : {"banners":[{"ad_monitors":[],"channel":"all","id":835,"image_url":"http://img03.liwushuo.com/image/161225/zg6pfqadx.jpg-w720","order":915,"status":0,"target_id":1046996,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=post&post_id=1046996","type":"post","webp_url":"http://img03.liwushuo.com/image/161225/zg6pfqadx.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":812,"image_url":"http://img03.liwushuo.com/image/161214/agcbhsaf6.jpg-w720","order":700,"status":0,"target":{"banner_image_url":"http://img02.liwushuo.com/image/161214/apbnrtuk0.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/161214/apbnrtuk0.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/161214/vivpl7z1s.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/161214/vivpl7z1s.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1481688276,"id":407,"posts_count":8,"status":1,"subtitle":"想变美的都进来！教你抢镜朋友圈","title":"自拍神器","updated_at":1481702073},"target_id":407,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=407","type":"collection","webp_url":"http://img03.liwushuo.com/image/161214/agcbhsaf6.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":813,"image_url":"http://img03.liwushuo.com/image/161214/l3vsltkn7.jpg-w720","order":600,"status":0,"target":{"banner_image_url":"http://img02.liwushuo.com/image/161214/4hxkjqn0n.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/161214/4hxkjqn0n.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/161214/txavq9iqk.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/161214/txavq9iqk.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1481688253,"id":406,"posts_count":7,"status":1,"subtitle":"我最亲爱的，这一年辛苦了！","title":"致自己的礼物","updated_at":1481688656},"target_id":406,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=406","type":"collection","webp_url":"http://img03.liwushuo.com/image/161214/l3vsltkn7.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":814,"image_url":"http://img03.liwushuo.com/image/161214/ilivnzblz.jpg-w720","order":0,"status":0,"target":{"banner_image_url":"http://img03.liwushuo.com/image/161214/h7exei3o2.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/161214/h7exei3o2.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/161214/52h3om7si.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/161214/52h3om7si.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1481688301,"id":408,"posts_count":8,"status":1,"subtitle":"别怕！小礼君助你突击成才","title":"考试季必备","updated_at":1481689022},"target_id":408,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=408","type":"collection","webp_url":"http://img03.liwushuo.com/image/161214/ilivnzblz.jpg?imageView2/2/w/720/q/85/format/webp"}]}
     * message : OK
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        private List<BannersBean> banners;

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public static class BannersBean {
            /**
             * ad_monitors : []
             * channel : all
             * id : 835
             * image_url : http://img03.liwushuo.com/image/161225/zg6pfqadx.jpg-w720
             * order : 915
             * status : 0
             * target_id : 1046996
             * target_type : url
             * target_url : liwushuo:///page?page_action=navigation&login=false&type=post&post_id=1046996
             * type : post
             * webp_url : http://img03.liwushuo.com/image/161225/zg6pfqadx.jpg?imageView2/2/w/720/q/85/format/webp
             * target : {"banner_image_url":"http://img02.liwushuo.com/image/161214/apbnrtuk0.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/161214/apbnrtuk0.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/161214/vivpl7z1s.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/161214/vivpl7z1s.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1481688276,"id":407,"posts_count":8,"status":1,"subtitle":"想变美的都进来！教你抢镜朋友圈","title":"自拍神器","updated_at":1481702073}
             */

            private String channel;
            private int id;
            private String image_url;
            private int order;
            private int status;
            private int target_id;
            private String target_type;
            private String target_url;
            private String type;
            private String webp_url;
            private TargetBean target;
            private List<?> ad_monitors;

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getTarget_id() {
                return target_id;
            }

            public void setTarget_id(int target_id) {
                this.target_id = target_id;
            }

            public String getTarget_type() {
                return target_type;
            }

            public void setTarget_type(String target_type) {
                this.target_type = target_type;
            }

            public String getTarget_url() {
                return target_url;
            }

            public void setTarget_url(String target_url) {
                this.target_url = target_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getWebp_url() {
                return webp_url;
            }

            public void setWebp_url(String webp_url) {
                this.webp_url = webp_url;
            }

            public TargetBean getTarget() {
                return target;
            }

            public void setTarget(TargetBean target) {
                this.target = target;
            }

            public List<?> getAd_monitors() {
                return ad_monitors;
            }

            public void setAd_monitors(List<?> ad_monitors) {
                this.ad_monitors = ad_monitors;
            }

            public static class TargetBean {
                /**
                 * banner_image_url : http://img02.liwushuo.com/image/161214/apbnrtuk0.jpg-w300
                 * banner_webp_url : http://img02.liwushuo.com/image/161214/apbnrtuk0.jpg?imageView2/2/w/300/q/85/format/webp
                 * cover_image_url : http://img02.liwushuo.com/image/161214/vivpl7z1s.jpg-w720
                 * cover_webp_url : http://img02.liwushuo.com/image/161214/vivpl7z1s.jpg?imageView2/2/w/720/q/85/format/webp
                 * created_at : 1481688276
                 * id : 407
                 * posts_count : 8
                 * status : 1
                 * subtitle : 想变美的都进来！教你抢镜朋友圈
                 * title : 自拍神器
                 * updated_at : 1481702073
                 */

                private String banner_image_url;
                private String banner_webp_url;
                private String cover_image_url;
                private String cover_webp_url;
                private int created_at;
                private int id;
                private int posts_count;
                private int status;
                private String subtitle;
                private String title;
                private int updated_at;

                public String getBanner_image_url() {
                    return banner_image_url;
                }

                public void setBanner_image_url(String banner_image_url) {
                    this.banner_image_url = banner_image_url;
                }

                public String getBanner_webp_url() {
                    return banner_webp_url;
                }

                public void setBanner_webp_url(String banner_webp_url) {
                    this.banner_webp_url = banner_webp_url;
                }

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public String getCover_webp_url() {
                    return cover_webp_url;
                }

                public void setCover_webp_url(String cover_webp_url) {
                    this.cover_webp_url = cover_webp_url;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getPosts_count() {
                    return posts_count;
                }

                public void setPosts_count(int posts_count) {
                    this.posts_count = posts_count;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getSubtitle() {
                    return subtitle;
                }

                public void setSubtitle(String subtitle) {
                    this.subtitle = subtitle;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(int updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }
    }
}

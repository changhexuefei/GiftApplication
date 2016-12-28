package com.example.gao.giftapplication.bean;

import java.util.List;

/**
 * Created by gao on 2016/12/28.
 */

public class Colleague {


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
        /**
         * items : [{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img03.liwushuo.com/image/160615/ozwl236qx.jpg","avatar_webp_url":null,"created_at":1465974288,"id":9,"introduction":"礼物界的老司机","nickname":"小C"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160608/kd1dy4pi3.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160713/y2arp77qx.jpg-w720","created_at":1462501381,"description":"如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？","id":5,"order":0,"post_published_at":1482807600,"status":0,"subtitle":"","title":"不打烊的礼物店","updated_at":1482826886},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1046108/content","cover_animated_webp_url":null,"cover_image_url":"http://img02.liwushuo.com/image/161012/vmjmsnezg.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/161012/vmjmsnezg.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476668014,"editor_id":1023,"feature_list":[],"hidden_cover_image":false,"id":1046108,"introduction":"我爱文艺青年们。他们爱摄影，爱旅行，爱文字。他们有自己的品味，有独特的小宇宙，他们爱生活而不落俗套。","labels":[],"liked":false,"likes_count":12530,"limit_end_at":null,"media_type":null,"published_at":1476500400,"share_msg":"我爱文艺青年们。他们爱摄影，爱旅行，爱文字。他们有自己的品味，有独特的小宇宙，他们爱生活而不落俗套。如果你身边也有这样的朋友，这期攻略将帮你解决送他们礼物的烦恼。如果你喜欢这篇攻略，那就赶紧为文艺的他准备一份礼物吧。","short_title":"文艺礼物","status":0,"template":"","title":"有一份很文艺的礼物要送你，收了吧~","type":"post","updated_at":1476414872,"url":"http://www.liwushuo.com/posts/1046108"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160815/v2p80ao8y.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160815/fervz0o5x.jpg-w720","created_at":1471225655,"description":"品质、考究、精心遴选；细节、严格、甄添筛减；处女座强迫症的挑选小组，一份有态度的最佳礼物大赏。","id":94,"order":0,"post_published_at":1481014800,"status":0,"subtitle":"","title":"最佳礼物大赏","updated_at":1481102300},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045268/content","cover_animated_webp_url":null,"cover_image_url":"http://img02.liwushuo.com/image/161017/4lnfgwx01.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/161017/4lnfgwx01.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476330940,"editor_id":1018,"feature_list":[],"hidden_cover_image":false,"id":1045268,"introduction":"上班之后，以前的同学纷纷都变成了上班一族，见到许久没有见的同学，不送点见面礼，有点不符合有工资一族的身份啊。当然礼盒更适用于过生日啊、过节什么的。如果你近期正有想要送礼的冲动的话，不妨看看小礼君为你们推荐的这些吧。","labels":[],"liked":false,"likes_count":4752,"limit_end_at":null,"media_type":0,"published_at":1473641432,"share_msg":"上班之后，以前的同学纷纷都变成了上班一族，见到许久没有见的同学，不送点见面礼，有点不符合有工资一族的身份啊。当然礼盒更适用于过生日啊、过节什么的。如果你近期正有想要送礼的冲动的话，不妨看看小礼君为你们推荐的这些吧。","short_title":"","status":0,"template":"","title":"送同事、老友的见面礼，一定要高大上","type":"post","updated_at":1476683440,"url":"http://www.liwushuo.com/posts/1045268"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160815/v2p80ao8y.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160815/fervz0o5x.jpg-w720","created_at":1471225655,"description":"品质、考究、精心遴选；细节、严格、甄添筛减；处女座强迫症的挑选小组，一份有态度的最佳礼物大赏。","id":94,"order":0,"post_published_at":1481014800,"status":0,"subtitle":"","title":"最佳礼物大赏","updated_at":1481102300},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045262/content","cover_animated_webp_url":null,"cover_image_url":"http://img01.liwushuo.com/image/161017/17z654qjf.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/161017/17z654qjf.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476330939,"editor_id":1018,"feature_list":[],"hidden_cover_image":false,"id":1045262,"introduction":"一天24小时，有8个小时的时间是待在办公室里的，如果加班的话，那么这个时间要被拉长到不可估量了。言归正传，你有没有在下午的时刻会觉得嘴巴寂寞，无力上班。总想吃点啥呢？但是怕胖，木有关系！下面这些零食中有部分是低卡低脂的呢，还有一些比较休闲的小零嘴，快来囤起来吧。","labels":[],"liked":false,"likes_count":4568,"limit_end_at":null,"media_type":0,"published_at":1474254000,"share_msg":"一天24小时，有8个小时的时间是待在办公室里的，如果加班的话，那么这个时间要被拉长到不可估量了。言归正传，你有没有在下午的时刻会觉得嘴巴寂寞，无力上班。总想吃点啥呢？但是怕胖，木有关系！下面这些零食中有部分是低卡低脂的呢，还有一些比较休闲的小零嘴，快来囤起来吧。","short_title":"","status":0,"template":"","title":"与同事一起分享，这些办公室人气零食","type":"post","updated_at":1476683589,"url":"http://www.liwushuo.com/posts/1045262"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img01.liwushuo.com/image/160616/4eqnc9500.jpg","avatar_webp_url":null,"created_at":1466067899,"id":26,"introduction":"品味风骚的好店资料库","nickname":"mint-T"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160620/kekw305c2.jpg-w300","category":"涨姿势","cover_image_url":"http://img02.liwushuo.com/image/160713/xqjatns48.jpg-w720","created_at":1465721723,"description":"给不了你梦想，那就给你一个梦境。","id":43,"order":0,"post_published_at":1480129200,"status":0,"subtitle":"","title":"跟我去巡店","updated_at":1481715055},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1045866/content","cover_animated_webp_url":null,"cover_image_url":"http://img03.liwushuo.com/image/160927/ilg1q78mq.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160927/ilg1q78mq.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329886,"editor_id":1058,"feature_list":[8,1,4,6,9],"hidden_cover_image":false,"id":1045866,"introduction":"自古以来，茶室就是人们活动的重要场所：饮茶、会友、吟诗作赋、听书赏戏，在通讯不方便的年代，茶室就成了人们沟通交流、互通有无之地。喝茶也是一件非常风雅有品位的事情，但不造为何，如今茶却似乎变成了老古董的代名词。 Whaaaaat？小礼君也是莫名其妙并深感痛心，三十秒。","labels":[],"liked":false,"likes_count":29890,"limit_end_at":null,"media_type":0,"published_at":1474791775,"share_msg":"小礼君每次巡店回归都是带着福利来的！这次一样不例外！","short_title":"","status":0,"template":"","title":"美学实验味蕾盛宴，一间不一样的茶室","type":"post","updated_at":1474980673,"url":"http://www.liwushuo.com/posts/1045866"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160615/sd1vymm55.jpg","avatar_webp_url":null,"created_at":1465974337,"id":10,"introduction":"家居小物收集爱好者","nickname":"叫我小公举"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/muk9fdsya.jpg-w300","category":"美物","cover_image_url":"http://img01.liwushuo.com/image/160713/1p98sh06h.jpg-w720","created_at":1462501717,"description":"僻静的街角有一家杂货铺，或许你带着忧愁走进店中，但不期而遇的小物却让你展露欢颜。","id":14,"order":0,"post_published_at":1482310800,"status":0,"subtitle":"","title":"解忧杂货铺","updated_at":1482456983},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045794/content","cover_animated_webp_url":null,"cover_image_url":"http://img01.liwushuo.com/image/160927/sap4tzcix.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160927/sap4tzcix.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329858,"editor_id":1191,"feature_list":[],"hidden_cover_image":false,"id":1045794,"introduction":"\u201c若只是吃，可以像远古时代的人们那样把食物盛在叶片上吃。但若想达到更高层次，就有必要选择容器。食器与料理，永远有着无法分离的密切关系，两者的关系可说如同夫妻一般。\u201d\u2014\u2014北大路鲁山人在那篇著名《食器是料理的衣裳》中如此写道。","labels":[],"liked":false,"likes_count":20732,"limit_end_at":null,"published_at":1474966800,"share_msg":"\u201c若只是吃，可以像远古时代的人们那样把食物盛在叶片上吃。但若想达到更高层次，就有必要选择容器。食器与料理，永远有着无法分离的密切关系，两者的关系可说如同夫妻一般。\u201d\u2014\u2014北大路鲁山人在那篇著名《食器是料理的衣裳》中如此写道。","short_title":"","status":0,"template":"","title":"丢你一只下饭的碗，独享碗盏里的小确幸","type":"post","updated_at":1475029290,"url":"http://www.liwushuo.com/posts/1045794"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img03.liwushuo.com/image/160615/wot8i19e3.jpg","avatar_webp_url":null,"created_at":1465974396,"id":12,"introduction":"专业爱美20年的护肤、美妆小达人","nickname":"灰姑娘"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/qojypq4pe.jpg-w300","category":"美护","cover_image_url":"http://img02.liwushuo.com/image/160713/en5n83z34.jpg-w720","created_at":1462501946,"description":"好看就行。\u2014\u2014玛丽莲·赫本·千颂伊","id":23,"order":0,"post_published_at":1482462000,"status":0,"subtitle":"","title":"靠脸吃饭","updated_at":1482828080},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045945/content","cover_animated_webp_url":null,"cover_image_url":"http://img03.liwushuo.com/image/161125/zcv4r1h6x.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/161125/zcv4r1h6x.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329839,"editor_id":1137,"feature_list":[],"hidden_cover_image":false,"id":1045945,"introduction":"说到护肤，所有人几乎都会在第一时间想到敷面膜！没错，面膜对于肤质的改善不仅是即时性的，相较于其他保养品，面膜具有更深层次的肌肤保养效果，而且见效很快。就连明星们都爱不释手，然而像明星那样不管何时何地敷面膜真的管用吗，亲爱的宝宝们已经敷了那么多年的面膜了，真的敷对了吗？","labels":[],"liked":false,"likes_count":29494,"limit_end_at":null,"media_type":0,"published_at":1475809200,"share_msg":"说到护肤，所有人几乎都会在第一时间想到敷面膜！没错，面膜对于肤质的改善不仅是即时性的，相较于其他保养品，面膜具有更深层次的肌肤保养效果，而且见效很快。就连明星们都爱不释手，然而像明星那样不管何时何地敷面膜真的管用吗，亲爱的宝宝们已经敷了那么多年的面膜了，真的敷对了吗？","short_title":"","status":0,"template":"","title":"敷了那么多年的面膜的你，确定敷对了？","type":"post","updated_at":1480035311,"url":"http://www.liwushuo.com/posts/1045945"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img01.liwushuo.com/image/160615/htaxrecse.jpg","avatar_webp_url":null,"created_at":1465974614,"id":13,"introduction":"恋各种美好事物的女汉子","nickname":"美物娘"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/8nluue8yx.jpg-w300","category":"美物","cover_image_url":"http://img02.liwushuo.com/image/160713/zlsbvl5it.jpg-w720","created_at":1462501829,"description":"贪念时间所有美好的东西，唯一不吝啬的，就是与你分享。","id":19,"order":0,"post_published_at":1482710400,"status":0,"subtitle":"","title":"美物收割机","updated_at":1482832597},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1044752/content","cover_animated_webp_url":null,"cover_image_url":"http://img01.liwushuo.com/image/161017/wtswxehvv.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/161017/wtswxehvv.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329814,"editor_id":1145,"feature_list":[],"hidden_cover_image":false,"id":1044752,"introduction":"话说，我们每天大部分的时光都是在办公室度过的，除了晚上回到家让自己舒舒服服的躺在床上，那有没有想过把自己的第二个\u201c家\u201d也装扮的舒适美美呢？每天坐办公室工作的菇凉们，都要被空调吹哭的节奏吧，披个毛毯，穿件大衣，完全忘记了自己的女神形象，还有部分苦恼是午睡一觉醒来到手酸，坐一整天的泥萌真的不想找个抱枕拥抱一下吗？","labels":[],"liked":false,"likes_count":15317,"limit_end_at":null,"media_type":0,"published_at":1469750400,"share_msg":"话说，我们每天大部分的时光都是在办公室度过的，除了晚上回到家让自己舒舒服服的躺在床上，那有没有想过把自己的第二个\u201c家\u201d也装扮的舒适美美呢？每天坐办公室工作的菇凉们，都要被空调吹哭的节奏吧，披个毛毯，穿件大衣，完全忘记了自己的女神形象，还有部分苦恼是午睡一觉醒来到手酸，坐一整天的泥萌真的不想找个抱枕拥抱一下吗？","short_title":"","status":0,"template":"","title":"第66期 | 上班族的贴心小棉袄，原来就是它","type":"post","updated_at":1476683804,"url":"http://www.liwushuo.com/posts/1044752"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160905/f5g5ouwkz.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160905/xqyvy9n1z.jpg-w720","created_at":1473045022,"description":"动心的太多，走心的1个足矣","id":106,"order":0,"post_published_at":1482483600,"status":0,"subtitle":"","title":"一个","updated_at":1482818775},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045846/content","cover_animated_webp_url":null,"cover_image_url":"http://img03.liwushuo.com/image/161125/prtn3gv9n.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/161125/prtn3gv9n.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329794,"editor_id":1131,"feature_list":[],"hidden_cover_image":false,"id":1045846,"introduction":"骚年，喜欢拼图吗？本来就闲的人无聊，忙的人一旦闲下来，会更加空虚寂寞冷，这时候拼图作为一款解压玩具，最适合拿来杀死无聊的时间了。你一定以为小礼君要说的是一款特别复杂魔性的拼图，比如这样的自我毁灭式\u2026\u2026","labels":[],"liked":false,"likes_count":31652,"limit_end_at":null,"media_type":0,"published_at":1475053200,"share_msg":"骚年，喜欢拼图吗？本来就闲的人无聊，忙的人一旦闲下来，会更加空虚寂寞冷，这时候拼图作为一款解压玩具，最适合拿来杀死无聊的时间了。你一定以为小礼君要说的是一款特别复杂魔性的拼图，比如这样的自我毁灭式\u2026\u2026","short_title":"","status":0,"template":"","title":"Doiy 慢生活拼图，帮你温柔地杀死无聊","type":"post","updated_at":1480039025,"url":"http://www.liwushuo.com/posts/1045846"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160905/f5g5ouwkz.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160905/xqyvy9n1z.jpg-w720","created_at":1473045022,"description":"动心的太多，走心的1个足矣","id":106,"order":0,"post_published_at":1482483600,"status":0,"subtitle":"","title":"一个","updated_at":1482818775},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045919/content","cover_animated_webp_url":null,"cover_image_url":"http://img03.liwushuo.com/image/160928/w1tyv9dtu.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160928/w1tyv9dtu.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329783,"editor_id":1058,"feature_list":[],"hidden_cover_image":false,"id":1045919,"introduction":"遥远星空，5亿颗发光的星星中，唯有那一颗，上面种着那一朵玫瑰； 无边沙漠，空旷而寂静的绝望中，唯有那一个未知处，闪烁着那一汪清泉； 摇曳麦田，重复有重复的时间里，唯有那一个瞬间，远处传来那世界上最特别的脚步声。","labels":[],"liked":false,"likes_count":31113,"limit_end_at":null,"media_type":0,"published_at":1475139600,"share_msg":"遥远星空，5亿颗发光的星星中，唯有那一颗，上面种着那一朵玫瑰；","short_title":"","status":0,"template":"","title":"没想到你是这样的小王子，连六级都没在怕的","type":"post","updated_at":1475033352,"url":"http://www.liwushuo.com/posts/1045919"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160905/f5g5ouwkz.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160905/xqyvy9n1z.jpg-w720","created_at":1473045022,"description":"动心的太多，走心的1个足矣","id":106,"order":0,"post_published_at":1482483600,"status":0,"subtitle":"","title":"一个","updated_at":1482818775},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045988/content","cover_animated_webp_url":null,"cover_image_url":"http://img02.liwushuo.com/image/161123/4dz36pai8.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/161123/4dz36pai8.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329768,"editor_id":1191,"feature_list":[],"hidden_cover_image":false,"id":1045988,"introduction":"Aloha ~","labels":[],"liked":false,"likes_count":34307,"limit_end_at":null,"media_type":0,"published_at":1475204400,"share_msg":"Aloha ~","short_title":"","status":0,"template":"","title":"一份\u201c迟到的礼物\u201d，就像夏威夷的阳光","type":"post","updated_at":1479887080,"url":"http://www.liwushuo.com/posts/1045988"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160905/f5g5ouwkz.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160905/xqyvy9n1z.jpg-w720","created_at":1473045022,"description":"动心的太多，走心的1个足矣","id":106,"order":0,"post_published_at":1482483600,"status":0,"subtitle":"","title":"一个","updated_at":1482818775},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045943/content","cover_animated_webp_url":null,"cover_image_url":"http://img02.liwushuo.com/image/160928/dgvf18bf5.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160928/dgvf18bf5.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329757,"editor_id":1133,"feature_list":[],"hidden_cover_image":false,"id":1045943,"introduction":"生活已经够无聊了 不如来点儿花样？ let's do this!! \u201c定制\u201d这个词听起来就够特别 独一无二，世间独一份 今天小礼君给你吃的这剂安利 是平淡生活中的一点小乐趣 不仅送人非常炫酷，","labels":[],"liked":false,"likes_count":29886,"limit_end_at":null,"media_type":0,"published_at":1475485200,"share_msg":"分享自 @礼物说","short_title":"","status":0,"template":"","title":"定制款肥皂？厉害了我的哥！","type":"post","updated_at":1475499748,"url":"http://www.liwushuo.com/posts/1045943"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160905/f5g5ouwkz.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160905/xqyvy9n1z.jpg-w720","created_at":1473045022,"description":"动心的太多，走心的1个足矣","id":106,"order":0,"post_published_at":1482483600,"status":0,"subtitle":"","title":"一个","updated_at":1482818775},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1046052/content","cover_animated_webp_url":null,"cover_image_url":"http://img01.liwushuo.com/image/161009/pomfjwn9j.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/161009/pomfjwn9j.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329742,"editor_id":1058,"feature_list":[],"hidden_cover_image":false,"id":1046052,"introduction":"现在出趟门呀，不是小礼君浮夸，简直逃荒一样。 装钱要带钱包，卡多要带卡包，还有数码周边要装，得备着收纳包。 还有钥匙、纸巾、口红等等等等等等装不完的东西！","labels":[],"liked":false,"likes_count":29974,"limit_end_at":null,"media_type":0,"published_at":1476176400,"share_msg":"现在出趟门呀，不是小礼君浮夸，简直逃荒一样。","short_title":"","status":0,"template":"","title":"扔掉你的钱包卡包手机包，此包在手天下你有","type":"post","updated_at":1476105372,"url":"http://www.liwushuo.com/posts/1046052"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160905/f5g5ouwkz.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160905/xqyvy9n1z.jpg-w720","created_at":1473045022,"description":"动心的太多，走心的1个足矣","id":106,"order":0,"post_published_at":1482483600,"status":0,"subtitle":"","title":"一个","updated_at":1482818775},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045858/content","cover_animated_webp_url":null,"cover_image_url":"http://img03.liwushuo.com/image/160928/6ejza6amu.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160928/6ejza6amu.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329720,"editor_id":1191,"feature_list":[],"hidden_cover_image":false,"id":1045858,"introduction":"试想一下，当完成一天繁忙工作的你，穿梭过匆忙的人群，带着一身疲惫，躺在沙发上，此时欣赏一件能旋转摆弄画出复杂且规律图案的沙摆，浮躁的心彷佛也逐渐归于平静。","labels":[],"liked":false,"likes_count":23198,"limit_end_at":null,"published_at":1474534800,"share_msg":"试想一下，","short_title":"","status":0,"template":"","title":"第18期｜捧起一把沙，把这份珍贵送给你","type":"post","updated_at":1475024967,"url":"http://www.liwushuo.com/posts/1045858"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160905/f5g5ouwkz.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160905/xqyvy9n1z.jpg-w720","created_at":1473045022,"description":"动心的太多，走心的1个足矣","id":106,"order":0,"post_published_at":1482483600,"status":0,"subtitle":"","title":"一个","updated_at":1482818775},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045789/content","cover_animated_webp_url":null,"cover_image_url":"http://img01.liwushuo.com/image/161123/3rc8td3sh.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/161123/3rc8td3sh.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329709,"editor_id":1131,"feature_list":[],"hidden_cover_image":false,"id":1045789,"introduction":"今天小礼君冒着暴露年龄的风险，谈谈万能礼物的前世今生。这些玩意儿你还眼熟吗？下面这些东西在小礼君的收礼物生涯里可以说是出镜率相当高的爆款！此生不想再见系列。","labels":[],"liked":false,"likes_count":22738,"limit_end_at":null,"media_type":0,"published_at":1474362000,"share_msg":"今天小礼君冒着暴露年龄的风险，谈谈万能礼物的前世今生。这些玩意儿你还眼熟吗？下面这些东西在小礼君的收礼物生涯里可以说是出镜率相当高的爆款！此生不想再见系列。","short_title":"","status":0,"template":"","title":"第16期 | 女生无法拒绝的万能礼物之小鸟情感灯","type":"post","updated_at":1479887238,"url":"http://www.liwushuo.com/posts/1045789"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160905/f5g5ouwkz.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160905/xqyvy9n1z.jpg-w720","created_at":1473045022,"description":"动心的太多，走心的1个足矣","id":106,"order":0,"post_published_at":1482483600,"status":0,"subtitle":"","title":"一个","updated_at":1482818775},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045744/content","cover_animated_webp_url":null,"cover_image_url":"http://img02.liwushuo.com/image/160928/qg7ihkn4b.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160928/qg7ihkn4b.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329698,"editor_id":1133,"feature_list":[],"hidden_cover_image":false,"id":1045744,"introduction":"如果说能够把把平时生活中经常用到的小工具随时带在身上，尤其对于男生来说因该是非常方便的一件事情呢！","labels":[],"liked":false,"likes_count":27045,"limit_end_at":null,"published_at":1474275600,"share_msg":"如果说能够把把平时生活中经常用到的小工具随时带在身上，尤其对于男生来说因该是非常方便的一件事情呢！","short_title":"","status":0,"template":"","title":"第15期|也许这是世界上最实用的一款钥匙链","type":"post","updated_at":1475046092,"url":"http://www.liwushuo.com/posts/1045744"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"introduction":"资深买买买达人","nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160905/f5g5ouwkz.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160905/xqyvy9n1z.jpg-w720","created_at":1473045022,"description":"动心的太多，走心的1个足矣","id":106,"order":0,"post_published_at":1482483600,"status":0,"subtitle":"","title":"一个","updated_at":1482818775},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045660/content","cover_animated_webp_url":null,"cover_image_url":"http://img01.liwushuo.com/image/160928/vcqcd1zps.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160928/vcqcd1zps.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329687,"editor_id":1131,"feature_list":[],"hidden_cover_image":false,"id":1045660,"introduction":"","labels":[],"liked":false,"likes_count":20977,"limit_end_at":null,"media_type":0,"published_at":1474102800,"share_msg":"很久之前就想推这款包包了，不行，不能叫人家包包，人家是背包，一点也不骚气！名字也超级杠把子，荷兰XD Design蒙马特安全防盗背包！（跟杀马特迷之关系\u2026\u2026）","short_title":"","status":0,"template":"","title":"第13期 | 蒙马特背包让你的地铁之行6的飞起","type":"post","updated_at":1475050119,"url":"http://www.liwushuo.com/posts/1045660"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img02.liwushuo.com/image/160615/opsnztoj4.jpg","avatar_webp_url":null,"created_at":1465977637,"id":20,"introduction":"海淘界的买手大人，轻松码住第一手时尚海外","nickname":"淘局长"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/rcmok6bpq.jpg-w300","category":"海淘","cover_image_url":"http://img01.liwushuo.com/image/160713/5cbekga4c.jpg-w720","created_at":1462500836,"description":"你想要的全世界，我都有！","id":3,"order":0,"post_published_at":1476522000,"status":0,"subtitle":"","title":"海淘情报局","updated_at":1476779049},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1044521/content","cover_animated_webp_url":null,"cover_image_url":"http://img03.liwushuo.com/image/161017/7rsvole06.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/161017/7rsvole06.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329633,"editor_id":1023,"feature_list":[],"hidden_cover_image":false,"id":1044521,"introduction":"隔三差五的就叫这儿疼那儿疼的，那是因为营养跟不上！客观的来说，我们生活的环境，我们生活的状态等，都会让我们或者周围的人或多或少的有点亚健康，且长期的工作及日常消耗，大家的免疫力等也有待提高，而保健品可以适当的帮助我们调整到比较好的状态。澳大利亚的鱼油、日本的纳豆、美国的维生素\u2026营养都补全了才能吃嘛嘛香！","labels":[],"liked":false,"likes_count":13018,"limit_end_at":null,"media_type":0,"published_at":1469343600,"share_msg":"隔三差五的就叫这儿疼那儿疼的，那是因为营养跟不上！客观的来说，我们生活的环境，我们生活的状态等，都会让我们或者周围的人或多或少的有点亚健康，且长期的工作及日常消耗，大家的免疫力等也有待提高，而保健品可以适当的帮助我们调整到比较好的状态。澳大利亚的鱼油、日本的纳豆、美国的维生素\u2026营养都补全了才能吃嘛嘛香！","short_title":"保健品","status":0,"template":"","title":"第56期 | 家里营养要备齐，小痛小病不找你","type":"post","updated_at":1476697514,"url":"http://www.liwushuo.com/posts/1044521"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img03.liwushuo.com/image/160615/opsnztoj4.jpg","avatar_webp_url":null,"created_at":1465977637,"id":20,"introduction":"海淘界的买手大人，轻松码住第一手时尚海外","nickname":"淘局长"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/rcmok6bpq.jpg-w300","category":"海淘","cover_image_url":"http://img02.liwushuo.com/image/160713/5cbekga4c.jpg-w720","created_at":1462500836,"description":"你想要的全世界，我都有！","id":3,"order":0,"post_published_at":1476522000,"status":0,"subtitle":"","title":"海淘情报局","updated_at":1476779049},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1044538/content","cover_animated_webp_url":null,"cover_image_url":"http://img01.liwushuo.com/image/161017/7hukdeg2x.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/161017/7hukdeg2x.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329623,"editor_id":1023,"feature_list":[],"hidden_cover_image":false,"id":1044538,"introduction":"懒癌晚期病发，好在有神器解救~因为懒得跑步，所以人类发明了汽车。因为懒得洗衣服，所以人类发明了洗衣机。所谓懒人的最高境界，就是以智慧寻求事半功倍的捷径。懒就要懒出境界，懒就要懒出创意。为懒人说两句好话，不要来说我们懒嘛\u2026\u2026要知道，正是因为我们懒，才催动人类研究这些神器，才有了这些送给懒癌宝宝的自救神器，懒宝宝们还不赶紧拿走！","labels":[],"liked":false,"likes_count":15982,"limit_end_at":null,"media_type":0,"published_at":1469610000,"share_msg":"懒癌晚期病发，好在有神器解救~因为懒得跑步，所以人类发明了汽车。因为懒得洗衣服，所以人类发明了洗衣机。所谓懒人的最高境界，就是以智慧寻求事半功倍的捷径。懒就要懒出境界，懒就要懒出创意。为懒人说两句好话，不要来说我们懒嘛\u2026\u2026要知道，正是因为我们懒，才催动人类研究这些神器，才有了这些送给懒癌宝宝的自救神器，懒宝宝们还不赶紧拿走！","short_title":"懒人神器","status":0,"template":"","title":"第58期 | 送给懒癌宝宝的自救生活神器，拿走不谢","type":"post","updated_at":1476697295,"url":"http://www.liwushuo.com/posts/1044538"},{"ad_monitors":[],"approved_at":null,"author":{"avatar_url":"http://img02.liwushuo.com/image/160615/opsnztoj4.jpg","avatar_webp_url":null,"created_at":1465977637,"id":20,"introduction":"海淘界的买手大人，轻松码住第一手时尚海外","nickname":"淘局长"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160608/rcmok6bpq.jpg-w300","category":"海淘","cover_image_url":"http://img01.liwushuo.com/image/160713/5cbekga4c.jpg-w720","created_at":1462500836,"description":"你想要的全世界，我都有！","id":3,"order":0,"post_published_at":1476522000,"status":0,"subtitle":"","title":"海淘情报局","updated_at":1476779049},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1044564/content","cover_animated_webp_url":null,"cover_image_url":"http://img03.liwushuo.com/image/161017/t03nj9xmj.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/161017/t03nj9xmj.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329611,"editor_id":1023,"feature_list":[],"hidden_cover_image":false,"id":1044564,"introduction":"没啥比夏天吃火锅，路边撸串串儿更爽的了。吃完爽完就该轮到痘痘和出油登场了，夏季面部爱出油，本身对皮肤就是很大的挑战。不是痘痘肌的小伙伴也会轻易就冒出痘痘，所以，夏季的抗痘工作势在必行。当然，小礼君提示大家，抗痘除了外用还要内调，少吃辛辣多补充维生素，保证身体内分泌的稳定状态，对痘痘也是有好处的哦~清热镇静面膜敷着，杀菌精油和调理爽肤水涂着，要做吃货更要做女神！","labels":[],"liked":false,"likes_count":25405,"limit_end_at":null,"media_type":0,"published_at":1469782800,"share_msg":"没啥比夏天吃火锅，路边撸串串儿更爽的了。吃完爽完就该轮到痘痘和出油登场了，夏季面部爱出油，本身对皮肤就是很大的挑战。不是痘痘肌的小伙伴也会轻易就冒出痘痘，所以，夏季的抗痘工作势在必行。当然，小礼君提示大家，抗痘除了外用还要内调，少吃辛辣多补充维生素，保证身体内分泌的稳定状态，对痘痘也是有好处的哦~清热镇静面膜敷着，杀菌精油和调理爽肤水涂着，要做吃货更要做女神！","short_title":"祛痘","status":0,"template":"","title":"第59期 | 吃完火锅撸完串，上火爆痘也不怕","type":"post","updated_at":1476697139,"url":"http://www.liwushuo.com/posts/1044564"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160902/jtw1eebas.jpg","avatar_webp_url":null,"created_at":1472802036,"id":42,"introduction":"爱啃书的小蛀虫，读物包罗万象，全能侃","nickname":"三两"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160905/0i5yxvfy3.jpg-w300","category":"爱读书","cover_image_url":"http://img03.liwushuo.com/image/160905/wk7lg4nme.jpg-w720","created_at":1472802190,"description":"多的是，三言两语道不尽之事。三两成群，独言不如众议。二三而成亖，亖亦为四，勤阅必有进步。","id":97,"order":0,"post_published_at":1480410000,"status":0,"subtitle":"","title":"亖言","updated_at":1480489374},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1045514/content","cover_animated_webp_url":null,"cover_image_url":"http://img03.liwushuo.com/image/160902/bky9lqcek.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160902/bky9lqcek.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1476329593,"editor_id":1131,"feature_list":[],"hidden_cover_image":false,"id":1045514,"introduction":"hello大家好，我是新出炉的三两君~这是一个新的读书栏目\u2014\u2014亖言。\u201c亖\u201d即是\u201c四\u201d，字由\u201c二\u201d、\u201c三\u201d组成，代表三言两语之积累，日后必有进步的意思。第一期我们来说说最近强势霸屏的玄幻小说题材影视剧IP，三两君觉得众多玄幻齐聚一堂，该玄幻的反倒没那么玄幻了。如此特意给大家整理了亲身读过觉得好的玄幻小说，赶走特效的吐槽吧，画面还是自己想象的美~","labels":[],"liked":false,"likes_count":14232,"limit_end_at":null,"media_type":0,"published_at":1473152400,"share_msg":"hello大家好，我是新出炉的三两君~这是一个新的读书栏目\u2014\u2014亖言。\u201c亖\u201d即是\u201c四\u201d，字由\u201c二\u201d、\u201c三\u201d组成，代表三言两语之积累，日后必有进步的意思。第一期我们来说说最近强势霸屏的玄幻小说题材影视剧IP，三两君觉得众多玄幻齐聚一堂，该玄幻的反倒没那么玄幻了。如此特意给大家整理了亲身读过觉得好的玄幻小说，赶走特效的吐槽吧，画面还是自己想象的美~","short_title":"","status":0,"template":"","title":"第1期 | 读完原著告诉你，这些小说甩同名IP剧几条街","type":"post","updated_at":1473073265,"url":"http://www.liwushuo.com/posts/1045514"}]
         * paging : {"next_url":"http://api.liwushuo.com/v2/channels/17/items_v2?generation=1&gender=1&limit=20&offset=20"}
         */

        private PagingBean paging;
        private List<ItemsBean> items;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class PagingBean {
            /**
             * next_url : http://api.liwushuo.com/v2/channels/17/items_v2?generation=1&gender=1&limit=20&offset=20
             */

            private String next_url;

            public String getNext_url() {
                return next_url;
            }

            public void setNext_url(String next_url) {
                this.next_url = next_url;
            }
        }

        public static class ItemsBean {
            /**
             * ad_monitors : []
             * approved_at : null
             * author : {"avatar_url":"http://img03.liwushuo.com/image/160615/ozwl236qx.jpg","avatar_webp_url":null,"created_at":1465974288,"id":9,"introduction":"礼物界的老司机","nickname":"小C"}
             * column : {"banner_image_url":"http://img01.liwushuo.com/image/160608/kd1dy4pi3.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160713/y2arp77qx.jpg-w720","created_at":1462501381,"description":"如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？","id":5,"order":0,"post_published_at":1482807600,"status":0,"subtitle":"","title":"不打烊的礼物店","updated_at":1482826886}
             * content_type : 1
             * content_url : http://www.liwushuo.com/posts/1046108/content
             * cover_animated_webp_url : null
             * cover_image_url : http://img02.liwushuo.com/image/161012/vmjmsnezg.jpg-w720
             * cover_webp_url : http://img02.liwushuo.com/image/161012/vmjmsnezg.jpg?imageView2/2/w/720/q/85/format/webp
             * created_at : 1476668014
             * editor_id : 1023
             * feature_list : []
             * hidden_cover_image : false
             * id : 1046108
             * introduction : 我爱文艺青年们。他们爱摄影，爱旅行，爱文字。他们有自己的品味，有独特的小宇宙，他们爱生活而不落俗套。
             * labels : []
             * liked : false
             * likes_count : 12530
             * limit_end_at : null
             * media_type : null
             * published_at : 1476500400
             * share_msg : 我爱文艺青年们。他们爱摄影，爱旅行，爱文字。他们有自己的品味，有独特的小宇宙，他们爱生活而不落俗套。如果你身边也有这样的朋友，这期攻略将帮你解决送他们礼物的烦恼。如果你喜欢这篇攻略，那就赶紧为文艺的他准备一份礼物吧。
             * short_title : 文艺礼物
             * status : 0
             * template :
             * title : 有一份很文艺的礼物要送你，收了吧~
             * type : post
             * updated_at : 1476414872
             * url : http://www.liwushuo.com/posts/1046108
             */

            private Object approved_at;
            private AuthorBean author;
            private ColumnBean column;
            private int content_type;
            private String content_url;
            private Object cover_animated_webp_url;
            private String cover_image_url;
            private String cover_webp_url;
            private int created_at;
            private int editor_id;
            private boolean hidden_cover_image;
            private int id;
            private String introduction;
            private boolean liked;
            private int likes_count;
            private Object limit_end_at;
            private Object media_type;
            private int published_at;
            private String share_msg;
            private String short_title;
            private int status;
            private String template;
            private String title;
            private String type;
            private int updated_at;
            private String url;
            private List<?> ad_monitors;
            private List<?> feature_list;
            private List<?> labels;

            public Object getApproved_at() {
                return approved_at;
            }

            public void setApproved_at(Object approved_at) {
                this.approved_at = approved_at;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public ColumnBean getColumn() {
                return column;
            }

            public void setColumn(ColumnBean column) {
                this.column = column;
            }

            public int getContent_type() {
                return content_type;
            }

            public void setContent_type(int content_type) {
                this.content_type = content_type;
            }

            public String getContent_url() {
                return content_url;
            }

            public void setContent_url(String content_url) {
                this.content_url = content_url;
            }

            public Object getCover_animated_webp_url() {
                return cover_animated_webp_url;
            }

            public void setCover_animated_webp_url(Object cover_animated_webp_url) {
                this.cover_animated_webp_url = cover_animated_webp_url;
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

            public int getEditor_id() {
                return editor_id;
            }

            public void setEditor_id(int editor_id) {
                this.editor_id = editor_id;
            }

            public boolean isHidden_cover_image() {
                return hidden_cover_image;
            }

            public void setHidden_cover_image(boolean hidden_cover_image) {
                this.hidden_cover_image = hidden_cover_image;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public boolean isLiked() {
                return liked;
            }

            public void setLiked(boolean liked) {
                this.liked = liked;
            }

            public int getLikes_count() {
                return likes_count;
            }

            public void setLikes_count(int likes_count) {
                this.likes_count = likes_count;
            }

            public Object getLimit_end_at() {
                return limit_end_at;
            }

            public void setLimit_end_at(Object limit_end_at) {
                this.limit_end_at = limit_end_at;
            }

            public Object getMedia_type() {
                return media_type;
            }

            public void setMedia_type(Object media_type) {
                this.media_type = media_type;
            }

            public int getPublished_at() {
                return published_at;
            }

            public void setPublished_at(int published_at) {
                this.published_at = published_at;
            }

            public String getShare_msg() {
                return share_msg;
            }

            public void setShare_msg(String share_msg) {
                this.share_msg = share_msg;
            }

            public String getShort_title() {
                return short_title;
            }

            public void setShort_title(String short_title) {
                this.short_title = short_title;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getTemplate() {
                return template;
            }

            public void setTemplate(String template) {
                this.template = template;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(int updated_at) {
                this.updated_at = updated_at;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<?> getAd_monitors() {
                return ad_monitors;
            }

            public void setAd_monitors(List<?> ad_monitors) {
                this.ad_monitors = ad_monitors;
            }

            public List<?> getFeature_list() {
                return feature_list;
            }

            public void setFeature_list(List<?> feature_list) {
                this.feature_list = feature_list;
            }

            public List<?> getLabels() {
                return labels;
            }

            public void setLabels(List<?> labels) {
                this.labels = labels;
            }

            public static class AuthorBean {
                /**
                 * avatar_url : http://img03.liwushuo.com/image/160615/ozwl236qx.jpg
                 * avatar_webp_url : null
                 * created_at : 1465974288
                 * id : 9
                 * introduction : 礼物界的老司机
                 * nickname : 小C
                 */

                private String avatar_url;
                private Object avatar_webp_url;
                private int created_at;
                private int id;
                private String introduction;
                private String nickname;

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public Object getAvatar_webp_url() {
                    return avatar_webp_url;
                }

                public void setAvatar_webp_url(Object avatar_webp_url) {
                    this.avatar_webp_url = avatar_webp_url;
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

                public String getIntroduction() {
                    return introduction;
                }

                public void setIntroduction(String introduction) {
                    this.introduction = introduction;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }
            }

            public static class ColumnBean {
                /**
                 * banner_image_url : http://img01.liwushuo.com/image/160608/kd1dy4pi3.jpg-w300
                 * category : 礼物
                 * cover_image_url : http://img02.liwushuo.com/image/160713/y2arp77qx.jpg-w720
                 * created_at : 1462501381
                 * description : 如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？
                 * id : 5
                 * order : 0
                 * post_published_at : 1482807600
                 * status : 0
                 * subtitle :
                 * title : 不打烊的礼物店
                 * updated_at : 1482826886
                 */

                private String banner_image_url;
                private String category;
                private String cover_image_url;
                private int created_at;
                private String description;
                private int id;
                private int order;
                private int post_published_at;
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

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getOrder() {
                    return order;
                }

                public void setOrder(int order) {
                    this.order = order;
                }

                public int getPost_published_at() {
                    return post_published_at;
                }

                public void setPost_published_at(int post_published_at) {
                    this.post_published_at = post_published_at;
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

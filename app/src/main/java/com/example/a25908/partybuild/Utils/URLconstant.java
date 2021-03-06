package com.example.a25908.partybuild.Utils;

/**
 * Created by 25908 on 2016/8/29.
 * 存放URL
 * 456DD7179686
 */


public class URLconstant {

    /**
     * //所有接口前缀
     */
//        public static final String URLINSER = "http://192.168.10.44:7070/zhirong.partybuild/Interface/";

//    public static final String IMGURL = "http://192.168.10.44:7070";//富文本图片前缀

//    public static final String URLINSER = "http://192.168.10.117:8080/zhirong.partybuild/Interface/";
//
//    public static final String IMGURL = "http://192.168.10.117:8080";//富文本图片前缀

    public static final String IMGURL = "http://101.201.211.27:8282";//富文本图片前缀

    public static final String URLINSER = "http://101.201.211.27:8282/zhirong.partybuild/Interface/";

    /**
     * Fragment 1 主界面
     */

    public static final String NewVer = "apUploadControllerInterface/appload";//版本更新

    public static final String RSA = "secretKeyControllerInterface/querySecretKey";//支付密钥

    public static final String PARTYCOMM = "newsController/queryNews";//党委通知,党员扶持,学习园地

    public static final String PARTYDETAILS = "newsController/queryNewsById";//党委通知,党员扶持,学习园地 详情

    public static final String PARTYDETAILSCOMN = "commentsControllerInterface/queryComments";//党委通知,党员扶持,学习园地 详情的评论

    public static final String PARTYDETAILSADDCOMN = "commentsControllerInterface/saveComments";//党委通知,党员扶持,学习园地 详情的  添加评论

    public static final String PARTYVIDEO = "videoControllerInterface/queryvideolist";//党建视频video
    public static final String PARTYVIDEOCOMN = "videoControllerInterface/queryvideoById";//党建视频详情video

    public static final String TCOP = "regulatoryFrameworkControllerInterface/queryRegulatory";//党的章程 党归党纪

    public static final String PALMPARTY = "newsController/queryNews";// 人物长廊

    public static final String DOCUMENTROOM = "documentControllerInterface/queryDocument";// 文档中心

    public static final String  SURVEY= "questionnaireSurveyControllerInterface/queryQuesion";//问卷调查survey

    public static final String  SURVEYTIJIAO= "questionnaireSurveyControllerInterface/saveQuesion";//问卷调查survey

    public static final String  FAQ="onlineAnswerControllerInterface/queryOnlineAnswer";// 在线答疑

    public static final String  FAQADD="onlineAnswerControllerInterface/saveOnlineAnswer";// 在线答疑之想组织提问

    public static final String PAYMORE = "partyMembershipDuesController/querypartyMember";//党费查询

    /**
     * Fragment 2 主界面
     */
    public static final String PARTYRTLISTURL = "userDateListControllerInterface/queryuserDataList";//党员名册资料

    public static final String PARTYRTNOTESURL = "userDateListControllerInterface/saveNote";//修改党员信息备注

    public static final String  PARTYRTLISTEWM = "userDateListControllerInterface/queryImg";//生成ewm

    public static final String  PARTYRTLISTURL2 = "userDateListControllerInterface/queryuserUnitlist";//党员名册资料(以部门为主)


    /**
     * Fragment 3 主界面
     */
    public static final String DONGTAI = "dynamicControllerInterface/queryDynamic";//动态查看

    public static final String DONGTAIFABU = "dynamicControllerInterface/saveDynamic";//动态发布

    public static final String DONGTAIPLFB = "commentsControllerInterface/saveComments";//动态评论发布

    public static final String DONGTAIDELETE = "dynamicControllerInterface/deleteDynamic";//动态删除

    public static final String DONGTAIPRSISE = "praiseController/savePraise";//动态点赞

    public static final String IMAGEID = "dynamicImgControllerInterfaced/queryDyImg";//动态取消点赞


    /**
     * Fragment 4 主界面
     */
    public static final String LOGINURL = "loginController/findUser";//登陆

    public static final String USERDATEURL = "userDataController/queryuserData";//个人资料

    public static final String USERDATEDWBMURL = "documentControllerInterface/queryUnit";//个人资料-单位部门
//
    public static final String UPDATEUSERDATEURL = "userDataController/updateuserData";//个人资料

    public static final String OPINION = "feedbackController/saveFeedback";//意见反馈

    public static final String PARTYPAY = "partyMembershipDuesController/querypartyMemberByOne";//我的党费

    public static final String Quit = "quiltControllerInterface/updateQuilt";//退出


//    ===================================测      试==============================================

    public static final String NEWSURL ="newsController/getNewslistPage";//新闻URLObeyed

//    public static final String videourl ="https://sec.ch9.ms/ch9/82d9/de312353-af35-48b7-a20a-e648489f82d9/Win10UpdateForDevs_high.mp4";//视频

public static final String videourl ="http://192.168.100.171:8080/zhirong.partybuild/file_path/1476343510105-[邓紫棋]喜欢你_bd.mp4";//视频

    public static final String url1="http://dzs.qisuu.com/txt/明末边军一小兵.txt";//下载地址

    public static final String url2="http://dzs.qisuu.com/txt/都市之最强纨绔.txt";//下载地址
}

package tkaxv7s.xposed.sesame.task.model.greenFinance;

import org.json.JSONArray;

import tkaxv7s.xposed.sesame.hook.ApplicationHook;
import tkaxv7s.xposed.sesame.util.UserIdMap;

public class GreenFinanceRpcCall {

    public static String greenFinanceIndex() {
        return ApplicationHook.requestString(
                "com.alipay.mcaplatformunit.common.mobile.newservice.GreenFinancePageQueryService.indexV2",
                "[{\"clientVersion\":\"VERSION2\",\"custType\":\"MERCHANT\"}]");
    }

    public static String batchSelfCollect(JSONArray bsnIds) {
        return ApplicationHook.requestString("com.alipay.mcaplatformunit.common.mobile.service.GreenFinancePointCollectService.batchSelfCollect",
                "[{\"bsnIds\":" + bsnIds + ",\"clientVersion\":\"VERSION2\",\"custType\":\"MERCHANT\",\"uid\":\""
                        + UserIdMap.getCurrentUid() + "\"}]");
    }

    public static String signInQuery(String sceneId) {
        return ApplicationHook.requestString("com.alipay.loanpromoweb.promo.signin.query",
                "[{\"cycleCount\":7,\"cycleType\":\"d\",\"extInfo\":{},\"needContinuous\":1,\"sceneId\":\"" + sceneId + "\"}]");
    }

    public static String signInTrigger(String sceneId) {
        return ApplicationHook.requestString("com.alipay.loanpromoweb.promo.signin.trigger",
                "[{\"extInfo\":{},\"sceneId\":\"" + sceneId + "\"}]");
    }

    public static String taskQuery(String appletId) {
        return ApplicationHook.requestString("com.alipay.loanpromoweb.promo.task.taskQuery",
                "[{\"appletId\":\"" + appletId + "\",\"completedBottom\":true}]");
    }

    public static String taskTrigger(String appletId, String stageCode, String taskCenId) {
        return ApplicationHook.requestString("com.alipay.loanpromoweb.promo.task.taskTrigger",
                "[{\"appletId\":\"" + appletId + "\",\"stageCode\":\"" + stageCode + "\",\"taskCenId\":\"" + taskCenId
                        + "\"}]");
    }

}

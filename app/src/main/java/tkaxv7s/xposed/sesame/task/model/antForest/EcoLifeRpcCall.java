package tkaxv7s.xposed.sesame.task.model.antForest;

import tkaxv7s.xposed.sesame.hook.ApplicationHook;

public class EcoLifeRpcCall {

    public static String queryHomePage() {
        return ApplicationHook.requestString("alipay.ecolife.rpc.h5.queryHomePage",
                "[{\"channel\":\"ALIPAY\",\"source\":\"search_brandbox\"}]");
    }

    public static String tick(String actionId, String channel, String dayPoint, boolean photoguangpan) {
        String args1 = null;
        if (photoguangpan) {
            args1 = "[{\"actionId\":\"photoguangpan\",\"channel\":\"" + channel + "\",\"dayPoint\":\"" + dayPoint
                    + "\",\"source\":\"search_brandbox\"}]";
        } else {
            args1 = "[{\"actionId\":\"" + actionId + "\",\"channel\":\""
                    + channel + "\",\"dayPoint\":\"" + dayPoint
                    + "\",\"generateEnergy\":false,\"source\":\"search_brandbox\"}]";
        }
        return ApplicationHook.requestString("alipay.ecolife.rpc.h5.tick", args1);
    }

    public static String queryDish(String channel, String dayPoint) {
        return ApplicationHook.requestString("alipay.ecolife.rpc.h5.queryDish",
                "[{\"channel\":\"" + channel + "\",\"dayPoint\":\"" + dayPoint
                        + "\",\"source\":\"photo-comparison\"}]");
    }

}

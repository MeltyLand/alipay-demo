package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000120698416";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEugIBADANBgkqhkiG9w0BAQEFAASCBKQwggSgAgEAAoIBAQDHzImXnuLi2zPTcweYaqOwWFi8MLcPVxNZBKP8GLclt6DCTCuM1hrsV78+18fdAmBgF2O+zrrPkSl6w9dx3uGbdPWXA9RbuAnqohmTuc2NLNcMGjYwDAa18t3TFziJ/5Jt01t6PE9ROoCC+gI0D4vpDs8gYGmm1tzphY6RiNmdUJYm/csB8oZZlSHRjoa3Vax/mA+8XiKmKtM3A2GPZAfJGf85RQEk8v2B0Ai12nyK46yFJRzIFPpHhN/lYY5/iU6KziaJ+yg9xZZ2wAa5iaAa4LxsR/Zlt9mh8RqpA2zanZ2Dp+VpfbfGzzelCu4uBjWBp5wgZ9wV/m3A64HElog3AgMBAAECggEAHJJnasNR9tcaBjcA8w7s8Z7wsZjV1N/C6Iv9V2PBbSdhWefCopVLrFiwBLCe6EAawCMYJIUzudMsd13iRWp2IOEM7deiWqtq357mwXVkq7ep2RU2gpB1tTdR+Ynsj+94ZTRAdK6DOT6Aejp+bit6+o0fmaWv9ifr14k95hoH5LMMuXY2EQkiuMfmVyhSEfNYz1lgWxL0ZpKchj9gTbDmAwx6E+m+Hw4Cem9BiCxZwuJDoBQz9Gs1F1Yx8WYPKHTD/B3zX33qrmfhJY/GKzuNoEDITsJVfJLXIjr/tUiYhrC2+faXtXg2QKc27gZL2uoPTLs21IHmWjidG73a5kN6AQKBgQDwBGsFFdIhaLs/cQfeiicuufKBAWsZfItizbhidLudPY6WWbl1dd/9q/f4heoLAcesmt+gd5nTWScfmNDMSDNdKemG9d441fEI01N9NrNniaMTNqGnTCgeYux5ilePBr3tQsti6QiApQudcQkhUdNePTQsmgTN/Pjo6HyLoPN6dwKBgQDVGoRdDUEt7gxHJFwC6S6iaQrZ49UA0SXbBvXP37ung7gRIB+mGnmN3QIFRtUvPBRIZp2oqFmtQODUhgl6QNfzwhVCOs+gunitLPWPAFTU7RBpTdVk32zijRT3NdOWm8nmX71TFJ5qIik6INpOMV7QFtH1fMCBQZX7KoRp9AsQQQKBgHcvunUsAMzWVSWL23yG3i416FZnfeeKES1fOtCpZwEOMGA47f+GKVSusNSYq0AMAjuULLhiq+BnxSXLnOPUdq0swuph7ZgLpUXcqvji0PP5RSGlX2DUUJfGR+eS6yf7ERVgtd7IGZDIZJwqJX6GQ4/olKARW5Furav6xt4PbtjBAoGAbcXGDyTHwYARJQhuuTUix5hydYDt9QjHhkbUkqr+QDESvQeeJfMXUGNbKhqtsDIzhIQPjJSD9UIpTnBpK2eBllgQmVgwIexMQ3CYYXxbNn+TZ5snZFnO/fiMpzc78iX338rLfKNvYt6L/Bx2N7cozuoiZ2FGzI5bUtE4+lcy58ECfx387FufP8gUchRAWw2NrSaklxAKFpVOCGX1kw+NiBjWma6zmEl4q20okyoPWeimd6gaHCeGqazPaUMAD0OUVULWWalUkHhWqwFeogveAU1k83D/W6GjBgJI9WVtnT88A668ZXGtTiYYfx21gph6oevdp23IadSDbLc4xXmiS60=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAowO3bN77p3fLA1h5nKCcdQmXx5pbVfqc5PV4LhLlNqNG3YCKoL0fGIfjDM2nsFCcXAxrcLSFiPZAGripbjnECA8rjMTAbHTifDxBz3DElGjp5uHiO81ofzlYwYFEsxhYSglFvu4LOFSwnDWIu9q6vruJFwOLTfbhodUXMnTikhw8E//cQHXbQPV1o5z3roOq7M08kTq5sGujOARfA2EFjWNMk4RcRRSpcMF6k1Cgm8XFLHLOcvoifsUr4cP4lltWexdGLLhMf9Vg3NhFgY3ax6jB+Ae+u+gJko1oD1ThZWkDy7lfteTagslU+JBFlpk72dS77IL8Ml/qfTjoMiSEHQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://qys2y7.natappfree.cc/alipay_trade_page_pay_JAVA_UTF_8_war_exploded/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id= 123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://qys2y7.natappfree.cc/alipay_trade_page_pay_JAVA_UTF_8_war_exploded/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


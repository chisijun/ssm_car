package org.study.car.utils.alipay;


import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

/**
 * 配置公共参数
 * @author Niu Li
 * @date 2016/10/29
 */
public final class AliPayConfig {
    /**
     * 应用号
     */
    public static String APP_ID = "2016073000129148";
    /**
     * 商户的私钥
     */
    public static String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCvSdZeyhNcx5TsTjim8PIgrSmR6N+g7VvSgZ/oYGn7fAjMvx29yxX5XYv0XFAUXej8s8ISUqj/Chkk0Eye7jA+rq/l+aEIw7KeZ8CMFC0oJteQzL3sUpw2Av7llAls6wauwDv24M78z1kzL+ub2SNlLuSdzXKkHPuEwTQJR3uUkQTKE6jagaC5Dtwn/+7zYq0Nuhg1n6Ka6GFd8WTF10UkLcnkesV9w4lOplkvBok3ThCOi1QNE8nkgMrZFzroeunQtycB/slvT3ooszbUZod9rnH6g+B9NQaNZYl9EjmRrAnZNgHS7cxXoIZS2lmMzH72tieKE8TOGVeLhrdvjs4ZAgMBAAECggEAWbG/tutSMxSRWMXB6XK7gwr4jYgK/m7WoIXhzGehc6UJX7OfxWFpEhvTJKwj8fgH418cPIH9pduF+Dd6LY0WNMzwhw5QX4q8GKBgf41Hehc+EQMjYAz5kA3CXrl8hTZSShNl27M3V1fGfhHUTwAyQ3FWXIUnV2DZNxohxWnFi8Q8SUq1c/030JLumu7GDK8/X9+L9AkIT2iZG7GhFkcIkAj+a+V80/9sJaiuwY9bTRbmWYxps1LisMZmTe/s9oXCuCHw89a1VNqZYdbbPeshCDQDtXRAT0DANMP44E+SNAxtB8tdTJDdNRPadMuzSM8qRFEsyCeIm1dkEVoZT7i+zQKBgQDX3vt+eHq2wdXJ+w0NAf2CBHHcUUeZe2ENXUic/u/cHcrrP8XT3Fp6Jpie3yFVQ1e6rPuqGtrWSPV2/EBust+rZMcUKtLTwX/ZAD09DwssNh5UnF34xIBMi4jTLO9Jw/kgCdc5U+Kyg2uv9SvXqZCUtYgoVs2m9bCZJUT566VL3wKBgQDP35Un7Vi+Bu140iY2ZmV7C5xvrtatkUP6iidpaoTCejuVJVZZBOpOZPUe7nq2V7/8qz2i+Ivin/yHYXWmiHk9sImwLsmgkLQvJMeOwRJLL1cqyNDQFVeDoqL3D5bSXtQDUByNLprHVp89tSQe9vqy4/eom373qXYRu20OoD2lBwKBgQCHY2taG5fjLVi3UAQUZ24mcEE1C6kbQr1Q03OqO14WMH1G4/1f7bC1MaXA5nKSdiT8iGdifWtIwANrd7O1eew8I32UUXNeqdpUMAk4VUoNlXeaW2O4lQ1edJkA0QrWudlyVZmtc8YXbcNJXTv9C3UJP31Ax4g9sZPryOskz70hAwKBgBbLyxykz62PLu2oBh7DHe/fdxlcUBiarJzGF8pcrxBwvSX/ATgj7NoKAkORHY3vk5NO6CR+I0EIEHZ8Pp2zq7ATMxZKGzxrggcFfojuLWZnW6TKfvPC02URKdP0NrL9STzPxUHKUZj4q9/lhH+M0DNcAqXP352jTNpm9m+7LOdzAoGAaV5NggKIGojp2qwH/U3Mb8aLH2IWFQj8Ft45x6EYeEnvnlc5/6CHD9KYogEUIpqNN8XmL4/a3OgiYD3O3b9yv1izXpDQVEI5pUc8eESnsGpphDkTKAhHOcPBJeOItAv1SZH9H6nct824bIIjYS/RlsskX2xZK8utgTACo8J4CTo=";
//    public static String APP_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALvK+SgVaWgLqnmsfk8TSAHLh473aDWLaJhwDg4zWndHArZcNZ9VzbbpP6F7KKvoM1o1V2N/SN81ZAMjZ0mfn2TtihQyvy3hIG8DC1tNPSEPaYvrpKREzAGOU60Q5VZ0Q4nzlXeIaXwI8gRfghG3Wdxn2U+/rMluDHkZ6zJc2+r1AgMBAAECgYEAjZcjNvK178nj9it1bJ+oChpwEf4+Zyi+azkJj/FuQ0KaK+7oS0OBgGjrHhDjAIJpvZk8U3uT8R+rUaZu6RbeMQr7nwFl7MFJua5RyZDn1RsKzvEKeh4f2Cu7w3ofIf781WEq5bzep5L4dhMDH1yP4iJmESWUPwplpOulVvK27z0CQQDj0sI0KXdAQ50WgQFIoHjY+/VJFwsJhl+p8f8WsDPFqhUIsPADn1aMlY4MSXiKVaGTd/i+f8ROPJ+xkN7/niiTAkEA0wTKCLa0PnyTdriOB6apQ9TQ/2rNpzWfQy+PKZVBMkqqM8pl1Y5/UBXveJLkmZL/0uHGWkiyrF6IW3ol+tz7VwJACihZdE3s/TaGiHxT/FL7UGFbfFjEqzYMid06TF6q0ENXEL4i1WaDS11XqgCUmUZcH+EXfBbiP8LANACLkMYSdQJAD8LY0EPNPKmTXhe0zA9/rwhTP/CbQbT4m00PFV0HjJkVE183sfa9vZ6Vz1yxZGMdZoPki9PIPKWm66Y49f7RawJAIKXGne7TuPS63RR7qA1k7/hK12CQUk7EQRkuwPHy1OS9Q/lzsJb3+ZVmGTOa4kF/5EgxtlDXmnsxgZZdNELt1Q==";
	/**
     * 编码
     */
    public static String CHARSET = "UTF-8";
    /**
     * 支付宝公钥
     */
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtroHrPO5Y0hrTkWZcAjPx+atZxNFdD3Mtxu407b0VYgBjtjTTAwBN6IVf2oW44l2jM5sKkCjG69UAueBPBsYAAXmM+hUopBryTfBwe2g8y0h8bLnIsCHWj4/hyMg0AEo1CazxIA5Yjl7G2ihmze4bZZlWjkJjOSXLP3cum7mNQn77FCzdkRbBhq/u0Fb+bdb4otVsXtb9KPgx2aSdi6DJo35kHM7tIEJ10/YknTpXyJNYk4KiG5dCOG2DCJ2Ab6qDtlHDCFsJVYAcdRsMhfySKiJ0QZrrkIpG+5aw2CoeCJ/iy4x+cFyQsXA+8D6hWdNfQ73DyusS+7ZcF/ZxsORLwIDAQAB";
//    public static String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC7yvkoFWloC6p5rH5PE0gBy4eO92g1i2iYcA4OM1p3RwK2XDWfVc226T+heyir6DNaNVdjf0jfNWQDI2dJn59k7YoUMr8t4SBvAwtbTT0hD2mL66SkRMwBjlOtEOVWdEOJ85V3iGl8CPIEX4IRt1ncZ9lPv6zJbgx5GesyXNvq9QIDAQAB";
    //public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoQjoEpF0v7/pL4rjXg/1HREwEd4WRDDj7Y1Oj5RU3QT+p2X+eeEums04quiJwrswh3IKe3CeY3qxeLdYGoM2NUTUTVNRm0/xW6bTcAaSgQOahSFC7O7esOWl3jZSGHe0wW+tz/98wwDmJtdhS8BmbgqlBPKXuGh2TB7YuYa0I6jAmOz0MQXfFd3UdkFBePLpG/MC5SnD5epeh3jOwDdI9Z/VwPPSHfbG1QbV46upLFC6/mdPOev2b4T6Qc8iAN7LoLdsjokTx/xHJTlRaMqqnisNXCgkOql7pnGy3kYstVflNIfJkQtjWnRqldH2JZXYCfpNTrk9cKpVyhTygB8f4QIDAQAB";
    /**
     * 支付宝网关地址
     */
    public static String GATEWAY = "https://openapi.alipaydev.com/gateway.do";
    //public static String GATEWAY = "https://openapi.alipay.com/gateway.do";
    /**
     * 成功付款回调
     */
    public static String PAY_NOTIFY = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
    //public static String PAY_NOTIFY = "http://localhost:8080/heat/payment/aliPayNotify";
    /**
     * 支付成功回调
     */
    public static String REFUND_NOTIFY = "http://niuli.tunnel.qydev.com/notify/alipay_pay";
    /**
     * 前台通知地址
     * 前台根据返回的参数获取订单详情
     */
    public static String RETURN_URL = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
    //public static String RETURN_URL = "http://localhost:8080/heat/wx/html/payment_list.html";
    /**
     * 参数类型
     */
    public static String PARAM_TYPE = "json";
    /**
     * 成功标识
     */
    public static final String SUCCESS_REQUEST = "TRADE_SUCCESS";
    /**
     * 交易关闭回调(当该笔订单全部退款完毕,则交易关闭)
     */
    public static final String TRADE_CLOSED = "TRADE_CLOSED";
    /**
     * 收款方账号
     */
    public static final String SELLER_ID = "yjeslc3497@sandbox.com";
    //public static final String SELLER_ID = "1554816903@qq.com";
    
    /**
     * 加密方式
     */
//    public static final String SIGN_TYPE = "RSA";
    public static final String SIGN_TYPE = "RSA2";
    
    /**
     * 支付宝请求客户端入口
     */
    private volatile static AlipayClient alipayClient = null;

    /**
     * 不可实例化
     */
    private AliPayConfig(){};

    /**
     * 双重锁单例
     * @return 支付宝请求客户端实例
     */
    public static AlipayClient getInstance(){
        if (alipayClient == null){
            synchronized (AliPayConfig.class){
                if (alipayClient == null){
                    alipayClient = new DefaultAlipayClient(GATEWAY,APP_ID,APP_PRIVATE_KEY,PARAM_TYPE,CHARSET,ALIPAY_PUBLIC_KEY,SIGN_TYPE);
                }
            }
        }
        return alipayClient;
    }

}

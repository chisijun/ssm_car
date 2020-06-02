package org.study.car.utils.alipay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-05-28 10:25
 * @Description:
 */
public class AlipayTest {

    public static void main(String[] args) {

        String app_id = "2016073000129148";
        String app_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCvSdZeyhNcx5TsTjim8PIgrSmR6N+g7VvSgZ/oYGn7fAjMvx29yxX5XYv0XFAUXej8s8ISUqj/Chkk0Eye7jA+rq/l+aEIw7KeZ8CMFC0oJteQzL3sUpw2Av7llAls6wauwDv24M78z1kzL+ub2SNlLuSdzXKkHPuEwTQJR3uUkQTKE6jagaC5Dtwn/+7zYq0Nuhg1n6Ka6GFd8WTF10UkLcnkesV9w4lOplkvBok3ThCOi1QNE8nkgMrZFzroeunQtycB/slvT3ooszbUZod9rnH6g+B9NQaNZYl9EjmRrAnZNgHS7cxXoIZS2lmMzH72tieKE8TOGVeLhrdvjs4ZAgMBAAECggEAWbG/tutSMxSRWMXB6XK7gwr4jYgK/m7WoIXhzGehc6UJX7OfxWFpEhvTJKwj8fgH418cPIH9pduF+Dd6LY0WNMzwhw5QX4q8GKBgf41Hehc+EQMjYAz5kA3CXrl8hTZSShNl27M3V1fGfhHUTwAyQ3FWXIUnV2DZNxohxWnFi8Q8SUq1c/030JLumu7GDK8/X9+L9AkIT2iZG7GhFkcIkAj+a+V80/9sJaiuwY9bTRbmWYxps1LisMZmTe/s9oXCuCHw89a1VNqZYdbbPeshCDQDtXRAT0DANMP44E+SNAxtB8tdTJDdNRPadMuzSM8qRFEsyCeIm1dkEVoZT7i+zQKBgQDX3vt+eHq2wdXJ+w0NAf2CBHHcUUeZe2ENXUic/u/cHcrrP8XT3Fp6Jpie3yFVQ1e6rPuqGtrWSPV2/EBust+rZMcUKtLTwX/ZAD09DwssNh5UnF34xIBMi4jTLO9Jw/kgCdc5U+Kyg2uv9SvXqZCUtYgoVs2m9bCZJUT566VL3wKBgQDP35Un7Vi+Bu140iY2ZmV7C5xvrtatkUP6iidpaoTCejuVJVZZBOpOZPUe7nq2V7/8qz2i+Ivin/yHYXWmiHk9sImwLsmgkLQvJMeOwRJLL1cqyNDQFVeDoqL3D5bSXtQDUByNLprHVp89tSQe9vqy4/eom373qXYRu20OoD2lBwKBgQCHY2taG5fjLVi3UAQUZ24mcEE1C6kbQr1Q03OqO14WMH1G4/1f7bC1MaXA5nKSdiT8iGdifWtIwANrd7O1eew8I32UUXNeqdpUMAk4VUoNlXeaW2O4lQ1edJkA0QrWudlyVZmtc8YXbcNJXTv9C3UJP31Ax4g9sZPryOskz70hAwKBgBbLyxykz62PLu2oBh7DHe/fdxlcUBiarJzGF8pcrxBwvSX/ATgj7NoKAkORHY3vk5NO6CR+I0EIEHZ8Pp2zq7ATMxZKGzxrggcFfojuLWZnW6TKfvPC02URKdP0NrL9STzPxUHKUZj4q9/lhH+M0DNcAqXP352jTNpm9m+7LOdzAoGAaV5NggKIGojp2qwH/U3Mb8aLH2IWFQj8Ft45x6EYeEnvnlc5/6CHD9KYogEUIpqNN8XmL4/a3OgiYD3O3b9yv1izXpDQVEI5pUc8eESnsGpphDkTKAhHOcPBJeOItAv1SZH9H6nct824bIIjYS/RlsskX2xZK8utgTACo8J4CTo=";
        String param_type = "json";
        String charset = "UTF-8";
        String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtroHrPO5Y0hrTkWZcAjPx+atZxNFdD3Mtxu407b0VYgBjtjTTAwBN6IVf2oW44l2jM5sKkCjG69UAueBPBsYAAXmM+hUopBryTfBwe2g8y0h8bLnIsCHWj4/hyMg0AEo1CazxIA5Yjl7G2ihmze4bZZlWjkJjOSXLP3cum7mNQn77FCzdkRbBhq/u0Fb+bdb4otVsXtb9KPgx2aSdi6DJo35kHM7tIEJ10/YknTpXyJNYk4KiG5dCOG2DCJ2Ab6qDtlHDCFsJVYAcdRsMhfySKiJ0QZrrkIpG+5aw2CoeCJ/iy4x+cFyQsXA+8D6hWdNfQ73DyusS+7ZcF/ZxsORLwIDAQAB";
        String sign_type = "RSA2";
        String gateway = "https://openapi.alipaydev.com/gateway.do";

//        String app_id = "2016073000129148";
//        String app_private_key = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALvK+SgVaWgLqnmsfk8TSAHLh473aDWLaJhwDg4zWndHArZcNZ9VzbbpP6F7KKvoM1o1V2N/SN81ZAMjZ0mfn2TtihQyvy3hIG8DC1tNPSEPaYvrpKREzAGOU60Q5VZ0Q4nzlXeIaXwI8gRfghG3Wdxn2U+/rMluDHkZ6zJc2+r1AgMBAAECgYEAjZcjNvK178nj9it1bJ+oChpwEf4+Zyi+azkJj/FuQ0KaK+7oS0OBgGjrHhDjAIJpvZk8U3uT8R+rUaZu6RbeMQr7nwFl7MFJua5RyZDn1RsKzvEKeh4f2Cu7w3ofIf781WEq5bzep5L4dhMDH1yP4iJmESWUPwplpOulVvK27z0CQQDj0sI0KXdAQ50WgQFIoHjY+/VJFwsJhl+p8f8WsDPFqhUIsPADn1aMlY4MSXiKVaGTd/i+f8ROPJ+xkN7/niiTAkEA0wTKCLa0PnyTdriOB6apQ9TQ/2rNpzWfQy+PKZVBMkqqM8pl1Y5/UBXveJLkmZL/0uHGWkiyrF6IW3ol+tz7VwJACihZdE3s/TaGiHxT/FL7UGFbfFjEqzYMid06TF6q0ENXEL4i1WaDS11XqgCUmUZcH+EXfBbiP8LANACLkMYSdQJAD8LY0EPNPKmTXhe0zA9/rwhTP/CbQbT4m00PFV0HjJkVE183sfa9vZ6Vz1yxZGMdZoPki9PIPKWm66Y49f7RawJAIKXGne7TuPS63RR7qA1k7/hK12CQUk7EQRkuwPHy1OS9Q/lzsJb3+ZVmGTOa4kF/5EgxtlDXmnsxgZZdNELt1Q==";
//        String param_type = "json";
//        String charset = "UTF-8";
//        String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC7yvkoFWloC6p5rH5PE0gBy4eO92g1i2iYcA4OM1p3RwK2XDWfVc226T+heyir6DNaNVdjf0jfNWQDI2dJn59k7YoUMr8t4SBvAwtbTT0hD2mL66SkRMwBjlOtEOVWdEOJ85V3iGl8CPIEX4IRt1ncZ9lPv6zJbgx5GesyXNvq9QIDAQAB";
//        String sign_type = "RSA";
//        String gateway = "https://openapi.alipaydev.com/gateway.do";

        Date date = new Date();
        /** 年月日时分秒(无下划线) yyyyMMddHHmmss */
        String dtLong = "yyyyMMddHHmmssSSS";
        DateFormat df = new SimpleDateFormat(dtLong);

        String outtradeno = df.format(date);

        //实例化客户端
        AlipayClient alipayClient = new DefaultAlipayClient(gateway,
                app_id, app_private_key, param_type,
                charset, alipay_public_key, sign_type);
//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
//SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody("我是测试数据");
        model.setSubject("App支付测试Java");
        model.setOutTradeNo(outtradeno);
        model.setTimeoutExpress("30m");
        model.setTotalAmount("0.01");
        model.setProductCode("QUICK_MSECURITY_PAY");
        request.setBizModel(model);
        request.setNotifyUrl("http://localhost:8080/heat/payment/aliPayNotify");
        try {
            //这里和普通的接口调用不同，使用的是sdkExecute
            AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
            System.out.println(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
    }
}

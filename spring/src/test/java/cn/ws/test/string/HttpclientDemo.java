package cn.ws.test.string;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;


public class HttpclientDemo {
	
	/**
	 * 获取openApi平台授权access_token
	 */
	public String getToken(){
		return "0192042C0E4FBEB7B30CE91F698A8F76";
	}
	
	/**
	 * openApi平台V2版接口调用
	 */
	public static String postOpenApiV2(String url, String param){
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
//		long start_time = System.currentTimeMillis();
		
		String Authorization = new HttpclientDemo().getToken();
		//商户流水号
		
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setConnectTimeout(30000);
//			conn.setRequestProperty("accept", "*/*");
//			conn.setRequestProperty("connection", "Keep-Alive");
//			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Authorization", Authorization);
			
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			//out.print(param);
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
			
			//int  state = con.getResponseCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	
	
	/*public static void main(String[] args) {
		String aa="";
		try {
			aa = postOpenApiV2("https://kong-int.ihxlife.com/api/v2/apply/trial","{\"sales_channel\":\"10\",\"sales_channel_detail\":\"98\",\"mode\":\"3000\",\"sales_agent\":\"137201004\",\"staff\":\"\",\"third_orgnization\":\"721301721004\",\"print_no\":\"\",\"third_transaction_no\":\"201808221001360061\",\"product_no\":\"\",\"product_name\":\"华夏常青藤综合医疗保障计划\",\"product_copies\":\"1\",\"is_automatic_renewal\":\"\",\"apply_date\":\"2018-08-22\",\"apply_time\":\"10:01:36\",\"expiration_period_value\":\"\",\"expiration_period_unit\":\"\",\"designated_effective_date\":\"\",\"is_automatic_loan\":\"\",\"is_automatic_defray\":\"\",\"third_trade_date\":\"\",\"third_trade_time\":\"\",\"applicant\":{\"name\":\"阿萨德\",\"sex\":\"M\",\"birthday\":\"1991-05-02\",\"nationality\":\"\",\"openid_gv\":\"\",\"marriage\":\"\",\"height\":\"180\",\"weight\":\"70\",\"academic_degree\":\"\",\"identity_card\":{\"type\":\"01\",\"number\":\"420527199105020232\",\"is_long_term_effective\":\"N\",\"expiration_date\":\"2120-12-20\"},\"finance\":{\"bank_account_name\":\"阿萨德\",\"bank_code\":\"04\",\"bank_province\":\"110000\",\"bank_city\":\"110100\",\"bank_account_no\":\"620000000006660101\",\"id_type\":\"01\",\"id_no\":\"420527199105020232\"},\"profession\":{\"company\":\"\",\"position\":\"\",\"worktype\":\"H0101001\",\"part_time_job\":\"\"},\"contact\":{\"mobile_phone\":\"15845646456\",\"fixed_phone\":{\"area_code\":\"\",\"telephone\":\"\",\"extension\":\"\"},\"weixin\":\"\",\"email\":\"1112313@qq.com\",\"address\":{\"is_same_with_applicant\":\"\",\"zip_code\":\"\",\"province\":\"110000\",\"city\":\"110100\",\"country\":\"110101\",\"street\":\"酸酸的方式发到斯蒂芬是\"}},\"impartments\":[{\"version\":\"010\",\"code\":\"010\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"020\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"030\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"040\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"050\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"060\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"070\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"080\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"090\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"100\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"110\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"120\",\"parameter\":\"否\"},{\"version\":\"010\",\"code\":\"150\",\"parameter\":\"180,70,180,70\"},{\"version\":\"010\",\"code\":\"16A\",\"parameter\":\"50, , , \"}]},\"insureds\":[{\"index\":\"1\",\"relationship_with_applicant\":\"01\",\"beneficiaries\":[],\"risks\":[{\"main_risk_code\":\"511206\",\"risk_code\":\"511206\",\"copies\":8,\"initial_premium\":1421600,\"top_up_premium\":\"\",\"amount_insured\":1561600,\"is_insure_whole_life\":\"N\",\"insure_period_value\":20,\"insure_period_unit\":\"Y\",\"payment_schedule\":12,\"is_payment_whole_life\":\"N\",\"payment_period_value\":10,\"payment_period_unit\":\"Y\",\"is_automatic_renewal\":\"\",\"dividend_option\":\"\",\"annuity_draw_value\":\"\",\"annuity_draw_unit\":\"\",\"product_no\":\"\",\"is_automatic_transform\":\"\",\"annual_premium\":2047104},{\"amount_insured\":40000,\"copies\":8,\"initial_premium\":140000,\"insure_period_unit\":\"Y\",\"insure_period_value\":20,\"is_automatic_renewal\":\"\",\"is_insure_whole_life\":\"N\",\"is_payment_whole_life\":\"N\",\"main_risk_code\":\"511206\",\"payment_period_unit\":\"Y\",\"payment_period_value\":10,\"payment_schedule\":12,\"risk_code\":\"521702\",\"annual_premium\":201600}]}]}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-->"+aa);
	}*/

	public static void main(String[] args) {
		String aa="";
		try {
			aa = get2Redis("https://mp.weixin.qq.com/s/76AZVFE96f03XcTbn89umw");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-->"+aa);
	}
	public static String get2Redis(String redisURL) {

		CloseableHttpClient httpClient = null;
		CloseableHttpResponse httpResponse = null;
		try {
			HttpGet httpGet = new HttpGet(redisURL);
			RequestConfig requestConfig =
					RequestConfig.custom().setConnectTimeout(3000)
							.setSocketTimeout(3000).build();
			httpGet.setConfig(requestConfig);

			httpClient = HttpClients.createDefault();
			httpResponse = httpClient.execute(httpGet);
			if (HttpStatus.SC_OK != httpResponse.getStatusLine().getStatusCode()) {
				HttpEntity entity = httpResponse.getEntity();
				throw new Exception("请求号机失败" + EntityUtils.toString(entity));
			}
			HttpEntity entity = httpResponse.getEntity();
			return EntityUtils.toString(entity);

		} catch (Throwable t) {
			String errorMsg = "请求Redis发生未知异常。";
		} finally {
			if (null != httpResponse) {
				try {
					httpResponse.close();
				} catch (IOException e) {
				}
			}
			if (null != httpClient) {
				try {
					httpClient.close();
				} catch (IOException e) {
				}
			}
		}
		return null;
	}
}

package gz.itcast.c_response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ����- ��ʱˢ��
 * @author APPle
 *
 */
public class ResponseDemo3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * ��ʱˢ��
		 * ԭ���������ʶrefreshͷ���õ�refreshͷ֮����������ǰ��Դ
		 */
		//response.setHeader("refresh", "1"); //ÿ��1��ˢ�´�ҳ��
		
		/**
		 * ��n��֮����ת�������Դ
		 */
		response.setHeader("refresh", "3;url=/day09/adv.html");//��3��֮����ת��adv.html
	}

}

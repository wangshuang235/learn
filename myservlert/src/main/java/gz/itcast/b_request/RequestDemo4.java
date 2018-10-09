package gz.itcast.b_request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ����- ��ֹ�Ƿ�����
 * ������Ҫ���ص���Դ
 * @author APPle
 *
 */
public class RequestDemo4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		//�õ�refererͷ
		String referer = request.getHeader("referer");
		System.out.println("referer="+referer);
		
		/**
		 * �жϷǷ����ӣ�
		 * 	1��ֱ�ӷ��ʵĻ�referer=null
		 *  2�������ǰ���������Թ��   
		 */
		if(referer==null || !referer.contains("/day09/adv.html")){
			response.getWriter().write("��ǰ�ǷǷ����ӣ���ص���ҳ��<a href='/day09/adv.html'>��ҳ</a>");
		}else{
			//��ȷ������
			response.getWriter().write("��Դ��������...");
		}
	
	}

}

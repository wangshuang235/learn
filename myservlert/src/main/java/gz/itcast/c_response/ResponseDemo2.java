package gz.itcast.c_response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ����- �����ض���
 * ���൱�ڳ�������תҳ�棩
 * @author APPle
 *
 */
public class ResponseDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * ���� ��ת��adv.html
		 * ʹ�������ض��� ����һ��302״̬��+location����Ӧͷ
		 */
		/*response.setStatus(302);//����һ��302״̬��
		response.setHeader("location", "/day09/adv.html"); //location����Ӧͷ
*/		
		
		//�����ض����д��
		response.sendRedirect("/day09/adv.html");
		
		
	}

}

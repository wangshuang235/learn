package gz.itcast.b_request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo2 extends HttpServlet {
/**
 * ע�⣺tomcat���������Ȼ����servlet��service������Ȼ����service�������ٸ�������ʽ���ֱ���ö�Ӧ��doXX����
 * �����磬�����GET����ʽ����service�����е���doGet������
 * 
 *   ��Ϊ�������ʽ��GET ��POST�����Ա�дservlet����ֻ��Ҫ����doGet��doPost���ɣ�������
 */
	
	/*@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(req.getMethod());
		System.out.println("service����������");
	}*/
	
	
	
	/**
	 * �÷������ڽ����������Get��ʽ�ύ������
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("GET��ʽ�ύ");
	}

	/**
	 * �÷������ڽ����������Post��ʽ�ύ������
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Post��ʽ�ύ");
	}

}

package gz.itcast.c_response;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ����- content-Type����
 * @author APPle
 *
 */
public class ResponseDemo4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * ������Ӧʵ�����ݱ���
		 */
		//response.setCharacterEncoding("utf-8");
		
		/**
		 * 1. ���������͸���������������ͺ����ݱ���
		 */
		//response.setHeader("content-type", "text/html");
		response.setContentType("text/html;charset=utf-8");//���������ȼۡ��Ƽ�ʹ�ô˷���
		//response.setContentType("text/xml");
		//response.setContentType("image/jpg");

		
		//response.getWriter().write("<html><head><title>this is tilte</title></head><body>�й�</body></html>");
		response.getOutputStream().write("<html><head><title>this is tilte</title></head><body>�й�</body></html>".getBytes("utf-8"));

		
		/*File file = new File("e:/mm.jpg");
		*//**
		 * ���������ط�ʽ���ļ�
		 *//*
		response.setHeader("Content-Disposition", "attachment; filename="+file.getName());
		*//**
		 * ����ͼƬ
		 *//*
		*//**
		 * ����ͼƬ
		 *//*
		FileInputStream in = new FileInputStream(file);
		byte[] buf = new byte[1024];
		int len = 0;
		
		//��ͼƬ����д���������
		while( (len=in.read(buf))!=-1 ){
			response.getOutputStream().write(buf, 0, len);
		}*/
	}

}
